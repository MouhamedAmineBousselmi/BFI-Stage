package com.example.BanqueSI.services;

import com.example.BanqueSI.EnumRetour.OperationRetour;
import com.example.BanqueSI.dto.ResultatTacheDTO;
import com.example.BanqueSI.entities.Task;
import com.example.BanqueSI.metier.TaskMetier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.RollbackException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by amino on 05/08/2017
 */

@RestController
public class TaskRestController {

    //--ATTRIBUTS
    @Autowired
    private TaskMetier taskMetier;
    //--END ATTRIBUTS

    //--METHODES
    @RequestMapping(value = "/tasks",method = RequestMethod.GET)
    @PreAuthorize("hasRole('EMPLOYE')")
    public List<ResultatTacheDTO> getTasks() {
        List<ResultatTacheDTO> resultatTachesDTOS = new ArrayList<>();
        for(Task t : taskMetier.getTasks()){
            ResultatTacheDTO resultatTacheDTO = new ResultatTacheDTO();
            try {
                resultatTacheDTO.setTaskName(t.getTaskName());
                resultatTacheDTO.setTaskMessage(t.getTaskMessage());
                resultatTacheDTO.setDeadline(t.getDeadline());
                resultatTacheDTO.setNextStep(t.getNextStep());
                resultatTacheDTO.setPriority(t.getPriority());
                resultatTacheDTO.setStartDate(t.getStartDate());
                resultatTacheDTO.setStatus(t.isStatus());
                resultatTacheDTO.setTaskType(t.getTaskType());
                resultatTacheDTO.setMessage(OperationRetour.TASK_FOUND.toString());
            }catch (RollbackException r){
                resultatTacheDTO.setMessage(r.getMessage());
            }
            resultatTachesDTOS.add(resultatTacheDTO);
        }
        return resultatTachesDTOS;
    }

    @RequestMapping(value = "/updatetask",method = RequestMethod.PUT)
    @PreAuthorize("hasRole('EMPLOYE')")
    public void updateTask(Task t) {
        taskMetier.updateTask(t);
    }
//--END METHODES
}

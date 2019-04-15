package com.example.BanqueSI.metier;

import com.example.BanqueSI.EnumRetour.OperationRetour;
import com.example.BanqueSI.dao.TaskRepository;
import com.example.BanqueSI.entities.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.RollbackException;
import java.util.List;

/**
 * Created by amino on 05/08/2017
 */

@Service
public class TaskMetierImpl implements TaskMetier{

    //--ATTRIBUTS
    @Autowired
    TaskRepository taskRepository;
    //--END ATTRIBUTS

    //--METHODES
    @Override
    public List<Task> getTasks() {
        if(taskRepository.findAll().size() == 0){
            throw new RollbackException(OperationRetour.EMPTY_LIST.toString());
        }
        return taskRepository.findAll();
    }

    public void updateTask(Task t){
        taskRepository.save(t);
    }
    //--END METHODES
}

package com.example.BanqueSI.services;

import com.example.BanqueSI.entities.Agence;
import com.example.BanqueSI.entities.Employe;
import com.example.BanqueSI.metier.EmployeMetier;
import com.example.BanqueSI.EnumRetour.OperationRetour;
import com.example.BanqueSI.dto.ResultatEmployeDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.*;

import javax.persistence.RollbackException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by amino on 21/06/2017
 */
@RestController
public class EmployeRestService{

    //--attributs
    @Autowired
    private EmployeMetier employeMetier;
    //--end attributs

    //--METHODES

    @RequestMapping(value = "/employes",method = RequestMethod.POST)
    @PreAuthorize("hasRole('ADMIN')")
    public ResultatEmployeDTO saveEmploye(@RequestBody Employe e) {
        ResultatEmployeDTO employeDTO = new ResultatEmployeDTO();
        try {
            employeMetier.saveEmploye(e);
            employeDTO.setCodeEmploye(e.getCodeEmploye());
            employeDTO.setUsername(e.getUsername());
            employeDTO.setMessage(OperationRetour.EMPLOYE_SAVED.toString());
        }catch (RollbackException r){
            employeDTO.setMessage(r.getMessage());
        }
        return employeDTO;
    }

    @RequestMapping(value = "/employes",method = RequestMethod.GET)
    @PreAuthorize("hasRole('ADMIN')")
    public List<ResultatEmployeDTO> listEmployes() {
        List<ResultatEmployeDTO> resultatEmployeDTOS = new ArrayList<ResultatEmployeDTO>();
        for(Employe e : employeMetier.listEmployes()){
            ResultatEmployeDTO employeDTO = new ResultatEmployeDTO();
            try {
                employeDTO.setCodeEmploye(e.getCodeEmploye());
                employeDTO.setUsername(e.getUsername());
                employeDTO.setMessage(OperationRetour.EMPLOYE_FOUND.toString());
                resultatEmployeDTOS.add(employeDTO);
            }catch (RollbackException r){
                employeDTO.setMessage(r.getMessage());
            }
        }
        return resultatEmployeDTOS;
    }

    @RequestMapping(value = "/whoami",method = RequestMethod.GET)
    @PreAuthorize("hasRole('ROLE_EMPLOYE')")
    public ResultatEmployeDTO user() {
        ResultatEmployeDTO resultatEmployeDTO = new ResultatEmployeDTO();

        Employe employe = (Employe) SecurityContextHolder
                .getContext()
                .getAuthentication()
                .getPrincipal();

        resultatEmployeDTO.setCodeEmploye(employe.getCodeEmploye());
        resultatEmployeDTO.setUsername(employe.getUsername());
        resultatEmployeDTO.setNomAgenceAppartient(employe.getAgence().getNomAgence());
        resultatEmployeDTO.setOAgenceAppartient(employe.getAgence().getHeureOuverture());
        resultatEmployeDTO.setFAgenceAppartient(employe.getAgence().getHeureFermeture());
        return resultatEmployeDTO;
    }
    //--END METHODES
}
package com.example.BanqueSI.services;

import com.example.BanqueSI.dto.ResultatOperationDTO;
import com.example.BanqueSI.entities.Operation;
import com.example.BanqueSI.metier.OperationMetier;
import com.example.BanqueSI.EnumRetour.OperationRetour;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.RollbackException;

/**
 * Created by amino on 21/06/2017
 */

@RestController
public class OperationRestService {

    //--Attributs
    @Autowired
    private OperationMetier operationMetier;
    //--END ATTRIBUTS

    //--METHODES
    @RequestMapping(value = "/versement",method = RequestMethod.PUT)
    @PreAuthorize("hasRole('EMPLOYE')")
    public ResultatOperationDTO verser(@RequestParam String code, @RequestParam double montant, @RequestParam Long codeEmp) {
        ResultatOperationDTO operationDTO = new ResultatOperationDTO();
        try {
            operationMetier.verser(code, montant, codeEmp);
            operationDTO.setMessage(OperationRetour.VERSEMENT_SAVED.toString());
        }catch (RollbackException r){
            operationDTO.setMessage(r.getMessage());
        }
        return operationDTO;
    }

    @RequestMapping(value = "/retrait",method = RequestMethod.PUT)
    @PreAuthorize("hasRole('EMPLOYE')")
    public ResultatOperationDTO retirer(@RequestParam String code, @RequestParam double montant, @RequestParam Long codeEmp) {
        ResultatOperationDTO operationDTO = new ResultatOperationDTO();
        try {
            operationMetier.retirer(code, montant, codeEmp);
            operationDTO.setMessage(OperationRetour.RETRAIT_SAVED.toString());
        }catch (RollbackException r){
            operationDTO.setMessage(r.getMessage());
        }
        return operationDTO;
    }

    @RequestMapping(value = "/virement",method = RequestMethod.PUT)
    @PreAuthorize("hasRole('EMPLOYE')")
    public ResultatOperationDTO virement(@RequestParam String cp1, @RequestParam String cp2, @RequestParam double montant, @RequestParam Long codeEmp) {
        ResultatOperationDTO operationDTO = new ResultatOperationDTO();
        try {
            operationMetier.virement(cp1, cp2, montant, codeEmp);
            operationDTO.setMessage(OperationRetour.VIREMENT_SAVED.toString());
        }catch (RollbackException r){
            operationDTO.setMessage(r.getMessage());
        }
        return operationDTO;
    }

    //--END METHODES
}
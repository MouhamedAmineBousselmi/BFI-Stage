package com.example.BanqueSI.services;

import com.example.BanqueSI.dto.ResultatCompteDTO;
import com.example.BanqueSI.entities.Compte;
import com.example.BanqueSI.metier.CompteMetier;
import com.example.BanqueSI.EnumRetour.OperationRetour;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import javax.persistence.RollbackException;

/**
 * Created by amino on 21/06/2017
 */
@RestController
public class CompteRestService {

    //--Attributs
    @Autowired
    private CompteMetier compteMetier;
    //--END Attributs

    //--METHODES
    @RequestMapping(value = "/comptes",method = RequestMethod.POST)
    @PreAuthorize("hasRole('ADMIN')")
        public ResultatCompteDTO saveCompte(@RequestBody Compte cp) {
            ResultatCompteDTO compteDTO = new ResultatCompteDTO();
        try {
            compteMetier.saveCompte(cp);

            compteDTO.setCodeCompte(cp.getCodeCompte());
            compteDTO.setSolde(cp.getSolde());
            compteDTO.setTaux(cp.getTaux());
            compteDTO.setDecouvert(cp.getDecouvert());
            compteDTO.setDateCreation(cp.getDateCreation());
            compteDTO.setType(cp.getType().toString());
            compteDTO.setMessage(OperationRetour.ACCOUNT_SAVED.toString());
        }catch (RollbackException r){
            compteDTO.setMessage(r.getMessage());
        }
        return compteDTO;
    }
    @RequestMapping(value = "/comptes/{code}",method = RequestMethod.GET)
    @PreAuthorize("hasRole('EMPLOYE')")
    public ResultatCompteDTO getCompte(@PathVariable String code) {

        ResultatCompteDTO compteDTO = new ResultatCompteDTO();

        try{

            Compte compte = compteMetier.getCompte(code);

            compteDTO.setCodeCompte(compte.getCodeCompte());
            compteDTO.setSolde(compte.getSolde());
            compteDTO.setTaux(compte.getTaux());
            compteDTO.setDecouvert(compte.getDecouvert());
            compteDTO.setDateCreation(compte.getDateCreation());
            compteDTO.setType(compte.getType().toString());
            compteDTO.setMessage(OperationRetour.ACCOUNT_FOUND.toString());

        }catch (RollbackException r){
           compteDTO.setMessage(r.getMessage());
        }
        return compteDTO;
    }

    //--END METHODES
}
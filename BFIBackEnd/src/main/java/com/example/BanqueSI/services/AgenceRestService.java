package com.example.BanqueSI.services;

import com.example.BanqueSI.EnumRetour.OperationRetour;
import com.example.BanqueSI.dto.ResultatAgenceDTO;
import com.example.BanqueSI.entities.Agence;
import com.example.BanqueSI.metier.AgenceMetier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import javax.persistence.RollbackException;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * Created by amino on 18/07/2017
 */
@RestController
public class AgenceRestService {

    @Autowired
    private AgenceMetier agenceMetier;

    @RequestMapping(value = "/agence",method = RequestMethod.POST)
    @PreAuthorize("hasRole('ADMIN')")
    public ResultatAgenceDTO saveAgence(@RequestBody  Agence a) {
        ResultatAgenceDTO agenceDTO = new ResultatAgenceDTO();
        try {
            agenceMetier.saveAgence(a);
            agenceDTO.setNomAgence(a.getNomAgence());
            agenceDTO.setAdresseAgence(a.getAdresseAgence());
            agenceDTO.setHeureOuverture(a.getHeureOuverture());
            agenceDTO.setHeureFermeture(a.getHeureFermeture());
            agenceDTO.setFondLiquideQuotidien(a.getFondLiquideQuotidien());
            agenceDTO.setMessage(OperationRetour.AGENCE_SAVED.toString());

        }catch (RollbackException r){
            agenceDTO.setMessage(r.getMessage());
        }
        return agenceDTO;
    }


    @RequestMapping(value = "/agence/{codeAgence}",method = RequestMethod.GET)
    @PreAuthorize("hasRole('EMPLOYE')")
    public ResultatAgenceDTO getAgence(@PathVariable Long codeAgence) {
        ResultatAgenceDTO agenceDTO = new ResultatAgenceDTO();
        try {

            Agence agence =  agenceMetier.getAgence(codeAgence);
            agenceDTO.setNomAgence(agence.getNomAgence());
            agenceDTO.setAdresseAgence(agence.getAdresseAgence());
            agenceDTO.setHeureOuverture(agence.getHeureOuverture());
            agenceDTO.setHeureFermeture(agence.getHeureFermeture());
            agenceDTO.setFondLiquideQuotidien(agence.getFondLiquideQuotidien());

            agenceDTO.setMessage(OperationRetour.ACCOUNT_FOUND.toString());
        }catch (RollbackException r){
            agenceDTO.setMessage(r.getMessage());
        }
        return agenceDTO;
    }
}
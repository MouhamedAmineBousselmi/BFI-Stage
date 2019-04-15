package com.example.BanqueSI.services;

import com.example.BanqueSI.EnumRetour.OperationRetour;
import com.example.BanqueSI.dto.ResultatChangeDTO;
import com.example.BanqueSI.entities.Change;
import com.example.BanqueSI.metier.ChangeMetier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import javax.persistence.RollbackException;
import java.io.IOException;

/**
 * Created by amino on 13/07/2017
 */
@RestController
public class ChangeRestService {

    //--ATTRIBUTS
    @Autowired
    private ChangeMetier changeMetier;
    //--END ATTRIBUTS

    //--METHODES
    @RequestMapping(value = "/achat",method = RequestMethod.PUT)
    @PreAuthorize("hasRole('EMPLOYE')")
    public ResultatChangeDTO AchatDevise(Change c) {
        ResultatChangeDTO changeDTO = new ResultatChangeDTO();
        try {
            changeMetier.AchatDevise(c);

            changeDTO.setIdentif(c.getIdentif());
            changeDTO.setNomP(c.getNomP());
            changeDTO.setPrenomP(c.getPrenomP());
            changeDTO.setMontant(c.getMontant());
            changeDTO.setDateChange(c.getDateChange());
            changeDTO.setMessage(OperationRetour.CHANGE_SAVED.toString());

        }catch (RollbackException r){
            changeDTO.setMessage(r.getMessage());
        }
        return changeDTO;
    }

    @RequestMapping(value = "/vente",method = RequestMethod.PUT)
    @PreAuthorize("hasRole('EMPLOYE')")
    public ResultatChangeDTO VenteDevise(Change c) {
        ResultatChangeDTO changeDTO = new ResultatChangeDTO();
        try {
            changeMetier.VenteDevise(c);

            changeDTO.setIdentif(c.getIdentif());
            changeDTO.setNomP(c.getNomP());
            changeDTO.setPrenomP(c.getPrenomP());
            changeDTO.setAdresseP(c.getAdresseP());
            changeDTO.setMontant(c.getMontant());
            changeDTO.setDestination(c.getDestination());
            changeDTO.setDateChange(c.getDateChange());
            changeDTO.setMessage(OperationRetour.CHANGE_SAVED.toString());

        }catch (RollbackException r){
            changeDTO.setMessage(r.getMessage());
        }
        return changeDTO;
    }


    @RequestMapping(value = "/convertir",method = RequestMethod.POST)
    @PreAuthorize("hasRole('EMPLOYE')")
    public ResultatChangeDTO convertisseurDevise(@RequestBody double montant) throws IOException {
        ResultatChangeDTO changeDTO = new ResultatChangeDTO();
        try {
            changeDTO.setMontant(changeMetier.convertisseurDevise(montant));
            changeDTO.setMessage(OperationRetour.TAUX_FOUND.toString());
        }catch (RollbackException r){
            changeDTO.setMessage(r.getMessage());
        }
        return changeDTO;
    }

    @RequestMapping(value = "/convertirR",method = RequestMethod.POST)
    @PreAuthorize("hasRole('EMPLOYE')")
    public ResultatChangeDTO convertisseurDeviseR(@RequestBody double montant) throws IOException {
        ResultatChangeDTO changeDTO = new ResultatChangeDTO();
        try {
            changeDTO.setMontant(changeMetier.convertisseurDeviseR(montant));
            changeDTO.setMessage(OperationRetour.TAUX_FOUND.toString());
        }catch (RollbackException r){
            changeDTO.setMessage(r.getMessage());
        }
        return changeDTO;
    }

    //--END METHODES
}
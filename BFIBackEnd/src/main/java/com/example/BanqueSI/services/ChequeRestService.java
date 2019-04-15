package com.example.BanqueSI.services;

import com.example.BanqueSI.EnumRetour.OperationRetour;
import com.example.BanqueSI.dto.ResultatChequeDTO;
import com.example.BanqueSI.entities.Cheque;
import com.example.BanqueSI.metier.ChequeMetier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import javax.persistence.RollbackException;

/**
 * Created by amino on 19/07/2017
 */
@RestController
public class ChequeRestService {

    @Autowired
    private ChequeMetier chequeMetier;

    @RequestMapping(value = "/cheque",method = RequestMethod.PUT)
    @PreAuthorize("hasRole('EMPLOYE')")
    public ResultatChequeDTO VersementCheque(Cheque c) {
        ResultatChequeDTO chequeDTO = new ResultatChequeDTO();
        try {
            chequeMetier.VersementCheque(c);
            chequeDTO.setNomProprietaire(c.getNomProprietaire());
            chequeDTO.setNumeroC(c.getNumeroC());
            chequeDTO.setPrenomProprietaire(c.getPrenomProprietaire());
            chequeDTO.setMontant(c.getMontant());
            chequeDTO.setDateV(c.getDateV());
            chequeDTO.setMessage(OperationRetour.CHEQUE_SAVED.toString());
        }catch (RollbackException r){
            chequeDTO.setMessage(r.getMessage());
        }
        return chequeDTO;
    }

    @RequestMapping(value = "/cheque",method = RequestMethod.GET)
    @PreAuthorize("hasRole('EMPLOYE')")
    public ResultatChequeDTO getCheque(Long idC) {
        ResultatChequeDTO chequeDTO = new ResultatChequeDTO();
        try {
            Cheque cheque = chequeMetier.getCheque(idC);
            chequeDTO.setNumeroC(cheque.getNumeroC());
            chequeDTO.setNomProprietaire(cheque.getNomProprietaire());
            chequeDTO.setPrenomProprietaire(cheque.getPrenomProprietaire());
            chequeDTO.setMontant(cheque.getMontant());
            chequeDTO.setDateV(cheque.getDateV());
            chequeDTO.setMessage(OperationRetour.CHEQUE_FOUND.toString());
        }catch (RollbackException r){
            chequeDTO.setMessage(r.getMessage());
        }
        return chequeDTO;
    }
}
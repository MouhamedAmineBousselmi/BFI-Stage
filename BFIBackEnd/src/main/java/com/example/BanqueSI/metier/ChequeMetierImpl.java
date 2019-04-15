package com.example.BanqueSI.metier;

import com.example.BanqueSI.EnumRetour.OperationRetour;
import com.example.BanqueSI.dao.ChequeRepository;
import com.example.BanqueSI.entities.Cheque;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.RollbackException;
import java.util.Date;

/**
 * Created by amino on 19/07/2017
 */
@Service
public class ChequeMetierImpl implements ChequeMetier {

    @Autowired
    private ChequeRepository chequeRepository;

    @Override
    public OperationRetour VersementCheque(Cheque c) {
        OperationRetour operationRetour;
        c.setDateV(new Date());
        if(c.getMontant() == 0 || c.getCompte() == null || c.getNomProprietaire() == null || c.getPrenomProprietaire() == null || c.getNumeroC() == 0 || c.getEmploye() == null  ){
            operationRetour = OperationRetour.EMPTY_FORM;
            throw new RollbackException(OperationRetour.EMPTY_FORM.toString());
        }

        chequeRepository.save(c);
        operationRetour = OperationRetour.CHEQUE_SAVED;
        return operationRetour;
    }

    @Override
    public Cheque getCheque(Long idC) {
        Cheque cheque =  chequeRepository.findOne(idC);
        if(cheque == null){
            throw new RollbackException(OperationRetour.CHEQUE_NOT_FOUND.toString());
        }
        return cheque;
    }
}

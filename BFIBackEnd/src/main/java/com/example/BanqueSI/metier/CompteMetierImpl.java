package com.example.BanqueSI.metier;

import com.example.BanqueSI.EnumRetour.OperationRetour;
import com.example.BanqueSI.dao.CompteRepository;
import com.example.BanqueSI.entities.Compte;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Service;

import javax.persistence.RollbackException;
import java.util.Date;

/**
 * Created by amino on 19/06/2017
 */
@Service
public class CompteMetierImpl implements CompteMetier {

    //--ATTRIBUTS
    @Autowired
    private CompteRepository compteRepository;
    //--END ATTRIBUTS

    @Override
    public OperationRetour saveCompte(Compte cp){
        OperationRetour operationRetour;
        cp.setDateCreation(new Date());

        if(cp.getCodeCompte() == null){
            operationRetour = OperationRetour.INSERT_ACCOUNT;
            throw new RollbackException(OperationRetour.INSERT_ACCOUNT.toString());
        }

        for(Compte c1:compteRepository.findAll()){
            if(c1.getCodeCompte().equals(cp.getCodeCompte())){
                operationRetour = OperationRetour.TECHNICAL_PROBLEM;
                throw new RollbackException(OperationRetour.TECHNICAL_PROBLEM.toString());
            }
        }

        compteRepository.save(cp);
        operationRetour = OperationRetour.ACCOUNT_SAVED;

        return operationRetour;
    }

    @Override
    public Compte getCompte(String code){
        Compte cp = compteRepository.findOne(code);

        if(cp == null) throw new RollbackException(OperationRetour.ACCOUNT_NON_EXIST.toString());

        return cp;
    }
}
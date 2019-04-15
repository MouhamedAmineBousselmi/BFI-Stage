package com.example.BanqueSI.metier;

import com.example.BanqueSI.EnumRetour.OperationRetour;
import com.example.BanqueSI.dao.CompteRepository;
import com.example.BanqueSI.dao.EmployeRepository;
import com.example.BanqueSI.dao.OperationRepository;
import com.example.BanqueSI.entities.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.RollbackException;
import java.util.Date;
import java.util.List;

/**
 * Created by amino on 19/06/2017
 */
@Service
public class OperationMetierImpl implements OperationMetier {

    //--ATTRIBUTS
    @Autowired
    private OperationRepository operationRepository;
    @Autowired
    private CompteRepository compteRepository;
    @Autowired
    private EmployeRepository employeRepository;
    //-- END ATTRIBUTS

    //--METHODES
    @Override
    @Transactional
    public OperationRetour verser(String code, double montant, Long codeEmp) {
        OperationRetour operationRetour;
        Compte cp = compteRepository.findOne(code);
        if(cp.getCodeCompte() == null){
            operationRetour = OperationRetour.ACCOUNT_NON_EXIST;
            throw new RollbackException(OperationRetour.ACCOUNT_NON_EXIST.toString());
        }

        Operation o = new Operation();
        Employe e = employeRepository.findOne(codeEmp);
        if(e.getCodeEmploye() == null){
            operationRetour = OperationRetour.INSERT_EMPLOYE;
            throw new RollbackException(OperationRetour.INSERT_EMPLOYE.toString());
        }
        o.setDateOperation(new Date());
        o.setMontant(montant);
        o.setCompte(cp);
        o.setEmploye(e);
        o.setTypeO(OperationType.V);

        if(o.getCompte() == null || o.getEmploye() == null || o.getTypeO() == null || o.getMontant() == 0){
            operationRetour = OperationRetour.INSERT_OPERATION;
            throw new RollbackException(OperationRetour.INSERT_OPERATION.toString());
        }
        operationRepository.save(o);
        cp.setSolde(cp.getSolde()+montant);
        operationRetour = OperationRetour.VERSEMENT_SAVED;
        return operationRetour;
    }

    @Override
    @Transactional
    public OperationRetour retirer(String code, double montant, Long codeEmp) {
        OperationRetour operationRetour;
        Compte cp = compteRepository.findOne(code);
        if(cp.getCodeCompte() == null){
            operationRetour = OperationRetour.ACCOUNT_NON_EXIST;
            throw new RollbackException(OperationRetour.ACCOUNT_NON_EXIST.toString());
        }

        if(cp.getSolde() < montant){
            operationRetour = OperationRetour.INSUFFICIENT_MONEY;
            throw new RollbackException(OperationRetour.INSUFFICIENT_MONEY.toString());
        }

        Operation o = new Operation();
        Employe e = employeRepository.findOne(codeEmp);
        if(e.getCodeEmploye() == null){
            operationRetour = OperationRetour.INSERT_EMPLOYE;
            throw new RollbackException(OperationRetour.INSERT_EMPLOYE.toString());
        }
        o.setDateOperation(new Date());
        o.setMontant(montant);
        o.setCompte(cp);
        o.setEmploye(e);
        o.setTypeO(OperationType.R);

        if(o.getCompte() == null || o.getEmploye() == null || o.getTypeO() == null || o.getMontant() == 0){
            operationRetour = OperationRetour.INSERT_OPERATION;
            throw new RollbackException(OperationRetour.INSERT_OPERATION.toString());
        }
        operationRepository.save(o);
        operationRetour = OperationRetour.RETRAIT_SAVED;
        cp.setSolde(cp.getSolde()-montant);
        return operationRetour;
    }

    @Override
    @Transactional
    public OperationRetour virement(String cp1, String cp2, double montant, Long codeEmp) {
        OperationRetour operationRetour;
        retirer(cp1,montant,codeEmp);
        verser(cp2,montant,codeEmp);
        operationRetour = OperationRetour.VIREMENT_SAVED;
        return operationRetour;
    }

    //A revoir
    @Override
    public List<Operation> getOperations() {
        return operationRepository.findAll();
    }
    //--END MEHODES
}

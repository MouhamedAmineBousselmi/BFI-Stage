package com.example.BanqueSI.metier;

import com.example.BanqueSI.EnumRetour.OperationRetour;
import com.example.BanqueSI.dao.PageOperationRepository;
import com.example.BanqueSI.entities.Change;
import com.example.BanqueSI.entities.Cheque;
import com.example.BanqueSI.entities.Operation;
import com.example.BanqueSI.entities.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Service;

import javax.persistence.RollbackException;

/**
 * Created by amino on 15/07/2017
 */
@Service
public class PageOperationMetierImpl implements PageOperationMetier {

    @Autowired
    private PageOperationRepository pageOperationRepository;


    @Override
    public Page getOperations(String codeCompte,Long codeEmp, int page, int size) {
        Page<Operation> ops = pageOperationRepository.getOperations(codeCompte, codeEmp, new PageRequest(page,size));
        if(ops == null){
            throw new RollbackException(OperationRetour.TECHNICAL_PROBLEM.toString());
        }
        return ops;
    }

    @Override
    public Page getChange(Long codeEmploye, int page, int size) {
        Page<Change> ops = pageOperationRepository.getChange(codeEmploye,new PageRequest(page,size));
        if(ops == null){
            throw new RollbackException(OperationRetour.TECHNICAL_PROBLEM.toString());
        }
        return ops;
    }

    @Override
    public Page getCheque(Long codeEmploye, int page, int size) {
        Page<Cheque> ops = pageOperationRepository.getCheque(codeEmploye,new PageRequest(page,size));
        if(ops == null){
            throw new RollbackException(OperationRetour.TECHNICAL_PROBLEM.toString());
        }
        return ops;
    }

    @Override
    public Page getTache(Long codeEmploye, int page, int size) {
        Page<Task> tasks = pageOperationRepository.getTache(codeEmploye,new PageRequest(page,size));
        if(tasks == null){
            throw new RollbackException(OperationRetour.TECHNICAL_PROBLEM.toString());
        }
        return tasks;
    }


}
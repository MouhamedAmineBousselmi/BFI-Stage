package com.example.BanqueSI.metier;

import com.example.BanqueSI.EnumRetour.OperationRetour;
import com.example.BanqueSI.dao.EmployeRepository;
import com.example.BanqueSI.entities.Agence;
import com.example.BanqueSI.entities.Authority;
import com.example.BanqueSI.entities.Employe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.RollbackException;
import java.util.List;

/**
 * Created by amino on 19/06/2017
 */
@Service
public class EmployeMetierImpl implements EmployeMetier  {

    //--attributs
    @Autowired
    private EmployeRepository employeRepository;

    //--end attributs

    @Override
    public OperationRetour saveEmploye(Employe e){
        OperationRetour operationRetour;
        if(e.getCodeEmploye() == null){
            operationRetour = OperationRetour.INSERT_EMPLOYE;
            throw new RollbackException(OperationRetour.INSERT_EMPLOYE.toString());
        }
        for(Employe e1:employeRepository.findAll()){
            if(e1.getCodeEmploye() == e.getCodeEmploye()){
                operationRetour = OperationRetour.TECHNICAL_PROBLEM;
                throw new RollbackException(OperationRetour.TECHNICAL_PROBLEM.toString());
            }
        }
        employeRepository.save(e);
        operationRetour = OperationRetour.EMPLOYE_SAVED;
        return operationRetour;
    }

    @Override
    public List<Employe> listEmployes() {
        if(employeRepository.findAll() == null){
            throw new RollbackException(OperationRetour.EMPTY_LIST.toString());
        }
        return employeRepository.findAll();
    }
}

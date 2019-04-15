package com.example.BanqueSI.metier;

import com.example.BanqueSI.EnumRetour.OperationRetour;
import com.example.BanqueSI.dao.AgenceRepository;
import com.example.BanqueSI.dao.EmployeRepository;
import com.example.BanqueSI.entities.Agence;
import com.example.BanqueSI.entities.Employe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.RollbackException;
import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * Created by amino on 18/07/2017
 */
@Service
public class AgenceMetierImpl implements AgenceMetier {

    @Autowired
    private AgenceRepository agenceRepository;
    @Autowired
    private EmployeRepository employeRepository;
    @Override
    public OperationRetour saveAgence(Agence a) {
        OperationRetour operationRetour;
        if(a.getCodeAgence() == null){
            operationRetour =  OperationRetour.INSERT_AGENCE;
            throw new RollbackException(OperationRetour.INSERT_AGENCE.toString());
        }

        for(Agence a1:agenceRepository.findAll()){
            if(a1.getCodeAgence().equals(a.getCodeAgence())){
                operationRetour = OperationRetour.TECHNICAL_PROBLEM;
                throw new RollbackException(OperationRetour.TECHNICAL_PROBLEM.toString());
            }
        }

        agenceRepository.save(a);
        operationRetour = OperationRetour.AGENCE_SAVED;
        return operationRetour;
    }

    @Override
    public Agence getAgence(Long codeAgence) {
        OperationRetour operationRetour;
        Agence agence = agenceRepository.getOne(codeAgence);
        if(agence == null){
            operationRetour = OperationRetour.AGENCE_NOT_FOUND;
            throw new RollbackException(OperationRetour.AGENCE_NOT_FOUND.toString());
        }else{
            operationRetour = OperationRetour.AGENCE_FOUND;
        }
        return agence;
    }
}
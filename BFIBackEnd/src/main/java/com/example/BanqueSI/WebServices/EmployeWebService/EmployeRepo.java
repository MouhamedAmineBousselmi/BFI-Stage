package com.example.BanqueSI.WebServices.EmployeWebService;

import com.example.BanqueSI.EnumRetour.OperationRetour;
import com.example.BanqueSI.WebServices.taskWebService.Task;
import com.example.BanqueSI.dao.ChangeRepository;
import com.example.BanqueSI.dao.ChequeRepository;
import com.example.BanqueSI.dao.EmployeRepository;
import com.example.BanqueSI.dao.TaskRepository;
import com.example.BanqueSI.entities.*;
import com.example.BanqueSI.entities.Authority;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


/**
 * Created by amino on 04/08/2017
 */
@Component
public class EmployeRepo {

    //--ATTRIBUTS
    @Autowired
    private EmployeRepository employeRepository;
    @Autowired
    private TaskRepository taskRepository;
    @Autowired
    private ChangeRepository changeRepository;
    @Autowired
    private ChequeRepository chequeRepository;
    @Autowired
    private PasswordEncoder passwordEncoder;
    //--END ATTRIBUTS

    //--METHODES
    public List<Employe> getEmployes(Long idAgence){

        List<Employe> employes = new ArrayList<>();

        for(com.example.BanqueSI.entities.Employe e : employeRepository.findAll()){
            if(e.getAgence().getCodeAgence() == idAgence){
                Employe employe = new Employe();
                employe.setCodeEmploye(e.getCodeEmploye());
                employe.setUsername(e.getUsername());
                employes.add(employe);
            }
        }
        return employes;
    }

    public List<EmployeMax> getAllEmployes(Long idAgence){

        List<EmployeMax> employes = new ArrayList<>();

        for(com.example.BanqueSI.entities.Employe e : employeRepository.findAll()){
            if(e.getAgence().getCodeAgence() == idAgence){
                EmployeMax employe = new EmployeMax();
                employe.setCodeEmploye(e.getCodeEmploye());
                employe.setUsername(e.getUsername());

                employe.setTask(getAllTasksByIdEmploye(e.getCodeEmploye()));
                employe.setChange(getAllChangeByIdEmploye(e.getCodeEmploye()));
                employe.setCheque(getAllChequeByIdEmploye(e.getCodeEmploye()));

                employes.add(employe);
            }
        }
        return employes;
    }

    public List<com.example.BanqueSI.WebServices.EmployeWebService.Task> getAllTasksByIdEmploye(Long codeEmploye){
        List<com.example.BanqueSI.WebServices.EmployeWebService.Task> tasks = new ArrayList<>();
        for(com.example.BanqueSI.entities.Task t : taskRepository.findAll()){
            if(t.getEmploye().getCodeEmploye() == codeEmploye){
                com.example.BanqueSI.WebServices.EmployeWebService.Task task = new com.example.BanqueSI.WebServices.EmployeWebService.Task();
                task.setIdTask(t.getIdTask());
                task.setStatus(t.isStatus());
                task.setTaskName(t.getTaskName());
                task.setTaskMessage(t.getTaskMessage());
                task.setTaskType(t.getTaskType());
                tasks.add(task);
            }
        }
        return tasks;
    }

    public List<com.example.BanqueSI.WebServices.EmployeWebService.Change> getAllChangeByIdEmploye(Long codeEmploye){
        List<com.example.BanqueSI.WebServices.EmployeWebService.Change> changes = new ArrayList<>();
        for(com.example.BanqueSI.entities.Change c : changeRepository.findAll()){
            if(c.getEmploye().getCodeEmploye() == codeEmploye){
                com.example.BanqueSI.WebServices.EmployeWebService.Change change= new com.example.BanqueSI.WebServices.EmployeWebService.Change();
                change.setIdChange(c.getIdChange());
                change.setChangeType(c.getChangeType().toString());
                change.setIdentif(c.getIdentif());
                change.setMontant(c.getMontant());
                change.setNomP(c.getNomP());
                change.setPrenomP(c.getPrenomP());

                changes.add(change);
            }
        }
        return changes;
    }

    public List<com.example.BanqueSI.WebServices.EmployeWebService.Cheque> getAllChequeByIdEmploye(Long codeEmploye){
        List<com.example.BanqueSI.WebServices.EmployeWebService.Cheque> cheques = new ArrayList<>();
        for(com.example.BanqueSI.entities.Cheque c : chequeRepository.findAll()){
            if(c.getEmploye().getCodeEmploye() == codeEmploye){
                com.example.BanqueSI.WebServices.EmployeWebService.Cheque cheque =  new com.example.BanqueSI.WebServices.EmployeWebService.Cheque();
                cheque.setIdC(c.getIdC());
                cheque.setClient(c.getClient().getCodeClient());
                cheque.setMontant(c.getMontant());
                cheque.setNomProprietaire(c.getNomProprietaire());
                cheque.setPrenomProprietaire(c.getPrenomProprietaire());
                cheque.setNumeroC(c.getNumeroC());
                cheques.add(cheque);
            }
        }
        return cheques;
    }

    public String addEmploye(EmployeAdd employeAdd){

        com.example.BanqueSI.entities.Employe employe = new com.example.BanqueSI.entities.Employe();
        employe.setUsername(employeAdd.getUsername());
        employe.setPassword(passwordEncoder.encode(employeAdd.getPassword()));
        Agence agence = new Agence();
        agence.setCodeAgence(employeAdd.getAgence());
        employe.setAgence(agence);
        if(employeAdd.getAgence() != 0){
            com.example.BanqueSI.entities.Employe employeSup = new com.example.BanqueSI.entities.Employe();
            employeSup.setCodeEmploye(employeAdd.getEmployeSup());
            employe.setEmployeSup(employeSup);
        }


        employeRepository.save(employe);
        return OperationRetour.EMPLOYE_SAVED.toString();
    }

    public String updateEmploye(Long codeEmploye,String username, String password){
        employeRepository.UpdateEmploye(codeEmploye,username,password);
        return OperationRetour.EMPLOYE_SAVED.toString();
    }


    public EmployeAuth loadUserByUsername(String username){
        com.example.BanqueSI.entities.Employe employe = employeRepository.findByUsername(username);

        EmployeAuth employeAuth = new EmployeAuth();
        employeAuth.setCodeEmploye(employe.getCodeEmploye());
        employeAuth.setAgence(employe.getAgence().getCodeAgence());
        employeAuth.setUsername(employe.getUsername());
        employeAuth.setPassword(employe.getPassword());
        List<com.example.BanqueSI.WebServices.EmployeWebService.Authority> authorities = new ArrayList<>();
        for(GrantedAuthority author : employe.getAuthorities()){
            com.example.BanqueSI.WebServices.EmployeWebService.Authority authority = new com.example.BanqueSI.WebServices.EmployeWebService.Authority();
            authority.setName(author.getAuthority());
            authorities.add(authority);
        }
        employeAuth.setAuthority(authorities);
        return employeAuth;
    }

    //--END METHODES

}
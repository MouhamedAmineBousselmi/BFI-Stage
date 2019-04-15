package com.example.BanqueSI.WebServices.taskWebService;

import com.example.BanqueSI.dao.EmployeRepository;
import com.example.BanqueSI.dao.TaskRepository;
import com.example.BanqueSI.entities.Employe;
import com.sun.org.apache.xerces.internal.jaxp.datatype.XMLGregorianCalendarImpl;
import org.apache.axis2.databinding.types.xsd.Date;
import org.joda.time.LocalDate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;


/**
 * Created by amino on 04/08/2017
 */
@Component
public class TaskRepo {

    @Autowired
    private TaskRepository taskRepository;
    @Autowired
    private EmployeRepository employeRepository;

    public Task addTask(Task task){
        com.example.BanqueSI.entities.Task task1 = new com.example.BanqueSI.entities.Task();

        task1.setIdTask(task.getIdTask());
        task1.setNextStep(task.getNextStep());
        task1.setPriority(task.getPriority());
        task1.setStatus(task.isStatus());
        task1.setTaskMessage(task.getTaskMessage());
        task1.setTaskName(task.getTaskName());
        task1.setTaskType(task.getTaskType());

        Employe employe = employeRepository.findOne(task.getEmploye());
        task1.setEmploye(employe);

        //start date
        java.util.Date date = new java.util.Date();
        date.setYear(task.getStartDate().getYear()-1900);
        date.setMonth(task.getStartDate().getMonth()-1);
        date.setDate(task.getStartDate().getDay());
        //--//

        task1.setStartDate(date);

        //deadline date
        java.util.Date dateDline = new java.util.Date();
        dateDline.setYear(task.getDeadline().getYear()-1900);
        dateDline.setMonth(task.getDeadline().getMonth()-1);
        dateDline.setDate(task.getDeadline().getDay());
        //--//
        task1.setDeadline(dateDline);

        taskRepository.save(task1);
        return task;
    }

    public TaskMin getTaskStatuts(Long idT){

        TaskMin task = new TaskMin();
        for(com.example.BanqueSI.entities.Task t : taskRepository.findAll()){
            if(t.getIdTask() == idT){
                 task.setIdTask(t.getIdTask());
                 task.setStatus(t.isStatus());
            }
        }
        return task;
    }

    public TaskD deleteTask(Long idT){
        TaskD task = new TaskD();
        task.setIdTask(taskRepository.findOne(idT).getIdTask());
        task.setStatus(taskRepository.findOne(idT).isStatus());
        task.setNextStep(taskRepository.findOne(idT).getNextStep());
        task.setPriority(taskRepository.findOne(idT).getPriority());
        task.setTaskMessage(taskRepository.findOne(idT).getTaskMessage());
        task.setTaskName(taskRepository.findOne(idT).getTaskName());
        task.setEmploye(taskRepository.findOne(idT).getEmploye().getCodeEmploye());
        task.setTaskType(taskRepository.findOne(idT).getTaskType());
        taskRepository.delete(idT);
        return task;
    }

    public List<Task> getTasks(Long idAgence){
        List<Task> tasks = new ArrayList<>();

        for(com.example.BanqueSI.entities.Task t : taskRepository.findAll()){
            if(t.getEmploye().getAgence().getCodeAgence() == idAgence){
                Task task = new Task();
                task.setIdTask(t.getIdTask());
                task.setStatus(t.isStatus());
                task.setNextStep(t.getNextStep());
                task.setPriority(t.getPriority());
                task.setTaskMessage(t.getTaskMessage());
                task.setTaskName(t.getTaskName());
                task.setEmploye(t.getEmploye().getCodeEmploye());
                task.setTaskType(t.getTaskType());

                //--conversion XMLGREGORIANCALENDAR TO JAVA.UTIL.DATE
                GregorianCalendar dateG = new GregorianCalendar();
                dateG.setTime(t.getStartDate());
                try {
                    XMLGregorianCalendar dateConv = DatatypeFactory.newInstance().newXMLGregorianCalendar(dateG);
                    task.setStartDate(dateConv);
                } catch (DatatypeConfigurationException e) {
                    e.printStackTrace();
                }
                //--//

                //--conversion XMLGREGORIANCALENDAR TO JAVA.UTIL.DATE
                GregorianCalendar dateD = new GregorianCalendar();
                dateG.setTime(t.getDeadline());
                try {
                    XMLGregorianCalendar dateConv1 = DatatypeFactory.newInstance().newXMLGregorianCalendar(dateD);
                    task.setDeadline(dateConv1);
                } catch (DatatypeConfigurationException e) {
                    e.printStackTrace();
                }

                //--//
                tasks.add(task);
            }
        }
        return tasks;
    }

}
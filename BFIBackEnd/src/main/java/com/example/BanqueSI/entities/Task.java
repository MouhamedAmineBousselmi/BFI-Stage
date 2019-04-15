package com.example.BanqueSI.entities;

import org.joda.time.LocalDate;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlTransient;
import java.util.Date;

/**
 * Created by amino on 05/08/2017
 */

@Entity
public class Task {

    //--ATTRIBUTS
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idTask;
    private String taskName;
    private String taskMessage;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date startDate;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date deadline;
    private boolean status;
    private String nextStep;
    private String priority;
    private String taskType;

    @ManyToOne(fetch = FetchType.EAGER)
    private Employe employe;
    //--END ATTRIBUTS

    //--CONSTRUCTOR
    public Task(){}
    //--END CONSTRUCTOR

    //--GETTERS SETTERS
    @XmlTransient
    public Employe getEmploye() {
        return employe;
    }

    public void setEmploye(Employe employe) {
        this.employe = employe;
    }

    public Long getIdTask() {
        return idTask;
    }

    public void setIdTask(Long idTask) {
        this.idTask = idTask;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getTaskMessage() {
        return taskMessage;
    }

    public void setTaskMessage(String taskMessage) {
        this.taskMessage = taskMessage;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getDeadline() {
        return deadline;
    }

    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getNextStep() {
        return nextStep;
    }

    public void setNextStep(String nextStep) {
        this.nextStep = nextStep;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public String getTaskType() {
        return taskType;
    }

    public void setTaskType(String taskType) {
        this.taskType = taskType;
    }

    //--END GETTERS SETTERS

    //--METHODES

    @Override
    public String toString() {
        return "Task{" +
                "idTask=" + idTask +
                ", taskName='" + taskName + '\'' +
                ", taskMessage='" + taskMessage + '\'' +
                ", startDate=" + startDate +
                ", deadline=" + deadline +
                ", status=" + status +
                ", nextStep='" + nextStep + '\'' +
                ", priority='" + priority + '\'' +
                ", taskType='" + taskType + '\'' +
                ", employe=" + employe +
                '}';
    }


    //--END METHODES
}

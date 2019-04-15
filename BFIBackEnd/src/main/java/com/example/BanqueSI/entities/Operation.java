package com.example.BanqueSI.entities;

import com.fasterxml.jackson.annotation.*;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by amino on 18/06/2017
 */

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Operation implements Serializable{

    //--ATTRIBUTS
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long numeroOperation;
    private Date dateOperation;
    private double montant;
    @ManyToOne
    @JoinColumn(name = "CODE_CPTE")
    private Compte compte;
    @ManyToOne
    @JoinColumn(name = "CODE_EMP")
    private Employe employe;

    @ManyToOne
    private PageOperation pageOperation;

    @Enumerated(EnumType.STRING)
    private OperationType typeO;
    //--END ATTRIBUTS

    //--CONSTRUCTEUR
    public Operation(){}
    //--END CONSTRUCTEUR

    //--GETTERS SETTERS

    public PageOperation getPageOperation() {
        return pageOperation;
    }

    public void setPageOperation(PageOperation pageOperation) {
        this.pageOperation = pageOperation;
    }

    public void setTypeO(OperationType typeO) {
        this.typeO = typeO;
    }

    public void setNumeroOperation(Long numeroOperation) {
        this.numeroOperation = numeroOperation;
    }

    public void setDateOperation(Date dateOperation) {
        this.dateOperation = dateOperation;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }
    @JsonSetter
    public void setCompte(Compte compte) {
        this.compte = compte;
    }
    @JsonSetter
    public void setEmploye(Employe employe) {
        this.employe = employe;
    }

    public Long getNumeroOperation() {
        return numeroOperation;
    }

    public Date getDateOperation() {
        return dateOperation;
    }

    public double getMontant() {
        return montant;
    }
    @JsonIgnore
    @XmlTransient
    public Compte getCompte() {
        return compte;
    }
    @JsonIgnore
    @XmlTransient
    public Employe getEmploye() {
        return employe;
    }

    public OperationType getTypeO() {
        return typeO;
    }
//--END GETTERS SETTERS

    //--METHODES
    //--END METHODES

}
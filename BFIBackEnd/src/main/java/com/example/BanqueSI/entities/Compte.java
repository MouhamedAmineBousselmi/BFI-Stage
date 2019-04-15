package com.example.BanqueSI.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSetter;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlTransient;
import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

/**
 * Created by amino on 18/06/2017
 */

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Compte implements Serializable {

    //--ATTRIBUTS

    @Id
    private String codeCompte;
    private Date dateCreation;
    private double solde;
    private double decouvert;
    private double taux;
    @ManyToOne
    @JoinColumn(name = "CODE_CLI")
    private Client client;

    @ManyToOne
    @JoinColumn(name = "CODE_EMP")
    private Employe employe;
    @OneToMany(mappedBy = "compte")
    private Collection<Operation> operations;

    @ManyToOne
    private Agence agence;
    @OneToMany(mappedBy = "compte")
    private Collection<Cheque> cheque;
    @Enumerated(EnumType.STRING)
    private CompteType type;
    //--END ATTRIBUTS

    //--CONSTRUCTEUR
    public Compte(){}
    //--END CONSTRUCTEUR

    //--GETTERS SETTERS

    public void setTaux(double taux) {
        this.taux = taux;
    }

    @JsonIgnore
    @XmlTransient
    public Collection<Cheque> getCheque() {
        return cheque;
    }
    @JsonSetter
    public void setCheque(Collection<Cheque> cheque) {
        this.cheque = cheque;
    }

    @JsonIgnore
    @XmlTransient
    public Agence getAgence() {
        return agence;
    }
    @JsonSetter
    public void setAgence(Agence agence) {
        this.agence = agence;
    }

    public void setDecouvert(double decouvert) {
        this.decouvert = decouvert;
    }

    public void setTypeC(CompteType typeC) {
        this.type = typeC;
    }

    public void setCodeCompte(String codeCompte) {
        this.codeCompte = codeCompte;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public void setEmploye(Employe employe) {
        this.employe = employe;
    }

    public void setOperations(Collection<Operation> operations) {
        this.operations = operations;
    }

    public String getCodeCompte() {
        return codeCompte;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public double getSolde() {
        return solde;
    }

    public Client getClient() {
        return client;
    }

    public Employe getEmploye() {
        return employe;
    }
    @JsonIgnore
    @XmlTransient
    public Collection<Operation> getOperations() {
        return operations;
    }

    public double getTaux() {
        return taux;
    }

    public CompteType getType() {
        return type;
    }

    public double getDecouvert() {
        return decouvert;
    }
    //--END GETTERS SETTERS

    //--METHODES

    @Override
    public String toString() {
        return "Compte{" +
                "codeCompte='" + codeCompte + '\'' +
                ", dateCreation=" + dateCreation +
                ", solde=" + solde +
                ", client=" + client +
                ", employe=" + employe +
                ", operations=" + operations +
                '}';
    }

    //--END METHODES

}

package com.example.BanqueSI.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSetter;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlTransient;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * Created by amino on 13/07/2017.
 */
@Entity
@Table(name = "changeBanque")
public class Change implements Serializable {

    //--ATTRIBUTS
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idChange;
    private String identif;

    private String nomP;
    private String prenomP;
    private Date dateChange;
    private double montant;
    private String adresseP;
    private String destination;

    @ManyToOne
    private Employe employe;

    @Enumerated(EnumType.STRING)
    private ChangeType changeType;

    //--END ATTRIBUTS

    //--CONSTRUCTOR
    public Change(){}
    //--END CONSTRUCTOR

    //--GETTERS SETTERS

    @JsonIgnore
    @XmlTransient
    public Employe getEmploye() {
        return employe;
    }
    @JsonSetter
    public void setEmploye(Employe employe) {
        this.employe = employe;
    }

    public Long getIdChange() {
        return idChange;
    }

    public void setIdChange(Long idChange) {
        this.idChange = idChange;
    }

    public String getIdentif() {
        return identif;
    }

    public void setIdentif(String identif) {
        this.identif = identif;
    }

    public ChangeType getChangeType() {
        return changeType;
    }

    public void setChangeType(ChangeType changeType) {
        this.changeType = changeType;
    }

    public String getNomP() {
        return nomP;
    }

    public void setNomP(String nomP) {
        this.nomP = nomP;
    }

    public String getPrenomP() {
        return prenomP;
    }

    public void setPrenomP(String prenomP) {
        this.prenomP = prenomP;
    }

    public Date getDateChange() {
        return dateChange;
    }

    public void setDateChange(Date dateChange) {
        this.dateChange = dateChange;
    }

    public double getMontant() {
        return montant;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }

    public String getAdresseP() {
        return adresseP;
    }

    public void setAdresseP(String adresseP) {
        this.adresseP = adresseP;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    //--END GETTERS SETTERS

    //--METHODES
    @Override
    public String toString() {
        return "Change{" +
                "identificateur='" + identif + '\'' +
                ", nomP='" + nomP + '\'' +
                ", prenomP='" + prenomP + '\'' +
                ", dateChange=" + dateChange +
                ", montant=" + montant +
                ", adresseP='" + adresseP + '\'' +
                ", destination='" + destination + '\'' +
                ", changeType=" + changeType +
                '}';
    }
    //--END METHODES
}
package com.example.BanqueSI.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSetter;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlTransient;
import java.io.Serializable;
import java.sql.Time;
import java.util.Calendar;
import java.util.Collection;

/**
 * Created by amino on 18/06/2017
 */

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Agence implements Serializable{

    //--ATTRIBUTS
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codeAgence;
    private String nomAgence;
    private String adresseAgence;
    private Time heureOuverture;
    private Time heureFermeture;

    @OneToMany(mappedBy = "agence")
    private Collection<Employe> employes;
    @OneToMany(mappedBy = "agence")
    private Collection<Client> clients;
    @OneToMany(mappedBy = "agence")
    private Collection<Compte> comptes;
    private double FondLiquideQuotidien;
    //--END ATTRIBUTS

    //--CONSTRUCTEUR

    public double getFondLiquideQuotidien() {
        return FondLiquideQuotidien;
    }

    public void setFondLiquideQuotidien(double fondLiquideQuotidien) {
        FondLiquideQuotidien = fondLiquideQuotidien;
    }

    public Agence(){
        if(Calendar.MONTH >= 6 &&  Calendar.MONTH <= 8 ) {
            heureOuverture = new Time(7, 0, 0);
            heureFermeture = new Time( 16, 30, 0);
            heureOuverture.getTime();
            heureFermeture.getTime();
        }else{
            heureOuverture = new Time( 8, 0, 0);
            heureFermeture = new Time(13, 0, 0);
            heureOuverture.getTime();
            heureFermeture.getTime();
       }
    }
    //--END CONSTRUCTEUR

    //--GETTERS SETTERS
    @JsonIgnore
    @XmlTransient
    public Collection<Compte> getComptes() {
        return comptes;
    }
    @JsonSetter
    public void setComptes(Collection<Compte> comptes) {
        this.comptes = comptes;
    }

    public Time getHeureOuverture() {
        return heureOuverture;
    }

    public Time getHeureFermeture() {
        return heureFermeture;
    }

    public String getAdresseAgence() {
        return adresseAgence;
    }
    @JsonIgnore
    @XmlTransient
    public Collection<Client> getClients() {
        return clients;
    }

    public Long getCodeAgence() {
        return codeAgence;
    }

    public String getNomAgence() {
        return nomAgence;
    }
    @JsonIgnore
    @XmlTransient
    public Collection<Employe> getEmployes() {
        return employes;
    }

    public void setCodeAgence(Long codeAgence) {
        this.codeAgence = codeAgence;
    }

    public void setNomAgence(String nomAgence) {
        this.nomAgence= nomAgence;
    }
    @JsonSetter
    public void setEmployes(Collection<Employe> employes) {
        this.employes = employes;
    }
    @JsonSetter
    public void setClients(Collection<Client> clients) {
        this.clients = clients;
    }

    public void setAdresseAgence(String adresseAgence) {
        this.adresseAgence = adresseAgence;
    }

    public void setHeureOuverture(Time heureOuverture) {
        this.heureOuverture = heureOuverture;
    }

    public void setHeureFermeture(Time heureFermeture) {
        this.heureFermeture = heureFermeture;
    }
    //--END GETTERS SETTERS

    //--METHODES

    @Override
    public String toString() {
        return "Agence{" +
                "codeAgence=" + codeAgence +
                ", nomAgence='" + nomAgence + '\'' +
                ", adresseAgence='" + adresseAgence + '\'' +
                ", heureOuverture=" + heureOuverture +
                ", heureFermeture=" + heureFermeture +
                ", employes=" + employes +
                ", clients=" + clients +
                ", comptes=" + comptes +
                '}';
    }

    //--END METHODES
}
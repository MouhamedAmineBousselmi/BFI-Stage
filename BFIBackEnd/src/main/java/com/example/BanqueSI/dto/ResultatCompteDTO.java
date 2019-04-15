package com.example.BanqueSI.dto;

import com.example.BanqueSI.entities.Compte;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by amino on 06/07/2017
 */
public class ResultatCompteDTO implements Serializable{

    //--ATTRIBUTS
    private String codeCompte;
    private Date dateCreation;
    private double solde;
    private double decouvert;
    private double taux;
    private String type;
    private String message;
    //--END ATTRIBUTS

    //--CONSTRUCTOR
    public ResultatCompteDTO(){}
    //--END CONSTRUCTOR

    //--GETTERS SETTERS

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCodeCompte() {
        return codeCompte;
    }

    public void setCodeCompte(String codeCompte) {
        this.codeCompte = codeCompte;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public double getDecouvert() {
        return decouvert;
    }

    public void setDecouvert(double decouvert) {
        this.decouvert = decouvert;
    }

    public double getTaux() {
        return taux;
    }

    public void setTaux(double taux) {
        this.taux = taux;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    //--END GETTERS SETTERS

    //--METHODES

    //--END METHODES
}
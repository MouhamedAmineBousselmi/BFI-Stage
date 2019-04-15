package com.example.BanqueSI.dto;

import java.util.Date;
import java.util.List;

/**
 * Created by amino on 16/07/2017
 */
public class ResultatChangeDTO{

    //--ATTRIBUTS
    private String identif;

    private String nomP;
    private String prenomP;
    private Date dateChange;
    private double montant;
    private String adresseP;
    private String destination;

    private String message;
    //--END ATTRIBUTS

    //--CONSTRUCTOR
    public ResultatChangeDTO(){}
    //--END CONSTRUCTOR

    //--GETTERS SETTERS

    public String getIdentif() {
        return identif;
    }

    public void setIdentif(String identif) {
        this.identif = identif;
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

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    //--END GETTERS SETTERS
}
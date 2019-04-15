package com.example.BanqueSI.dto;

import java.sql.Time;

/**
 * Created by amino on 18/07/2017
 */
public class ResultatAgenceDTO {

    //--ATTRIBUTS
    private String nomAgence;
    private String adresseAgence;
    private Time heureOuverture;
    private Time heureFermeture;
    private String message;
    private double FondLiquideQuotidien;
    //--END ATTRIBUTS

    //--CONSTRUCTOR
    public ResultatAgenceDTO(){}
    //--END CONSTRUCTOR

    //--GETTERS SETTERS

    public String getNomAgence() {
        return nomAgence;
    }

    public void setNomAgence(String nomAgence) {
        this.nomAgence = nomAgence;
    }

    public String getAdresseAgence() {
        return adresseAgence;
    }

    public void setAdresseAgence(String adresseAgence) {
        this.adresseAgence = adresseAgence;
    }

    public Time getHeureOuverture() {
        return heureOuverture;
    }

    public void setHeureOuverture(Time heureOuverture) {
        this.heureOuverture = heureOuverture;
    }

    public Time getHeureFermeture() {
        return heureFermeture;
    }

    public void setHeureFermeture(Time heureFermeture) {
        this.heureFermeture = heureFermeture;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public double getFondLiquideQuotidien() {
        return FondLiquideQuotidien;
    }

    public void setFondLiquideQuotidien(double fondLiquideQuotidien) {
        FondLiquideQuotidien = fondLiquideQuotidien;
    }

    //--END GETTERS SETTERS

}
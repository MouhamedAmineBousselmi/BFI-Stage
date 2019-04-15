package com.example.BanqueSI.dto;

import java.util.Date;

/**
 * Created by amino on 19/07/2017
 */
public class ResultatChequeDTO{

    //--ATTRIBUTS
    private String nomProprietaire;
    private String prenomProprietaire;
    private double montant;
    private double numeroC;
    private Date dateV;
    private String message;
    //--END ATTRIBUTS

    //--CONSTRUCTOR
    public ResultatChequeDTO() {}
    //--END CONSTRUCTOR

    //--GETTERS SETTERS

    public String getNomProprietaire() {
        return nomProprietaire;
    }

    public void setNomProprietaire(String nomProprietaire) {
        this.nomProprietaire = nomProprietaire;
    }

    public String getPrenomProprietaire() {
        return prenomProprietaire;
    }

    public void setPrenomProprietaire(String prenomProprietaire) {
        this.prenomProprietaire = prenomProprietaire;
    }

    public double getMontant() {
        return montant;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }

    public double getNumeroC() {
        return numeroC;
    }

    public void setNumeroC(double numeroC) {
        this.numeroC = numeroC;
    }

    public Date getDateV() {
        return dateV;
    }

    public void setDateV(Date dateV) {
        this.dateV = dateV;
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
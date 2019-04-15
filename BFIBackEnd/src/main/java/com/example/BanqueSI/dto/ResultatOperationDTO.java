package com.example.BanqueSI.dto;

import com.example.BanqueSI.entities.Operation;

import java.util.Date;

/**
 * Created by amino on 06/07/2017
 */
public class ResultatOperationDTO {

    //--ATTRIBUTS
    private Long numeroOperation;
    private Date dateOperation;
    private double montant;
    private String typeO;
    private String message;
    //--END ATTRIBUTS

    //--CONSTRUCTOR
    public ResultatOperationDTO(){}
    //--END CONSTRUCTOR

    //--GETTERS SETTERS

    public Long getNumeroOperation() {
        return numeroOperation;
    }

    public void setNumeroOperation(Long numeroOperation) {
        this.numeroOperation = numeroOperation;
    }

    public Date getDateOperation() {
        return dateOperation;
    }

    public void setDateOperation(Date dateOperation) {
        this.dateOperation = dateOperation;
    }

    public double getMontant() {
        return montant;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }

    public String getTypeO() {
        return typeO;
    }

    public void setTypeO(String typeO) {
        this.typeO = typeO;
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
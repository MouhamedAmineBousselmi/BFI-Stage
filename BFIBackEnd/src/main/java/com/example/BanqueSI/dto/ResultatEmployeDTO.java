package com.example.BanqueSI.dto;

import com.example.BanqueSI.entities.Employe;

import java.sql.Time;
import java.util.Date;
import java.util.List;

/**
 * Created by amino on 06/07/2017
 */
public class ResultatEmployeDTO {
    //--ATTRIBUTS
    private Long codeEmploye;
    private String username;
    private String NomAgenceAppartient;
    private Time   OAgenceAppartient;
    private Time   FAgenceAppartient;
    private String message;
    //--END ATTRIBUTS

    //--CONSTRUCTOR
    public ResultatEmployeDTO() {}
    //--END CONSTRUCTOR

    //--GETTERS SETTERS


    public String getNomAgenceAppartient() {
        return NomAgenceAppartient;
    }

    public void setNomAgenceAppartient(String nomAgenceAppartient) {
        NomAgenceAppartient = nomAgenceAppartient;
    }

    public Time getOAgenceAppartient() {
        return OAgenceAppartient;
    }

    public void setOAgenceAppartient(Time OAgenceAppartient) {
        this.OAgenceAppartient = OAgenceAppartient;
    }

    public Time getFAgenceAppartient() {
        return FAgenceAppartient;
    }

    public void setFAgenceAppartient(Time FAgenceAppartient) {
        this.FAgenceAppartient = FAgenceAppartient;
    }

    public Long getCodeEmploye() {
        return codeEmploye;
    }

    public void setCodeEmploye(Long codeEmploye) {
        this.codeEmploye = codeEmploye;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    //--END GETTERS SETTERS
}
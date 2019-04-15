package com.example.BanqueSI.dto;

import com.example.BanqueSI.entities.Client;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.List;

/**
 * Created by amino on 06/07/2017
 */
public class ResultatClientDTO{

    //--ATTRIBUTS

    private String message;
    private String nomClient;
    //--END ATTRIBUTS

    //--CONSTRUCTOR
    public ResultatClientDTO(){}
    //--END CONSTRUCTOR

    //--GETTERS SETTERS

    public String getNomClient() {
        return nomClient;
    }

    public void setNomClient(String nomClient) {
        this.nomClient = nomClient;
    }

    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
    //--END GETTERS SETTERS

    //--METHODES

    @Override
    public String toString() {
        return "ResultatClient{" +
                ", message='" + message + '\'' +
                '}';
    }

    //--END METHODES
}
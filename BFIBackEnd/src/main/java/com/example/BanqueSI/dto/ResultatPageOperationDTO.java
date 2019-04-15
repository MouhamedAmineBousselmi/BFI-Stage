package com.example.BanqueSI.dto;

import org.springframework.data.domain.Page;

/**
 * Created by amino on 16/07/2017
 */
public class ResultatPageOperationDTO{
    //--ATTRIBUTS
    private Page opr;
    private String message;
    //--END ATTRIBUTS

    //--CONSTRUCTOR
    public ResultatPageOperationDTO(){}
    //--END CONSTRUCTOR

    //--GETTERS SETTERS

    public Page getOpr() {
        return opr;
    }

    public void setOpr(Page opr) {
        this.opr = opr;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
//--END GETTERS SETTERS
}
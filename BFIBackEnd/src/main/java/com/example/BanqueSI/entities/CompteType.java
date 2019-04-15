package com.example.BanqueSI.entities;

/**
 * Created by amino on 29/06/2017
 */
public enum  CompteType{
    CC ("CC"),
    CE ("CE");

    private final String nom;

    CompteType(String nom){
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }
}

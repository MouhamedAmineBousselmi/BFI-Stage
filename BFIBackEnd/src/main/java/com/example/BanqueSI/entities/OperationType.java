package com.example.BanqueSI.entities;

/**
 * Created by amino on 29/06/2017
 */
public enum OperationType {
    R("R"),
    V ("V"),
    VI("VI");

    private final String nom;

    OperationType(String nom){
        this.nom = nom;
    }
}

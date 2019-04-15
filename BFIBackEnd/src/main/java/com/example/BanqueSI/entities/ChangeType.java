package com.example.BanqueSI.entities;

/**
 * Created by amino on 13/07/2017.
 */
public enum ChangeType {
    ACHAT("achat"),
    VENTE ("vente");

    private final String nom;

    ChangeType(String nom){
        this.nom = nom;
    }
}
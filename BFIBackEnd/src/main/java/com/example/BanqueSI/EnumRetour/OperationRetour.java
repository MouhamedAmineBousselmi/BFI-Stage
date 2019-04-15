package com.example.BanqueSI.EnumRetour;

/**
 * Created by amino on 29/06/2017.
 */
public enum OperationRetour {
    TECHNICAL_PROBLEM("TECHNICAL PROBLEM"),
    CLIENT_SAVED("Client enregistrer avec succès"),
    INSERT_CLIENT("INSERT CLIENT"),
    INSERT_EMPLOYE("INSERT_EMPLOYE"),
    EMPLOYE_SAVED("Employe enregistrer avec succès"),
    EMPTY_LIST("EMPTY LIST"),
    INSERT_ACCOUNT("INSERT ACCOUNT"),
    ACCOUNT_SAVED("Compte enregistrer avec succès"),
    ACCOUNT_NON_EXIST("compte inexistant"),
    INSERT_OPERATION("inserer une operation"),
    INSUFFICIENT_MONEY("solde insuffisant"),
    VERSEMENT_SAVED("versement effectuer avec succès"),
    RETRAIT_SAVED("retrait effectuer avec succès"),
    VIREMENT_SAVED("virement effectuer avec succès"),
    ACCOUNT_FOUND("compte trouvé"),
    CLIENTS_FOUND("clients trouvés"),
    CLIENT_ADD_TO_LIST("client ajouté au liste"),
    OPERATION_PAGE_GET("operation page recuperer"),
    EMPTY_FORM("formulaire vide"),
    CHANGE_SAVED("change effectuer"),
    TAUX_DEVISE_SERVICE_NOT_FOUND("probleme de recupération du taux de devise"),
    TAUX_FOUND("taux de change recuperer"),
    LIST_CHANGE("liste de change"),
    INSERT_AGENCE("inserer une agence"),
    AGENCE_NOT_FOUND("agence introuvable"),
    AGENCE_FOUND("agence trouve"),
    AGENCE_SAVED("agence enregistrer"),
    CHEQUE_SAVED("cheque enregistrer"),
    CHEQUE_NOT_FOUND("cheque introuvable"),
    CHEQUE_FOUND("cheque trouver"),
    EMPLOYE_FOUND("employe trouver"),
    EMPLOYE_NOT_FOUND("employe non trouver"),
    TASK_FOUND("tache trouver");
    private String nom;

    OperationRetour(String nom){
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public String toString() {
        return  nom;
    }
}
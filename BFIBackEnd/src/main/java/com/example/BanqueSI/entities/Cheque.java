package com.example.BanqueSI.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSetter;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlTransient;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by amino on 19/07/2017
 */
@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Cheque implements Serializable {
    //--ATTRIBUTS
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idC;

    private String nomProprietaire;
    private String prenomProprietaire;
    @Column(nullable = true)
    private double montant;
    @Column(nullable = true)
    private double numeroC;
    @Column(nullable = true)
    private int nbrPagesC;
    private Date dateV;

    @ManyToOne
    private Compte compte;

    @ManyToOne
    private Client client;

    @ManyToOne
    private Employe employe;
    //--END ATTRIBUTS

    //--CONSTRUCTOR
    public Cheque(){}
    //--END CONSTRUCTOR

    //--GETTERS SETTERS

    public Date getDateV() {
        return dateV;
    }

    public void setDateV(Date dateV) {
        this.dateV = dateV;
    }

    public Long getIdC() {
        return idC;
    }

    public void setIdC(Long idC) {
        this.idC = idC;
    }
    @JsonIgnore
    @XmlTransient
    public Employe getEmploye() {
        return employe;
    }
    @JsonSetter
    public void setEmploye(Employe employe) {
        this.employe = employe;
    }

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

    public int getNbrPagesC() {
        return nbrPagesC;
    }

    public void setNbrPagesC(int nbrPagesC) {
        this.nbrPagesC = nbrPagesC;
    }

    public Compte getCompte() {
        return compte;
    }

    public void setCompte(Compte compte) {
        this.compte = compte;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public double getNumeroC() {
        return numeroC;
    }

    public void setNumeroC(double numeroC) {
        this.numeroC = numeroC;
    }

    public double getMontant() {
        return montant;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }
//--END GETTERS SETTERS

    //--METHODES

    @Override
    public String toString() {
        return "Cheque{" +
                "idC=" + idC +
                ", numeroC=" + numeroC +
                ", nomProprietaire='" + nomProprietaire + '\'' +
                ", prenomProprietaire='" + prenomProprietaire + '\'' +
                ", Montant=" + montant +
                ", nbrPagesC=" + nbrPagesC +
                ", compte=" + compte +
                ", client=" + client +
                ", employe=" + employe +
                '}';
    }


    //-- END METHODES
}
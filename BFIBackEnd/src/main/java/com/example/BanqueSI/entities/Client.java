package com.example.BanqueSI.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSetter;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlTransient;
import java.io.Serializable;
import java.util.Collection;

/**
 * Created by amino on 18/06/2017
 */

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Client  implements Serializable{

    //--ATTRIBUTS
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codeClient;
    private String nomClient;
    @OneToMany(mappedBy = "client",fetch = FetchType.LAZY)
    private Collection<Compte> comptes;

    @ManyToOne
    private Agence agence;

    @OneToMany(mappedBy = "client")
    private Collection<Cheque> cheque;
    //--END ATTRIBUTS

    //--CONSTRUCTEUR
    public Client(){}
    //--END CONSTRUCTEUR

    //--GETTERS SETTERS
    @JsonSetter
    public void setAgence(Agence agence) {
        this.agence = agence;
    }

    public void setCodeClient(Long codeClient) {
        this.codeClient = codeClient;
    }

    public void setNomClient(String nomClient) {
        this.nomClient = nomClient;
    }
    @JsonSetter
    public void setComptes(Collection<Compte> comptes) {
        this.comptes = comptes;
    }

    public Long getCodeClient() {
        return codeClient;
    }

    public String getNomClient() {
        return nomClient;
    }
    @JsonIgnore
    @XmlTransient
    public Collection<Compte> getComptes() {
        return comptes;
    }
    @JsonIgnore
    @XmlTransient
    public Agence getAgence() {
        return agence;
    }
//--END GETTERS SETTERS

    //--METHODES

    @Override
    public String toString() {
        return "Client{" +
                "codeClient=" + codeClient +
                ", nomClient='" + nomClient + '\'' +
                ", comptes=" + comptes +
                '}';
    }

    //--END METHODES
}
package com.example.BanqueSI.entities;

import com.example.BanqueSI.entities.Operation;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import java.io.Serializable;
import java.util.List;

/**
 * Created by amino on 19/06/2017
 */
@Entity
public class PageOperation implements Serializable {

    //--Attributs
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idP;
    @OneToMany
    private List<Operation> operations;
    private  int page;
    private int nombreOperations;
    private int totalOperations;
    private int totalPages;
    //-- End Attributs

    //--GETTERS SETTERS

    public Long getIdP() {
        return idP;
    }

    public void setIdP(Long idP) {
        this.idP = idP;
    }

    public void setOperations(List<Operation> operations) {
        this.operations = operations;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public void setNombreOperations(int nombreOperations) {
        this.nombreOperations = nombreOperations;
    }

    public void setTotalOperations(int totalOperations) {
        this.totalOperations = totalOperations;
    }

    public void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
    }

    public List<Operation> getOperations() {
        return operations;
    }

    public int getPage() {
        return page;
    }

    public int getNombreOperations() {
        return nombreOperations;
    }

    public int getTotalOperations() {
        return totalOperations;
    }

    public int getTotalPages() {
        return totalPages;
    }

    //--END GETTERS SETTERS

    //--METHODES
    //--END METHODES
}
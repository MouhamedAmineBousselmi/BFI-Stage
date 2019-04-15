package com.example.BanqueSI.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSetter;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlTransient;
import java.io.Serializable;
import java.util.Collection;
import java.util.List;

/**
 * Created by amino on 18/06/2017
 */

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Employe implements UserDetails {

    //--ATTRIBUTS
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codeEmploye;

    private String username;
    private String password;

    @ManyToOne
    @JoinColumn(name = "code_emp_sup")
    private Employe employeSup;
    @ManyToOne(cascade = CascadeType.MERGE, fetch = FetchType.EAGER)
    private Agence agence;

    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinTable(name = "user_authority",
            joinColumns = @JoinColumn(name = "codeEmploye", referencedColumnName = "codeEmploye"),
            inverseJoinColumns = @JoinColumn(name = "authority_id", referencedColumnName = "id"))
    private List<Authority> authorities;

    @OneToMany(mappedBy = "employe")
    private Collection<Cheque> cheques;

    @OneToMany(mappedBy = "employe")
    private Collection<Change> changes;

    @OneToMany(mappedBy = "employe")
    private Collection<Task> tasks;
    //--END ATTRIBUTS

    //--CONSTRUCTEUR
    public Employe(){}
    //--END CONSTRUCTEUR

    //--GETTERS SETTERS

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @JsonIgnore
    @XmlTransient
    public Collection<Change> getChanges() {
        return changes;
    }
    @JsonSetter
    public void setChanges(Collection<Change> changes) {
        this.changes = changes;
    }
    @JsonIgnore
    @XmlTransient
    public Collection<Cheque> getCheques() {
        return cheques;
    }
    @JsonSetter
    public void setCheques(Collection<Cheque> cheques) {
        this.cheques = cheques;
    }

    public Long getCodeEmploye() {
        return codeEmploye;
    }
    @JsonIgnore
    @XmlTransient
    public Employe getEmployeSup() {
        return employeSup;
    }

    public Agence getAgence() {
        return agence;
    }

    public void setCodeEmploye(Long codeEmploye) {
        this.codeEmploye = codeEmploye;
    }

    @JsonSetter
    public void setEmployeSup(Employe employeSup) {
        this.employeSup = employeSup;
    }
    public void setAgence(Agence agence) {
        this.agence = agence;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return this.authorities;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return username;
    }

    @Override
    @JsonIgnore
    @XmlTransient
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    @JsonIgnore
    @XmlTransient
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    @JsonIgnore
    @XmlTransient
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    @JsonIgnore
    @XmlTransient
    public boolean isEnabled() {
        return true;
    }

    @JsonIgnore
    @XmlTransient
    public Collection<Task> getTasks() {
        return tasks;
    }
    @JsonSetter
    public void setTasks(Collection<Task> tasks) {
        this.tasks = tasks;
    }

    //--END GETTERS SETTERS

    //--METHODES

    @Override
    public String toString() {
        return "Employe{" +
                "codeEmploye=" + codeEmploye +
                ", nomEmploye='" + username + '\'' +
                ", motDePasse='" + password + '\'' +
                ", authorities=" + authorities +
                '}';
    }

    //--END METHODES
}
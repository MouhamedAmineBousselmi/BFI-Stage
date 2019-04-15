package com.BanqueSIClient.BanqueSIClient.DTO;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;

/**
 * Created by amino on 25/08/2017
 */
public class ClientDTO implements UserDetails {

    //--ATTRIBUTS
    private Long codeClient;
    private String username;
    private String password;
    private Long agence;
    public Collection<Authority> authorities;
    //--END ATTRIBUTS

    //--GETTERS SETTERS

    public Long getCodeClient() {
        return codeClient;
    }

    public void setCodeClient(Long codeClient) {
        this.codeClient = codeClient;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Long getAgence() {
        return agence;
    }

    public void setAgence(Long agence) {
        this.agence = agence;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return username;
    }
    //--END GETTERS SETTERS

    //--METHODES
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return authorities;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }

    @Override
    public String toString() {
        return "ClientDTO{" +
                "codeClient=" + codeClient +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", agence=" + agence +
                '}';
    }


    //--END METHODES
}
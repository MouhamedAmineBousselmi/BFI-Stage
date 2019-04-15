package com.BanqueSIClient.BanqueSIClient.DTO;

import org.springframework.security.core.GrantedAuthority;

/**
 * Created by amino on 2017-07-07
 */

public class Authority implements GrantedAuthority {

    private String name = "ROLE_CLIENT";

    @Override
    public String getAuthority() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    @Override
    public String toString() {
        return "Authority{" +
                ", name='" + name + '\'' +
                '}';
    }
}

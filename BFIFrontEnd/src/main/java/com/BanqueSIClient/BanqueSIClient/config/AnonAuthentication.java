package com.BanqueSIClient.BanqueSIClient.config;

import org.springframework.security.authentication.AbstractAuthenticationToken;

/**
 * Created by amino 2017-07-07.
 */

public class AnonAuthentication extends AbstractAuthenticationToken {

    public AnonAuthentication() {
        super( null );
    }

    @Override
    public Object getCredentials() {
        return null;
    }

    @Override
    public Object getPrincipal() {
        return null;
    }

    @Override
    public boolean isAuthenticated() {
        return true;
    }


    @Override
    public boolean equals( Object obj ) {
        if ( this == obj ) {
            return true;
        }
        if ( obj == null ) {
            return false;
        }
        if ( getClass() != obj.getClass() ) {
            return false;
        }
        return true;
    }


}

package com.example.BanqueSI.metier;

import com.example.BanqueSI.dao.EmployeRepository;
import com.example.BanqueSI.entities.Employe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 * Created by fan.jin on 2016-10-31
 */

@Service
public class CustomUserDetailsService implements UserDetailsService {
    @Autowired
    private EmployeRepository employeRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Employe user = employeRepository.findByUsername(username);
        if (user == null) {
            throw new UsernameNotFoundException(String.format("No user found with username '%s'.", username));
        } else {
            return user;
        }
    }
}

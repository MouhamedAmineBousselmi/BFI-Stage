package com.example.BanqueSI.dao;

import com.example.BanqueSI.entities.Compte;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by amino on 19/06/2017.
 */
public interface CompteRepository extends JpaRepository<Compte,String> {
}
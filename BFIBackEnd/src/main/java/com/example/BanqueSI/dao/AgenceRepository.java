package com.example.BanqueSI.dao;

import com.example.BanqueSI.entities.Agence;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 * Created by amino on 19/06/2017
 */
public interface AgenceRepository extends JpaRepository<Agence,Long> {
}
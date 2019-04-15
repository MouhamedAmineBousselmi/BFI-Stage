package com.example.BanqueSI.dao;

import com.example.BanqueSI.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;

/**
 * Created by amino on 19/06/2017.
 */
public interface ClientRepository extends JpaRepository<Client,Long>{

}
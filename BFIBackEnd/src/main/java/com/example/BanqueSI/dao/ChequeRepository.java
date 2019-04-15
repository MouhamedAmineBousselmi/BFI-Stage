package com.example.BanqueSI.dao;

import com.example.BanqueSI.entities.Cheque;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by amino on 19/07/2017
 */
public interface ChequeRepository extends JpaRepository<Cheque,Long>{

}
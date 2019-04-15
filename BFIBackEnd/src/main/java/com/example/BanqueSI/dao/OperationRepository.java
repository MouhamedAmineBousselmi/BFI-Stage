package com.example.BanqueSI.dao;

import com.example.BanqueSI.entities.Compte;
import com.example.BanqueSI.entities.Operation;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 * Created by amino on 19/06/2017
 */
public interface OperationRepository extends JpaRepository<Operation,Long> {}
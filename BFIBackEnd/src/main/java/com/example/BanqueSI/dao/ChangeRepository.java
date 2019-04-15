package com.example.BanqueSI.dao;

import com.example.BanqueSI.entities.Change;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by amino on 13/07/2017.
 */
public interface ChangeRepository extends JpaRepository<Change,Long> {}

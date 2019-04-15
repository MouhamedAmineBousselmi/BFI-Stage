package com.example.BanqueSI.dao;

import com.example.BanqueSI.entities.Agence;
import com.example.BanqueSI.entities.Employe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 * Created by amino on 19/06/2017
 */
public interface EmployeRepository extends JpaRepository<Employe,Long> {

  @Modifying
  @Query("update Employe  e set e.username=:x, e.password =:y where e.codeEmploye =:z")
  String UpdateEmploye(@Param("z") Long codeEmploye,@Param("x") String username,@Param("y") String password);

   Employe findByUsername(String username);
}
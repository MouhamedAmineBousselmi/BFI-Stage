package com.example.BanqueSI.dao;

import com.example.BanqueSI.entities.*;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 * Created by amino on 15/07/2017
 */
public interface PageOperationRepository extends JpaRepository<PageOperation,Long>{

    @Query("select o from Operation o  where o.compte.codeCompte =:x and o.employe.codeEmploye=:e ")
    public Page<Operation> getOperations(@Param("x") String code ,@Param("e") Long codeEmp, Pageable pageable);

    @Query("select c from Change c  where c.employe.codeEmploye=:y")
    public Page<Change> getChange(@Param("y") Long codeEmploye, Pageable pageable );

    @Query("select ch from Cheque ch where ch.employe.codeEmploye=:z")
    public Page<Cheque> getCheque(@Param("z") Long codeEmploye, Pageable pageable );

    @Query("select ta from Task ta where ta.employe.codeEmploye=:a")
    public Page<Task> getTache(@Param("a") Long codeEmploye, Pageable pageable );
}
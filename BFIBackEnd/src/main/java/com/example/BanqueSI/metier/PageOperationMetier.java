package com.example.BanqueSI.metier;

import com.example.BanqueSI.entities.PageOperation;
import org.springframework.data.domain.Page;

import java.util.List;

/**
 * Created by amino on 15/07/2017
 */
public interface PageOperationMetier {
    public Page getOperations(String codeCompte,Long codeEmp, int page, int size);
    public Page getChange(Long codeEmploye,int page,int size);
    public Page getCheque(Long codeEmploye,int page,int size);
    public Page getTache(Long codeEmploye,int page,int size);
}
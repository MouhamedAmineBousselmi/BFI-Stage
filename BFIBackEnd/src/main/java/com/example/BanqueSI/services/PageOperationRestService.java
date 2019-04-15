package com.example.BanqueSI.services;

import com.example.BanqueSI.dto.ResultatPageOperationDTO;
import com.example.BanqueSI.EnumRetour.OperationRetour;
import com.example.BanqueSI.metier.PageOperationMetier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.RollbackException;

/**
 * Created by amino on 15/07/2017
 */
@RestController
public class PageOperationRestService {

    @Autowired
    private PageOperationMetier pageOperationMetier;


    @RequestMapping(value = "/operations",method = RequestMethod.GET)
    @PreAuthorize("hasRole('EMPLOYE')")
    public ResultatPageOperationDTO getOperations(@RequestParam String codeCompte,@RequestParam Long codeEmp, @RequestParam int page, @RequestParam int size) {
        ResultatPageOperationDTO pageOperationDTO = new ResultatPageOperationDTO();
        try {
            pageOperationDTO.setOpr(pageOperationMetier.getOperations(codeCompte,codeEmp, page, size));
            pageOperationDTO.setMessage(OperationRetour.OPERATION_PAGE_GET.toString());
        }catch (RollbackException r){
            pageOperationDTO.setMessage(r.getMessage());
        }
        return pageOperationDTO;
    }

    @RequestMapping(value = "/changes",method = RequestMethod.GET)
    @PreAuthorize("hasRole('EMPLOYE')")
    public ResultatPageOperationDTO getChange(@RequestParam Long codeEmploye,@RequestParam int page,@RequestParam int size) {
        ResultatPageOperationDTO resultatPageOperationDTO = new ResultatPageOperationDTO();
        try {
            resultatPageOperationDTO.setOpr(pageOperationMetier.getChange(codeEmploye, page, size));
            resultatPageOperationDTO.setMessage(OperationRetour.OPERATION_PAGE_GET.toString());
        }catch (RollbackException r){
            resultatPageOperationDTO.setMessage(r.getMessage());
        }
        return resultatPageOperationDTO;
    }

    @RequestMapping(value = "/cheques",method = RequestMethod.GET)
    @PreAuthorize("hasRole('EMPLOYE')")
    public ResultatPageOperationDTO getCheque(@RequestParam Long codeEmploye,@RequestParam int page,@RequestParam int size) {
        ResultatPageOperationDTO resultatPageOperationDTO = new ResultatPageOperationDTO();
        try {
            resultatPageOperationDTO.setOpr(pageOperationMetier.getCheque(codeEmploye, page, size));
            resultatPageOperationDTO.setMessage(OperationRetour.OPERATION_PAGE_GET.toString());
        }catch (RollbackException r){
            resultatPageOperationDTO.setMessage(r.getMessage());
        }
        return resultatPageOperationDTO;
    }

    @RequestMapping(value = "/taches",method = RequestMethod.GET)
    @PreAuthorize("hasRole('EMPLOYE')")
    public ResultatPageOperationDTO getTache(@RequestParam  Long codeEmploye,@RequestParam int page,@RequestParam int size) {
        ResultatPageOperationDTO resultatPageOperationDTO = new ResultatPageOperationDTO();
        try {
            resultatPageOperationDTO.setOpr(pageOperationMetier.getTache(codeEmploye, page, size));
            resultatPageOperationDTO.setMessage(OperationRetour.OPERATION_PAGE_GET.toString());
            System.out.print("-------"+pageOperationMetier.getTache(codeEmploye, page, size)+" -----");
        }catch (RollbackException r){
            resultatPageOperationDTO.setMessage(r.getMessage());
        }
        return resultatPageOperationDTO;
    }
}
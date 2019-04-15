package com.example.BanqueSI.WebServices.compteWebService;


import com.example.BanqueSI.WebServices.clientWebService.Client;
import com.example.BanqueSI.dao.ClientRepository;
import com.example.BanqueSI.dao.CompteRepository;
import com.example.BanqueSI.entities.Agence;
import com.example.BanqueSI.entities.CompteType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;


/**
 * Created by amino on 04/08/2017
 */
@Component
public class CompteRepo {

    //--ATTRIBUTS
    @Autowired
    private CompteRepository compteRepository;
    //--END ATTRIBUTS

    //--METHODES
    public List<Cp> getComptes(Long idAgence){

        List<Cp> comptes= new ArrayList<>();

        for(com.example.BanqueSI.entities.Compte c : compteRepository.findAll()){
            if(c.getAgence().getCodeAgence() == idAgence){
                Cp compte = new Cp();
                compte.setCodeCompte(c.getCodeCompte());
                compte.setAgence(c.getAgence().getCodeAgence());

                //--conversion XMLGREGORIANCALENDAR TO JAVA.UTIL.DATE
                GregorianCalendar dateG = new GregorianCalendar();
                dateG.setTime(c.getDateCreation());
                try {
                    XMLGregorianCalendar dateConv = DatatypeFactory.newInstance().newXMLGregorianCalendar(dateG);
                    compte.setDateCreation(dateConv);
                } catch (DatatypeConfigurationException e) {
                    e.printStackTrace();
                }
                //--//
                compte.setClient(c.getClient().getCodeClient());
                compte.setDecouvert(c.getDecouvert());
                compte.setEmploye(c.getEmploye().getCodeEmploye());
                compte.setSolde(c.getSolde());
                compte.setTaux(c.getTaux());
                compte.setType(c.getType().toString());
                comptes.add(compte);
            }
        }
        return comptes;
    }

    public CpAdd addCp(CpAdd cpAdd){

        com.example.BanqueSI.entities.Compte compte = new com.example.BanqueSI.entities.Compte();
        compte.setSolde(cpAdd.getSolde());
        compte.setCodeCompte(cpAdd.getCodeCompte());

        compte.setDateCreation(new Date());
        CompteType compteType = CompteType.valueOf(cpAdd.getType());
        compte.setTypeC(compteType);

        Agence agence = new Agence();
        agence.setCodeAgence(cpAdd.getAgence());
        compte.setAgence(agence);

        com.example.BanqueSI.entities.Client client = new com.example.BanqueSI.entities.Client();
        client.setCodeClient(cpAdd.getClient());
        compte.setClient(client);

        compte.setSolde(cpAdd.getSolde());
        compte.setDecouvert(cpAdd.getDecouvert());
        compte.setTaux(cpAdd.getTaux());
        compteRepository.save(compte);
        return cpAdd;
    }
    //--END METHODES

}
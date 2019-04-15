package com.example.BanqueSI.WebServices.chequeWebService;

import com.example.BanqueSI.dao.ChequeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;


/**
 * Created by amino on 04/08/2017
 */
@Component
public class ChequeRepo {

    //--ATTRIBUTS
    @Autowired
    private ChequeRepository chequeRepository;
    //--END ATTRIBUTS

    //--METHODES
    public List<Cheque> getCheques(Long idAgence){

        List<Cheque> cheques = new ArrayList<>();

        for(com.example.BanqueSI.entities.Cheque c : chequeRepository.findAll()){
            if(c.getEmploye().getAgence().getCodeAgence() == idAgence){
                Cheque cheque = new Cheque();
                cheque.setIdC(c.getIdC());
                cheque.setCompte(c.getCompte().getCodeCompte());

                //--conversion XMLGREGORIANCALENDAR TO JAVA.UTIL.DATE
                GregorianCalendar dateG = new GregorianCalendar();
                dateG.setTime(c.getDateV());
                try {
                    XMLGregorianCalendar dateConv = DatatypeFactory.newInstance().newXMLGregorianCalendar(dateG);
                    cheque.setDateV(dateConv);
                } catch (DatatypeConfigurationException e) {
                    e.printStackTrace();
                }
                //--//

                cheque.setEmploye(c.getEmploye().getCodeEmploye());
                cheque.setMontant(c.getMontant());
                cheque.setNomProprietaire(c.getNomProprietaire());
                cheque.setNumeroC(c.getNumeroC());
                cheque.setPrenomProprietaire(c.getPrenomProprietaire());
                cheque.setClient(c.getClient().getCodeClient());
                cheques.add(cheque);
            }
        }
        return cheques;
    }
    //--END METHODES

}
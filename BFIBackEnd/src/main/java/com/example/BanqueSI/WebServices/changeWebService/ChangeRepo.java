package com.example.BanqueSI.WebServices.changeWebService;

import com.example.BanqueSI.dao.ChangeRepository;
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
public class ChangeRepo {

    //--ATTRIBUTS
    @Autowired
    private ChangeRepository changeRepository;
    //--END ATTRIBUTS

    //--METHODES
    public List<Change> getChanges(Long idAgence){

        List<Change> changes = new ArrayList<>();

        for(com.example.BanqueSI.entities.Change c : changeRepository.findAll()){
            if(c.getEmploye().getAgence().getCodeAgence() == idAgence){
                Change change = new Change();
                change.setIdChange(c.getIdChange());
                change.setAdresseP(c.getAdresseP());
                change.setChangeType(c.getChangeType().toString());

                //--conversion XMLGREGORIANCALENDAR TO JAVA.UTIL.DATE
                GregorianCalendar dateG = new GregorianCalendar();
                dateG.setTime(c.getDateChange());
                try {
                    XMLGregorianCalendar dateConv = DatatypeFactory.newInstance().newXMLGregorianCalendar(dateG);
                    change.setDateChange(dateConv);
                } catch (DatatypeConfigurationException e) {
                    e.printStackTrace();
                }
                //--//
                change.setDestination(c.getDestination());
                change.setEmploye(c.getEmploye().getCodeEmploye());
                change.setIdentif(c.getIdentif());
                change.setMontant(c.getMontant());
                change.setNomP(c.getNomP());
                change.setPrenomP(c.getPrenomP());
                changes.add(change);
            }
        }
        return changes;
    }
    //--END METHODES

}
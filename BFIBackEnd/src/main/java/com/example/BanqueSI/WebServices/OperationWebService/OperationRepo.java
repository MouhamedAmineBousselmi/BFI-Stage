package com.example.BanqueSI.WebServices.OperationWebService;

import com.example.BanqueSI.dao.OperationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

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
public class OperationRepo {

    @Autowired
    private OperationRepository operationRepository;

    /**
     * Get compteby code if such exist, else retrieve null
     * @param code
     * @return compte or null
     */
    public Operation findCompte(Long code){
        Assert.notNull(code,"not null");
        for(com.example.BanqueSI.entities.Operation c: operationRepository.findAll()){
            if(c.getNumeroOperation() == code){
                Operation operation = new Operation();
                operation.setId(c.getNumeroOperation());
                operation.setMontant(c.getMontant());
                operation.setCompte(c.getCompte().getCodeCompte());
                operation.setEmploye(c.getEmploye().getCodeEmploye());
                operation.setTypeO(c.getTypeO().toString());
                return operation;
            }
        }
        return null;
    }

    /**
     * Get compteby code if such exist, else retrieve null
     * @return List<Operation> or null
     */
    public List<Operation> findAllOperations(Long idAgence){
        List<Operation> operations = new ArrayList<>();

        for(com.example.BanqueSI.entities.Operation o : operationRepository.findAll()){
            if(o.getEmploye().getAgence().getCodeAgence() == idAgence){
                Operation operation = new Operation();
                operation.setId(o.getNumeroOperation());
                operation.setMontant(o.getMontant());
                operation.setEmploye(o.getEmploye().getCodeEmploye());
                operation.setCompte(o.getCompte().getCodeCompte());
                operation.setTypeO(o.getTypeO().toString());

                //--conversion XMLGREGORIANCALENDAR TO JAVA.UTIL.DATE
                GregorianCalendar dateG = new GregorianCalendar();
                dateG.setTime(o.getDateOperation());
                try {
                    XMLGregorianCalendar dateConv = DatatypeFactory.newInstance().newXMLGregorianCalendar(dateG);
                    operation.setDateOperation(dateConv);
                } catch (DatatypeConfigurationException e) {
                    e.printStackTrace();
                }
                //--//

                operations.add(operation);
            }
        }
        return operations;
    }

}
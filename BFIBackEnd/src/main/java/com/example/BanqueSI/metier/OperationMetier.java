package com.example.BanqueSI.metier;

import com.example.BanqueSI.EnumRetour.OperationRetour;
import com.example.BanqueSI.entities.Operation;

import java.util.List;

/**
 * Created by amino on 19/06/2017
 */
public interface OperationMetier {
    public OperationRetour verser(String code, double montant , Long codeEmp);
    public OperationRetour retirer(String code, double montant , Long codeEmp);
    public OperationRetour virement(String cp1 , String cp2 , double montant , Long codeEmp);

    //A revoir
    public List<Operation> getOperations();
}
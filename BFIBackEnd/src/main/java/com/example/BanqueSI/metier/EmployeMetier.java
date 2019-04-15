package com.example.BanqueSI.metier;

import com.example.BanqueSI.EnumRetour.OperationRetour;
import com.example.BanqueSI.entities.Agence;
import com.example.BanqueSI.entities.Employe;

import java.util.List;

/**
 * Created by amino on 19/06/2017.
 */
public interface EmployeMetier {

    public OperationRetour saveEmploye(Employe e);
    public List<Employe> listEmployes();
}
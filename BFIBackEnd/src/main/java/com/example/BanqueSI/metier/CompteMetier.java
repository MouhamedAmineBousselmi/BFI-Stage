package com.example.BanqueSI.metier;

import com.example.BanqueSI.EnumRetour.OperationRetour;
import com.example.BanqueSI.entities.Compte;

/**
 * Created by amino on 19/06/2017
 */
public interface CompteMetier {
    public OperationRetour saveCompte(Compte cp);
    public Compte getCompte(String code);

}
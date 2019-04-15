package com.example.BanqueSI.metier;

import com.example.BanqueSI.EnumRetour.OperationRetour;
import com.example.BanqueSI.entities.Agence;
import java.util.List;

/**
 * Created by amino on 18/07/2017
 */
public interface AgenceMetier {

    public OperationRetour saveAgence(Agence a);
    public Agence getAgence(Long codeAgence);
}
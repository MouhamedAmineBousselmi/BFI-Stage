package com.example.BanqueSI.metier;

import com.example.BanqueSI.EnumRetour.OperationRetour;
import com.example.BanqueSI.entities.Change;

import java.io.IOException;
import java.util.List;

/**
 * Created by amino on 13/07/2017.
 */
public interface ChangeMetier {
    public OperationRetour AchatDevise(Change c);
    public OperationRetour VenteDevise(Change c);
    public double convertisseurDevise(double montant) throws IOException;
    public double convertisseurDeviseR(double montant) throws IOException;
}
package com.example.BanqueSI.metier;

import com.example.BanqueSI.EnumRetour.OperationRetour;
import com.example.BanqueSI.entities.Cheque;

/**
 * Created by amino on 19/07/2017
 */
public interface ChequeMetier {
    public OperationRetour VersementCheque(Cheque c);
    public Cheque getCheque(Long idC);
}

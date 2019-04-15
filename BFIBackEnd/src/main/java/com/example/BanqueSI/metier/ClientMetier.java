package com.example.BanqueSI.metier;

import com.example.BanqueSI.EnumRetour.OperationRetour;
import com.example.BanqueSI.entities.Client;

import java.util.List;

/**
 * Created by amino on 19/06/2017.
 */
public interface ClientMetier {
    public OperationRetour saveClient(Client c);
    public List<Client> listClient();

}

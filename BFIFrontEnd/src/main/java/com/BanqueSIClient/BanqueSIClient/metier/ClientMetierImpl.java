package com.BanqueSIClient.BanqueSIClient.metier;

import com.example.BanqueSI.WebServices.clientWebService.ClientPortServiceStub;
import org.apache.axis2.AxisFault;
import org.springframework.stereotype.Service;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by amino on 26/08/2017
 */

@Service
public class ClientMetierImpl implements ClientMetier{

    public List<ClientPortServiceStub.Compte> getComptesByIdClient(Long codeClient) throws RemoteException {
        ClientPortServiceStub serviceStub = new ClientPortServiceStub();
        ClientPortServiceStub.LoadAccountByIdClientRequest request = new ClientPortServiceStub.LoadAccountByIdClientRequest();
        request.setCodeClient(codeClient);

        ClientPortServiceStub.LoadAccountByIdClientResponse response = serviceStub.loadAccountByIdClient(request);

        List<ClientPortServiceStub.Compte> comptes = new ArrayList<>();

        for(ClientPortServiceStub.Compte c : response.getCompte()){
            ClientPortServiceStub.Compte compte = new ClientPortServiceStub.Compte();
            compte.setCodeCompte(c.getCodeCompte());
            compte.setCheque(c.getCheque());
            compte.setDecouvert(c.getDecouvert());
            compte.setOperation(c.getOperation());
            compte.setSolde(c.getSolde());
            compte.setTaux(c.getTaux());
            compte.setType(c.getType());
            comptes.add(compte);
        }
        return comptes;
    }
}

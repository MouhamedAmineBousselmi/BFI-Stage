package com.BanqueSIClient.BanqueSIClient.metier;

import com.example.BanqueSI.WebServices.clientWebService.ClientPortServiceStub;
import org.apache.axis2.AxisFault;

import java.rmi.RemoteException;
import java.util.List;

/**
 * Created by amino on 26/08/2017
 */

public interface ClientMetier {

    public List<ClientPortServiceStub.Compte> getComptesByIdClient(Long codeClient) throws RemoteException;
}
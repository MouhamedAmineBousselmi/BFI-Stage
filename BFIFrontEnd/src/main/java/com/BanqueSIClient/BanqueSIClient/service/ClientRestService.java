package com.BanqueSIClient.BanqueSIClient.service;

import com.BanqueSIClient.BanqueSIClient.DTO.ClientDTO;
import com.BanqueSIClient.BanqueSIClient.metier.ClientMetier;
import com.example.BanqueSI.WebServices.clientWebService.ClientPortServiceStub;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;

import java.rmi.RemoteException;
import java.util.List;

/**
 * Created by amino on 26/08/2017
 */

@RestController
public class ClientRestService {

    //--ATTRIBUTS
    @Autowired
    private ClientMetier clientMetier;
    //--END ATTRIBUTS

    //--METHODES
    @RequestMapping(value = "/comptes/{codeClient}",method = RequestMethod.GET)
    public List<ClientPortServiceStub.Compte> getComptesByIdClient(@PathVariable Long codeClient) throws RemoteException {
        return clientMetier.getComptesByIdClient(codeClient);
    }

    @RequestMapping(value = "/whoami",method = RequestMethod.GET)
    public ClientDTO user() {
        ClientDTO client= (ClientDTO) SecurityContextHolder
                .getContext()
                .getAuthentication()
                .getPrincipal();


        return client;
    }
    //--END METHODES
}

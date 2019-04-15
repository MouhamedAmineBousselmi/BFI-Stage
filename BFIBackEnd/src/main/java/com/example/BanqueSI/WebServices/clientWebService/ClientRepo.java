package com.example.BanqueSI.WebServices.clientWebService;


import com.example.BanqueSI.dao.ClientRepository;
import com.example.BanqueSI.entities.Agence;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.ArrayList;
import java.util.List;


/**
 * Created by amino on 04/08/2017
 */
@Component
public class ClientRepo {

    //--ATTRIBUTS
    @Autowired
    private ClientRepository clientRepository;
    //--END ATTRIBUTS

    //--METHODES
    public List<Client> getClients(Long idAgence){

        List<Client> clients= new ArrayList<>();

        for(com.example.BanqueSI.entities.Client c : clientRepository.findAll()){
            if(c.getAgence().getCodeAgence() == idAgence){
                Client client = new Client();
                client.setCodeClient(c.getCodeClient());
                client.setNomClient(c.getNomClient());
                clients.add(client);
            }
        }
        return clients;
    }

    public ClientMax AddClient(ClientMax clientMax){
        com.example.BanqueSI.entities.Client client = new com.example.BanqueSI.entities.Client();
        client.setNomClient(clientMax.getNomClient());
        Agence agence = new Agence();
        agence.setCodeAgence(clientMax.getAgence());
        client.setAgence(agence);
        clientRepository.save(client);
        return clientMax;
    }
    //--END METHODES

}
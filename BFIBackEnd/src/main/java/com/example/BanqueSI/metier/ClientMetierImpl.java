package com.example.BanqueSI.metier;

import com.example.BanqueSI.EnumRetour.OperationRetour;
import com.example.BanqueSI.dao.ClientRepository;
import com.example.BanqueSI.entities.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.RollbackException;
import java.util.List;

/**
 * Created by amino on 19/06/2017
 */

@Service
public class ClientMetierImpl implements ClientMetier {

    //--ATTRIBUTS

    @Autowired
    private ClientRepository clientRepository;
    //--END ATTRIBUTS

    //--METHODES
    @Override
    public OperationRetour saveClient(Client c) {
        OperationRetour operationRetour;
       if(c.getNomClient() == null){
           operationRetour = OperationRetour.INSERT_CLIENT;
            throw new RollbackException(OperationRetour.INSERT_CLIENT.toString());
       }

       for(Client c1:clientRepository.findAll()){
              if(c.getCodeClient() == c1.getCodeClient()){
                  operationRetour = OperationRetour.TECHNICAL_PROBLEM;
                  throw new RollbackException(OperationRetour.TECHNICAL_PROBLEM.toString());
          }
       }
       operationRetour = OperationRetour.CLIENT_SAVED;
       clientRepository.save(c);

       return operationRetour;
    }

    @Override
    public List<Client> listClient(){
        if(clientRepository.findAll() == null){
            throw new RollbackException(OperationRetour.EMPTY_LIST.toString());
        }
        return clientRepository.findAll();
    }
    //--END METHODES
}

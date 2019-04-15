package com.example.BanqueSI.services;

import com.example.BanqueSI.dto.ResultatClientDTO;
import com.example.BanqueSI.entities.Client;
import com.example.BanqueSI.metier.ClientMetier;
import com.example.BanqueSI.EnumRetour.OperationRetour;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.persistence.RollbackException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by amino on 21/06/2017
 */
@RestController
public class ClientRestService {

    //--ATTRIBUTS
    @Autowired
    private ClientMetier clientMetier;
    //--END ATTRIBUTS

    //--METHODES
    @RequestMapping(value = "/clients",method = RequestMethod.POST)
    public ResultatClientDTO saveClient(@RequestBody Client c) {

        ResultatClientDTO clientDTO = new ResultatClientDTO();

        try {

            clientMetier.saveClient(c);
            clientDTO.setNomClient(c.getNomClient());
            clientDTO.setMessage(OperationRetour.CLIENT_SAVED.toString());

        }catch (RollbackException r){
            clientDTO.setMessage(r.getMessage());
        }

        return clientDTO;
    }

    @RequestMapping(value = "/clients",method = RequestMethod.GET)
    public List<ResultatClientDTO> listClient() {
        List<ResultatClientDTO> resultatClientDTOS = new ArrayList<ResultatClientDTO>();
        for(Client c:clientMetier.listClient()) {
            ResultatClientDTO clientDTO = new ResultatClientDTO();
            try {
                clientDTO.setNomClient(c.getNomClient());
                clientDTO.setMessage(OperationRetour.CLIENT_ADD_TO_LIST.toString());
                resultatClientDTOS.add(clientDTO);
            } catch (RollbackException r) {
                clientDTO.setMessage(r.getMessage());
            }
        }

        return resultatClientDTOS;
    }
    //--END METHODES
}


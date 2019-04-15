package com.example.BanqueSI.WebServices.agenceWebService;

import com.example.BanqueSI.dao.AgenceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


/**
 * Created by amino on 04/08/2017
 */
@Component
public class AgenceRepo {

    //--ATTRIBUTS
    @Autowired
    private AgenceRepository agenceRepository;
    //--END ATTRIBUTS

    //--METHODES
    public Agence getAgence(Long idAgence){
        com.example.BanqueSI.entities.Agence a = agenceRepository.findOne(idAgence);
        Agence agence = new Agence();
        agence.setCodeAgence(a.getCodeAgence());
        agence.setAdresseAgence(a.getAdresseAgence());
        agence.setNomAgence(a.getNomAgence());
        agence.setHeureFermeture(a.getHeureFermeture().toString());
        agence.setHeureOuverture(a.getHeureOuverture().toString());

        return agence;
    }
    //--END METHODES

}
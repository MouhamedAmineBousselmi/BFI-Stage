package com.example.BanqueSI.WebServices.agenceWebService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

/**
 * Created by amino on 15/08/2017
 */
@Endpoint
public class AgenceEndPoint {

    private static final String NAMESPACE_URI = "http://com.example.BanqueSI.WebServices/agence";

    private AgenceRepo agenceRepo;

    @Autowired
    public AgenceEndPoint(AgenceRepo agenceRepo) {
        this.agenceRepo = agenceRepo;
    }


    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getAgenceRequest")
    @ResponsePayload
    public GetAgenceResponse getAgence(@RequestPayload GetAgenceRequest request) {
        GetAgenceResponse  response = new GetAgenceResponse ();
        response.setAgence(agenceRepo.getAgence(request.getIdAgence()));
        return response;
    }
}

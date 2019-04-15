package com.example.BanqueSI.WebServices.compteWebService;

import com.example.BanqueSI.WebServices.clientWebService.GetClientsRequest;
import com.example.BanqueSI.WebServices.clientWebService.GetClientsResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

/**
 * Created by amino on 04/08/2017
 */
@Endpoint
public class CompteEndPoint {

    private static final String NAMESPACE_URI = "http://com.example.BanqueSI.WebServices/cp";

    private CompteRepo compteRepo;

    @Autowired
    public CompteEndPoint(CompteRepo compteRepo) {
        this.compteRepo = compteRepo;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getCpRequest")
    @ResponsePayload
    public GetCpResponse getComptes (@RequestPayload GetCpRequest request) {
        GetCpResponse response = new GetCpResponse();
        response.setCp(compteRepo.getComptes(request.getIdAgence()));
        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "addCpRequest")
    @ResponsePayload
        public AddCpResponse AddComptes (@RequestPayload AddCpRequest request) {
        AddCpResponse response = new AddCpResponse();
        response.setCpAdd(compteRepo.addCp(request.getCompte()));
        return response;
    }
}

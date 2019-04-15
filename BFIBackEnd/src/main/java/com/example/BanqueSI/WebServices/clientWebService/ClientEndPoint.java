package com.example.BanqueSI.WebServices.clientWebService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

/**
 * Created by amino on 04/08/2017
 */
@Endpoint
public class ClientEndPoint {

    private static final String NAMESPACE_URI = "http://com.example.BanqueSI.WebServices/client";

    private ClientRepo clientRepo;

    @Autowired
    public ClientEndPoint(ClientRepo clientRepo) {
        this.clientRepo = clientRepo;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getClientsRequest")
    @ResponsePayload
    public GetClientsResponse getClients (@RequestPayload GetClientsRequest request) {
        GetClientsResponse response = new GetClientsResponse();
        response.setClient(clientRepo.getClients(request.getIdAgence()));
        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "addClientsRequest")
    @ResponsePayload
    public AddClientsResponse addClients (@RequestPayload AddClientsRequest request) {
        AddClientsResponse response = new AddClientsResponse();
        response.setClientMax(clientRepo.AddClient(request.getClientMax()));
        return response;
    }
}

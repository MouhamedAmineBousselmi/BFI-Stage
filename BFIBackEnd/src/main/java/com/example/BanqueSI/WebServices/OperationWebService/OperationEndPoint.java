package com.example.BanqueSI.WebServices.OperationWebService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

/**
 * Created by amino on 04/08/2017
 */
@Endpoint
public class OperationEndPoint {

    private static final String NAMESPACE_URI = "http://com.example.BanqueSI.WebServices/operation";

    private OperationRepo compteRepo;

    @Autowired
    public OperationEndPoint(OperationRepo compteRepo) {
        this.compteRepo = compteRepo;
    }


    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getOperationRequest")
    @ResponsePayload
    public GetOperationResponse getById(@RequestPayload GetOperationRequest request) {
        GetOperationResponse response = new GetOperationResponse();
        response.setOperation(compteRepo.findCompte(request.getId()));
        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getOperationsRequest")
    @ResponsePayload
    public GetOperationsResponse getAllOperations(@RequestPayload GetOperationsRequest request) {
        GetOperationsResponse response = new GetOperationsResponse();
        response.setOperation(compteRepo.findAllOperations(request.getIdAgence()));
        return response;
    }
}

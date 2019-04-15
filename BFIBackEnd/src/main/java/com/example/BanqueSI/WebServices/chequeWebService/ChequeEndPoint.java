package com.example.BanqueSI.WebServices.chequeWebService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

/**
 * Created by amino on 04/08/2017
 */
@Endpoint
public class ChequeEndPoint {

    private static final String NAMESPACE_URI = "http://com.example.BanqueSI.WebServices/cheque";

    private ChequeRepo chequeRepo;

    @Autowired
    public ChequeEndPoint(ChequeRepo chequeRepo) {
        this.chequeRepo = chequeRepo;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getChequesRequest")
    @ResponsePayload
    public GetChequesResponse getCheques(@RequestPayload GetChequesRequest request) {
        GetChequesResponse response = new GetChequesResponse();
        response.setCheque(chequeRepo.getCheques(request.getIdAgence()));
        return response;
    }
}

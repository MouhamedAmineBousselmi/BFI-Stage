package com.example.BanqueSI.WebServices.changeWebService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

/**
 * Created by amino on 15/08/2017
 */
@Endpoint
public class ChangeEndPoint {

    private static final String NAMESPACE_URI = "http://com.example.BanqueSI.WebServices/change";

    private ChangeRepo changeRepo;

    @Autowired
    public ChangeEndPoint(ChangeRepo changeRepo) {
        this.changeRepo = changeRepo;
    }


    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getChangesRequest")
    @ResponsePayload
    public GetChangesResponse getChanges(@RequestPayload GetChangesRequest request) {
        GetChangesResponse response = new GetChangesResponse();
        response.setChange(changeRepo.getChanges(request.getIdAgence()));
        return response;
    }
}

package com.example.BanqueSI.WebServices.EmployeWebService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

/**
 * Created by amino on 04/08/2017
 */
@Endpoint
public class EmployeEndPoint {

    private static final String NAMESPACE_URI = "http://com.example.BanqueSI.WebServices/employe";

    private EmployeRepo employeRepo;

    @Autowired
    public EmployeEndPoint(EmployeRepo employeRepo) {
        this.employeRepo = employeRepo;
    }


    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getEmployesRequest")
    @ResponsePayload
    public GetEmployesResponse getAllEmployes(@RequestPayload GetEmployesRequest request) {
        GetEmployesResponse response = new GetEmployesResponse();
        response.setEmploye(employeRepo.getEmployes(request.getIdAgence()));
        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getAllEmployesRequest")
    @ResponsePayload
    public GetAllEmployesResponse getAllEmp(@RequestPayload GetAllEmployesRequest request) {
        GetAllEmployesResponse response = new GetAllEmployesResponse();
        response.setEmployeMax(employeRepo.getAllEmployes(request.getIdAgence()));
        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "addEmployesRequest")
    @ResponsePayload
    public AddEmployesResponse addEmploye(@RequestPayload AddEmployesRequest request) {
        AddEmployesResponse response = new AddEmployesResponse();
        response.setResult(employeRepo.addEmploye(request.getEmployeAdd()));
        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "updateEmployesRequest")
    @ResponsePayload
    public UpdateEmployesResponse updateEmploye(@RequestPayload UpdateEmployesRequest request) {
        UpdateEmployesResponse response = new UpdateEmployesResponse();
        response.setResult(employeRepo.updateEmploye(request.getCodeEmploye(),request.getUsername(),request.getPassword()));
        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "LoadEmployesByUsernameRequest")
    @ResponsePayload
    public LoadEmployesByUsernameResponse EmployeAuthentification(@RequestPayload LoadEmployesByUsernameRequest request) {
        LoadEmployesByUsernameResponse response = new LoadEmployesByUsernameResponse();
        response.setEmployeAuth(employeRepo.loadUserByUsername(request.getUsername()));
        return response;
    }
}
/**
 * ClientPortServiceCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.5  Built on : May 06, 2017 (03:45:26 BST)
 */
package com.example.BanqueSI.WebServices.clientWebService;


/**
 *  ClientPortServiceCallbackHandler Callback class, Users can extend this class and implement
 *  their own receiveResult and receiveError methods.
 */
public abstract class ClientPortServiceCallbackHandler {
    protected Object clientData;

    /**
     * User can pass in any object that needs to be accessed once the NonBlocking
     * Web service call is finished and appropriate method of this CallBack is called.
     * @param clientData Object mechanism by which the user can pass in user data
     * that will be avilable at the time this callback is called.
     */
    public ClientPortServiceCallbackHandler(Object clientData) {
        this.clientData = clientData;
    }

    /**
     * Please use this constructor if you don't want to set any clientData
     */
    public ClientPortServiceCallbackHandler() {
        this.clientData = null;
    }

    /**
     * Get the client data
     */
    public Object getClientData() {
        return clientData;
    }

    /**
     * auto generated Axis2 call back method for addClients method
     * override this method for handling normal response from addClients operation
     */
    public void receiveResultaddClients(
        com.example.BanqueSI.WebServices.clientWebService.ClientPortServiceStub.AddClientsResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from addClients operation
     */
    public void receiveErroraddClients(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for loadAccountByIdClient method
     * override this method for handling normal response from loadAccountByIdClient operation
     */
    public void receiveResultloadAccountByIdClient(
        com.example.BanqueSI.WebServices.clientWebService.ClientPortServiceStub.LoadAccountByIdClientResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from loadAccountByIdClient operation
     */
    public void receiveErrorloadAccountByIdClient(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for loadClientByUsername method
     * override this method for handling normal response from loadClientByUsername operation
     */
    public void receiveResultloadClientByUsername(
        com.example.BanqueSI.WebServices.clientWebService.ClientPortServiceStub.LoadClientByUsernameResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from loadClientByUsername operation
     */
    public void receiveErrorloadClientByUsername(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getClients method
     * override this method for handling normal response from getClients operation
     */
    public void receiveResultgetClients(
        com.example.BanqueSI.WebServices.clientWebService.ClientPortServiceStub.GetClientsResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getClients operation
     */
    public void receiveErrorgetClients(java.lang.Exception e) {
    }
}

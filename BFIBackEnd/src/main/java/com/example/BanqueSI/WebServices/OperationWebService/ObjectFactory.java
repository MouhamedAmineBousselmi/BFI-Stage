
package com.example.BanqueSI.WebServices.OperationWebService;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.example.BanqueSI.WebServices.OperationWebService package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.example.BanqueSI.WebServices.OperationWebService
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetOperationResponse }
     * 
     */
    public GetOperationResponse createGetOperationResponse() {
        return new GetOperationResponse();
    }

    /**
     * Create an instance of {@link Operation }
     * 
     */
    public Operation createOperation() {
        return new Operation();
    }

    /**
     * Create an instance of {@link GetOperationRequest }
     * 
     */
    public GetOperationRequest createGetOperationRequest() {
        return new GetOperationRequest();
    }

    /**
     * Create an instance of {@link GetOperationsRequest }
     * 
     */
    public GetOperationsRequest createGetOperationsRequest() {
        return new GetOperationsRequest();
    }

    /**
     * Create an instance of {@link GetOperationsResponse }
     * 
     */
    public GetOperationsResponse createGetOperationsResponse() {
        return new GetOperationsResponse();
    }

}

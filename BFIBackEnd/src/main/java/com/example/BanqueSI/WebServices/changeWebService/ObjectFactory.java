
package com.example.BanqueSI.WebServices.changeWebService;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.example.BanqueSI.WebServices.changeWebService package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.example.BanqueSI.WebServices.changeWebService
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetChangesResponse }
     * 
     */
    public GetChangesResponse createGetChangesResponse() {
        return new GetChangesResponse();
    }

    /**
     * Create an instance of {@link Change }
     * 
     */
    public Change createChange() {
        return new Change();
    }

    /**
     * Create an instance of {@link GetChangesRequest }
     * 
     */
    public GetChangesRequest createGetChangesRequest() {
        return new GetChangesRequest();
    }

}

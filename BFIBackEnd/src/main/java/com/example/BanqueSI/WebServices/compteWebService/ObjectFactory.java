
package com.example.BanqueSI.WebServices.compteWebService;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.example.BanqueSI.WebServices.compteWebService package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.example.BanqueSI.WebServices.compteWebService
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetCpRequest }
     * 
     */
    public GetCpRequest createGetCpRequest() {
        return new GetCpRequest();
    }

    /**
     * Create an instance of {@link AddCpResponse }
     * 
     */
    public AddCpResponse createAddCpResponse() {
        return new AddCpResponse();
    }

    /**
     * Create an instance of {@link CpAdd }
     * 
     */
    public CpAdd createCpAdd() {
        return new CpAdd();
    }

    /**
     * Create an instance of {@link AddCpRequest }
     * 
     */
    public AddCpRequest createAddCpRequest() {
        return new AddCpRequest();
    }

    /**
     * Create an instance of {@link GetCpResponse }
     * 
     */
    public GetCpResponse createGetCpResponse() {
        return new GetCpResponse();
    }

    /**
     * Create an instance of {@link Cp }
     * 
     */
    public Cp createCp() {
        return new Cp();
    }

}

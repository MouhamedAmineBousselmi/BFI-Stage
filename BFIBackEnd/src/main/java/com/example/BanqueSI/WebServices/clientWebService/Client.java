
package com.example.BanqueSI.WebServices.clientWebService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour client complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="client">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codeClient" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="nomClient" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "client", namespace = "http://com.example.BanqueSI.WebServices/client", propOrder = {
    "codeClient",
    "nomClient"
})
public class Client {

    @XmlElement(namespace = "http://com.example.BanqueSI.WebServices/client")
    protected long codeClient;
    @XmlElement(namespace = "http://com.example.BanqueSI.WebServices/client", required = true)
    protected String nomClient;

    /**
     * Obtient la valeur de la propriété codeClient.
     * 
     */
    public long getCodeClient() {
        return codeClient;
    }

    /**
     * Définit la valeur de la propriété codeClient.
     * 
     */
    public void setCodeClient(long value) {
        this.codeClient = value;
    }

    /**
     * Obtient la valeur de la propriété nomClient.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomClient() {
        return nomClient;
    }

    /**
     * Définit la valeur de la propriété nomClient.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomClient(String value) {
        this.nomClient = value;
    }

}


package com.example.BanqueSI.WebServices.clientWebService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour clientMax complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="clientMax">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nomClient" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="agence" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "clientMax", namespace = "http://com.example.BanqueSI.WebServices/client", propOrder = {
    "nomClient",
    "agence"
})
public class ClientMax {

    @XmlElement(namespace = "http://com.example.BanqueSI.WebServices/client", required = true)
    protected String nomClient;
    @XmlElement(namespace = "http://com.example.BanqueSI.WebServices/client")
    protected long agence;

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

    /**
     * Obtient la valeur de la propriété agence.
     * 
     */
    public long getAgence() {
        return agence;
    }

    /**
     * Définit la valeur de la propriété agence.
     * 
     */
    public void setAgence(long value) {
        this.agence = value;
    }

}

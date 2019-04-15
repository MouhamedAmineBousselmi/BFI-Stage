
package com.example.BanqueSI.WebServices.clientWebService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour anonymous complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="clientMax" type="{http://com.example.BanqueSI.WebServices/client}clientMax"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "clientMax"
})
@XmlRootElement(name = "addClientsRequest", namespace = "http://com.example.BanqueSI.WebServices/client")
public class AddClientsRequest {

    @XmlElement(namespace = "http://com.example.BanqueSI.WebServices/client", required = true)
    protected ClientMax clientMax;

    /**
     * Obtient la valeur de la propriété clientMax.
     * 
     * @return
     *     possible object is
     *     {@link ClientMax }
     *     
     */
    public ClientMax getClientMax() {
        return clientMax;
    }

    /**
     * Définit la valeur de la propriété clientMax.
     * 
     * @param value
     *     allowed object is
     *     {@link ClientMax }
     *     
     */
    public void setClientMax(ClientMax value) {
        this.clientMax = value;
    }

}

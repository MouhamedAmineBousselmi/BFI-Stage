
package com.example.BanqueSI.WebServices.clientWebService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour anonymous complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idAgence" type="{http://www.w3.org/2001/XMLSchema}long"/>
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
    "idAgence"
})
@XmlRootElement(name = "getClientsRequest", namespace = "http://com.example.BanqueSI.WebServices/client")
public class GetClientsRequest {

    @XmlElement(namespace = "http://com.example.BanqueSI.WebServices/client")
    protected long idAgence;

    /**
     * Obtient la valeur de la propri�t� idAgence.
     * 
     */
    public long getIdAgence() {
        return idAgence;
    }

    /**
     * D�finit la valeur de la propri�t� idAgence.
     * 
     */
    public void setIdAgence(long value) {
        this.idAgence = value;
    }

}

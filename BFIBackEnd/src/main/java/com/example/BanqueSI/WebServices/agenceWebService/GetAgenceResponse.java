
package com.example.BanqueSI.WebServices.agenceWebService;

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
 *         &lt;element name="agence" type="{http://com.example.BanqueSI.WebServices/agence}agence"/>
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
    "agence"
})
@XmlRootElement(name = "getAgenceResponse", namespace = "http://com.example.BanqueSI.WebServices/agence")
public class GetAgenceResponse {

    @XmlElement(namespace = "http://com.example.BanqueSI.WebServices/agence", required = true)
    protected Agence agence;

    /**
     * Obtient la valeur de la propriété agence.
     * 
     * @return
     *     possible object is
     *     {@link Agence }
     *     
     */
    public Agence getAgence() {
        return agence;
    }

    /**
     * Définit la valeur de la propriété agence.
     * 
     * @param value
     *     allowed object is
     *     {@link Agence }
     *     
     */
    public void setAgence(Agence value) {
        this.agence = value;
    }

}

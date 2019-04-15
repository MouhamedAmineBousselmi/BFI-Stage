
package com.example.BanqueSI.WebServices.compteWebService;

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
 *         &lt;element name="compte" type="{http://com.example.BanqueSI.WebServices/cp}cpAdd"/>
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
    "compte"
})
@XmlRootElement(name = "addCpRequest", namespace = "http://com.example.BanqueSI.WebServices/cp")
public class AddCpRequest {

    @XmlElement(namespace = "http://com.example.BanqueSI.WebServices/cp", required = true)
    protected CpAdd compte;

    /**
     * Obtient la valeur de la propri�t� compte.
     * 
     * @return
     *     possible object is
     *     {@link CpAdd }
     *     
     */
    public CpAdd getCompte() {
        return compte;
    }

    /**
     * D�finit la valeur de la propri�t� compte.
     * 
     * @param value
     *     allowed object is
     *     {@link CpAdd }
     *     
     */
    public void setCompte(CpAdd value) {
        this.compte = value;
    }

}

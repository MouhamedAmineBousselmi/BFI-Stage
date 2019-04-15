
package com.example.BanqueSI.WebServices.compteWebService;

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
 *         &lt;element name="cpAdd" type="{http://com.example.BanqueSI.WebServices/cp}cpAdd"/>
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
    "cpAdd"
})
@XmlRootElement(name = "addCpResponse", namespace = "http://com.example.BanqueSI.WebServices/cp")
public class AddCpResponse {

    @XmlElement(namespace = "http://com.example.BanqueSI.WebServices/cp", required = true)
    protected CpAdd cpAdd;

    /**
     * Obtient la valeur de la propriété cpAdd.
     * 
     * @return
     *     possible object is
     *     {@link CpAdd }
     *     
     */
    public CpAdd getCpAdd() {
        return cpAdd;
    }

    /**
     * Définit la valeur de la propriété cpAdd.
     * 
     * @param value
     *     allowed object is
     *     {@link CpAdd }
     *     
     */
    public void setCpAdd(CpAdd value) {
        this.cpAdd = value;
    }

}

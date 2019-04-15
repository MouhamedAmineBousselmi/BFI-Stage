
package com.example.BanqueSI.WebServices.EmployeWebService;

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
 *         &lt;element name="employeAuth" type="{http://com.example.BanqueSI.WebServices/employe}employeAuth"/>
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
    "employeAuth"
})
@XmlRootElement(name = "LoadEmployesByUsernameResponse", namespace = "http://com.example.BanqueSI.WebServices/employe")
public class LoadEmployesByUsernameResponse {

    @XmlElement(namespace = "http://com.example.BanqueSI.WebServices/employe", required = true)
    protected EmployeAuth employeAuth;

    /**
     * Obtient la valeur de la propriété employeAuth.
     * 
     * @return
     *     possible object is
     *     {@link EmployeAuth }
     *     
     */
    public EmployeAuth getEmployeAuth() {
        return employeAuth;
    }

    /**
     * Définit la valeur de la propriété employeAuth.
     * 
     * @param value
     *     allowed object is
     *     {@link EmployeAuth }
     *     
     */
    public void setEmployeAuth(EmployeAuth value) {
        this.employeAuth = value;
    }

}

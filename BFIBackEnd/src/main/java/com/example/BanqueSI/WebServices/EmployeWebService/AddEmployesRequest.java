
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
 *         &lt;element name="employeAdd" type="{http://com.example.BanqueSI.WebServices/employe}employeAdd"/>
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
    "employeAdd"
})
@XmlRootElement(name = "addEmployesRequest", namespace = "http://com.example.BanqueSI.WebServices/employe")
public class AddEmployesRequest {

    @XmlElement(namespace = "http://com.example.BanqueSI.WebServices/employe", required = true)
    protected EmployeAdd employeAdd;

    /**
     * Obtient la valeur de la propriété employeAdd.
     * 
     * @return
     *     possible object is
     *     {@link EmployeAdd }
     *     
     */
    public EmployeAdd getEmployeAdd() {
        return employeAdd;
    }

    /**
     * Définit la valeur de la propriété employeAdd.
     * 
     * @param value
     *     allowed object is
     *     {@link EmployeAdd }
     *     
     */
    public void setEmployeAdd(EmployeAdd value) {
        this.employeAdd = value;
    }

}


package com.example.BanqueSI.WebServices.EmployeWebService;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element name="employeMax" type="{http://com.example.BanqueSI.WebServices/employe}employeMax" maxOccurs="unbounded"/>
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
    "employeMax"
})
@XmlRootElement(name = "getAllEmployesResponse", namespace = "http://com.example.BanqueSI.WebServices/employe")
public class GetAllEmployesResponse {

    @XmlElement(namespace = "http://com.example.BanqueSI.WebServices/employe", required = true)
    protected List<EmployeMax> employeMax;

    /**
     * Gets the value of the employeMax property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the employeMax property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEmployeMax().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EmployeMax }
     * 
     * 
     */
    public List<EmployeMax> getEmployeMax() {
        if (employeMax == null) {
            employeMax = new ArrayList<EmployeMax>();
        }
        return this.employeMax;
    }

    public void setEmployeMax(List<EmployeMax> employeMax) {
        this.employeMax = employeMax;
    }
}

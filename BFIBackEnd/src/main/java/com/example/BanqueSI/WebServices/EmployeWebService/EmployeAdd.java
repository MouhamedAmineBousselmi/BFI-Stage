
package com.example.BanqueSI.WebServices.EmployeWebService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour employeAdd complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="employeAdd">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="username" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="password" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="employeSup" type="{http://www.w3.org/2001/XMLSchema}long"/>
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
@XmlType(name = "employeAdd", namespace = "http://com.example.BanqueSI.WebServices/employe", propOrder = {
    "username",
    "password",
    "employeSup",
    "agence"
})
public class EmployeAdd {

    @XmlElement(namespace = "http://com.example.BanqueSI.WebServices/employe", required = true)
    protected String username;
    @XmlElement(namespace = "http://com.example.BanqueSI.WebServices/employe", required = true)
    protected String password;
    @XmlElement(namespace = "http://com.example.BanqueSI.WebServices/employe")
    protected long employeSup;
    @XmlElement(namespace = "http://com.example.BanqueSI.WebServices/employe")
    protected long agence;

    /**
     * Obtient la valeur de la propri�t� username.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsername() {
        return username;
    }

    /**
     * D�finit la valeur de la propri�t� username.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsername(String value) {
        this.username = value;
    }

    /**
     * Obtient la valeur de la propri�t� password.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassword() {
        return password;
    }

    /**
     * D�finit la valeur de la propri�t� password.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassword(String value) {
        this.password = value;
    }

    /**
     * Obtient la valeur de la propri�t� employeSup.
     * 
     */
    public long getEmployeSup() {
        return employeSup;
    }

    /**
     * D�finit la valeur de la propri�t� employeSup.
     * 
     */
    public void setEmployeSup(long value) {
        this.employeSup = value;
    }

    /**
     * Obtient la valeur de la propri�t� agence.
     * 
     */
    public long getAgence() {
        return agence;
    }

    /**
     * D�finit la valeur de la propri�t� agence.
     * 
     */
    public void setAgence(long value) {
        this.agence = value;
    }

}

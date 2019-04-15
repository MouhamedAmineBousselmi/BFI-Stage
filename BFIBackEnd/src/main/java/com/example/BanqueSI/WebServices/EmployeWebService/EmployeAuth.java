
package com.example.BanqueSI.WebServices.EmployeWebService;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour employeAuth complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="employeAuth">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codeEmploye" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="username" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="password" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="agence" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="Authority" type="{http://com.example.BanqueSI.WebServices/employe}Authority" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "employeAuth", namespace = "http://com.example.BanqueSI.WebServices/employe", propOrder = {
    "codeEmploye",
    "username",
    "password",
    "agence",
    "authority"
})
public class EmployeAuth {

    @XmlElement(namespace = "http://com.example.BanqueSI.WebServices/employe")
    protected long codeEmploye;
    @XmlElement(namespace = "http://com.example.BanqueSI.WebServices/employe", required = true)
    protected String username;
    @XmlElement(namespace = "http://com.example.BanqueSI.WebServices/employe", required = true)
    protected String password;
    @XmlElement(namespace = "http://com.example.BanqueSI.WebServices/employe")
    protected long agence;
    @XmlElement(name = "Authority", namespace = "http://com.example.BanqueSI.WebServices/employe")
    protected List<Authority> authority;

    /**
     * Obtient la valeur de la propri�t� codeEmploye.
     * 
     */
    public long getCodeEmploye() {
        return codeEmploye;
    }

    /**
     * D�finit la valeur de la propri�t� codeEmploye.
     * 
     */
    public void setCodeEmploye(long value) {
        this.codeEmploye = value;
    }

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

    /**
     * Gets the value of the authority property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the authority property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAuthority().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Authority }
     * 
     * 
     */
    public List<Authority> getAuthority() {
        if (authority == null) {
            authority = new ArrayList<Authority>();
        }
        return this.authority;
    }

    public void setAuthority(List<Authority> authority) {
        this.authority = authority;
    }
}

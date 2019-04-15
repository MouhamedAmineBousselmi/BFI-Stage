
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
 *         &lt;element name="codeEmploye" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="username" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="password" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "codeEmploye",
    "username",
    "password"
})
@XmlRootElement(name = "updateEmployesRequest", namespace = "http://com.example.BanqueSI.WebServices/employe")
public class UpdateEmployesRequest {

    @XmlElement(namespace = "http://com.example.BanqueSI.WebServices/employe")
    protected long codeEmploye;
    @XmlElement(namespace = "http://com.example.BanqueSI.WebServices/employe", required = true)
    protected String username;
    @XmlElement(namespace = "http://com.example.BanqueSI.WebServices/employe", required = true)
    protected String password;

    /**
     * Obtient la valeur de la propriété codeEmploye.
     * 
     */
    public long getCodeEmploye() {
        return codeEmploye;
    }

    /**
     * Définit la valeur de la propriété codeEmploye.
     * 
     */
    public void setCodeEmploye(long value) {
        this.codeEmploye = value;
    }

    /**
     * Obtient la valeur de la propriété username.
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
     * Définit la valeur de la propriété username.
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
     * Obtient la valeur de la propriété password.
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
     * Définit la valeur de la propriété password.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassword(String value) {
        this.password = value;
    }

}

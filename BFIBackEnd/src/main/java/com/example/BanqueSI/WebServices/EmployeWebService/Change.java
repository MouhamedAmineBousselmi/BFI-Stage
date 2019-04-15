
package com.example.BanqueSI.WebServices.EmployeWebService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour change complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="change">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idChange" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="identif" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="nomP" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="prenomP" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="montant" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="changeType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "change", namespace = "http://com.example.BanqueSI.WebServices/employe", propOrder = {
    "idChange",
    "identif",
    "nomP",
    "prenomP",
    "montant",
    "changeType"
})
public class Change {

    @XmlElement(namespace = "http://com.example.BanqueSI.WebServices/employe")
    protected long idChange;
    @XmlElement(namespace = "http://com.example.BanqueSI.WebServices/employe", required = true)
    protected String identif;
    @XmlElement(namespace = "http://com.example.BanqueSI.WebServices/employe", required = true)
    protected String nomP;
    @XmlElement(namespace = "http://com.example.BanqueSI.WebServices/employe", required = true)
    protected String prenomP;
    @XmlElement(namespace = "http://com.example.BanqueSI.WebServices/employe")
    protected double montant;
    @XmlElement(namespace = "http://com.example.BanqueSI.WebServices/employe", required = true)
    protected String changeType;

    /**
     * Obtient la valeur de la propriété idChange.
     * 
     */
    public long getIdChange() {
        return idChange;
    }

    /**
     * Définit la valeur de la propriété idChange.
     * 
     */
    public void setIdChange(long value) {
        this.idChange = value;
    }

    /**
     * Obtient la valeur de la propriété identif.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentif() {
        return identif;
    }

    /**
     * Définit la valeur de la propriété identif.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentif(String value) {
        this.identif = value;
    }

    /**
     * Obtient la valeur de la propriété nomP.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomP() {
        return nomP;
    }

    /**
     * Définit la valeur de la propriété nomP.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomP(String value) {
        this.nomP = value;
    }

    /**
     * Obtient la valeur de la propriété prenomP.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrenomP() {
        return prenomP;
    }

    /**
     * Définit la valeur de la propriété prenomP.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrenomP(String value) {
        this.prenomP = value;
    }

    /**
     * Obtient la valeur de la propriété montant.
     * 
     */
    public double getMontant() {
        return montant;
    }

    /**
     * Définit la valeur de la propriété montant.
     * 
     */
    public void setMontant(double value) {
        this.montant = value;
    }

    /**
     * Obtient la valeur de la propriété changeType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChangeType() {
        return changeType;
    }

    /**
     * Définit la valeur de la propriété changeType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChangeType(String value) {
        this.changeType = value;
    }

}

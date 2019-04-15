
package com.example.BanqueSI.WebServices.changeWebService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java pour change complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
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
 *         &lt;element name="adresseP" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="destination" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="changeType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="dateChange" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="employe" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "change", namespace = "http://com.example.BanqueSI.WebServices/change", propOrder = {
    "idChange",
    "identif",
    "nomP",
    "prenomP",
    "montant",
    "adresseP",
    "destination",
    "changeType",
    "dateChange",
    "employe"
})
public class Change {

    @XmlElement(namespace = "http://com.example.BanqueSI.WebServices/change")
    protected long idChange;
    @XmlElement(namespace = "http://com.example.BanqueSI.WebServices/change", required = true)
    protected String identif;
    @XmlElement(namespace = "http://com.example.BanqueSI.WebServices/change", required = true)
    protected String nomP;
    @XmlElement(namespace = "http://com.example.BanqueSI.WebServices/change", required = true)
    protected String prenomP;
    @XmlElement(namespace = "http://com.example.BanqueSI.WebServices/change")
    protected double montant;
    @XmlElement(namespace = "http://com.example.BanqueSI.WebServices/change", required = true)
    protected String adresseP;
    @XmlElement(namespace = "http://com.example.BanqueSI.WebServices/change", required = true)
    protected String destination;
    @XmlElement(namespace = "http://com.example.BanqueSI.WebServices/change", required = true)
    protected String changeType;
    @XmlElement(namespace = "http://com.example.BanqueSI.WebServices/change", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateChange;
    @XmlElement(namespace = "http://com.example.BanqueSI.WebServices/change")
    protected long employe;

    /**
     * Obtient la valeur de la propri�t� idChange.
     * 
     */
    public long getIdChange() {
        return idChange;
    }

    /**
     * D�finit la valeur de la propri�t� idChange.
     * 
     */
    public void setIdChange(long value) {
        this.idChange = value;
    }

    /**
     * Obtient la valeur de la propri�t� identif.
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
     * D�finit la valeur de la propri�t� identif.
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
     * Obtient la valeur de la propri�t� nomP.
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
     * D�finit la valeur de la propri�t� nomP.
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
     * Obtient la valeur de la propri�t� prenomP.
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
     * D�finit la valeur de la propri�t� prenomP.
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
     * Obtient la valeur de la propri�t� montant.
     * 
     */
    public double getMontant() {
        return montant;
    }

    /**
     * D�finit la valeur de la propri�t� montant.
     * 
     */
    public void setMontant(double value) {
        this.montant = value;
    }

    /**
     * Obtient la valeur de la propri�t� adresseP.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdresseP() {
        return adresseP;
    }

    /**
     * D�finit la valeur de la propri�t� adresseP.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdresseP(String value) {
        this.adresseP = value;
    }

    /**
     * Obtient la valeur de la propri�t� destination.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestination() {
        return destination;
    }

    /**
     * D�finit la valeur de la propri�t� destination.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestination(String value) {
        this.destination = value;
    }

    /**
     * Obtient la valeur de la propri�t� changeType.
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
     * D�finit la valeur de la propri�t� changeType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChangeType(String value) {
        this.changeType = value;
    }

    /**
     * Obtient la valeur de la propri�t� dateChange.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateChange() {
        return dateChange;
    }

    /**
     * D�finit la valeur de la propri�t� dateChange.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateChange(XMLGregorianCalendar value) {
        this.dateChange = value;
    }

    /**
     * Obtient la valeur de la propri�t� employe.
     * 
     */
    public long getEmploye() {
        return employe;
    }

    /**
     * D�finit la valeur de la propri�t� employe.
     * 
     */
    public void setEmploye(long value) {
        this.employe = value;
    }

}

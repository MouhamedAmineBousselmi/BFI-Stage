
package com.example.BanqueSI.WebServices.chequeWebService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java pour cheque complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="cheque">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idC" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="nomProprietaire" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="prenomProprietaire" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="montant" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="numeroC" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="dateV" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="compte" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="employe" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="client" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cheque", namespace = "http://com.example.BanqueSI.WebServices/cheque", propOrder = {
    "idC",
    "nomProprietaire",
    "prenomProprietaire",
    "montant",
    "numeroC",
    "dateV",
    "compte",
    "employe",
    "client"
})
public class Cheque {

    @XmlElement(namespace = "http://com.example.BanqueSI.WebServices/cheque")
    protected long idC;
    @XmlElement(namespace = "http://com.example.BanqueSI.WebServices/cheque", required = true)
    protected String nomProprietaire;
    @XmlElement(namespace = "http://com.example.BanqueSI.WebServices/cheque", required = true)
    protected String prenomProprietaire;
    @XmlElement(namespace = "http://com.example.BanqueSI.WebServices/cheque")
    protected double montant;
    @XmlElement(namespace = "http://com.example.BanqueSI.WebServices/cheque")
    protected double numeroC;
    @XmlElement(namespace = "http://com.example.BanqueSI.WebServices/cheque", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateV;
    @XmlElement(namespace = "http://com.example.BanqueSI.WebServices/cheque", required = true)
    protected String compte;
    @XmlElement(namespace = "http://com.example.BanqueSI.WebServices/cheque")
    protected long employe;
    @XmlElement(namespace = "http://com.example.BanqueSI.WebServices/cheque")
    protected long client;

    /**
     * Obtient la valeur de la propri�t� idC.
     * 
     */
    public long getIdC() {
        return idC;
    }

    /**
     * D�finit la valeur de la propri�t� idC.
     * 
     */
    public void setIdC(long value) {
        this.idC = value;
    }

    /**
     * Obtient la valeur de la propri�t� nomProprietaire.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomProprietaire() {
        return nomProprietaire;
    }

    /**
     * D�finit la valeur de la propri�t� nomProprietaire.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomProprietaire(String value) {
        this.nomProprietaire = value;
    }

    /**
     * Obtient la valeur de la propri�t� prenomProprietaire.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrenomProprietaire() {
        return prenomProprietaire;
    }

    /**
     * D�finit la valeur de la propri�t� prenomProprietaire.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrenomProprietaire(String value) {
        this.prenomProprietaire = value;
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
     * Obtient la valeur de la propri�t� numeroC.
     * 
     */
    public double getNumeroC() {
        return numeroC;
    }

    /**
     * D�finit la valeur de la propri�t� numeroC.
     * 
     */
    public void setNumeroC(double value) {
        this.numeroC = value;
    }

    /**
     * Obtient la valeur de la propri�t� dateV.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateV() {
        return dateV;
    }

    /**
     * D�finit la valeur de la propri�t� dateV.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateV(XMLGregorianCalendar value) {
        this.dateV = value;
    }

    /**
     * Obtient la valeur de la propri�t� compte.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompte() {
        return compte;
    }

    /**
     * D�finit la valeur de la propri�t� compte.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompte(String value) {
        this.compte = value;
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

    /**
     * Obtient la valeur de la propri�t� client.
     * 
     */
    public long getClient() {
        return client;
    }

    /**
     * D�finit la valeur de la propri�t� client.
     * 
     */
    public void setClient(long value) {
        this.client = value;
    }

}

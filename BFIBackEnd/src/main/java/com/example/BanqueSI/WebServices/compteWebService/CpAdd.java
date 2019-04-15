
package com.example.BanqueSI.WebServices.compteWebService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour cpAdd complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="cpAdd">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codeCompte" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="solde" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="decouvert" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="taux" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="agence" type="{http://www.w3.org/2001/XMLSchema}long"/>
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
@XmlType(name = "cpAdd", namespace = "http://com.example.BanqueSI.WebServices/cp", propOrder = {
    "codeCompte",
    "solde",
    "decouvert",
    "taux",
    "type",
    "agence",
    "client"
})
public class CpAdd {

    @XmlElement(namespace = "http://com.example.BanqueSI.WebServices/cp", required = true)
    protected String codeCompte;
    @XmlElement(namespace = "http://com.example.BanqueSI.WebServices/cp")
    protected double solde;
    @XmlElement(namespace = "http://com.example.BanqueSI.WebServices/cp")
    protected double decouvert;
    @XmlElement(namespace = "http://com.example.BanqueSI.WebServices/cp")
    protected double taux;
    @XmlElement(namespace = "http://com.example.BanqueSI.WebServices/cp", required = true)
    protected String type;
    @XmlElement(namespace = "http://com.example.BanqueSI.WebServices/cp")
    protected long agence;
    @XmlElement(namespace = "http://com.example.BanqueSI.WebServices/cp")
    protected long client;

    /**
     * Obtient la valeur de la propri�t� codeCompte.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeCompte() {
        return codeCompte;
    }

    /**
     * D�finit la valeur de la propri�t� codeCompte.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeCompte(String value) {
        this.codeCompte = value;
    }

    /**
     * Obtient la valeur de la propri�t� solde.
     * 
     */
    public double getSolde() {
        return solde;
    }

    /**
     * D�finit la valeur de la propri�t� solde.
     * 
     */
    public void setSolde(double value) {
        this.solde = value;
    }

    /**
     * Obtient la valeur de la propri�t� decouvert.
     * 
     */
    public double getDecouvert() {
        return decouvert;
    }

    /**
     * D�finit la valeur de la propri�t� decouvert.
     * 
     */
    public void setDecouvert(double value) {
        this.decouvert = value;
    }

    /**
     * Obtient la valeur de la propri�t� taux.
     * 
     */
    public double getTaux() {
        return taux;
    }

    /**
     * D�finit la valeur de la propri�t� taux.
     * 
     */
    public void setTaux(double value) {
        this.taux = value;
    }

    /**
     * Obtient la valeur de la propri�t� type.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * D�finit la valeur de la propri�t� type.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
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

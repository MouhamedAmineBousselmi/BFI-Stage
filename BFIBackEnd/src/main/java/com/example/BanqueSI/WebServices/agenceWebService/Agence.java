
package com.example.BanqueSI.WebServices.agenceWebService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour agence complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="agence">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codeAgence" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="nomAgence" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="adresseAgence" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="heureOuverture" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="heureFermeture" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "agence", namespace = "http://com.example.BanqueSI.WebServices/agence", propOrder = {
    "codeAgence",
    "nomAgence",
    "adresseAgence",
    "heureOuverture",
    "heureFermeture"
})
public class Agence {

    @XmlElement(namespace = "http://com.example.BanqueSI.WebServices/agence")
    protected long codeAgence;
    @XmlElement(namespace = "http://com.example.BanqueSI.WebServices/agence", required = true)
    protected String nomAgence;
    @XmlElement(namespace = "http://com.example.BanqueSI.WebServices/agence", required = true)
    protected String adresseAgence;
    @XmlElement(namespace = "http://com.example.BanqueSI.WebServices/agence", required = true)
    protected String heureOuverture;
    @XmlElement(namespace = "http://com.example.BanqueSI.WebServices/agence", required = true)
    protected String heureFermeture;

    /**
     * Obtient la valeur de la propri�t� codeAgence.
     * 
     */
    public long getCodeAgence() {
        return codeAgence;
    }

    /**
     * D�finit la valeur de la propri�t� codeAgence.
     * 
     */
    public void setCodeAgence(long value) {
        this.codeAgence = value;
    }

    /**
     * Obtient la valeur de la propri�t� nomAgence.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomAgence() {
        return nomAgence;
    }

    /**
     * D�finit la valeur de la propri�t� nomAgence.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomAgence(String value) {
        this.nomAgence = value;
    }

    /**
     * Obtient la valeur de la propri�t� adresseAgence.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdresseAgence() {
        return adresseAgence;
    }

    /**
     * D�finit la valeur de la propri�t� adresseAgence.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdresseAgence(String value) {
        this.adresseAgence = value;
    }

    /**
     * Obtient la valeur de la propri�t� heureOuverture.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHeureOuverture() {
        return heureOuverture;
    }

    /**
     * D�finit la valeur de la propri�t� heureOuverture.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHeureOuverture(String value) {
        this.heureOuverture = value;
    }

    /**
     * Obtient la valeur de la propri�t� heureFermeture.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHeureFermeture() {
        return heureFermeture;
    }

    /**
     * D�finit la valeur de la propri�t� heureFermeture.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHeureFermeture(String value) {
        this.heureFermeture = value;
    }

}

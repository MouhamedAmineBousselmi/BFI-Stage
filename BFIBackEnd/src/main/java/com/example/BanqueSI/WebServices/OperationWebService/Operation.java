
package com.example.BanqueSI.WebServices.OperationWebService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java pour operation complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="operation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="montant" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="compte" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="employe" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="typeO" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="dateOperation" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "operation", namespace = "http://com.example.BanqueSI.WebServices/operation", propOrder = {
    "id",
    "montant",
    "compte",
    "employe",
    "typeO",
    "dateOperation"
})
public class Operation {

    @XmlElement(namespace = "http://com.example.BanqueSI.WebServices/operation")
    protected long id;
    @XmlElement(namespace = "http://com.example.BanqueSI.WebServices/operation")
    protected double montant;
    @XmlElement(namespace = "http://com.example.BanqueSI.WebServices/operation", required = true)
    protected String compte;
    @XmlElement(namespace = "http://com.example.BanqueSI.WebServices/operation")
    protected long employe;
    @XmlElement(namespace = "http://com.example.BanqueSI.WebServices/operation", required = true)
    protected String typeO;
    @XmlElement(namespace = "http://com.example.BanqueSI.WebServices/operation", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateOperation;

    /**
     * Obtient la valeur de la propriété id.
     * 
     */
    public long getId() {
        return id;
    }

    /**
     * Définit la valeur de la propriété id.
     * 
     */
    public void setId(long value) {
        this.id = value;
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
     * Obtient la valeur de la propriété compte.
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
     * Définit la valeur de la propriété compte.
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
     * Obtient la valeur de la propriété employe.
     * 
     */
    public long getEmploye() {
        return employe;
    }

    /**
     * Définit la valeur de la propriété employe.
     * 
     */
    public void setEmploye(long value) {
        this.employe = value;
    }

    /**
     * Obtient la valeur de la propriété typeO.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeO() {
        return typeO;
    }

    /**
     * Définit la valeur de la propriété typeO.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeO(String value) {
        this.typeO = value;
    }

    /**
     * Obtient la valeur de la propriété dateOperation.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateOperation() {
        return dateOperation;
    }

    /**
     * Définit la valeur de la propriété dateOperation.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateOperation(XMLGregorianCalendar value) {
        this.dateOperation = value;
    }

}

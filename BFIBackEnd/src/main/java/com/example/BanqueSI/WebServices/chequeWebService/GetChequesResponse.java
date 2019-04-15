
package com.example.BanqueSI.WebServices.chequeWebService;

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
 *         &lt;element name="cheque" type="{http://com.example.BanqueSI.WebServices/cheque}cheque" maxOccurs="unbounded"/>
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
    "cheque"
})
@XmlRootElement(name = "getChequesResponse", namespace = "http://com.example.BanqueSI.WebServices/cheque")
public class GetChequesResponse {

    @XmlElement(namespace = "http://com.example.BanqueSI.WebServices/cheque", required = true)
    protected List<Cheque> cheque;

    /**
     * Gets the value of the cheque property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cheque property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCheque().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Cheque }
     * 
     * 
     */
    public List<Cheque> getCheque() {
        if (cheque == null) {
            cheque = new ArrayList<Cheque>();
        }
        return this.cheque;
    }

    public void setCheque(List<Cheque> cheque) {
        this.cheque = cheque;
    }
}

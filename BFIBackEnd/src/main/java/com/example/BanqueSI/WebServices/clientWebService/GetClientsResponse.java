
package com.example.BanqueSI.WebServices.clientWebService;

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
 *         &lt;element name="client" type="{http://com.example.BanqueSI.WebServices/client}client" maxOccurs="unbounded"/>
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
    "client"
})
@XmlRootElement(name = "getClientsResponse", namespace = "http://com.example.BanqueSI.WebServices/client")
public class GetClientsResponse {

    @XmlElement(namespace = "http://com.example.BanqueSI.WebServices/client", required = true)
    protected List<Client> client;

    /**
     * Gets the value of the client property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the client property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClient().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Client }
     * 
     * 
     */
    public List<Client> getClient() {
        if (client == null) {
            client = new ArrayList<Client>();
        }
        return this.client;
    }

    public void setClient(List<Client> client) {
        this.client = client;
    }
}

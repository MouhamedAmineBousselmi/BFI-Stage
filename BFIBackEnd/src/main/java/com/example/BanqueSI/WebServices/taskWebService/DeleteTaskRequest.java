
package com.example.BanqueSI.WebServices.taskWebService;

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
 *         &lt;element name="idT" type="{http://www.w3.org/2001/XMLSchema}long"/>
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
    "idT"
})
@XmlRootElement(name = "deleteTaskRequest", namespace = "http://com.example.BanqueSI.WebServices/task")
public class DeleteTaskRequest {

    @XmlElement(namespace = "http://com.example.BanqueSI.WebServices/task")
    protected long idT;

    /**
     * Obtient la valeur de la propri�t� idT.
     * 
     */
    public long getIdT() {
        return idT;
    }

    /**
     * D�finit la valeur de la propri�t� idT.
     * 
     */
    public void setIdT(long value) {
        this.idT = value;
    }

}

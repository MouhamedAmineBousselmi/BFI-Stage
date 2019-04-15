
package com.example.BanqueSI.WebServices.taskWebService;

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
 *         &lt;element name="idTask" type="{http://www.w3.org/2001/XMLSchema}long"/>
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
    "idTask"
})
@XmlRootElement(name = "GetTasksStatusRequest", namespace = "http://com.example.BanqueSI.WebServices/task")
public class GetTasksStatusRequest {

    @XmlElement(namespace = "http://com.example.BanqueSI.WebServices/task")
    protected long idTask;

    /**
     * Obtient la valeur de la propriété idTask.
     * 
     */
    public long getIdTask() {
        return idTask;
    }

    /**
     * Définit la valeur de la propriété idTask.
     * 
     */
    public void setIdTask(long value) {
        this.idTask = value;
    }

}


package com.example.BanqueSI.WebServices.taskWebService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour taskMin complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="taskMin">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idTask" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "taskMin", namespace = "http://com.example.BanqueSI.WebServices/task", propOrder = {
    "idTask",
    "status"
})
public class TaskMin {

    @XmlElement(namespace = "http://com.example.BanqueSI.WebServices/task")
    protected long idTask;
    @XmlElement(namespace = "http://com.example.BanqueSI.WebServices/task")
    protected boolean status;

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

    /**
     * Obtient la valeur de la propriété status.
     * 
     */
    public boolean isStatus() {
        return status;
    }

    /**
     * Définit la valeur de la propriété status.
     * 
     */
    public void setStatus(boolean value) {
        this.status = value;
    }

}

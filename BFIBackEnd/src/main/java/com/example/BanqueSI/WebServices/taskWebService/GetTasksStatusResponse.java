
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
 *         &lt;element name="task" type="{http://com.example.BanqueSI.WebServices/task}taskMin"/>
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
    "task"
})
@XmlRootElement(name = "GetTasksStatusResponse", namespace = "http://com.example.BanqueSI.WebServices/task")
public class GetTasksStatusResponse {

    @XmlElement(namespace = "http://com.example.BanqueSI.WebServices/task", required = true)
    protected TaskMin task;

    /**
     * Obtient la valeur de la propriété task.
     * 
     * @return
     *     possible object is
     *     {@link TaskMin }
     *     
     */
    public TaskMin getTask() {
        return task;
    }

    /**
     * Définit la valeur de la propriété task.
     * 
     * @param value
     *     allowed object is
     *     {@link TaskMin }
     *     
     */
    public void setTask(TaskMin value) {
        this.task = value;
    }

}

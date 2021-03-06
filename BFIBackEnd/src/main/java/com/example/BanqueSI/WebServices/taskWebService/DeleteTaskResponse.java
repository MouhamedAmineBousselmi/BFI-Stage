
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
 *         &lt;element name="task" type="{http://com.example.BanqueSI.WebServices/task}taskD"/>
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
@XmlRootElement(name = "deleteTaskResponse", namespace = "http://com.example.BanqueSI.WebServices/task")
public class DeleteTaskResponse {

    @XmlElement(namespace = "http://com.example.BanqueSI.WebServices/task", required = true)
    protected TaskD task;

    /**
     * Obtient la valeur de la propri�t� task.
     * 
     * @return
     *     possible object is
     *     {@link TaskD }
     *     
     */
    public TaskD getTask() {
        return task;
    }

    /**
     * D�finit la valeur de la propri�t� task.
     * 
     * @param value
     *     allowed object is
     *     {@link TaskD }
     *     
     */
    public void setTask(TaskD value) {
        this.task = value;
    }

}

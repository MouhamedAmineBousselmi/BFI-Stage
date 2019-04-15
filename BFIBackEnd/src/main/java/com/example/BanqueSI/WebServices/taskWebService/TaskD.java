
package com.example.BanqueSI.WebServices.taskWebService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour taskD complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="taskD">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idTask" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="taskName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="taskMessage" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="nextStep" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="priority" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="taskType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="employe" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "taskD", namespace = "http://com.example.BanqueSI.WebServices/task", propOrder = {
    "idTask",
    "taskName",
    "taskMessage",
    "status",
    "nextStep",
    "priority",
    "taskType",
    "employe"
})
public class TaskD {

    @XmlElement(namespace = "http://com.example.BanqueSI.WebServices/task")
    protected long idTask;
    @XmlElement(namespace = "http://com.example.BanqueSI.WebServices/task", required = true)
    protected String taskName;
    @XmlElement(namespace = "http://com.example.BanqueSI.WebServices/task", required = true)
    protected String taskMessage;
    @XmlElement(namespace = "http://com.example.BanqueSI.WebServices/task")
    protected boolean status;
    @XmlElement(namespace = "http://com.example.BanqueSI.WebServices/task", required = true)
    protected String nextStep;
    @XmlElement(namespace = "http://com.example.BanqueSI.WebServices/task", required = true)
    protected String priority;
    @XmlElement(namespace = "http://com.example.BanqueSI.WebServices/task", required = true)
    protected String taskType;
    @XmlElement(namespace = "http://com.example.BanqueSI.WebServices/task")
    protected long employe;

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
     * Obtient la valeur de la propriété taskName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaskName() {
        return taskName;
    }

    /**
     * Définit la valeur de la propriété taskName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaskName(String value) {
        this.taskName = value;
    }

    /**
     * Obtient la valeur de la propriété taskMessage.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaskMessage() {
        return taskMessage;
    }

    /**
     * Définit la valeur de la propriété taskMessage.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaskMessage(String value) {
        this.taskMessage = value;
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

    /**
     * Obtient la valeur de la propriété nextStep.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNextStep() {
        return nextStep;
    }

    /**
     * Définit la valeur de la propriété nextStep.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNextStep(String value) {
        this.nextStep = value;
    }

    /**
     * Obtient la valeur de la propriété priority.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriority() {
        return priority;
    }

    /**
     * Définit la valeur de la propriété priority.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriority(String value) {
        this.priority = value;
    }

    /**
     * Obtient la valeur de la propriété taskType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaskType() {
        return taskType;
    }

    /**
     * Définit la valeur de la propriété taskType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaskType(String value) {
        this.taskType = value;
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

}

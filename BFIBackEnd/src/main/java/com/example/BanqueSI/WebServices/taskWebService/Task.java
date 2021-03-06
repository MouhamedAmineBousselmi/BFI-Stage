
package com.example.BanqueSI.WebServices.taskWebService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java pour task complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="task">
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
 *         &lt;element name="startDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="deadline" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "task", namespace = "http://com.example.BanqueSI.WebServices/task", propOrder = {
    "idTask",
    "taskName",
    "taskMessage",
    "status",
    "nextStep",
    "priority",
    "taskType",
    "employe",
    "startDate",
    "deadline"
})
public class Task {

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
    @XmlElement(namespace = "http://com.example.BanqueSI.WebServices/task", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar startDate;
    @XmlElement(namespace = "http://com.example.BanqueSI.WebServices/task", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar deadline;

    /**
     * Obtient la valeur de la propri�t� idTask.
     * 
     */
    public long getIdTask() {
        return idTask;
    }

    /**
     * D�finit la valeur de la propri�t� idTask.
     * 
     */
    public void setIdTask(long value) {
        this.idTask = value;
    }

    /**
     * Obtient la valeur de la propri�t� taskName.
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
     * D�finit la valeur de la propri�t� taskName.
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
     * Obtient la valeur de la propri�t� taskMessage.
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
     * D�finit la valeur de la propri�t� taskMessage.
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
     * Obtient la valeur de la propri�t� status.
     * 
     */
    public boolean isStatus() {
        return status;
    }

    /**
     * D�finit la valeur de la propri�t� status.
     * 
     */
    public void setStatus(boolean value) {
        this.status = value;
    }

    /**
     * Obtient la valeur de la propri�t� nextStep.
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
     * D�finit la valeur de la propri�t� nextStep.
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
     * Obtient la valeur de la propri�t� priority.
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
     * D�finit la valeur de la propri�t� priority.
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
     * Obtient la valeur de la propri�t� taskType.
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
     * D�finit la valeur de la propri�t� taskType.
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
     * Obtient la valeur de la propri�t� employe.
     * 
     */
    public long getEmploye() {
        return employe;
    }

    /**
     * D�finit la valeur de la propri�t� employe.
     * 
     */
    public void setEmploye(long value) {
        this.employe = value;
    }

    /**
     * Obtient la valeur de la propri�t� startDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartDate() {
        return startDate;
    }

    /**
     * D�finit la valeur de la propri�t� startDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartDate(XMLGregorianCalendar value) {
        this.startDate = value;
    }

    /**
     * Obtient la valeur de la propri�t� deadline.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDeadline() {
        return deadline;
    }

    /**
     * D�finit la valeur de la propri�t� deadline.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDeadline(XMLGregorianCalendar value) {
        this.deadline = value;
    }

}

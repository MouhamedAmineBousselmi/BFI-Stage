
package com.example.BanqueSI.WebServices.EmployeWebService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="taskType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "task", namespace = "http://com.example.BanqueSI.WebServices/employe", propOrder = {
    "idTask",
    "taskName",
    "taskMessage",
    "status",
    "taskType"
})
public class Task {

    @XmlElement(namespace = "http://com.example.BanqueSI.WebServices/employe")
    protected long idTask;
    @XmlElement(namespace = "http://com.example.BanqueSI.WebServices/employe", required = true)
    protected String taskName;
    @XmlElement(namespace = "http://com.example.BanqueSI.WebServices/employe", required = true)
    protected String taskMessage;
    @XmlElement(namespace = "http://com.example.BanqueSI.WebServices/employe")
    protected boolean status;
    @XmlElement(namespace = "http://com.example.BanqueSI.WebServices/employe", required = true)
    protected String taskType;

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

}

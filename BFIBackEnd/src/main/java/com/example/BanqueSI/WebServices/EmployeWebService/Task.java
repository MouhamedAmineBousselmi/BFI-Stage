
package com.example.BanqueSI.WebServices.EmployeWebService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour task complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
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

}

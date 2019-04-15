
package com.example.BanqueSI.WebServices.EmployeWebService;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour employeMax complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="employeMax">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codeEmploye" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="username" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="task" type="{http://com.example.BanqueSI.WebServices/employe}task" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="change" type="{http://com.example.BanqueSI.WebServices/employe}change" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="cheque" type="{http://com.example.BanqueSI.WebServices/employe}cheque" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "employeMax", namespace = "http://com.example.BanqueSI.WebServices/employe", propOrder = {
    "codeEmploye",
    "username",
    "task",
    "change",
    "cheque"
})
public class EmployeMax {

    @XmlElement(namespace = "http://com.example.BanqueSI.WebServices/employe")
    protected long codeEmploye;
    @XmlElement(namespace = "http://com.example.BanqueSI.WebServices/employe", required = true)
    protected String username;
    @XmlElement(namespace = "http://com.example.BanqueSI.WebServices/employe")
    protected List<Task> task;
    @XmlElement(namespace = "http://com.example.BanqueSI.WebServices/employe")
    protected List<Change> change;
    @XmlElement(namespace = "http://com.example.BanqueSI.WebServices/employe")
    protected List<Cheque> cheque;

    /**
     * Obtient la valeur de la propri�t� codeEmploye.
     * 
     */
    public long getCodeEmploye() {
        return codeEmploye;
    }

    /**
     * D�finit la valeur de la propri�t� codeEmploye.
     * 
     */
    public void setCodeEmploye(long value) {
        this.codeEmploye = value;
    }

    /**
     * Obtient la valeur de la propri�t� username.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsername() {
        return username;
    }

    /**
     * D�finit la valeur de la propri�t� username.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsername(String value) {
        this.username = value;
    }

    /**
     * Gets the value of the task property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the task property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTask().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Task }
     * 
     * 
     */
    public List<Task> getTask() {
        if (task == null) {
            task = new ArrayList<Task>();
        }
        return this.task;
    }

    /**
     * Gets the value of the change property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the change property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChange().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Change }
     * 
     * 
     */
    public List<Change> getChange() {
        if (change == null) {
            change = new ArrayList<Change>();
        }
        return this.change;
    }

    /**
     * Gets the value of the cheque property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cheque property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCheque().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Cheque }
     * 
     * 
     */
    public List<Cheque> getCheque() {
        if (cheque == null) {
            cheque = new ArrayList<Cheque>();
        }
        return this.cheque;
    }

    public void setTask(List<Task> task) {
        this.task = task;
    }

    public void setChange(List<Change> change) {
        this.change = change;
    }

    public void setCheque(List<Cheque> cheque) {
        this.cheque = cheque;
    }
}

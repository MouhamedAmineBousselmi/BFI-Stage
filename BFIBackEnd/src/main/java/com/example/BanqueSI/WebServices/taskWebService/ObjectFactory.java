
package com.example.BanqueSI.WebServices.taskWebService;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.example.BanqueSI.WebServices.taskWebService package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.example.BanqueSI.WebServices.taskWebService
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DeleteTaskRequest }
     * 
     */
    public DeleteTaskRequest createDeleteTaskRequest() {
        return new DeleteTaskRequest();
    }

    /**
     * Create an instance of {@link GetTasksStatusRequest }
     * 
     */
    public GetTasksStatusRequest createGetTasksStatusRequest() {
        return new GetTasksStatusRequest();
    }

    /**
     * Create an instance of {@link GetTasksRequest }
     * 
     */
    public GetTasksRequest createGetTasksRequest() {
        return new GetTasksRequest();
    }

    /**
     * Create an instance of {@link AddTaskRequest }
     * 
     */
    public AddTaskRequest createAddTaskRequest() {
        return new AddTaskRequest();
    }

    /**
     * Create an instance of {@link Task }
     * 
     */
    public Task createTask() {
        return new Task();
    }

    /**
     * Create an instance of {@link AddTaskResponse }
     * 
     */
    public AddTaskResponse createAddTaskResponse() {
        return new AddTaskResponse();
    }

    /**
     * Create an instance of {@link DeleteTaskResponse }
     * 
     */
    public DeleteTaskResponse createDeleteTaskResponse() {
        return new DeleteTaskResponse();
    }

    /**
     * Create an instance of {@link TaskD }
     * 
     */
    public TaskD createTaskD() {
        return new TaskD();
    }

    /**
     * Create an instance of {@link GetTasksStatusResponse }
     * 
     */
    public GetTasksStatusResponse createGetTasksStatusResponse() {
        return new GetTasksStatusResponse();
    }

    /**
     * Create an instance of {@link TaskMin }
     * 
     */
    public TaskMin createTaskMin() {
        return new TaskMin();
    }

    /**
     * Create an instance of {@link GetTasksResponse }
     * 
     */
    public GetTasksResponse createGetTasksResponse() {
        return new GetTasksResponse();
    }

}

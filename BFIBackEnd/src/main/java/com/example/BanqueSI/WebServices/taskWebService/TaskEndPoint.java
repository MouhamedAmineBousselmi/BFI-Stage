package com.example.BanqueSI.WebServices.taskWebService;

import org.joda.time.LocalDate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

/**
 * Created by amino on 04/08/2017
 */
@Endpoint
public class TaskEndPoint {

    private static final String NAMESPACE_URI = "http://com.example.BanqueSI.WebServices/task";

    private TaskRepo taskRepo;

    @Autowired
    public TaskEndPoint(TaskRepo taskRepo) {
        this.taskRepo = taskRepo;
    }


    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "addTaskRequest")
    @ResponsePayload
    public AddTaskResponse AddTask(@RequestPayload AddTaskRequest request) {
        AddTaskResponse response = new AddTaskResponse();
        response.setTask(taskRepo.addTask(request.getTask()));
        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "GetTasksStatusRequest")
    @ResponsePayload
    public GetTasksStatusResponse AddTask(@RequestPayload GetTasksStatusRequest request) {
        GetTasksStatusResponse response = new GetTasksStatusResponse();
        response.setTask(taskRepo.getTaskStatuts(request.getIdTask()));
        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "deleteTaskRequest")
    @ResponsePayload
    public DeleteTaskResponse deleteTask(@RequestPayload DeleteTaskRequest request) {
        DeleteTaskResponse response = new DeleteTaskResponse();
        response.setTask(taskRepo.deleteTask(request.getIdT()));
        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "GetTasksRequest")
    @ResponsePayload
    public GetTasksResponse getTasks(@RequestPayload GetTasksRequest request) {
        GetTasksResponse response = new GetTasksResponse();
        response.setTask(taskRepo.getTasks(request.getIdAgence()));
        return response;
    }
}

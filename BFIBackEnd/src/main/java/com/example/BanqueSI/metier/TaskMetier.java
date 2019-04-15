package com.example.BanqueSI.metier;

import com.example.BanqueSI.entities.Task;

import java.util.List;

/**
 * Created by amino on 05/08/2017
 */
public interface TaskMetier {
    public List<Task> getTasks();
    public void updateTask(Task t);
}

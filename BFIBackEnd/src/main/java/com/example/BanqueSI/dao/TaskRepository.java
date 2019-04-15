package com.example.BanqueSI.dao;

import com.example.BanqueSI.entities.Task;
import org.joda.time.LocalDate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * Created by amino on 05/08/2017
 */
public interface TaskRepository extends JpaRepository<Task,Long>{

    @Query("select t from Task  t  where t.startDate=:z")
    List<Task> getTaskWithStartDate(@Param("z") LocalDate date);
}
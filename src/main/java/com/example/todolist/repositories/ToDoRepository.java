package com.example.todolist.repositories;

import com.example.todolist.entities.ToDoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ToDoRepository extends JpaRepository<ToDoEntity, String> {
    @Query("select u from ToDoEntity u WHERE u.task_id = :task_id")
    List<ToDoEntity> getToDos(@Param("task_id") String task_id);
}

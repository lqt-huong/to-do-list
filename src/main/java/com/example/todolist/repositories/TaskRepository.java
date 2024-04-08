package com.example.todolist.repositories;

import com.example.todolist.entities.TaskEntity;
import com.example.todolist.entities.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TaskRepository extends JpaRepository<TaskEntity, String> {
    @Query("select u from TaskEntity u WHERE u.user_id = :userid")
    List<TaskEntity> getTasks(@Param("userid") String userid);
}

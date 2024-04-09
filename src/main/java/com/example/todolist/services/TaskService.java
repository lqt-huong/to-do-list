package com.example.todolist.services;

import com.example.todolist.dtos.TaskDto;
import com.example.todolist.dtos.ToDoDto;

import com.example.todolist.dtos.UserDto;

import com.example.todolist.entities.TaskEntity;
import com.example.todolist.entities.ToDoEntity;
import com.example.todolist.mapper.TaskMapper;
import com.example.todolist.mapper.ToDoMapper;

import com.example.todolist.repositories.TaskRepository;
import com.example.todolist.repositories.ToDoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.ArrayList;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class TaskService {
    final TaskRepository taskRepository;
    final ToDoRepository toDoRespository;

    public List<TaskDto> getTask(UserDto userDto) {
        List<TaskEntity> taskEntities = taskRepository.getTasks(userDto.getId());
        List<TaskDto> taskDtos = TaskMapper.INSTANCE.toTaskDtos(taskEntities);

        List<ToDoEntity> toDoEntities = toDoRespository.findAll();
        List<ToDoDto> toDoDtos = ToDoMapper.INSTANCE.toToDoDtos(toDoEntities);

        for (TaskDto task:taskDtos) {
            task.setToDoList(new ArrayList<>());
            for (ToDoDto toDo:toDoDtos) {
                if (toDo.getTask_id().equals(task.getId())) {
                    task.getToDoList().add(toDo);
                }
            }
        }


        return taskDtos;
    }
    public int addTask(TaskDto taskDto) {
        try {
            taskDto.setId(UUID.randomUUID().toString());
            TaskEntity task = TaskMapper.INSTANCE.toTaskEntity(taskDto);
            taskRepository.save(task);
            return 1;
        }catch(Exception e) {
            return -1;
        }
    }
    public int deleteTask(TaskDto taskDto) {
        try {
            TaskEntity task = TaskMapper.INSTANCE.toTaskEntity(taskDto);
            taskRepository.delete(task);
            return 1;
        }catch(Exception e) {
            return -1;
        }
    }
}


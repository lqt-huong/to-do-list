package com.example.todolist.services;

import com.example.todolist.dtos.TaskDto;
import com.example.todolist.dtos.UserDto;

import com.example.todolist.entities.TaskEntity;
import com.example.todolist.mapper.TaskMapper;
import com.example.todolist.repositories.TaskRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TaskService {
    final TaskRepository taskRepository;

    public List<TaskDto> getTask(UserDto userDto) {
        List<TaskEntity> taskEntities = taskRepository.getTasks(userDto.getId());
        List<TaskDto> taskDtos = TaskMapper.INSTANCE.toTaskDtos(taskEntities);
        return taskDtos;
    }
}


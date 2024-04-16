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

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class ToDoService {
    final ToDoRepository toDoRespository;


    public int addToDo(ToDoDto toDoDto) {
        try {
            toDoDto.setId(UUID.randomUUID().toString());
            toDoDto.setChecked(false);
            ToDoEntity todo = ToDoMapper.INSTANCE.toToDoEntity(toDoDto);
            toDoRespository.save(todo);
            return 1;
        }catch(Exception e) {
            return -1;
        }
    }
    public int deleteToDo(List<ToDoDto> toDoDto) {
        try {
            for(ToDoDto i : toDoDto)
                toDoRespository.deleteById(i.getId());
            return 1;
        }catch(Exception e) {
            return -1;
        }
    }

    public int updateToDo(ToDoDto toDoDto) {
        try {
            ToDoEntity todo = ToDoMapper.INSTANCE.toToDoEntity(toDoDto);
            toDoRespository.save(todo);
            return 1;
        }catch(Exception e) {
            return -1;
        }
    }
}


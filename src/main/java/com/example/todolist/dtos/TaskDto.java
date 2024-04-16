package com.example.todolist.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@NoArgsConstructor
@AllArgsConstructor
@Data

public class TaskDto {
    String id;
    String name;
    String user_id;
    List<ToDoDto> toDoList;
    int serial;
}
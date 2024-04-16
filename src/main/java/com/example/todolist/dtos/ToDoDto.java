package com.example.todolist.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
@Data

public class ToDoDto {
    String id;
    String todo_name;
    String task_id;
    boolean checked;
    int serial;
}
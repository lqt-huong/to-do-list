package com.example.todolist.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
@Data

public class TaskDto {
    String id;
    String name;
    String user_id;
}
package com.example.todolist.controllers;

import com.example.todolist.dtos.ResponseDto;
import com.example.todolist.dtos.TaskDto;
import com.example.todolist.dtos.UserDto;
import com.example.todolist.dtos.ToDoDto;
import com.example.todolist.services.ToDoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/api/v1/todo")
@RequiredArgsConstructor
public class ToDoController {
    private final ToDoService toDoService;

    @PostMapping("/addToDo")
    private ResponseEntity<?> addToDo(@RequestBody ToDoDto toDoDto) {
        try {
            var result = toDoService.addToDo(toDoDto);
            return ResponseEntity.ok(new ResponseDto(List.of("get success"), HttpStatus.OK.value(), result));
        } catch (Exception e) {
            return ResponseEntity.ok(new ResponseDto(List.of(e.getMessage()), HttpStatus.INTERNAL_SERVER_ERROR.value(), null));
        }
    }
//    @PostMapping("/deleteTask")
//    private ResponseEntity<?> deleteTask(@RequestBody TaskDto taskDto) {
//        try {
//            var result = taskService.deleteTask(taskDto);
//            return ResponseEntity.ok(new ResponseDto(List.of("get success"), HttpStatus.OK.value(), result));
//        } catch (Exception e) {
//            return ResponseEntity.ok(new ResponseDto(List.of(e.getMessage()), HttpStatus.INTERNAL_SERVER_ERROR.value(), null));
//        }
//    }

}

package com.example.todolist.controllers;

import com.example.todolist.dtos.ResponseDto;
import com.example.todolist.dtos.UserDto;
import com.example.todolist.dtos.TaskDto;
import com.example.todolist.services.TaskService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/api/v1/task")
@RequiredArgsConstructor
public class TaskController {
    private final TaskService taskService;
    @PostMapping("/getAllTasks")
    private ResponseEntity<?> getAllTasks(@RequestBody UserDto userLogin) {
        try {
            var result = taskService.getTask(userLogin);
            return ResponseEntity.ok(new ResponseDto(List.of("get success"), HttpStatus.OK.value(), result));
        } catch (Exception e) {
            return ResponseEntity.ok(new ResponseDto(List.of(e.getMessage()), HttpStatus.INTERNAL_SERVER_ERROR.value(), null));
        }
    }
    @PostMapping("/addTask")
    private ResponseEntity<?> addTask(@RequestBody TaskDto taskDto) {
        try {
            var result = taskService.addTask(taskDto);
            return ResponseEntity.ok(new ResponseDto(List.of("get success"), HttpStatus.OK.value(), result));
        } catch (Exception e) {
            return ResponseEntity.ok(new ResponseDto(List.of(e.getMessage()), HttpStatus.INTERNAL_SERVER_ERROR.value(), null));
        }
    }
    @PostMapping("/deleteTask")
    private ResponseEntity<?> deleteTask(@RequestBody TaskDto taskDto) {
        try {
            var result = taskService.deleteTask(taskDto);
            return ResponseEntity.ok(new ResponseDto(List.of("get success"), HttpStatus.OK.value(), result));
        } catch (Exception e) {
            return ResponseEntity.ok(new ResponseDto(List.of(e.getMessage()), HttpStatus.INTERNAL_SERVER_ERROR.value(), null));
        }
    }

}

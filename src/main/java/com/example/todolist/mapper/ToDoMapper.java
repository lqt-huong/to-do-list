package com.example.todolist.mapper;

import com.example.todolist.dtos.TaskDto;
import com.example.todolist.dtos.ToDoDto;
import com.example.todolist.entities.TaskEntity;
import com.example.todolist.entities.ToDoEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;


@Mapper
public interface ToDoMapper {
    ToDoMapper INSTANCE = Mappers.getMapper(ToDoMapper.class);

    @Mapping(source ="checked", target = "checked")
    ToDoDto toToDoDto(ToDoEntity toDoEntity);

    List<ToDoDto> toToDoDtos(List<ToDoEntity>  paymentDto);


    ToDoEntity toToDoEntity(ToDoDto toDoDto);

    List<ToDoEntity> toToDoEntityList(List<ToDoDto> list);

}

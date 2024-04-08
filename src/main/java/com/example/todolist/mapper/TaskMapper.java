package com.example.todolist.mapper;

import com.example.todolist.dtos.TaskDto;
import com.example.todolist.dtos.UserDto;
import com.example.todolist.entities.TaskEntity;
import com.example.todolist.entities.UserEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;


@Mapper
public interface TaskMapper {
    TaskMapper INSTANCE = Mappers.getMapper(TaskMapper.class);

    TaskDto toTaskDto(TaskEntity paymentDto);

    List<TaskDto> toTaskDtos(List<TaskEntity>  paymentDto);


    TaskEntity toTaskEntity(TaskEntity taskDto);

    List<TaskEntity> toTaskEntityList(List<TaskDto> list);

}

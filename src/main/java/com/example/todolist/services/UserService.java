package com.example.todolist.services;

import com.example.todolist.dtos.UserDto;
import com.example.todolist.entities.UserEntity;
import com.example.todolist.mapper.UserMapper;
import com.example.todolist.repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;


@Service
@RequiredArgsConstructor
// haàm xử lý
public class UserService {
    final UserRepository userRepository;

    public UserDto checkLogin(UserDto userLogin){
        List<UserEntity> user = userRepository.getUserByUserName(userLogin.getUsername());

        //mapping
        List<UserDto> userDtos = UserMapper.INSTANCE.toUserDtos(user);

        if(userDtos.size() ==0)
            return null;
        else
            return userDtos.get(0);
    }


    public UserDto addUser(UserDto userDto){
        try {
            UserEntity user = UserMapper.INSTANCE.toUserEntity(userDto);
            user.setId(UUID.randomUUID().toString());

            List<UserEntity> user2CheckExisted = userRepository.getUserByUserName(userDto.getUsername());
            if(user2CheckExisted.size() == 0){
                userRepository.save(user);
                return userDto;
            }
            return null;
        }catch (Exception e){
            return null;
        }
    }
}

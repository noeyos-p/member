package com.my.member.service;

import com.my.member.dto.UserDto;
import com.my.member.entity.UserEntity;
import com.my.member.repository.UserRepository;
import org.apache.catalina.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void saveUser(UserDto dto) {
        // dto -> Entity
        UserEntity entity = UserDto.toDto(dto);
        // 저장
        userRepository.save(entity);
    }

    public void updateUser(UserDto dto) {
        UserEntity user = UserDto.toDto(dto);
        userRepository.save(user);
    }

    public List<UserDto> findAllUser() {
        List<UserEntity> userList = userRepository.findAll();
        System.out.println(userList);
        return userList
                .stream()
                .map(x -> UserDto.fromEntity(x))
                .toList();
    }
    public void findByUser() {


    }
    public UserDto findOneUser(String email) {
        UserEntity entity = userRepository.findById(email).orElse(null);
        return UserDto.fromEntity(entity);

    }

    public void deleteUser(String email) {
        userRepository.deleteById(email);

    }
}

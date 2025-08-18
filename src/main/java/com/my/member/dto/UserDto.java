package com.my.member.dto;

import com.my.member.entity.UserEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.catalina.User;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {
    private String email;
    private String password;
    private String nickname;

    public static UserDto fromEntity(UserEntity user) {
        return new UserDto(
                user.getEmail(),
                user.getPassword(),
                user.getNickname()
        );
    }

    public static UserEntity toDto(UserDto dto) {
        UserEntity user = new UserEntity();
        user.setEmail(dto.getEmail());
        user.setPassword(dto.getPassword());
        user.setNickname(dto.getNickname());
        return user;
    }
}

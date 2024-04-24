package com.duch.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private Integer id;
    private String nickname;
    private String username;
    private String password;
    private String email;
    private LocalDateTime createTime;
    private LocalDateTime lastLoginTime;
    private Integer animalId;
}

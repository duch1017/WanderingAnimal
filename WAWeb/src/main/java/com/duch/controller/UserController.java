package com.duch.controller;

import com.duch.mapper.UserMapper;
import com.duch.pojo.Result;
import com.duch.pojo.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping(value = "/user")
public class UserController {
    @Autowired
    private UserMapper userMapper;

    @PostMapping
    public Result login() {
//        userMapper.login(user);
        return Result.success("登录成功");
    }
}

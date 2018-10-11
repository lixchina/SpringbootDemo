package com.demo.controller;

import com.demo.entity.User;
import com.demo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@EnableAutoConfiguration
@RequestMapping("/testboot")
public class TestBootController {

    @Autowired
    UserMapper userMapper;

    @RequestMapping("getuser")
    public List<User> getUser() {
        User user = new User();
        List<User> users = userMapper.selectAll();
        return users;
    }
}
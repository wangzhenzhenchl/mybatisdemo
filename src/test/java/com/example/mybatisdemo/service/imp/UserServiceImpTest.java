package com.example.mybatisdemo.service.imp;

import com.example.mybatisdemo.service.UserService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @className: UserServiceImpTest
 * @description: TODO 类描述
 * @author: niaonao
 * @date: 2021/6/27
 **/
@RunWith(SpringRunner.class)
@SpringBootTest
class UserServiceImpTest {

    @Autowired
    public UserService userService;

    @Test
    void getUser() {
        System.out.println(userService.getUser(1).toString());
    }
}
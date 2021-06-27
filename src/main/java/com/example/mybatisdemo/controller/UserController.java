package com.example.mybatisdemo.controller;/**
 * @className: UserController
 * @description: TODO 类描述
 * @author: niaonao
 * @date: 2021/6/27
 **/

import com.example.mybatisdemo.entity.User;
import com.example.mybatisdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
  * @author wzz
  * @date 2021年06月27日 4:02 下午
  */
@RestController
public class UserController {

    @Autowired
    public UserService userService;

    @GetMapping("/getUser")
    public User getUser(@RequestParam("id") int id){
        return userService.getUser(id);
    }
}

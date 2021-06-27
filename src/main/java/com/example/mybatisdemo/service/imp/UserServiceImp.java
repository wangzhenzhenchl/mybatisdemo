package com.example.mybatisdemo.service.imp;

import com.example.mybatisdemo.entity.User;
import com.example.mybatisdemo.mapper.UserMapper;
import com.example.mybatisdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
  * @author wzz
  * @date 2021年06月27日 4:05 下午
  */
@Service
public class UserServiceImp implements UserService {
    @Autowired
    private UserMapper userMapper;

    public User getUser(int id){
        User user = userMapper.selectByPrimaryKey(id);
        return user;

    }
}

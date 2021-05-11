package com.kgc.springbootymw.service.impl;

import com.kgc.springbootymw.mapper.UserMapper;
import com.kgc.springbootymw.pojo.User;
import com.kgc.springbootymw.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;
    @Override
    public List<User> UserLogin(String name, String password) {
        List<User> users = userMapper.UserLogin(name, password);

        return users;

    }
}

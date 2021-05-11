package com.kgc.springbootymw.service;

import com.kgc.springbootymw.pojo.User;

import java.util.List;

public interface UserService {
    List<User> UserLogin(String name, String password);
}

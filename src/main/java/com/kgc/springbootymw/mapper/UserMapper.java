package com.kgc.springbootymw.mapper;

import com.kgc.springbootymw.pojo.User;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public interface UserMapper {
    List<User> UserLogin(@RequestParam(value = "loginname") String loginname, @RequestParam(value = "password") String password);
}

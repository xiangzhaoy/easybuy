package com.kgc.springbootymw.mapper;

import com.kgc.springbootymw.pojo.User;

import org.springframework.web.bind.annotation.RequestParam;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface UserMapper extends Mapper<User> {
    List<User> UserLogin(@RequestParam(value = "loginname") String loginname, @RequestParam(value = "password") String password);

    int tianjia(User user);


    List<User> findAll();

    int dele();

}

package com.kgc.springbootymw.controller;

import com.kgc.springbootymw.pojo.User;
import com.kgc.springbootymw.service.UserService;
import com.kgc.springbootymw.utils.RespBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    UserService userService;
    @RequestMapping(value = "login")
    @ResponseBody
    public RespBean Login(@RequestParam(value = "loginname") String loginname, @RequestParam(value = "password") String password){
        List<User> list = userService.UserLogin(loginname, password);

        return  RespBean.ok("登录成功",list);
    }
}

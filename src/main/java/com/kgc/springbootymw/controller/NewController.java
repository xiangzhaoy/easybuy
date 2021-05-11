package com.kgc.springbootymw.controller;

import com.kgc.springbootymw.pojo.News;
import com.kgc.springbootymw.service.NewService;
import com.kgc.springbootymw.utils.RespBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/new")
public class NewController {
    @Autowired
    NewService newService;
    @RequestMapping(value = "findAll")
    public RespBean findAll(){
        List<News> list = newService.findAll();
return RespBean.ok("查询新闻成功",list);
    }
}

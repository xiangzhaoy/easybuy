package com.kgc.springbootymw.controller;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.kgc.springbootymw.pojo.News;
import com.kgc.springbootymw.service.NewService;
import com.kgc.springbootymw.utils.RespBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(value = "/new")
public class NewController {
        @Autowired
         NewService newService;
        @RequestMapping(value = "findAll")
        public RespBean findAll(Map map,
                @RequestParam(value = "pageNum", defaultValue = "1")int pageNum){
            PageHelper.startPage(pageNum,4);
            List<News> list = newService.findAll();
            PageInfo<News> pageInfo = new PageInfo<>(list);
            map.put("list",pageInfo);
    return RespBean.ok("查询新闻成功",pageInfo);
        }
}

package com.kgc.springbootymw.mapper;

import com.kgc.springbootymw.pojo.News;
import com.kgc.springbootymw.pojo.User;

import java.util.List;

public interface NewMapper {
    List<News>  findAll();



    int tianjia(User user);
}




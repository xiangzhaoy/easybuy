package com.kgc.springbootymw.mapper;

import com.kgc.springbootymw.pojo.News;

import java.util.List;

public interface NewMapper {
    List<News>  findAll();
}

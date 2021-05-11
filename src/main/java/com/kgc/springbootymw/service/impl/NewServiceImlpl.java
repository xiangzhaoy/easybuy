package com.kgc.springbootymw.service.impl;

import com.kgc.springbootymw.mapper.NewMapper;
import com.kgc.springbootymw.pojo.News;
import com.kgc.springbootymw.service.NewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class NewServiceImlpl implements NewService {

    @Autowired
    NewMapper newMapper;
    @Override
    public List<News> findAll() {

        return newMapper.findAll();
    }
}

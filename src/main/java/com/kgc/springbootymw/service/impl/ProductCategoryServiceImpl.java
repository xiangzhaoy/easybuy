package com.kgc.springbootymw.service.impl;

import com.kgc.springbootymw.mapper.ProductCategoryMapper;
import com.kgc.springbootymw.pojo.ProductCategory;
import com.kgc.springbootymw.pojo.User;

import com.kgc.springbootymw.service.ProductCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by bdqn on 2016/5/8.
 */
@Service
public class ProductCategoryServiceImpl implements ProductCategoryService {

    @Autowired
   ProductCategoryMapper productCategoryMapper;



    @Override
    public List <ProductCategory> erji(Integer parentId) {

        return productCategoryMapper.erji(parentId);
    }

    @Override
    public List<ProductCategory> ersanji(int parentId) {
        return productCategoryMapper.ersanji(parentId);
    }


    @Override
    public List<User> UserLogin(String name, String password) {
        List<User> users = productCategoryMapper.UserLogin(name, password);

        return users;

    }



    @Override
    public List<ProductCategory> yiji(int type) {
        return productCategoryMapper.yiji(type);
    }
}

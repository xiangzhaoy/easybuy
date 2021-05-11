package com.kgc.springbootymw.service.impl;

import com.kgc.springbootymw.mapper.ProductMapper;
import com.kgc.springbootymw.pojo.Product;
import com.kgc.springbootymw.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    ProductMapper  productMapper;
    @Override
    public List<Product> getProductList(String name) throws Exception {
        return productMapper.getProductList(name);
    }
}

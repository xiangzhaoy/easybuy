package com.kgc.springbootymw.controller;

import com.kgc.springbootymw.pojo.Product;
import com.kgc.springbootymw.service.ProductService;
import com.kgc.springbootymw.utils.RespBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/pc")
public class ProductConller {

    @Autowired
    ProductService productService;

    @RequestMapping(value = "list")
    @ResponseBody
    public RespBean List(@RequestParam(value = "name")String  name) throws Exception {
        List<Product> list = productService.getProductList(name);

        return  RespBean.ok("搜素成功",list);
    }
}

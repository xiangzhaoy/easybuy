package com.kgc.springbootymw.controller;

import com.kgc.springbootymw.pojo.ProductCategory;
import com.kgc.springbootymw.pojo.User;
import com.kgc.springbootymw.service.ProductCategoryService;
import com.kgc.springbootymw.utils.RespBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@RestController
@RequestMapping(value = "/pc")
public class ProductCategoryController {

    @Autowired
    ProductCategoryService productCategoryService;



     @ResponseBody
     @RequestMapping(value = "fjcx")
     public  RespBean yiersan(@RequestParam(value = "type",defaultValue = "1") Integer type){
         List<ProductCategory> yiji=productCategoryService.yiji(type);
         List<Map<String,Object>> list=new ArrayList<>();
         Map<String,Object> map=new HashMap<String,Object>();
         map.put("yiji",yiji);

         for (ProductCategory p:yiji) {
             List<ProductCategory> erji=productCategoryService.erji(p.getId());
             map.put("erji",erji);

             for (ProductCategory p2:erji) {
                 List<ProductCategory> sanji=productCategoryService.ersanji(p2.getId());
                 map.put("sanji",sanji);
             }

         }
         list.add(map);

         return RespBean.ok("查询成功",list);

     }

}

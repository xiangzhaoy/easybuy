package com.kgc.springbootymw.service;

import com.kgc.springbootymw.pojo.ProductCategory;
import com.kgc.springbootymw.pojo.User;


import java.util.List;
import java.util.Map;


public interface ProductCategoryService {


    List<ProductCategory> erji(Integer parentId);
    List<ProductCategory> ersanji(int parentId);
    List<ProductCategory> yiji(int type);

}

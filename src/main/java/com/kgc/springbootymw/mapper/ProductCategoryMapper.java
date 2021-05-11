package com.kgc.springbootymw.mapper;
import com.kgc.springbootymw.pojo.ProductCategory;

import com.kgc.springbootymw.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;

public interface ProductCategoryMapper {

    List<User> UserLogin(@RequestParam(value = "loginname") String loginname, @RequestParam(value = "password") String password);

    List<ProductCategory> erji(Integer parentId);
    List<ProductCategory> ersanji(int parentId);

    List<ProductCategory> yiji( int type);
}

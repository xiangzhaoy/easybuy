package com.kgc.springbootymw.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "test")
public class TestConller {
    @RequestMapping(value = "t1")
    public  void test1(){
        System.out.println("打火机按快点回家贷款");
    }
}

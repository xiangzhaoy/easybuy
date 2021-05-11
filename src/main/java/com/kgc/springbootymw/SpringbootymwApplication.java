package com.kgc.springbootymw;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;


@MapperScan("com.kgc.springbootymw.mapper")
@SpringBootApplication
public class SpringbootymwApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {

        SpringApplication.run(SpringbootymwApplication.class, args);
    }
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(SpringbootymwApplication.class);
    }

}

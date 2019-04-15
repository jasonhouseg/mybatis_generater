package com.mybatisgenerater.mybatis_generater;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.fn.dao.mapper")
public class MybatisGeneraterApplication {

    public static void main(String[] args) {
        SpringApplication.run(MybatisGeneraterApplication.class, args);
    }

}


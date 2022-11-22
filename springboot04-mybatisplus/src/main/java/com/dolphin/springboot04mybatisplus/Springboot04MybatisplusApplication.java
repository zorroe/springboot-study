package com.dolphin.springboot04mybatisplus;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.dolphin.springboot04mybatisplus.mapper")
public class Springboot04MybatisplusApplication {

    public static void main(String[] args) {
        SpringApplication.run(Springboot04MybatisplusApplication.class, args);
    }

}

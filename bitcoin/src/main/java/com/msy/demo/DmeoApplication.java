package com.msy.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.msy.demo.dao")
public class DmeoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DmeoApplication.class, args);
    }

}

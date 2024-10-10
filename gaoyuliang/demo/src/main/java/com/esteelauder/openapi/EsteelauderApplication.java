package com.esteelauder.openapi;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.esteelauder.openapi.mapper")
public class EsteelauderApplication {

    public static void main(String[] args) {
        SpringApplication.run(EsteelauderApplication.class, args);
    }

}

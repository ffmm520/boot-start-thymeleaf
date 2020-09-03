package com.mimehoo.appdemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.mimehoo.appdemo.mapper")
public class SpringbootStartDemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringbootStartDemoApplication.class, args);
    }
}

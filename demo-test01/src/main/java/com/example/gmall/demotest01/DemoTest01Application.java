package com.example.gmall.demotest01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(basePackages = "com.example.gmall.demotest01.mapper")
public class DemoTest01Application {

    public static void main(String[] args) {
        SpringApplication.run(DemoTest01Application.class, args);
    }

}

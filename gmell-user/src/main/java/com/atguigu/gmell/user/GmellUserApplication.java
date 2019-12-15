package com.atguigu.gmell.user;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.atguigu.gmell.user.mapper")
public class GmellUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(GmellUserApplication.class, args);
    }

}

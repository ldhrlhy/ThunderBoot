package com.dy.tb;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.dy.tb.mapper")
public class TbApplication {

    public static void main(String[] args) {
        SpringApplication.run(TbApplication.class, args);
    }
}

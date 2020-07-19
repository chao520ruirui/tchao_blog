package com.itchao.tchao_blog;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.itchao.tchao_blog.dao")
public class TchaoBlogApplication {

    public static void main(String[] args) {
        SpringApplication.run(TchaoBlogApplication.class, args);
    }

}

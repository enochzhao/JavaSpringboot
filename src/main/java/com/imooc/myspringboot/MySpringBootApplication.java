package com.imooc.myspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//这个注解说明 这是一个SpringBoot应用的入口类
@SpringBootApplication
public class MySpringBootApplication {
    public static void main(String[] args){
//        启动SpringBoot应用
        SpringApplication.run(MySpringBootApplication.class);
    }
}

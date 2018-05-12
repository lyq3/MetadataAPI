package com.androidmov.metadata;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @description: 启动类
 * @author: 卡卢比
 * @date: 2018-05-12 11:06
 **/
@SpringBootApplication
@ComponentScan(basePackages = { "com.androidmov.metadata" })
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }
}

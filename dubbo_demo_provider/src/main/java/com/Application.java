package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

//import org.mybatis.spring.annotation.MapperScan;

/**
 * @author 王扶摇
 * @Title: Student
 * @ProjectName Dubbo_demo
 * @Description: TODO
 * @date 2018/7/16 0:37
 */

@ImportResource(value = "classpath:providor")
@SpringBootApplication()
//@MapperScan("com.mapping")
//@DubboComponentScan(basePackages = "com.service.impl")
//@ComponentScan(basePackages = "com")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);

        System.out.println("服务提供者");
    }



}

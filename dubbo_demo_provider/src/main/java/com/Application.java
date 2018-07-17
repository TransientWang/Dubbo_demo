package com;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * @author 密码123456
 * @Title: Student
 * @ProjectName Dubbo_demo
 * @Description: TODO
 * @date 2018/7/16 0:37
 */

@ImportResource(value = "classpath:provider")
@SpringBootApplication()
@MapperScan("com.mapping")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);

        System.out.println("服务提供者");
    }



}

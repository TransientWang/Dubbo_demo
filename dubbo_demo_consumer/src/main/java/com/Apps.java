package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;



@SpringBootApplication
@ImportResource(value = "classpath:consumer")
public class Apps {
    public static void main(String[] args) {
        SpringApplication.run(Apps.class,args);

        System.out.println("消费者启动成功");
    }
}

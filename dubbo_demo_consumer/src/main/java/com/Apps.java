package com;//import com.alibaba.dubbo.config.spring.context.annotation.DubboComponentScan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;


@SpringBootApplication
@ImportResource(value = "classpath:dubbo_consumer")
//@ComponentScan("com")
//@DubboComponentScan(basePackages = "com.service")
public class Apps {
    public static void main(String[] args) {
        SpringApplication.run(Apps.class,args);

        System.out.println("消费者启动成功");
    }
}

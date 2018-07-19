package com;//import com.alibaba.dubbo.config.spring.context.annotation.DubboComponentScan;

import com.alibaba.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
//@ImportResource(value = "classpath:dubbo_consumer")
//@ComponentScan("com")
@DubboComponentScan(basePackages = "com.service")
public class ConsumerApps {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerApps.class,args);

        System.out.println("消费者启动成功");
    }
}

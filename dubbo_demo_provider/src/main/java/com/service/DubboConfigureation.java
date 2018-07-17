package com.service;

import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.RegistryConfig;
import org.springframework.context.annotation.Bean;

/**
 * @author 密码123456
 * @Title: DubboConfigureation
 * @ProjectName Dubbo_demo
 * @Description: TODO
 * @date 2018/7/17 18:04
 */
//@Configuration

public class DubboConfigureation {
    @Bean
    public ApplicationConfig applicationConfig() {
        ApplicationConfig applicationConfig = new ApplicationConfig();
        applicationConfig.setName("dubbo-provider");
        return applicationConfig;
    }


    @Bean
    public RegistryConfig registryConfig(){
        RegistryConfig registryConfig = new RegistryConfig();
        registryConfig.setAddress("zookeeper://127.0.0.1:2181");
        registryConfig.setClient("zkclient");
        return registryConfig;
    }
}

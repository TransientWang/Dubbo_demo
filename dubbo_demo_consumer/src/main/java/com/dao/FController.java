package com.dao;

import com.alibaba.dubbo.config.annotation.Reference;
import com.service.HelloService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FController {

   @Reference(interfaceClass = com.service.HelloService.class)
    HelloService helloService;

    @RequestMapping("/{aname}")
    public Student a(@PathVariable String aname) {
        System.out.println(aname);
//        System.out.println(demoService);
//        EchoService echoService = (EchoService) demoService;
//        System.out.println(echoService.$echo("OK"));
//        Student student = demoService.hello(aname);
        return helloService.hello(aname);
    }
}

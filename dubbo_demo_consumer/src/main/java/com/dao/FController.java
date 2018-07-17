package com.dao;

import com.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FController {

    @Autowired
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

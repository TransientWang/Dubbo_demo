package com.example.demo;


import org.springframework.stereotype.Controller;

import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.support.SessionStatus;


import javax.validation.Valid;
import java.util.Map;

@Controller
@RequestMapping("/")
@SessionAttributes(names = {"james"})
public class Congig {
    //ModelAttribute单独注解在方法上时候，该方法会在url映射进该控制器时根据出现顺序首先，执行该方法
//并将返回值放在modelMap中
    @ModelAttribute(value = "html")
    public Car s() {
        Car car = new Car();
        car.setName("红旗");
        car.setSpeed(200);
        System.out.println("第一个被执行");
//        System.out.println("ModelAttribute:"+car);
        return car;
    }

    /*
    第一个被执行
    model执行
    a被执行
    html::Car{name='红旗', speed=200}
    string::content-type
    name::
    org.springframework.validation.BindingResult.name::org.springframework.validation.BeanPropertyBindingResult: 0 errors
     */
    //ModelAttribute作用在参数上时会吧参数的值放入request作用域中返回给页面,或者用ModelAttribute单独作用在方法上的同名返回值
    //覆盖参数
    @RequestMapping("a")
    @ResponseBody
    public String haha(ModelMap modelMap, @ModelAttribute("name") String name) {
        System.out.println("a被执行");
        for (Map.Entry<String, Object> ignored : modelMap.entrySet()) {
            System.out.println(ignored.getKey() + "::" + ignored.getValue());
        }
        return "index";
    }

    //SessionAttribute将参数放入session中返回
    @GetMapping("c")
    public String c(ModelMap modelMap, @SessionAttribute("james") String james, SessionStatus sessionStatus) {

        System.out.println(james);
        sessionStatus.setComplete();
        for (Map.Entry<String, Object> ignored :
                modelMap.entrySet()) {
            System.out.println(ignored.getKey() + ":" + ignored.getValue());
        }
        return "dawdaw";
    }
//ModelAttribute与RequestMapping一起使用时返回视图是RequestMapping的value值返回的string变成request作用域的attritube了
    @ModelAttribute("james")
    @RequestMapping("index")
    public String ad() {

        System.out.println("b被执行");

        return "index";
    }

    @ModelAttribute(value = "name")
    public String saa() {
        System.out.println("model执行");
//        System.out.println("ModelAttribute:"+car);
        return "content-type";
    }

    @RequestMapping("/d/{name}/d/{speed}")
    public String wdawd(@Valid @ModelAttribute("mycar") Car car, BindingResult result) {
        if (result.hasErrors()) {
            FieldError fieldError = result.getFieldError();
            String mes = fieldError.getDefaultMessage();
            return mes;
        }
        for (Map.Entry<String, Object> ignored :
                result.getModel().entrySet()) {
            System.out.println(ignored.getKey() + ":" + ignored.getValue());
        }
        return "true";
    }
}

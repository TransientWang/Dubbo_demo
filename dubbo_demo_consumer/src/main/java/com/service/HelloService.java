package com.service;

import com.dao.Student;
public interface HelloService {
    /**
     * 一个调用服务方法
     *
     * @param aname 学生姓名
     * @return com.dao.Student 学生的信息
     * @Author 王扶摇
     * @Description //TODO
     * @Date 13:32 2018/7/16
     */
//   @Reference(interfaceClass = com.service.HelloService.class)
    public Student hello(String aname);

}

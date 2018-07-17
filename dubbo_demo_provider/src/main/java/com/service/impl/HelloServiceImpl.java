package com.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.dao.Student;
import com.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.Serializable;

@Service(interfaceClass = HelloService.class)
public class HelloServiceImpl implements HelloService, Serializable {


    @Autowired
    com.dao.Student student;

    @Autowired
    com.mapping.studentMapper studentMapper;


    @Override
    public Student hello(String aname) {
        System.out.println(aname);
        System.out.println(student);
        System.out.println(studentMapper);
//        System.out.println(studentMapper);
//        System.out.println(Student);
//        Student = studentMapper.selstudent(aname);
//        student.setAname("王扶摇");
//        student.setAclass("软件7777");
//
//        student.setCollege("计算机科学与软件");
//        student.setNumber("1222222222");
//        return student;

//        try {
//            PostgreUtil.doSelect("SELECT * FROM t_student WHERE s_name = '王摇' or 1 = 1");
//        } catch (SQLException e) {
//            user.setProvince("发生了异常");
//            e.printStackTrace();
//        }
//          Student  = new Student();

        return studentMapper.selstudent(aname);

    }
}

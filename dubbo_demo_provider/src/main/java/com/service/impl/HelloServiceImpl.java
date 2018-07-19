package com.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.dao.Student;
import com.service.HelloService;
import com.service.Util.MyThreadPool;
import com.service.Util.ThreadPoolUtil;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.concurrent.atomic.AtomicInteger;

@Service(interfaceClass = com.service.HelloService.class, timeout = 3000)
public class HelloServiceImpl implements HelloService {


    @Autowired
    Student student;

    @Autowired
    com.mapping.studentMapper studentMapper;


    @Override
    public Student hello(String aname) {
        System.out.println(aname);
//        System.out.println(student);
//        System.out.println(studentMapper);
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

//        return studentMapper.selstudent(aname);

        AtomicInteger a = new AtomicInteger(1);

        MyThreadPool myThreadPool = ThreadPoolUtil.THREAD_POOL.getMyThreadPool();
        Runnable t = () -> System.out.println(studentMapper.selstudent(aname) + "   " +a.getAndIncrement());
        for (int i = 0; i < 10000; i++) {

            myThreadPool.submit(t);
        }

        return studentMapper.selstudent(aname);
    }
}

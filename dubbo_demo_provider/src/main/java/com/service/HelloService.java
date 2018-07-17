package com.service;

import com.dao.Student;
/**
 * @Title: ${NAME}
 * @ProjectName ${PROJECT_NAME}
 * @Description: TODO
 * @author ${USER}
 * @date ${DATE} ${TIME}
 */
public interface HelloService {
    /**
     * 服务提供者方法，提供Student类的JSON串
     *
     * @Author 王扶摇
     * @Description //TODO
     * @Date 13:35 2018/7/16
     * @param aname
     * @return com.dao.Student
     *
     */
    public Student hello(String aname);
}

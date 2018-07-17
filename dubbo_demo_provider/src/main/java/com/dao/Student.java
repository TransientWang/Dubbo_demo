package com.dao;

import org.springframework.stereotype.Repository;

import java.io.Serializable;

/**
 * @author 密码123456
 * @Title: Student
 * @ProjectName Dubbo_demo
 * @Description: TODO
 * @date 2018/7/16 0:37
 */
@Repository
public class Student implements Serializable {

    String aname;
    String number;
    String college;
    String aclass;
    int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAname() {
        return aname;
    }

    public void setAname(String aname) {
        this.aname = aname;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public String getAclass() {
        return aclass;
    }

    public void setAclass(String aclass) {
        this.aclass = aclass;
    }
}

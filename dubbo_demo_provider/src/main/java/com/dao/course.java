package com.dao;
/**
 * @author 王扶摇
 * @Title: course
 * @ProjectName Dubbo_demo
 * @Description: TODO
 * @date 2018/7/16 14:29
 */
public class course {
    private Short cId;

    private String cName;

    public Short getcId() {
        return cId;
    }

    public void setcId(Short cId) {
        this.cId = cId;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName == null ? null : cName.trim();
    }
}
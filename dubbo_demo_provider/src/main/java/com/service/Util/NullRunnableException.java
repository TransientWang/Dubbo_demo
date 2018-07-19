package com.service.Util;

/**
 * @author 密码123456
 * @Title: NullRunnableException
 * @ProjectName Dubbo_demo
 * @Description: TODO
 * @date 2018/7/19 15:46
 */
public class NullRunnableException extends Exception {


    public NullRunnableException() {
        super("提交了一个空Runnable到线程池");
    }
}

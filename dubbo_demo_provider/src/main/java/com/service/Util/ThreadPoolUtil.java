package com.service.Util;


import java.util.Optional;

/**
 * @author 密码123456
 * @Title: ThreadPoolUtil
 * @ProjectName Dubbo_demo
 * @Description: TODO
 * @date 2018/7/19 14:02
 */
public enum ThreadPoolUtil {

    THREAD_POOL; //线程池单例

    private MyThreadPool myThreadPool = null;

    ThreadPoolUtil() {
        myThreadPool = Optional.ofNullable(myThreadPool).orElseGet(MyThreadPool::new);
    }

    public MyThreadPool getMyThreadPool() {

        System.out.println(myThreadPool);
        return myThreadPool;


    }


}

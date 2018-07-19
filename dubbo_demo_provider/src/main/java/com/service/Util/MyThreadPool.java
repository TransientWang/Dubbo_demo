package com.service.Util;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author 密码123456
 * @Title: MyThreadPool
 * @ProjectName Dubbo_demo
 * @Description: TODO
 * @date 2018/7/19 14:14
 */
public class MyThreadPool extends ThreadPoolExecutor {


    public MyThreadPool() {
        super(1, 3, 0L,
                TimeUnit.MILLISECONDS, new LinkedBlockingDeque<Runnable>(),new MyThreadFactory(), new MyDiscardPolicy());
    }






    @Override
    protected void beforeExecute(Thread t, Runnable r) {
        System.out.println("正在准备执行:"+r.toString());
    }

    @Override
    protected void afterExecute(Runnable r, Throwable t) {
        System.out.println("线程执行完毕："+r.toString());
    }

    @Override
    protected void terminated() {
        System.out.println("线程池退出");

    }

    static class MyDiscardPolicy implements RejectedExecutionHandler {
        public MyDiscardPolicy() {
            System.out.println("初始化拒绝策略");
        }

        @Override
        public void rejectedExecution(Runnable r, ThreadPoolExecutor executor) {
            System.out.println("线程池执行了拒绝策略");
        }
    }
}

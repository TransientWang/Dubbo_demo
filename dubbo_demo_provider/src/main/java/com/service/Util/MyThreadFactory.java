package com.service.Util;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author 密码123456
 * @Title: MyThreadFactory
 * @ProjectName Dubbo_demo
 * @Description: TODO
 * @date 2018/7/19 15:16
 */
public class MyThreadFactory implements ThreadFactory {
    private static final AtomicInteger poolNumber = new AtomicInteger(1);
    private final AtomicInteger threadNumber = new AtomicInteger(1);
    private final ThreadGroup threadGroup;
    private String poolGroupName;

    public MyThreadFactory() {
        System.out.println("初始化线程工厂");
        threadGroup = Thread.currentThread().getThreadGroup();
        poolGroupName = threadGroup.getName()+ "-" + poolNumber.getAndIncrement() + "-Thread-";
    }

    @Override
    public Thread newThread(Runnable r) {
        Thread myThread = new Thread(threadGroup, r, poolGroupName + threadNumber.getAndIncrement(), 0);
        if (myThread.isDaemon()) {
            myThread.setDaemon(false);
        }
        if (myThread.getPriority() != Thread.NORM_PRIORITY) {
            myThread.setPriority(Thread.NORM_PRIORITY);
        }
        System.out.println("线程池创建线程：" + poolGroupName + (threadNumber.get() - 1));
        return myThread;
    }


}

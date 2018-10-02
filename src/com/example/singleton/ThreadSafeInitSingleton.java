package com.example.singleton;

public class ThreadSafeInitSingleton {
    private ThreadSafeInitSingleton() {};

    private static ThreadSafeInitSingleton threadSafeInitSingleton = null;

    //将获取与初始化分开，在初始化时加锁，这样也确保了只会初始化一次
    private static synchronized void init(){
        threadSafeInitSingleton = new ThreadSafeInitSingleton();
    }

    public static ThreadSafeInitSingleton getInstance(){
        if(threadSafeInitSingleton == null){
            init();
        }
        return threadSafeInitSingleton;
    }

    public void dosomething(){
        System.out.println("bussiness work");
    }
}
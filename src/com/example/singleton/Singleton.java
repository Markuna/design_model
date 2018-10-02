package com.example.singleton;

/**
 * 单例模式
 * 构造函数私有化 杜绝外部访问
 * 静态函数返回唯一的内部实例
 */
public class Singleton {

    private Singleton(){};

    private static Singleton singleton = null;

    public static Singleton getSingleton() {
        if(singleton == null){
            singleton = new Singleton();
        }
        return singleton;
    }

    public void doSomething(){
        //业务处理
        System.out.println("deal some bussiness work");
    }

}

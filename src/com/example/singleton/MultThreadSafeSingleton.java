package com.example.singleton;

//安全的多线程单例模式
public class MultThreadSafeSingleton {

    private MultThreadSafeSingleton(){};

    //使用一个内部类来维护实例
    private static class SingletonFactory{
        private static MultThreadSafeSingleton multThreadSafeSingleton = new MultThreadSafeSingleton();
    }

    //获取实例
    public static MultThreadSafeSingleton getInstance(){
        return SingletonFactory.multThreadSafeSingleton;
    }

    public void dosomething(){
        System.out.println("safe do....");
    }


}

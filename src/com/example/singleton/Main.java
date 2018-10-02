package com.example.singleton;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getSingleton();
        singleton.doSomething();
        Singleton singleton1 = Singleton.getSingleton();
        if(singleton.equals(singleton1)){
            System.out.println("equals true");
        }
        if(singleton == singleton1){
            System.out.println("== true");
        }
        MultThreadSingleton.getInstance().dosomething();

        //=======================================
        //============多线程测试(不安全)==================

        List<Thread> threadList = new ArrayList<Thread>(100);
        for (int i = 0; i < 100; i++) {
            final int n = i;
            Thread thread = new Thread(() -> {
                System.out.println(n+":");
                MultThreadSingleton.getInstance().dosomething();
            });
            threadList.add(thread);
        }

        threadList.forEach(Thread::start);

        //==============安全内部类多线程(安全)==================

        List<Thread> safeList = new ArrayList<>(100);
        for (int i = 0; i < 100; i++) {
            final int n = i;
            Thread thread = new Thread(()-> {
                System.out.println(n+":");
                MultThreadSafeSingleton.getInstance().dosomething();
            });
            safeList.add(thread);
        }

        safeList.forEach(Thread::start);

        //===============获取加锁（安全）==================
        List<Thread> initList = new ArrayList<>(100);
        for (int i = 0; i < 100; i++) {
            final int n = i;
            Thread thread = new Thread(()-> {
                System.out.println(n+":");
                ThreadSafeInitSingleton.getInstance().dosomething();
            });
            initList.add(thread);
        }

        initList.forEach(Thread::start);
        //================ end ==================
    }
}

package com.example.singleton;

public class MultThreadSingleton {
    private MultThreadSingleton(){};

    private static MultThreadSingleton multThreadSingleton = null;

    /**
     * 多线程下在首次初始化对象的时候加锁
     * 但不是完全的线程安全
     * 例：
     *      A线程进入后程序开辟了内存并赋值指针，但未实例化对象就退出了
     *      B线程进入得到指针，但指向内容为空，调用报错
     *
     * @return
     */
    public static MultThreadSingleton getInstance(){
        if(multThreadSingleton == null){
            synchronized (MultThreadSingleton.class){
                if(multThreadSingleton == null){
                    multThreadSingleton = new MultThreadSingleton();
                }
            }
        }
        return multThreadSingleton;
    }

    public void dosomething(){
        System.out.println("do....");
    }


}

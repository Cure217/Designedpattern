package com.aliano.singleton;

public class Single {
    // 法一
    // private static Single instance = new Single(); // 类加载时直接创建好 只需要创建一次

    // 法二 关键字 进行双重检测实现单例模式
    private volatile static Single instance;

    private Single(){
        System.out.println("Single对象被创建了");
    }

    // 对应法一
    // public static synchronized Single getInstance(){
    //     // 线程同步 synchronized 在静态方法锁的是整个类，在普通方法锁的是对象 但是此时是延迟加载 会带来性能损耗
    //     // if (instance == null) {
    //     //     instance = new Single();
    //     // }
    //     return instance;
    // }

    // 对应法二
    public static synchronized Single getInstance(){
        // 双重检测
        if (instance == null) {
            synchronized (Single.class){
                if (instance == null){
                    instance = new Single();
                }
            }
        }
        return instance;
    }
}

package com.aliano.singleton;

/**
 * 单例模式
 * 确保一个类 只能有一个实例化对象，且能够被全局访问（该对象被共享）
 *
 * 不想频繁的创建和销毁对象，因为会造成资源的浪费 则可以使用单例模式
 * 常见的：IO流、 数据库连接对象
 */
public class Test {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            // Single.getInstance();// 单线程情况下的单例模式.
            new Thread(()->{
                Single.getInstance();
            }).start();
        }
    }
}

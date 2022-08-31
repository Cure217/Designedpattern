package com.aliano.adapter;

/**
 * 适配器模式
 * 将一个接口转换成一个用户期待的接口，解决的是类之间接口不兼容的问题
 * 该例子为 对象的适配器模式
 */
public class Test {
    public static void main(String[] args) {
        MusicPlayer player = new PlayerAdapter();
        player.play("mp3","xxx.mp3");
        player.play("wma","xxx.wma");
    }
}

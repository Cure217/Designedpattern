package com.aliano.decorator;

public class XiaoMing implements Person{
    @Override
    public Double cost() {
        return 0.0;
    }

    @Override
    public void show() {
        System.out.println("没买衣服的小明");
    }
}

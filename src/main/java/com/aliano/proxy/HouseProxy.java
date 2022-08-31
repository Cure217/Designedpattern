package com.aliano.proxy;

public class HouseProxy implements House {
    private House house;

    public HouseProxy(House house) {
        this.house = house;
    }

    @Override
    public void findHouse() {
        System.out.println("找代理"); // 利用代理扩展出来的空间 使得委托对象只有业务代码
        this.house.findHouse();
    }
}

package com.aliano.proxy;

public class Test {
    public static void main(String[] args) {
        House house = new XiaoMing();
        HouseProxy proxy = new HouseProxy(house);
        proxy.findHouse();
    }
}

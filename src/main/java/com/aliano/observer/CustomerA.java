package com.aliano.observer;

public class CustomerA extends Customer {
    @Override
    public void update() {
        System.out.println("客户A的报纸已送达");
    }
}

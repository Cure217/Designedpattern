package com.aliano.decorator;

/**
 * 装饰模式测试
 */
public class Test {
    public static void main(String[] args) {
        Person xm = new XiaoMing();
        xm = new Shirt(xm); //衬衫是Person的实现类
        // xm.show();
        xm = new Trousers(xm);
        xm.show();
        /**
         * 没买衣服的小明
         * 买了一件衬衫，累计消费1000.0
         * 买了一条裤子，累计消费1800.0
         */
        System.out.println("共消费" + xm.cost()); //共消费1800.0

    }
}

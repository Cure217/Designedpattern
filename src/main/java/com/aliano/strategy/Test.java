package com.aliano.strategy;
/**
 * 策略模式测试
 */
public class Test {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.setOperation(new OperationAdd());
        System.out.println(calculator.doOperation(2, 1));//3
        calculator.setOperation(new OperationSub());
        System.out.println(calculator.doOperation(2, 1));//1
    }
}

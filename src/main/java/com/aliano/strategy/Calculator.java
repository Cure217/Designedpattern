package com.aliano.strategy;

public class Calculator {
    private Operation operation;

    //Setter
    public void setOperation(Operation operation) {
        this.operation = operation;
    }

    public int doOperation (int num1,int num2){
        return this.operation.doOperation(num1,num2);
    }
}

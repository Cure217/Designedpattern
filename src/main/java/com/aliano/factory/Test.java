package com.aliano.factory;

public class Test {
    public static void main(String[] args) {
        ComputerFactory factory = new ComputerFactory();
        Computer a = factory.createComputer("a");
        Computer b = factory.createComputer("b");
    }
}

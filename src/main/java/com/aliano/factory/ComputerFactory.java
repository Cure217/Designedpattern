package com.aliano.factory;

public class ComputerFactory {
    public Computer createComputer(String name){
        Computer computer = null;
        if (name.equals("a")) {
            computer = new ComputerA();
        }
        if (name.equals("b")) {
            computer = new ComputerB();
        }
        return computer;
    }
}

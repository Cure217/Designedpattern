package com.aliano.templatemethod;

public class Test {
    public static void main(String[] args) {
        Cook cook1 = new CookTomato();
        cook1.cook();
        System.out.println("---------------------");
        Cook cook2 = new CookPotato();
        cook2.cook();
    }
}

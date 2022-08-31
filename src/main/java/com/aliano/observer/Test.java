package com.aliano.observer;

public class Test {
    public static void main(String[] args) {
        NewspaperOffice newspaperOffice = new NewspaperOffice();
        Customer customerA = new CustomerA();
        Customer customerB = new CustomerB();
        newspaperOffice.addCustomer(customerA);
        newspaperOffice.addCustomer(customerB);
        newspaperOffice.newspaper();
    }
}

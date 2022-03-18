package com.wanda;

public class CustomerList {
    public static void main(String[] args) {
        Customer c1 = new Customer("0001",1200);
        Customer c2 = new GoldenCustomer("0002",2500);
        Customer c3 = new SilverCustomer("0003",1500);
        c1.print();
        c2.print();
        c3.print();
    }
}

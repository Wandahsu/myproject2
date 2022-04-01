package com.wanda.sales;

import java.util.ArrayList;
import java.util.List;

public class CustomerList {
    public static void main(String[] args) {
        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer("0001",1200));
        customers.add(new GoldenCustomer("0002",2500));
        customers.add(new SilverCustomer("0003",1500));
        customers.add(new PlatinumCustomer("0004",17000));
        for (Customer c: customers) {
            c.print();
        }
       /* for (int i = 0; i < 5; i++) {
            customers.get(i).print();

        }*/
    }
}

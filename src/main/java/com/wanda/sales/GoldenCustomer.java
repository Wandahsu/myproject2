package com.wanda.sales;

public class GoldenCustomer extends Customer{
    int giveBack;
    public GoldenCustomer(String id,int amount) {
        super(id,amount);

    }
    @Override
    public void print() {

        System.out.println(id + "\t"+amount +"\t" +money() + "\t" + giveBack()+" give back");

    }
}

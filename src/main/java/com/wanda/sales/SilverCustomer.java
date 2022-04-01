package com.wanda.sales;

public class SilverCustomer extends Customer{
    public SilverCustomer(String id,int amount) {
        super(id,amount);
    }
    public int giveBack () {
        return amount-money() ;
    }
    @Override
    public void print() {
        System.out.println(id + "\t"+amount +"\t" +money() + "\t" + giveBack()+" give back");

    }
}





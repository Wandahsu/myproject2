package com.wanda.sales;

public class Customer {
    String id;
    int amount;
    float off = 0.1f;
    public Customer(String id,int amount) {
        this.id = id;
        this.amount = amount;

    };
    public int giveBack () {
        return amount-money() ;
    }
    public int money () {
        return (int) (amount - (amount/1000)*off*1000);
    }
    public int percentOff (){return (int) (amount - (amount * off));}

    public void print() {
        System.out.println(id + "\t" + amount + "\t" + money() );
    }
}

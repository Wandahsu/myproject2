package com.wanda.sales;

public class GoldenCustomer extends SilverCustomer{
    public GoldenCustomer(String id,int amount) {
        super(id,amount);

    }
    public int percentOff (){return (int) (amount - (amount * off));}

    @Override
    public int giveBack() {return (amount-percentOff());}

}

package com.wanda.sales;

public class PlatinumCustomer extends GoldenCustomer {
    public PlatinumCustomer(String id, int amount) {
        super(id, amount);

    }
    @Override
    public int percentOff() {return (int) (amount - (amount * (off*3)));}
    public int giveBack() {return (int) (amount*(off*2));}
}

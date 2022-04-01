package com.wanda.ticket;

public class Type {
    public static final Type NORMAL = new Type(001,"Normal",1);
    public static final Type STUDENT = new Type(002,"Student",0.8f);
    public static final Type ELDER = new Type(003,"Elder",0.5f);
    int id;
    String name;
    float percentOff ;

    public Type(int id, String name,float percentOff) {
        this.id = id;
        this.name = name;
        this.percentOff = percentOff;
    }
}

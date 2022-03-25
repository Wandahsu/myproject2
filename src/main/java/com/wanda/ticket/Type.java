package com.wanda.ticket;

public class Type {
    public static final Type NORMAL = new Type(001,"Normal");
    public static final Type STUDENT = new Type(002,"Student");
    public static final Type ELDER = new Type(003,"Elder");
    public static final Type BACK_AND_FORTH = new Type(004,"Back And Forth");

    int id;
    String name;
    public Type(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

package com.wanda;

public class GraduatedStudent extends Student {
    int thesis;
    public GraduatedStudent (String name,int english, int math, int thesis) {
        super(name,english,math);
        this.thesis = thesis;
    }
    public GraduatedStudent(String name) {
        super(name);
        this.name = name;
    }
    @Override
    public void print() {
        System.out.println(name + "\t"+english+"\t" +math + "\t" +getAverage() + "\t" + thesis);
    }
}

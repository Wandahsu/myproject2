package com.wanda;

public class Student {
    String name;
    int english;
    int math;
   // int thesis;
    public Student (String name){
        this.name = name;
    };
    public Student(String name,int english,int math){
        this(name);
        //this.name = name;
        this.english = english;
        this.math = math;

    };
    public void print() {
        //int average = (english + math) /2;
        System.out.print(name +"\t" + english + "\t" + math + "\t" +getAverage());
        if (getAverage() <60) {
            System.out.println("*");
        } else{
            System.out.println();
        }
       /* if (thesis >0) {
            System.out.println("\t" + thesis);
        } */
    }
    public int getAverage() {
        return (english+math)/2;
    }
}

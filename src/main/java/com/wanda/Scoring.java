package com.wanda;

public class Scoring {
    public static void main(String[] args) {
        //Student jack = new Student("Jack");
        Student jack = new Student("Jack",80,38);
        Student evan = new Student("Evan",90,88);
        GraduatedStudent jane = new GraduatedStudent("Jane");
        jack.print();
        evan.print();
        jane.print();


    }
}

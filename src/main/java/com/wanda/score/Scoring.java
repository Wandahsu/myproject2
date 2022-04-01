package com.wanda.score;

import java.util.ArrayList;
import java.util.List;

public class Scoring {
    public static void main(String[] args) {
        //Student jack = new Student("Jack");
        List<Student> students = new ArrayList<>();
        students.add(new Student("Jack",80,38));
       students.add(new Student("Evan",90,88));
       students.add(new GraduatedStudent("Jane", 60, 70, 85));
        for (Student s:students) {
            s.print();
        }
    }


}
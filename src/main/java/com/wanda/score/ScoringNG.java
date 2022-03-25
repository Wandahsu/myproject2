package com.wanda.score;

public class ScoringNG {
    public static void main(String[] args) {

        int [] english = {70,88,94,62,54};
        int [] math = {84,75,98,70,18};
        String[] name = {"Andy","Sandy","Rose","Jack","Steven"};
        System.out.println("Name" +"\t");
        System.out.println("name" + "\t" + "英" + "\t" + "數" + "\t" + "平均");
        for (int i =0;i<5;i++){
            if(i !=4) {
                System.out.println(name[i] + "\t" + english[i] + "\t" + math[i] + "\t" + (english[i] + math[i]) / 2);
            }
        }
    }
}

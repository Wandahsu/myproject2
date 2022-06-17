package com.wanda.score;

import java.io.*;

public class ScoringFile {
    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader("scores.txt");
            BufferedReader bf = new BufferedReader(fileReader);
            String line = bf.readLine();
            while(line != null) {
                String[] token = line.split(",");
                String name = token[0];
                int english = Integer.parseInt(token[1]);
                int math = Integer.parseInt(token[2]);
                Student stu = new Student(name,english,math);
                stu.print();
                line = bf.readLine();
            }
                /*int data = fileReader.read();
                while (data != -1){
                    System.out.print((char)data);
                    data = fileReader.read();
                }*/
            System.out.println();
        }catch (FileNotFoundException e) {
            System.out.println("檔案讀取失敗");
        }catch (IOException e){
            System.out.println("資料讀取失敗");
        }
        System.out.println("Continuing");
    }
}

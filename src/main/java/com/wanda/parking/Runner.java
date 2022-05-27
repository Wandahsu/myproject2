package com.wanda.parking;

import java.text.DateFormat;
import java.text.FieldPosition;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public class Runner {
    public static void main(String[] args) {
        String id = "ABC-1234";
        int toll = 30; //30元每小時
        long price;
        LocalDate todaysDate = LocalDate.now();

        DateFormat df = new SimpleDateFormat("HH:mm");
        try {
            Date enter1 = df.parse("08:00");
            Date  exit1 = df.parse("08:10");
            long diff = (exit1.getTime()-enter1.getTime())/(1000*60);
            price = toll*((diff+30)/60) ;
            System.out.println(id + "\n" + enter1+ "\n" + exit1+"\n" + diff +" mins" + "\n" + price + " dollars");


        } catch (Exception e){}

    }
}

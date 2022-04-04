package com.wanda.ticket;


import java.util.Scanner;

import static com.wanda.ticket.Total.choose1;
import static com.wanda.ticket.Total.total;

public class Book {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to tje system! (enter '1' to book the ticket)");
        int in = Integer.parseInt(scanner.next());
        while (in == 1) {
            System.out.println("Your start station (1 Taipei , 2 Taichung, 3 Kaohsiung )");
            int choice = Integer.parseInt(scanner.next());
            Station startStation = null;
            switch (choice) {
                case 1:
                    startStation = startStation.TAIPEI_CITY;
                    break;
                case 2 :
                    startStation = startStation.TAICHUNG_CITY;
                    break;
                case 3:
                    startStation =startStation.KAOHSiUNG_CITY;
                    break;

            }

            System.out.println("Your destination station (1 Taipei , 2 Taichung, 3 Kaohsiung )");
            choice = Integer.parseInt(scanner.next());
            Station endStation = null;
            switch (choice) {
                case 1:
                    endStation = endStation.TAIPEI_CITY;
                    break;
                case 2 :
                    endStation = endStation.TAICHUNG_CITY;
                    break;
                case 3:
                    endStation = endStation.KAOHSiUNG_CITY;
                    break;

            }

            System.out.println("What type of ticket do you want? (1 Normal, 2 Student,3 Elder)");
            int type = Integer.parseInt(scanner.next());
            System.out.println("What many ticket do you want?");
            int ticket = Integer.parseInt(scanner.next());
            Type ticketType = null;
            switch (type) {
                case 1:
                    ticketType = ticketType.NORMAL;
                    break;
                case 2:
                    ticketType = ticketType.STUDENT;
                    break;
                case 3 :
                    ticketType = ticketType.ELDER;
                    break;

            }

            System.out.println("Do you want to keep booking?('1' : Yes . '2' : No)");
            int keep = Integer.parseInt(scanner.next());
            if(keep ==1) {
                total = (int)(Math.abs(endStation.price- startStation.price)*ticket*ticketType.percentOff);
                System.out.println(total);
                choose1 = (startStation.name + "\t" + endStation .name+ "\t" + ticketType.name+ "*" + ticket  + "\t"+total);

                continue;
            }else if (keep ==2) {
                int price = (int)(Math.abs(endStation.price- startStation.price)*ticket*ticketType.percentOff);
                System.out.println(choose1);
                System.out.println(startStation.name + "\t" + endStation .name+ "\t" + ticketType.name+ "*" + ticket + "\t"+price);

                System.out.println("Total = " +(price+total));
                break;
            }
        }
    }
}

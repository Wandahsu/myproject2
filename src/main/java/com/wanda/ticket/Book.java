package com.wanda.ticket;


import com.wanda.score.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static com.wanda.ticket.Total.choose1;
import static com.wanda.ticket.Total.total;

public class Book {
    public static void main(String[] args) {
        List<Ticket> tickets = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to tje system! (enter '1' to book the ticket)");
        int in = Integer.parseInt(scanner.next());
        while (in == 1) {
            System.out.println("Your start station (1 Taipei , 2 Taichung, 3 Kaohsiung )");
            int choice = Integer.parseInt(scanner.next());
            Station start = null;
            switch (choice) {
                case 1:
                    start = start.TAIPEI_CITY;
                    break;
                case 2 :
                    start = start.TAICHUNG_CITY;
                    break;
                case 3:
                    start =start.KAOHSiUNG_CITY;
                    break;

            }

            System.out.println("Your destination station (1 Taipei , 2 Taichung, 3 Kaohsiung )");
            choice = Integer.parseInt(scanner.next());
            Station destination = null;
            switch (choice) {
                case 1:
                    destination = destination.TAIPEI_CITY;
                    break;
                case 2 :
                    destination = destination.TAICHUNG_CITY;
                    break;
                case 3:
                    destination = destination.KAOHSiUNG_CITY;
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
                total = (int)(Math.abs(destination.price- start.price)*ticket*ticketType.percentOff);
                System.out.println(total);
                tickets.add(new Ticket(start.name,destination.name,ticketType.name,ticket));

                continue;
            }else if (keep ==2) {
                int price = (int)(Math.abs(destination.price- start.price)*ticket*ticketType.percentOff);
                tickets.add(new Ticket(start.name,destination.name,ticketType.name,ticket));
                for (Ticket t:tickets) {
                    t.print();
                }

                System.out.println("Total = " +(price+total));
                break;
            }
        }
    }
}

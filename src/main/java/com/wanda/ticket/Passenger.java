package com.wanda.ticket;


import java.sql.SQLOutput;
import java.util.Scanner;

public class Passenger {
    public static void main(String[] args) {
        System.out.println("Your start station (1 Taipei , 2 Taichung, 3 Kaohsiung )");
        Scanner scanner = new Scanner(System.in);
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
        System.out.println("What type of ticket do you want? (1 Normal, 2 Student,3 Elder, 4 Back and Forth )");
        int type = Integer.parseInt(scanner.next());
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
            case 4 :
                ticketType = ticketType.BACK_AND_FORTH;
        }
        System.out.println("What many ticket do you want?");
        int ticket = Integer.parseInt(scanner.next());
        

    }
}

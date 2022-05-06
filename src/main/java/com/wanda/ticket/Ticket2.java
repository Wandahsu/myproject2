package com.wanda.ticket;

import java.util.Scanner;

import static com.wanda.ticket.Total.total;

public class Ticket2 {
    public static final int TAIPEI_city = 100;
    public static final int TAICHUNG_city = 200;
    public static final int KAOHSIUNG_city = 400;

    int price;
    Station start;
    Station destination;

    public Ticket2(Station start, Station destination) {
        this.start = start;
        this.destination = destination;
        int diff = Math.abs(start.id-destination.id);
        System.out.println(diff);
        switch (diff) {
            case 100:
                price = 500;
                break;
            case 200:
                price = 600;
                break;
            case 400 :
                price = 1100;
                break;
        }

    }
}

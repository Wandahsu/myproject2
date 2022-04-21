package com.wanda.ticket;

import javax.print.StreamPrintServiceFactory;

public class Ticket {
    /*
    public static final int TAIPEI_city = 100;
    public static final int TAICHUNG_city = 200;
    public static final int KAOHSIUNG_city = 300;
    */
    String start;
    String destination;
    String ticketType;
    int ticket;


    public Ticket(String start, String destination, String ticketType, int ticket) {
        this.start = start;
        this.destination = destination;
        this.ticketType = ticketType;
        this.ticket = ticket;

    }

    public void print() {
        System.out.println(start + "\t" + destination + "\t" + ticketType + "\t" + " * "+ticket);
    }
}

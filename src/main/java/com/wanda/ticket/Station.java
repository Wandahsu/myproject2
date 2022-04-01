package com.wanda.ticket;

public class Station {
    public static final Station TAIPEI_CITY =
            new Station(100,"Taipei",0);
    public static final Station TAICHUNG_CITY =
            new Station(200,"Taichung",750);
    public static final Station KAOHSiUNG_CITY =
            new Station(300,"Kaohsiung", 1500);

    int id;
    String name;
    int price;
    public Station(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}

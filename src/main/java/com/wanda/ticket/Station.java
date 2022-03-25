package com.wanda.ticket;

public class Station {
    public static final Station TAIPEI_CITY =
            new Station(100,"Taipei");
    public static final Station TAICHUNG_CITY =
            new Station(200,"Taichung");
    public static final Station KAOHSiUNG_CITY =
            new Station(300,"Kaohsiung");

    int id;
    String name;
    public Station(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

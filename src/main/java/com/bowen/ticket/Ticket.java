package com.bowen.ticket;

public class Ticket {
    public static final int TAIPEI_CITY = 100;
    public static final int TAICHUNG_CITY = 200;
    public static final int KAOHSIUNG_CITY = 300;

    int price;
    Station start;
    Station end;
    public Ticket(Station start,Station end) {
        this.start = start;
        this.end = end;
    }
    public void print(){

    }
}

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
        int n = start.id +end.id;
        switch (n){
            case(1):
                n = 300;
                price = 600;
            case (2):
                n = 400;
                price = 900;
            case (3):
                n = 600;
                price = 1500;
        }
    }
    public void print(){
    }
}

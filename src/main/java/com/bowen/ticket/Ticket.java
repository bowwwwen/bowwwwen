package com.bowen.ticket;
import com.bowen.ticket.Station;

public class Ticket {
    public static final int TAIPEI_STATION= 100;
    public static final int TAICHUNG_STATION = 200;
    public static final int KAOHSIUNG_STATION = 300;

    Station start;
    Station end;
    int price;

    public Ticket(Station start, Station end) {
        if (start == Station.TAIPEI_STATION){
            if (end == Station.TAICHUNG_STATION){
                price = 600;
            }else{
                price = 1500;
            }
        }else if (start==Station.TAICHUNG_STATION){
            if (end==Station.TAIPEI_STATION){
                price = 600;
            }else {
                price = 900;
            }
        }else if (start==Station.KAOHSIUNG_STATION){
            if (end==Station.TAICHUNG_STATION){
                price = 900;
            }else {
                price = 1500;
            }
        }
        this.start = start;
        this.end = end;

    }
}


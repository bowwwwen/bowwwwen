package com.bowen.ticket;

public class ElderTicket extends Ticket{
    float discount = price*0.5f;
    public ElderTicket(Station start,Station end){
        super(start,end);
        price = (int) (price-discount);
    }
}

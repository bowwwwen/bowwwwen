package com.bowen.ticket;

public class DoubleTicket extends Ticket{
    float discount = price*0.1f;
    public DoubleTicket(Station start,Station end){
        super(start,end);
        price = (int)((price-discount)*2);
    }
}

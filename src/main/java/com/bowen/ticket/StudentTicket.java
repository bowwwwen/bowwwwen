package com.bowen.ticket;

public class StudentTicket extends Ticket{
    float discount = price*0.2f;

    public StudentTicket(Station start,Station end){
        super(start, end);
        price = (int)(price-discount);
    }
}

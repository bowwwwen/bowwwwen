package com.bowen.sale;

public class SaleTest {
    public static void main(String[] args) {
        NormalCustomer c1 = new NormalCustomer("0001",1200);
        NormalCustomer c2 = new NormalCustomer("0002",800);
        SilverCustomer c3 = new SilverCustomer("0003",2200);
        GoldenCustomers c4 = new GoldenCustomers("0004",3200);
        c1.print();
        c2.print();
        c3.print();
        c4.print();
    }
}

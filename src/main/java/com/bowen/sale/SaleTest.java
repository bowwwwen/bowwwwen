package com.bowen.sale;

import java.util.ArrayList;
import java.util.List;

public class SaleTest {
    public static void main(String[] args) {

        List<NormalCustomer> customers = new ArrayList<>();
        customers.add(new NormalCustomer("0001",1200));
        customers.add(new NormalCustomer("0002",800));
        customers.add(new SilverCustomer("0003",2200));
        customers.add(new GoldenCustomers("0004",3200));
        customers.add(new PlatinumCustomers("0005",700));
        customers.add(new GoldenCustomeres2("0007",3200));

//        for (int i = 0; i < 6; i++) {
//           customers.get(i);
//        }

        for (NormalCustomer c : customers) {
            c.print();
        }


//        NormalCustomer c1 = new NormalCustomer("0001",1200);
//        NormalCustomer c2 = new NormalCustomer("0002",800);
//        SilverCustomer c3 = new SilverCustomer("0003",2200);
//        GoldenCustomers c4 = new GoldenCustomers("0004",3200);
//        PlatinumCustomers c5 = new PlatinumCustomers("0005",700);
//        GoldenCustomeres2 c6 = new GoldenCustomeres2("0007",3200);
//        customers.get(0).print();
//        customers.get(1).print();
//        customers.get(2).print();
//        customers.get(3).print();
//        customers.get(4).print();
//        customers.get(5).print();
    }
}

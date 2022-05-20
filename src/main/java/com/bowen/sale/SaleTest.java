package com.bowen.sale;

import java.util.ArrayList;
import java.util.List;

public class SaleTest {
    public static void main(String[] args) {
        List<Integer> list =new ArrayList<>();
        list.add(800);
        list.add(1200);
        List<NormalCustomer> customers = new ArrayList<>();
        customers.add(new NormalCustomer("0001",1200));
        customers.add(new NormalCustomer("0002",800));
        customers.add(new SilverCustomer("0003",2200));
        customers.add(new GoldenCustomers("0004",3200));
        customers.add(new PlatinumCustomers("0005",700));
        customers.add(new GoldenCustomeres2("0007",3200));
        MyClass m = new MyClass();
        m.max(100,200);
        m.getClass();
        m.print();


//        for (int i = 0; i < 6; i++) {
//           customers.get(i);
//        }

        for (NormalCustomer c : customers) {
            c.print();
        }
        NormalCustomer c = customers.get(4);
        if (c instanceof GoldenCustomers){
            GoldenCustomers gc = (GoldenCustomers)c;
            System.out.println(c instanceof GoldenCustomers);
            System.out.println(gc.bonus);
        }

//        System.out.println(c instanceof SilverCustomer);
////        avoid stupid
//        SilverCustomer sc = (SilverCustomer) c;
//        System.out.println(sc.amount);


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

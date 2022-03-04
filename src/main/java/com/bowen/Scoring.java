package com.bowen;

import java.lang.management.BufferPoolMXBean;

public class Scoring {
    public static void main(String[] args) {
        Person Bowen = new Person();
        Bowen.name = "Bowen";
        Bowen.cn = 73;
        Bowen.sc = 86;
        System.out.println(Bowen.cn +"\t"+ Bowen.sc +"\t"+ Bowen.name);
    }
}

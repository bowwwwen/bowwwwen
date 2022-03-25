package com.bowen.score;

public class Person {
    int cn;
    int sc;
    String name;
    public Person(String name){
        this.name = name;
    }
    public Person(String name, int cn, int sc){
        this(name);
        this.cn = cn;
        this.sc = sc;
    }
    public Person(){

    }
    public void print(){
        System.out.print(name + "\t" + sc + "\t" + sc + "\t" + getAverage());
        if (getAverage() < 60) {
            System.out.print("*");
        }
        System.out.println();
        }
        public int getAverage() {
            return (cn+sc)/2;
    }
}

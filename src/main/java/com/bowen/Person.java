package com.bowen;

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
        int avarege =(cn+sc)/2;
        System.out.print(name+ "\t" + cn + "\t" + sc + "\t" + avarege);
        if (avarege<60){
            System.out.println("*");
        } else{
            System.out.println();
        }
    }
}

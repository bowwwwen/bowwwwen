package com.bowen.score;

public class Student implements Printerable{
    protected int cn;
    protected int sc;
    public String name;
    public Student(String name){

        this.name = name;
    }
    public Student(String name, int cn, int sc){
        this(name);
        this.cn = cn;
        this.sc = sc;
    }
    public Student(){

    }
    @Override
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

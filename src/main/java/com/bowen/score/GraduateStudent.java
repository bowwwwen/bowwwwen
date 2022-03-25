package com.bowen.score;

public class GraduateStudent extends Person {
    int thesis;
    public GraduateStudent(String name,int cn, int sc, int thesis){
        super(name,cn,sc);
        this.thesis = thesis;
    }
    public GraduateStudent(String name){
        super(name);
    }
    @Override
    public void print(){
        System.out.println(name + "\t" + cn + "\t" + sc + "\t" + getAverage()+ "\t" + thesis);
        if (getAverage() < 60) {
            System.out.print("*");
        }
    }
}

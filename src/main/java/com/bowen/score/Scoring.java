package com.bowen.score;

public class Scoring {
    public static void main(String[] args) {
        Student Bowen = new Student("Bowen",76,96);
        Student ELsa = new Student("Elsa",65,78);
        Student Rayy = new Student("Rayy",25,66);
        GraduateStudent Eric = new GraduateStudent("Eric", 55, 38,56);
        Bowen.print();
        ELsa.print();
        Rayy.print();
        Eric.print();
    }
}

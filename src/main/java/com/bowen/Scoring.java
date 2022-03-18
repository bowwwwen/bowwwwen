package com.bowen;

public class Scoring {
    public static void main(String[] args) {
        Person Bowen = new Person("Bowen",76,96);
        Person ELsa = new Person("Elsa",65,78);
        Person Rayy = new Person("Rayy",25,66);
        GraduateStudent Eric = new GraduateStudent("Eric", 55, 38,56);
        Bowen.print();
        ELsa.print();
        Rayy.print();
        Eric.print();
    }
}

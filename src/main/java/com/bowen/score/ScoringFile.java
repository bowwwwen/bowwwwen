package com.bowen.score;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class ScoringFile {
    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader("scores.txt");
            BufferedReader reader = new BufferedReader(fileReader);
            String line = reader.readLine();
            while(line != null) {
//                System.out.println(line);
                //Jack,25,80
                String[] token = line.split(",");
                String name = token[0];
                int cn = Integer.parseInt(token[1]);
                int sc = Integer.parseInt(token[2]);
                Student stu = new Student(name, cn, sc);
                stu.print();
                line = reader.readLine();
            }


            /*int data = fileReader.read();
            while(data != -1) {
                System.out.print((char)data);
                data = fileReader.read();
            }*/
        } catch (FileNotFoundException ex) {
            System.out.println("error");
        } catch (IOException e) {
            System.out.println("error");
        }
        System.out.println("Continuing");
    }
}

package com.bowen.score;

public class ScoringNG {
    public static void main(String[] args) {
        int[] cn ={73, 80, 32};
        int[] sc ={86, 97, 65};
        String[] name ={"Bowen", "Elsa", "Rayy"};
        for (int i = 0; i < 3; i++) {
            System.out.println(name[i] + "\t" + cn[i] +"\t" + sc[i] + "\t" +(cn[i]+sc[i])/2);
        }
    }
}

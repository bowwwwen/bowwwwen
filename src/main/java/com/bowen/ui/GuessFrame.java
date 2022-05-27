package com.bowen.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class GuessFrame extends JFrame {
    Random random = new Random();
    int secret = random.nextInt(10)+1;
    JButton button = new JButton("ENTER");
    JLabel label = new JLabel("Guess number 1~10");
    JTextField number = new JTextField(10);

    public GuessFrame(){
        super();
        System.out.println(secret);
        setSize(600,400);
        setLocation(300,200);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//                System.out.println("hello2");
//                label.setText("ni hao");

                int num = Integer.parseInt(number.getText());
                System.out.println(num);
                if (num<secret){
                    label.setText("bigger");
                }else if (num>secret){
                    label.setText("smaller");
                }else {
                    label.setText("bingo" + "\t" + "secret number is " + "\t" + secret);
                }
            }
        });

        setLayout(new FlowLayout());
        add(number);
        add(label);
        add(button);
        setVisible(true);
    }

    public static void main(String[] args) {
        GuessFrame guessFrame = new GuessFrame();

    }
}

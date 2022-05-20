package com.bowen.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GuessFrame extends JFrame {


    public GuessFrame(){
        super();
        setSize(600,400);
        setLocation(300,200);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setVisible(true);
        JButton button = new JButton("another");
        JLabel label = new JLabel("helllo3");
        button.addActionListener(0527new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("hello2");
                label.setText("ni hao");
            }
        });


        setLayout(new FlowLayout());
        add(label);
        add(button);
        setVisible(true);


    }

    public static void main(String[] args) {
        GuessFrame guessFrame = new GuessFrame();

    }
}

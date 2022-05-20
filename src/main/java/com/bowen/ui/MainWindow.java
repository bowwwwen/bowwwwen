package com.bowen.ui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainWindow {
    public static void main(String[] args) {
        JFrame frame =new JFrame();
        frame.setSize(400,400);
        frame.setLocation(200,200);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        JButton button = new JButton("ok");
        JButton button1 = new JButton("testing");

        MyActionListener listener = new MyActionListener();
        button.addActionListener(listener);
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("much easier");
            }
        });
//        frame.setLayout(new BorderLayout());
        frame.add(button);
        frame.setVisible(true);
        System.out.println("start");
        frame.add(button1);
        frame.setVisible(true);
        System.out.println("end");

    }
}

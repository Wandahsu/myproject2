package com.wanda.ui;

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
        JButton button = new JButton("OK");
        JLabel label = new JLabel("aaa");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //System.out.println("Hello!");
                label.setText("Hello!!");
            }
        });

        label.setText("Zzzzz....");
        setLayout(new FlowLayout());
        add(label);
        add(button);
    }

    public static void main(String[] args) {
        GuessFrame guessFrame = new GuessFrame();
    }


}

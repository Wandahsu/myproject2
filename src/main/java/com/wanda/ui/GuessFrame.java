package com.wanda.ui;

import org.w3c.dom.ls.LSOutput;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class GuessFrame extends JFrame {
    JButton button = new JButton("Guess");
    JLabel label = new JLabel("...");
    JTextField number = new JTextField(10);
    Random random = new Random();
    int ans = random.nextInt(10)+1;


    public GuessFrame(){
        super();
        setSize(600,400);
        setLocation(300,200);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setVisible(true);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(ans);
                    int num = Integer.parseInt(number.getText());
                    System.out.println(num);

                        if (num > ans) {
                            label.setText("smaller!");
                        }else if (num <ans) {
                            label.setText("bigger!");
                        }else{
                            label.setText("Correct!");
                        }

                //System.out.println("Hello!");
                //label.setText("Hello!!");

            }
        });
        setLayout(new FlowLayout());
        add(number);
        add(button);
        add(label);
    }

    public static void main(String[] args) {
        GuessFrame guessFrame = new GuessFrame();
    }


}

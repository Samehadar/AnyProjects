package com.gmail.samehadar.draw_practice;

import javax.swing.*;

/**
 * Created by User on 13.09.2016.
 */
public class SimpleGUI1 {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JButton button = new JButton("click me");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.getContentPane().add(button);

        frame.setSize(300, 300);
        frame.setVisible(true);
    }

}

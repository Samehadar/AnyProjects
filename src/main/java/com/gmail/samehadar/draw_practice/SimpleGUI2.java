package com.gmail.samehadar.draw_practice;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by User on 13.09.2016.
 */
public class SimpleGUI2 implements ActionListener {
    JButton button;

    public static void main(String[] args) {
        SimpleGUI2 gui = new SimpleGUI2();
        gui.go();
    }

    public void actionPerformed(ActionEvent e) {
        button.setText("clicked");
    }

    public void go() {
        JFrame frame = new JFrame();
        button = new JButton("click me");

        button.addActionListener(this);

        //frame.getContentPane().add(button);
        JPanel drawPanel = new MyDrawPanel3();
        frame.getContentPane().add(drawPanel);
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

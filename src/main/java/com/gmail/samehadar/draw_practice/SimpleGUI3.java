package com.gmail.samehadar.draw_practice;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by User on 13.09.2016.
 */
public class SimpleGUI3 implements ActionListener {

    JFrame frame;

    public static void main(String[] args) {
        SimpleGUI3 gui = new SimpleGUI3();
        gui.go();
    }

    public void go() {
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton button = new JButton("Change colors");
        button.addActionListener(this);

        MyDrawPanel3 draw3 = new MyDrawPanel3();

        frame.getContentPane().add(BorderLayout.SOUTH, button);
        frame.getContentPane().add(BorderLayout.CENTER, draw3);
        frame.setSize(300, 300);
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        frame.repaint();
    }

}

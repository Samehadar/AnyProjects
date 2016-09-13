package com.gmail.samehadar.draw_practice;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *  Class that have two button: change color and change label
 */
public class TwoButtonsGui {
    JFrame frame;
    JLabel label;

    /**
     * main func
     * @param args cmd str
     */
    public static void main(String[] args) {
        TwoButtonsGui gui = new TwoButtonsGui();
        gui.go();
    }

    void go() {
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton labelButton = new JButton("Label button");
        labelButton.addActionListener(new LabelButtonListener());

        JButton colorButton = new JButton("Color button");
        colorButton.addActionListener(new ColorButtonListener());

        label = new JLabel("I'm label");
        JPanel drawPanel3 = new MyDrawPanel();

        frame.getContentPane().add(BorderLayout.SOUTH, colorButton);
        frame.getContentPane().add(BorderLayout.CENTER, drawPanel3);
        frame.getContentPane().add(BorderLayout.EAST, labelButton);
        frame.getContentPane().add(BorderLayout.WEST, label);

        frame.setSize(300, 300);
        frame.setVisible(true);
    }

    class ColorButtonListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            frame.repaint();
        }
    }

    class LabelButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            label.setText("Wasted");
        }
    }

}

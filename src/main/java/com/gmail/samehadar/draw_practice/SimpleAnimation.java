package com.gmail.samehadar.draw_practice;

import javax.swing.*;

/**
 * Created by User on 13.09.2016.
 */
public class SimpleAnimation {

    int x = 70;
    int y = 70;

    public static void main(String[] args) {
        SimpleAnimation gui = new SimpleAnimation();
        gui.go();
    }

    public void go() {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        MyDrawPanel2 drawPanel3 = new MyDrawPanel2(x, y);

        frame.getContentPane().add(drawPanel3);
        frame.setSize(300, 300);
        frame.setVisible(true);

        for (int i = 0; i < 130; i++) {
            x++;
            y++;
            drawPanel3.setX(x);
            drawPanel3.setY(y);
            drawPanel3.repaint();

            try {
                Thread.sleep(50);
            } catch (Exception e) {}
        }
    }

}

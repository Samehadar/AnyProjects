package com.gmail.samehadar.draw_practice;

import javax.swing.*;
import java.awt.*;

/**
 * Create circle with random gradient color
 */
public class MyDrawPanel3 extends JPanel {
    private int x;
    private int y;

    public MyDrawPanel3() {
        this.x = 70;
        this.y = 70;
    }

    public MyDrawPanel3(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    @Override
    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;

        int red = (int) (Math.random() * 255);
        int green = (int) (Math.random() * 255);
        int blue = (int) (Math.random() * 255);
        Color startColor = new Color(red, green, blue);

        red = (int) (Math.random() * 255);
        green = (int) (Math.random() * 255);
        blue = (int) (Math.random() * 255);
        Color endColor = new Color(red, green, blue);

        GradientPaint gradient = new GradientPaint(x, y, startColor, x + 80, y + 80, endColor);
        g2d.setPaint(gradient);
        g2d.fillOval(x, y, 40, 40);
    }

}

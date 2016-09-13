package com.gmail.samehadar.draw_practice;

import javax.swing.*;
import java.awt.*;

/**
 * Create oval with gradient color, after clean screen
 */
public class MyDrawPanel2 extends JPanel {
    private int x;
    private int y;

    public MyDrawPanel2() {
        this.x = 70;
        this.y = 70;
    }

    public MyDrawPanel2(int x, int y) {
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
        g.setColor(Color.white);
        g.fillRect(0, 0, this.getWidth(), this.getHeight());
        Graphics2D g2d = (Graphics2D) g;
        g2d.setPaint(new GradientPaint(x, y, Color.blue, x+80, y+80, Color.orange));

        g2d.fillOval(x, y, 100, 100);
    }

}

package com.gmail.samehadar.draw_practice;

import javax.swing.*;
import java.awt.*;

/**
 * Print image
 */
public class MyDrawPanel extends JPanel {

    public void paintComponent(Graphics g){
        Image image = new ImageIcon("C:\\Users\\User\\IdeaProjects\\AllVPProjects\\AnyProjects\\src\\main\\resources\\5ee662a286.jpg").getImage();
        g.drawImage(image, 3, 4, this);
    }

}

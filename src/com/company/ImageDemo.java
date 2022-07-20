package com.company;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ImageDemo extends JApplet
{
    JFrame jframe;
    public void makeGui()
    {
        jframe.setSize(1920, 1080);
        ImageIcon imageIcon = new ImageIcon("./imagesLebron_2.jpg");
        JLabel jlabel = new JLabel("Lebron James", imageIcon, JLabel.CENTER);
        jframe.add(jlabel);
        jframe.setVisible(true);
    }
}

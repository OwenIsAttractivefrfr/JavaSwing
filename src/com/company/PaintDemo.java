package com.company;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class PaintDemo
{
    JLabel jlabel;
    PaintPanel paintpanel;

    public PaintDemo()
    {
        JFrame jframe = new JFrame("Paint Demo");
        jframe.setSize(1280,720);
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        paintpanel = new PaintPanel();
        jframe.add(paintpanel);
        jframe.setVisible(true);
    }
}

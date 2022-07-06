package com.company;
import javax.swing.*;
import java.awt.*;
import java.lang.*;
import java.awt.event.*;
import java.io.*;


public class SwingDemo
{
    JFrame jframe;

    SwingDemo()
    {
        jframe = new JFrame("JFrame Application");

        jframe.setSize(640,480);

        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel jlabel = new JLabel("My second swing application");

        jframe.add(jlabel);

        jframe.setVisible(true);


    }
}

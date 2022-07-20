package com.company;

import javax.swing.*;
import java.awt.*;

public class Main extends JApplet
{
    public static void main(String[] args)
    {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new GUIeventHandling();
            }
        });

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new SwingDemo();
            }
        });
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new PaintDemo();
            }
        });
        try
        {
            SwingUtilities.invokeAndWait(new Runnable() {
                @Override
                public void run() {
                    new ImageDemo();
                }
            });
        }catch(Exception e)
        {
            System.out.println(e);
        }
    }
}

package com.company;

import javax.swing.*;
import java.awt.*;

public class Main extends JApplet {
    public static void main(String[] args) {
        JButton a, b;
        JLabel jlabel;
        public void init()
        {
            try {
                SwingUtilities.invokeAndWait(new Runnable() {
                    @Override
                    public void run() {
//                        new SwingDemo();
                        makeGUI();
                    }
                });
            } catch (Exception e) {
                System.out.println(e);
            }
            private void makeGUI()
            {
                setLayout(new FlowLayout());
                a = new JButton("click me");

            }
        }
    }
}

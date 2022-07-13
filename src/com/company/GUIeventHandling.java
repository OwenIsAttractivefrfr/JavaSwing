package com.company;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class GUIeventHandling
{
    JLabel jlabel;

    public GUIeventHandling()
    {
        JFrame jframe = new JFrame("Event handling");
        jframe.setLayout(new FlowLayout());
        jframe.setSize(1280,720);
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton yesbutton = new JButton("Yes");

        JButton nobutton = new JButton("NO");

        JButton maybeButton = new JButton("Maybe");

        yesbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jlabel.setText("Yes button was pressed.");
            }
        });

        nobutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jlabel.setText("No button was pressed.");
            }
        });

        maybeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jlabel.setText("Maybe button was pressed");
            }
        });

        jframe.add(yesbutton);
        jframe.add(nobutton);
        jframe.add(maybeButton);

        jlabel = new JLabel("yes, no, or maybe");

        jframe.add(jlabel);

        jframe.setVisible(true);
    }
}

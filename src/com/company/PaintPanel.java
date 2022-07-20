package com.company;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class PaintPanel extends JPanel
{
    Insets inset;
    Random randomNumber;

    public PaintPanel()
    {
        setBorder(BorderFactory.createLineBorder(Color.RED, 5));
        randomNumber = new Random();
    }
    protected void paintComponent(Graphics graphics)
    {
        super.paintComponent(graphics);
        int x1, x2, y1, y2;
        int height = getHeight();
        int width = getWidth();
        inset = getInsets();
        for(int i = 0; i < 10; i++)
        {
            x1 = randomNumber.nextInt(width - inset.left);
            x2 = randomNumber.nextInt(width - inset.left);
            y1 = randomNumber.nextInt(height - inset.bottom);
            y2 = randomNumber.nextInt(height - inset.bottom);

            graphics.drawLine(x1, y1, x2, y2);
        }
    }
}

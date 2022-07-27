package com.company;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
//we will get back to this need to review more


/*
<applet code = "ImageDemo" width = 1920 height = 1080>
</applet>
 */

public class ImageDemo extends JApplet
{

    public void init()
    {
        try {
            SwingUtilities.invokeAndWait(new Runnable() {
                @Override
                public void run() {
                    makeGui();
                }
            });
        } catch (Exception e){
            System.out.println(e);
        }
    }


    public void makeGui()
    {
        ImageIcon imageIcon = new ImageIcon("./imagesLebron_2.jpg");
        JLabel jlabel = new JLabel("Lebron James", imageIcon, JLabel.CENTER);
        add(jlabel);
    }
}

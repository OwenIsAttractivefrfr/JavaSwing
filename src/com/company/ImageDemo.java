package com.company;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ImageDemo extends JFrame
{
    JFrame jframe;
    JLabel jlabel;
    ImageIcon imageicon;
    ImageIcon lebronjames2;
    ImageIcon tenz;
    ImageIcon kevinknox;
    JButton jbutton;
    JButton lebronjames2button;
    JButton tenzbutton;
    JButton kevinknoxbutton;

    public ImageDemo()
    {
        jframe = new JFrame("Lebron James");
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.setLayout(new FlowLayout());
        try
        {
            imageicon = new ImageIcon("./src/com/company/images/Lebron_2.jpg");
            lebronjames2 = new ImageIcon("./src/com/company/images/Lebron_3.jpg");
            tenz = new ImageIcon("./src/com/company/images/Tenz.jpg");
            kevinknox = new ImageIcon("./src/com/company/images/FortniteSuit.jpg");

            jbutton = new JButton(imageicon);
            jbutton.setActionCommand("Lebron James 1");
            jbutton.setIcon(imageicon);
//            jbutton.addActionListener(new ActionListener() {
//                @Override
//                public void actionPerformed(ActionEvent e) {
//                    jlabel.setText("You selected Lebron James 1");
//                }
//            });
            jframe.add(jbutton);

            lebronjames2button = new JButton(lebronjames2);
            lebronjames2button.setActionCommand("Lebron James 2");
            lebronjames2button.setIcon(lebronjames2);
            jframe.add(lebronjames2button);


            tenzbutton = new JButton(tenz);
            tenzbutton.setActionCommand("Tenz");
            tenzbutton.setIcon(tenz);
            jframe.add(tenzbutton);


            kevinknoxbutton = new JButton(kevinknox);
            kevinknoxbutton.setActionCommand("Kevin Knox");
            kevinknoxbutton.setIcon(kevinknox);
            jframe.add(kevinknoxbutton);


        } catch(Exception e)
        {
            System.out.println("can not find image.");
        }
        jframe.pack();
        jframe.setVisible(true);
    }
}

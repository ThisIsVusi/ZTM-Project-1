package za.ac.tut.ui;

import java.awt.Color;
import javax.swing.JFrame;


public class MyFirstFrame extends JFrame
{
    public MyFirstFrame()
    {
        setTitle("Mercedez-Benz.co.za");
        setSize(480,360);
        setDefaultLookAndFeelDecorated(true);
        setResizable(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setForeground(Color.RED);
        setVisible(true);
    }
}

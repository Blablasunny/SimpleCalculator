package org.example;
import javax.swing.JFrame;

public class MyFrame extends JFrame {
    public MyFrame(Calculator calculator) {
        super ("Работа с людьми");
        getContentPane().add(new MyStartPane(calculator, this));
        pack();
        setSize(640,360);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
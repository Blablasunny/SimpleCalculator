package org.example;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyStartPane extends JPanel {
    private Calculator calculator;
    private JFrame frame;

    JButton button1 = new JButton ("Сложение");
    JButton button2 = new JButton ("Вычитание");
    JButton button3 = new JButton ("Умножение");
    JButton button4 = new JButton ("Деление");
    JTextField txtFieldA = new JTextField("", 5);
    JTextField txtFieldB = new JTextField("", 5);
    JLabel labelRes = new JLabel ("");
    JLabel label = new JLabel ("Введите 2 числа для операции");

    public MyStartPane(Calculator calculator, JFrame frame) {
        this.calculator = calculator;
        this.frame = frame;

        setLayout (new GridLayout(2,4));
        add(label);
        add(txtFieldA);
        add(txtFieldB);
        add(labelRes);
        add(button1);
        add(button2);
        add(button3);
        add(button4);

        button1.addActionListener(new MyEvent1());
        button2.addActionListener(new MyEvent2());
        button3.addActionListener(new MyEvent3());
        button4.addActionListener(new MyEvent4());
    }

    private class MyEvent1 implements ActionListener {
        public MyEvent1() {
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            try{
                float a, b;
                try {
                    a = Float.parseFloat(txtFieldA.getText());
                    b = Float.parseFloat(txtFieldB.getText());
                }catch (Exception ex){
                    System.out.println("Должны быть введены числа");
                    throw new Exception();
                }
                labelRes.setText(String.valueOf(calculator.add(a, b)));
            } catch (Exception ex) {
                System.out.println("Не удалось выполнить операцию");
            }
        }
    }

    private class MyEvent2 implements ActionListener {

        public MyEvent2() {
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            try{
                float a, b;
                try {
                    a = Float.parseFloat(txtFieldA.getText());
                    b = Float.parseFloat(txtFieldB.getText());
                }catch (Exception ex){
                    System.out.println("Должны быть введены числа");
                    throw new Exception();
                }
                labelRes.setText(String.valueOf(calculator.subtract(a, b)));
            } catch (Exception ex) {
                System.out.println("Не удалось выполнить операцию");
            }
        }
    }

    private class MyEvent3 implements ActionListener {

        public MyEvent3() {
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            try{
                float a, b;
                try {
                    a = Float.parseFloat(txtFieldA.getText());
                    b = Float.parseFloat(txtFieldB.getText());
                }catch (Exception ex){
                    System.out.println("Должны быть введены числа");
                    throw new Exception();
                }
                labelRes.setText(String.valueOf(calculator.multiply(a, b)));
            } catch (Exception ex) {
                System.out.println("Не удалось выполнить операцию");
            }
        }
    }

    private class MyEvent4 implements ActionListener {

        public MyEvent4() {
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            try{
                float a, b;
                try {
                    a = Float.parseFloat(txtFieldA.getText());
                    b = Float.parseFloat(txtFieldB.getText());
                }catch (Exception ex){
                    System.out.println("Должны быть введены числа");
                    throw new Exception();
                }
                labelRes.setText(String.valueOf(calculator.divide(a, b)));
            } catch (Exception ex) {
                System.out.println("Не удалось выполнить операцию");
            }
        }
    }

}



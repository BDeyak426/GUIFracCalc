package com.company;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {

    private JFrame frame = new JFrame("Fraction Calculator");

    private JTextArea txtScreen = new JTextArea();

    String strNum1 = "";
    String strNum2 = "";

    String[] statement;

    int num1 = 0;
    int num2 = 0;

    String strTotal;

    private JButton btn0 = new JButton("0");
    private JButton btn1 = new JButton("1");
    private JButton btn2 = new JButton("2");
    private JButton btn3 = new JButton("3");
    private JButton btn4 = new JButton("4");
    private JButton btn5 = new JButton("5");
    private JButton btn6 = new JButton("6");
    private JButton btn7 = new JButton("7");
    private JButton btn8 = new JButton("8");
    private JButton btn9 = new JButton("9");

    private JButton btnDiv = new JButton("/");
    private JButton btnMul = new JButton("*");
    private JButton btnSub = new JButton("-");
    private JButton btnAdd = new JButton("+");

    public Main() {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setSize(400, 550);
        frame.setResizable(false);
        frame.setLayout(null);

        txtScreen.setSize(380, 100);
        txtScreen.setLocation(7, 5);
        txtScreen.setEditable(false);

        btn0.setSize(100, 50);
        btn0.setLocation(120, 460);
        btn0.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                txtScreen.append("0");
            }
        });

        btn1.setSize(100, 50);
        btn1.setLocation(10, 395);
        btn1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                txtScreen.append("1");
            }
        });

        btn2.setSize(100, 50);
        btn2.setLocation(120, 395);
        btn2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                txtScreen.append("2");
            }
        });

        btn3.setSize(100, 50);
        btn3.setLocation(200, 395);
        btn3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                txtScreen.append("3");
            }
        });

        btn4.setSize(90, 50);
        btn4.setLocation(10, 310);
        btn4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                txtScreen.append("4");
            }
        });

        btn5.setSize(90, 50);
        btn5.setLocation(105, 310);
        btn5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                txtScreen.append("5");
            }
        });

        btn6.setSize(100, 50);
        btn6.setLocation(200, 310);
        btn6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                txtScreen.append("6");
            }
        });

        btn7.setSize(100, 50);
        btn7.setLocation(200, 395);
        btn7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                txtScreen.append("7");
            }
        });

        btn8.setSize(100, 50);
        btn8.setLocation(200, 395);
        btn8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                txtScreen.append("8");
            }
        });


        frame.add(txtScreen);
        frame.add(btn0);
        frame.add(btn1);
        frame.add(btn2);
        frame.add(btn3);
        frame.add(btn4);
        frame.add(btn5);
        frame.add(btn6);
        frame.add(btn7);
        frame.add(btn8);
        frame.add(btn9);

        frame.add(btnDiv);
        frame.add(btnMul);
        frame.add(btnSub);
        frame.add(btnAdd);

    }
    public static void main(String[] args) {
	// write your code here
        new Main();

    }
}

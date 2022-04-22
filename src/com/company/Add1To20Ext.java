package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Add1To20Ext extends JFrame implements ActionListener {

    JLabel display = new JLabel("Click to see the sum of integers 1 to 20");
    JButton buttonAll = new JButton("ALL");
    JButton buttonOdd = new JButton("ODD");
    JButton buttonEven = new JButton("EVEN");
    int sumAll = 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10 + 11 + 12 + 13 + 14 + 15 + 16 + 17 + 18 + 19 + 20;
    int sumOdd = 1 + 3 + 5 + 7 + 9 + 11 + 13 + 15 + 17 + 19;
    int sumEven = 2 + 4 + 6 + 8 + 10 + 12 + 14 + 16 + 18 + 20;

    public Add1To20Ext() {
        display.setFont(display.getFont().deriveFont(18.0f));
        buttonAll.setPreferredSize(new Dimension(125, 50));
        buttonOdd.setPreferredSize(new Dimension(125, 50));
        buttonEven.setPreferredSize(new Dimension(125, 50));
        getContentPane().add(display, BorderLayout.NORTH);
        getContentPane().add(buttonAll, BorderLayout.CENTER);
        getContentPane().add(buttonOdd, BorderLayout.EAST);
        getContentPane().add(buttonEven, BorderLayout.WEST);
        buttonAll.addActionListener(this);
        buttonAll.setActionCommand("all");
        buttonOdd.addActionListener(this);
        buttonOdd.setActionCommand("odd");
        buttonEven.addActionListener(this);
        buttonEven.setActionCommand("even");
    }

    public static void main(String[] args) {
        Add1To20Ext frame = new Add1To20Ext();
        frame.setSize(400, 400);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("all")) {
            display.setText(String.valueOf(sumAll));
        } else if (e.getActionCommand().equals("odd")) {
            display.setText(String.valueOf(sumOdd));
        } else if (e.getActionCommand().equals("even")) {
            display.setText(String.valueOf(sumEven));
        }
    }
}

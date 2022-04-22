package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SumOfANumber extends JFrame implements ActionListener {
    JLabel display = new JLabel("Give me a number between 1 and 1000 to add together:");
    JTextField text = new JTextField("");
    JButton button = new JButton("Sum");
    int sum = 0;

    public SumOfANumber() {
        display.setFont(display.getFont().deriveFont(13.0f));
        button.setPreferredSize(new Dimension(125, 50));
        button.setFont(button.getFont().deriveFont(18.0f));
        text.setFont(text.getFont().deriveFont(18.0f));
        getContentPane().add(display, BorderLayout.NORTH);
        getContentPane().add(text, BorderLayout.CENTER);
        getContentPane().add(button, BorderLayout.SOUTH);
        button.addActionListener(this);
    }

    public static void main(String[] args) {
        SumOfANumber frame = new SumOfANumber();
        frame.setSize(400, 400);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int input = Integer.parseInt(text.getText());
        if (input > 0 && input <= 1000) {
            for (int i = 0; i < text.getText().length(); i++) {
                int lastDigit = input % 10;
                input = input / 10;
                sum = sum + lastDigit;
            }
            display.setText("Sum of individual numbers = " + sum);
        } else display.setText("Invalid number. Enter a valid number between 1 and 1000: ");
    }
}

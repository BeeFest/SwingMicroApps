package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ReverseString extends JFrame implements ActionListener {
    JLabel display = new JLabel("Enter a sentence: ");
    JTextField input = new JTextField();
    JLabel output = new JLabel();
    JPanel panel = new JPanel();
    JButton button = new JButton("Reverse");

    public ReverseString() {
        display.setFont(display.getFont().deriveFont(15.0f));
        getContentPane().add(display, BorderLayout.NORTH);

        input.setFont(input.getFont().deriveFont(15.0f));
        panel.setLayout(new GridLayout(1, 2));
        getContentPane().add(panel, BorderLayout.CENTER);
        panel.add(input);
        panel.add(output);

        getContentPane().add(button, BorderLayout.SOUTH);
        button.addActionListener(this);
    }

    public static void main(String[] args) {
        ReverseString frame = new ReverseString();
        frame.setSize(600, 200);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        display.setText("");
        String text = input.getText();
        StringBuilder sb = new StringBuilder();
        sb.append(text).reverse();
        output.setText(String.valueOf(sb));
        }
    }
package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ConvertIntToHex extends JFrame implements ActionListener {
    JLabel display = new JLabel("Convert integer to hex number:");
    JTextField text = new JTextField("");
    JButton button = new JButton("integer -> hex");

    public ConvertIntToHex() {
        display.setFont(display.getFont().deriveFont(12.0f));
        button.setPreferredSize(new Dimension(125, 50));
        button.setFont(button.getFont().deriveFont(16.0f));
        text.setFont(text.getFont().deriveFont(18.0f));
        getContentPane().add(display, BorderLayout.NORTH);
        getContentPane().add(text, BorderLayout.CENTER);
        getContentPane().add(button, BorderLayout.SOUTH);
        button.addActionListener(this);
    }

    public static void main(String[] args) {
        ConvertIntToHex frame = new ConvertIntToHex();
        frame.setSize(300, 200);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int value = Integer.parseInt(text.getText());
        display.setText("The entered integer is the same as hex " + Integer.toHexString(value));
    }
}


package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CountUppercaseLetters extends JFrame implements ActionListener {
    JLabel display = new JLabel("Enter a sentence: ");
    JTextField input = new JTextField("");
    JPanel panel = new JPanel();
    JButton buttonU = new JButton("Count Uppercases");
    JButton buttonL = new JButton("Count lowercases");

    public CountUppercaseLetters() {
        display.setFont(display.getFont().deriveFont(15.0f));
        getContentPane().add(display, BorderLayout.NORTH);

        getContentPane().add(input, BorderLayout.CENTER);
        input.setFont(input.getFont().deriveFont(15.0f));

        panel.setLayout(new GridLayout(1, 2));
        getContentPane().add(panel, BorderLayout.SOUTH);
        panel.add(buttonU);
        buttonU.addActionListener(this);
        buttonU.setActionCommand("Upper");
        panel.add(buttonL);
        buttonL.addActionListener(this);
        buttonL.setActionCommand("Lower");

    }

    public static void main(String[] args) {
        CountUppercaseLetters frame = new CountUppercaseLetters();
        frame.setSize(400, 200);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        display.setText("");
        if (e.getActionCommand().equals("Upper")) {
            int upperCases = 0;
            StringBuilder sb = new StringBuilder(input.getText());
            for (int i = 0; i < sb.length(); i++) {
                if (Character.isUpperCase(sb.charAt(i))) {
                    upperCases++;
                }
            }
            display.setText("Uppercases counted: " + upperCases);
        } else if (e.getActionCommand().equals("Lower")) {
            int lowerCases = 0;
            StringBuilder sb = new StringBuilder(input.getText());
            for (int i = 0; i < sb.length(); i++) {
                if (Character.isLowerCase(sb.charAt(i))) {
                    lowerCases++;
                }
            }
            display.setText("Lowercases counted: " + lowerCases);
        }
    }
}
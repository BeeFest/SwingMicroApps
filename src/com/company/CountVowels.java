package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Locale;

public class CountVowels extends JFrame implements ActionListener {
    JLabel display = new JLabel("Enter a sentence: ");
    JTextArea input = new JTextArea();
    JTextArea output = new JTextArea();
    JPanel panel = new JPanel();
    JButton button = new JButton("Count");

    public CountVowels() {
        display.setFont(display.getFont().deriveFont(15.0f));
        getContentPane().add(display, BorderLayout.NORTH);


        panel.setLayout(new GridLayout(1, 2));
        getContentPane().add(panel, BorderLayout.CENTER);
        panel.add(input);
        input.setLineWrap(true);
        input.setFont(input.getFont().deriveFont(15.0f));
        input.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY, 1));

        panel.add(output);
        output.setLineWrap(true);
        output.setFont(output.getFont().deriveFont(Font.BOLD, 15.0f));
        output.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY, 1));

        getContentPane().add(button, BorderLayout.SOUTH);
        button.addActionListener(this);
    }

    public static void main(String[] args) {
        CountVowels frame = new CountVowels();
        frame.setSize(600, 200);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        output.setText("");
        int vowels = 0;
        int consonants = 0;
        String text = input.getText().toUpperCase(Locale.ROOT);
        char[] letterArray = new char[text.length()];

        for (int i = 0; i < text.length(); i++) {
            letterArray[i] = text.charAt(i);
        }
        for (char letter : letterArray) {
            if (letter >= 'A' && letter <= 'Z') {
                if (letter == 'A' || letter == 'E' || letter == 'O' || letter == 'I' || letter == 'U'|| letter == 'Y') {
                    vowels++;
                } else consonants++;
            }
        }
        output.append("Vowels counted: " + vowels);
                output.append("\nConsonants counted: " +consonants);
    }
}
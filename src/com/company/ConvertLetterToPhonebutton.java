package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Locale;

public class ConvertLetterToPhonebutton extends JFrame implements ActionListener {
    JLabel display = new JLabel("Input letter to convert: ");
    JTextField input = new JTextField();
    JPanel panel = new JPanel();
    JButton button = new JButton("Letter to phone button");

    public ConvertLetterToPhonebutton() {
        display.setFont(display.getFont().deriveFont(20.0f));
        getContentPane().add(display, BorderLayout.NORTH);

        input.setFont(input.getFont().deriveFont(80.0f));
        panel.setLayout(new GridLayout(1, 2));
        getContentPane().add(panel, BorderLayout.CENTER);
        panel.add(input);
        panel.add(button);
        button.addActionListener(this);

    }

    public static void main(String[] args) {
        ConvertLetterToPhonebutton frame = new ConvertLetterToPhonebutton();
        frame.setSize(400, 200);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        display.setText("");
        switch (input.getText().toLowerCase(Locale.ROOT)) {
            case "a", "b", "c":
                display.setText("Phone button is: 2");
                break;
            case "d", "e", "f":
                display.setText("Phone button is: 3");
                break;
            case "g", "h", "i":
                display.setText("Phone button is: 4");
                break;
            case "j", "k", "l":
                display.setText("Phone button is: 5");
                break;
            case "m", "n", "o":
                display.setText("Phone button is: 6");
                break;
            case "p", "q", "r", "s":
                display.setText("Phone button is: 7");
                break;
            case "t", "u", "v":
                display.setText("Phone button is: 8");
                break;
            case "w", "x", "y", "z":
                display.setText("Phone button is: 9");
                break;
            default:
                display.setText(input.getText() + " is an invalid input. Try again:");
        }
    }
}

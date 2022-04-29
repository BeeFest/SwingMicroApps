package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ConvertIntHex extends JFrame implements ActionListener {
    JLabel display = new JLabel("Input number to convert: ");
    JTextField input = new JTextField();
    JPanel panel = new JPanel();

    public ConvertIntHex() {
        display.setFont(display.getFont().deriveFont(20.0f));
        getContentPane().add(display, BorderLayout.NORTH);

        input.setFont(input.getFont().deriveFont(80.0f));
        getContentPane().add(input, BorderLayout.CENTER);

        String[] labels = {"decimal to hexadecimal", "hexadecimal to decimal"};
        panel.setLayout(new GridLayout(1, 2));
        getContentPane().add(panel, BorderLayout.SOUTH);
        for (int i = 0; i < 2; i++) {
            JButton button = new JButton(labels[i]);
            panel.add(button);
            button.addActionListener(this);
        }
    }

    public static void main(String[] args) {
        ConvertIntHex frame = new ConvertIntHex();
        frame.setSize(400, 200);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String currentButton = e.getActionCommand();

        switch (currentButton) {
            case "decimal to hexadecimal":
                try {
                    int value1 = Integer.parseInt(input.getText());
                    display.setText("Hexadecimal = " + Integer.toHexString(value1));
                    break;
                } catch (NumberFormatException ex) {
                    display.setText("Invalid decimal. Try again:");
                }

            case "hexadecimal to decimal":
                try {
                    int value2 = Integer.parseInt(input.getText(), 16);
                    display.setText(("Decimal = " + value2));
                    break;
                } catch (NumberFormatException ex) {
                    display.setText("Invalid hexadecimal. Try again: ");
                }
        }
    }
}

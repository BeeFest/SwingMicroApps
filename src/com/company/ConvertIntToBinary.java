package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class ConvertIntToBinary extends JFrame implements ActionListener {
    JLabel display = new JLabel("Input number to convert: ");
    JTextField input = new JTextField();
    JPanel panel = new JPanel();
    JButton button = new JButton("Decimal to binary");

    public ConvertIntToBinary() {
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
        ConvertIntToBinary frame = new ConvertIntToBinary();
        frame.setSize(400, 200);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) throws NumberFormatException{
        display.setText("");
        ArrayList<Integer> binaryBuilder = new ArrayList<>();
        try {
            int number = Integer.parseInt(input.getText());
            if (number < 0) {
                throw new NumberFormatException();
            }
            while (number > 0) {
                binaryBuilder.add(number % 2);
                number = number / 2;
            }
        } catch (NumberFormatException exc) {
            display.setText("Invalid input. Fill in a positive number. ");
            throw new NumberFormatException();
        }

        String[] binaryStrings = new String[binaryBuilder.size()];

        for (int i = 0; i < binaryBuilder.size(); i++) {
            binaryStrings[i] = String.valueOf(binaryBuilder.get(i));
        }

        StringBuilder binaryResult = new StringBuilder();
        for (String bi : binaryStrings) {
            binaryResult.append(bi);
        }
        binaryResult.reverse();
        display.setText("Binary number = " + binaryResult);
    }
}
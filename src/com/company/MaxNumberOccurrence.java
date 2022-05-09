package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class MaxNumberOccurrence extends JFrame implements ActionListener {
    JLabel display = new JLabel("Fill in numbers between 0 and 9 (separate with spaces) :");
    JTextField input = new JTextField();
    JPanel panel = new JPanel();
    JButton button = new JButton("Calculate");

    public MaxNumberOccurrence() {
        display.setFont(display.getFont().deriveFont(15.0f));
        getContentPane().add(display, BorderLayout.NORTH);

        input.setFont(input.getFont().deriveFont(15.0f));
        panel.setLayout(new GridLayout(1, 2));
        getContentPane().add(panel, BorderLayout.CENTER);
        panel.add(input);
        panel.add(button);
        button.addActionListener(this);

    }

    public static void main(String[] args) {
        MaxNumberOccurrence frame = new MaxNumberOccurrence();
        frame.setSize(400, 200);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        display.setText("");
        ArrayList<Integer> numbersArray = new ArrayList<>();
        String numberString = input.getText();
        for (int i = 0; i < numberString.length(); i++) {
            if (numberString.charAt(i) == ' ') {
                continue;
            }
            numbersArray.add(Integer.parseInt(String.valueOf(numberString.charAt(i))));
        }

        int max = numbersArray.get(0);
        int count = 1;
        for (Integer number : numbersArray){
            if (number > max){
                max = number;
                count = 1;
            }else if (number == max){
                count++;
            }
        }
        display.setText("Highest number = " +max +". Counted " +count + " times.");
    }
}
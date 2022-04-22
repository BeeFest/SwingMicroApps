package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ConvertFeetToMeters extends JFrame implements ActionListener {
    JLabel display = new JLabel("Convert feet to meter: ");
    JTextField text = new JTextField(" ");
    JButton button = new JButton("Feet -> Meters");

    public ConvertFeetToMeters(){
        display.setFont(display.getFont().deriveFont(18.0f));
        button.setPreferredSize(new Dimension(125, 50));
        button.setFont(button.getFont().deriveFont(18.0f));
        text.setFont(text.getFont().deriveFont(18.0f));
        getContentPane().add(display, BorderLayout.NORTH);
        getContentPane().add(text, BorderLayout.CENTER);
        getContentPane().add(button, BorderLayout.SOUTH);
        button.addActionListener(this);
    }
    public static void main (String[] args){
        ConvertFeetToMeters frame = new ConvertFeetToMeters();
        frame.setSize(400, 400);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        double input = Double.parseDouble(text.getText()) * 0.305;
        display.setText(input + " meter");
}}

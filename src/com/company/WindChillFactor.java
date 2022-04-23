package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WindChillFactor extends JFrame implements ActionListener {

    JLabel display = new JLabel(" ");
    JTextField textF = new JTextField("Enter temperature (lower than 10 °C)");
    JTextField textW = new JTextField("Enter wind speed (greater than 4.8 km/h");
    JButton button = new JButton("Calculate windchill factor");

    public WindChillFactor(){
        textF.setPreferredSize(new Dimension(200,50));
        textW.setPreferredSize(new Dimension(200,50));
        display.setFont(display.getFont().deriveFont(18.0f));
        button.setPreferredSize(new Dimension(125, 50));
        button.setFont(button.getFont().deriveFont(18.0f));
        textF.setFont(textF.getFont().deriveFont(10.0f));
        textW.setFont(textW.getFont().deriveFont(10.0f));
        getContentPane().add(display, BorderLayout.NORTH);
        getContentPane().add(textF, BorderLayout.WEST);
        getContentPane().add(textW, BorderLayout.EAST);
        getContentPane().add(button, BorderLayout.SOUTH);
        button.addActionListener(this);
    }
    public static void main (String[] args){
        WindChillFactor frame = new WindChillFactor();
        frame.setSize(500, 200);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        double valueF = Double.parseDouble(textF.getText());
        double valueW = Double.parseDouble(textW.getText());
        double factor = 13.12 + 0.6215 * valueF - 11.37 * Math.pow(valueW, 0.16) + 0.3965 * valueF * Math.pow(valueW, 0.16);
        double roundOff = Math.round(factor * 100.0) / 100.0;
        display.setText("Wind chill temperature: " + roundOff + " °C");
}}

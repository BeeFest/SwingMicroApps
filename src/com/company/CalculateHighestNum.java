package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculateHighestNum extends JFrame implements ActionListener
{
    JLabel display = new JLabel("Fill in a number in every field");
    JTextField number1Field = new JTextField();
    JTextField number2Field = new JTextField();
    JTextField number3Field = new JTextField();
    JButton button = new JButton("Click me!");

    public CalculateHighestNum(){
        number1Field.setPreferredSize(new Dimension(125,50));
        number2Field.setPreferredSize(new Dimension(125,50));
        number3Field.setPreferredSize(new Dimension(125,50));
        getContentPane().add(display, BorderLayout.NORTH);
        getContentPane().add(number1Field, BorderLayout.WEST);
        getContentPane().add(number2Field, BorderLayout.CENTER);
        getContentPane().add(number3Field, BorderLayout.EAST);
        getContentPane().add(button, BorderLayout.SOUTH);
        button.addActionListener(this);
    }

    public static void main (String[] args){
        CalculateHighestNum frame = new CalculateHighestNum();
        frame.setSize(400, 400);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int number1Value = Integer.parseInt(number1Field.getText());
        int number2Value = Integer.parseInt(number2Field.getText());
        int number3Value = Integer.parseInt(number3Field.getText());
        int array[] = {number1Value, number2Value, number3Value};
        int temporaryArray;
        int size = array.length;
        for(int i = 0; i<size; i++ ){
            for(int j = i+1; j<size; j++){
                if(array[i]>array[j]){
                    temporaryArray = array[i];
                    array[i] = array[j];
                    array[j] = temporaryArray;
                }
            }
        }
        display.setText("Highest number is: "+array[size-1]);

    }
}


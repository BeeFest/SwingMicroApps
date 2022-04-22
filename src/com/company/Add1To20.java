package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Add1To20 extends JFrame implements ActionListener {

    JLabel display1 = new JLabel("1+2+3+4+5+6+7+8+9+10+11+12+13+14+15+16+17+18+19+20 = ");
    JButton button = new JButton("Solution");
    JLabel display2 = new JLabel();

    public Add1To20(){
        display1.setPreferredSize(new Dimension(100,100 ));
        button.setPreferredSize(new Dimension(100,100 ));
        display2.setPreferredSize(new Dimension(100,100 ));
        getContentPane().add(display1, BorderLayout.NORTH);
        getContentPane().add(button, BorderLayout.SOUTH);
        getContentPane().add(display2, BorderLayout.CENTER);
        button.addActionListener((ActionListener) this);
    }

    public static void main (String[] args){
        Add1To20 addIntegers = new Add1To20();
        addIntegers.setSize(400, 400);
        addIntegers.setVisible(true);
        addIntegers.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        {
            int sum = 0;
            for (int index =0; index <= 20; index++)
                sum += index;
            display2.setText(String.valueOf(sum));
        }
    }
}


package com.holpapp;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class NeederForm extends JFrame {
     public NeederForm() {
        setTitle("Helper Form");
        setSize(250, 750); 
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        add(panel);
    }   
}

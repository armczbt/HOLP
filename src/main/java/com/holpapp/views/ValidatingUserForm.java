package com.holpapp.views;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class ValidatingUserForm extends JFrame {
    public ValidatingUserForm() {
        setTitle("Helper Form");
        setSize(250, 750); 
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        add(panel);
    }
}
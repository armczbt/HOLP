package com.holpapp;

import javax.swing.*;

public class NeederForm extends JFrame {
    public NeederForm() {
        JLabel label = new JLabel("Hello World!");
        add(label);
        pack();

    }

    public static void main(String[] args) {
        NeederForm neederForm = new NeederForm();
        neederForm.setVisible(true);
    }
}

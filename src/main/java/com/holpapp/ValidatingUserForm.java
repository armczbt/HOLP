package com.holpapp;

import javax.swing.*;

public class ValidatingUserForm extends JFrame {
    public ValidatingUserForm() {
        JLabel label = new JLabel("Hello World!");
        add(label);
        pack();
    }

    public static void main(String[] args) {
        ValidatingUserForm validatingUserForm = new ValidatingUserForm();
        validatingUserForm.setVisible(true);
    }
}

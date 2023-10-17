package com.holpapp;

<<<<<<< HEAD
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
=======
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ValidatingUserForm extends JFrame {
    public ValidatingUserForm() {
        setTitle("Validating User Form");
        setSize(250, 750); 
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        add(panel);
>>>>>>> 614fece085940c88984f51d268e07890f95dae00
    }
}

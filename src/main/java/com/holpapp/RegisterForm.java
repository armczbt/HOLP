package com.holpapp;
import javax.swing.*;

public class RegisterForm extends JFrame {
    public RegisterForm() {
        setTitle("Register Form");
        setSize(300, 250); 
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        add(panel);

        JLabel userLabel = new JLabel("Username:");
        JTextField userText = new JTextField(20);
        panel.add(userLabel);
        panel.add(userText);

        JLabel passwordLabel = new JLabel("Password:");
        JPasswordField passwordText = new JPasswordField(20);
        panel.add(passwordLabel);
        panel.add(passwordText);

        JLabel confirmPasswordLabel = new JLabel("Confirm Password:");
        JPasswordField confirmPasswordText = new JPasswordField(20);
        panel.add(confirmPasswordLabel);
        panel.add(confirmPasswordText);

        JLabel emailLabel = new JLabel("Email:");
        JTextField emailText = new JTextField(20);
        panel.add(emailLabel);
        panel.add(emailText);

        JButton registerButton = new JButton("Register");
        panel.add(registerButton);
    }

    public static void main(String[] args) {
        RegisterForm registerForm = new RegisterForm();
        registerForm.setVisible(true);
    }
}

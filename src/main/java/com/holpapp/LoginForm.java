package com.holpapp;
import javax.swing.*;

public class LoginForm extends JFrame {
    public LoginForm() {
        setTitle("Login Form");
        setSize(300, 200);
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

        JButton loginButton = new JButton("Login");
        panel.add(loginButton);
    }

    public static void main(String[] args) {
        LoginForm loginForm = new LoginForm();
        loginForm.setVisible(true);
    }
}
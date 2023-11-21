package com.holpapp.views;
import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HomePage {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Welcome");
        frame.setSize(300, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        frame.add(panel);

        frame.setTitle("HomePage");

        JLabel label = new JLabel("Welcome to HOLP");
        panel.add(label);

        JButton registerButton = new JButton("Register");
        panel.add(registerButton);

        JButton loginButton = new JButton("Log In");
        panel.add(loginButton);

        registerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                RegisterForm registerForm = new RegisterForm();
                registerForm.setVisible(true);
            }
        });

        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                LoginForm loginForm = new LoginForm();
                loginForm.setVisible(true);
            }
        });

        frame.setVisible(true);
    }
}

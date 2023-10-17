package com.holpapp.views;
import javax.swing.*;

import com.holpapp.controllers.DatabaseController;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;


public class RegisterForm extends JFrame {


    private JTextField nameText;
    private JTextField surnameText;
    private JTextField birthdateText;
    private JTextField emailText;
    private JTextField phoneText;
    private JTextField addressText;
    private JPasswordField passwordText;
    private JPasswordField confirmPasswordText;

    public RegisterForm() {
        setTitle("Register Form");
        setSize(250, 750); 
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        Font labelFont = new Font("Nunito", Font.BOLD, 14);

        JPanel panel = new JPanel();
        panel.setBackground(new Color(255, 255, 255, 200));
        add(panel);

        JLabel imageLabel = new JLabel(new ImageIcon("public/img/HolpLittle.png"));
        add(imageLabel, BorderLayout.NORTH);

        JLabel nameLabel = new JLabel("Name");
        nameText = new JTextField(20);
        nameLabel.setFont(labelFont);
        panel.add(nameLabel);
        panel.add(nameText);

        JLabel surnameLabel = new JLabel("Surname");
        surnameText = new JTextField(20);
        surnameLabel.setFont(labelFont);
        panel.add(surnameLabel);
        panel.add(surnameText);

        JLabel birthdateLabel = new JLabel("Birthdate (YYYY-MM-DD)");
        birthdateText = new JTextField(20);
        birthdateLabel.setFont(labelFont);
        panel.add(birthdateLabel);
        panel.add(birthdateText);

        JLabel emailLabel = new JLabel("Email");
        emailText = new JTextField(20);
        emailLabel.setFont(labelFont);
        panel.add(emailLabel);
        panel.add(emailText);

        JLabel phoneLabel = new JLabel("Phone");
        phoneText = new JTextField(20);
        phoneLabel.setFont(labelFont);
        panel.add(phoneLabel);
        panel.add(phoneText);

        JLabel addressLabel = new JLabel("Address");
        addressText = new JTextField(20);
        addressLabel.setFont(labelFont);
        panel.add(addressLabel);
        panel.add(addressText);

        JLabel passwordLabel = new JLabel("Password");
        passwordText = new JPasswordField(20);
        passwordLabel.setFont(labelFont);
        panel.add(passwordLabel);
        panel.add(passwordText);

        JLabel confirmPasswordLabel = new JLabel("Confirm password");
        confirmPasswordText = new JPasswordField(20);
        confirmPasswordLabel.setFont(labelFont);
        panel.add(confirmPasswordLabel);
        panel.add(confirmPasswordText);

        JButton registerButton = new JButton("Register");
        registerButton.setFont(labelFont);
        panel.add(registerButton);

        

        registerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = nameText.getText();
                String surname = new String(surnameText.getText());
                String birthdate = birthdateText.getText();
                String email = emailText.getText();
                String phone = phoneText.getText();
                String address = addressText.getText();
                String password = new String(passwordText.getPassword());
                String confirmPassword = new String(confirmPasswordText.getPassword());

                DatabaseController databaseController = new DatabaseController();
        
                if (password.equals(confirmPassword)) {
                    if (databaseController.insertUser(name, surname, birthdate, email, phone, address, password)) {
                        JOptionPane.showMessageDialog(null, "Successfully registered !");
                        nameText.setText("");
                        surnameText.setText("");
                        birthdateText.setText("");
                        emailText.setText("");
                        phoneText.setText("");
                        addressText.setText("");
                        passwordText.setText("");
                        confirmPasswordText.setText("");
                    } else {
                        JOptionPane.showMessageDialog(null, "Error");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Passwords are not matching", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }
    

    public static void main(String[] args) {
        RegisterForm registerForm = new RegisterForm();
        registerForm.setVisible(true);
    }
}


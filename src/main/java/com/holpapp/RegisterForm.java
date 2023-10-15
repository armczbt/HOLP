package com.holpapp;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.BorderLayout;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


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

        JPanel panel = new JPanel();
        add(panel);

        JLabel imageLabel = new JLabel(new ImageIcon("public/img/HolpLittle.png"));
        add(imageLabel, BorderLayout.NORTH);

        JLabel nameLabel = new JLabel("Name:");
        nameText = new JTextField(20);
        panel.add(nameLabel);
        panel.add(nameText);

        JLabel surnameLabel = new JLabel("Surname:");
        surnameText = new JTextField(20);
        panel.add(surnameLabel);
        panel.add(surnameText);

        JLabel birthdateLabel = new JLabel("Birthdate (YYYY-MM-DD):");
        birthdateText = new JTextField(20);
        panel.add(birthdateLabel);
        panel.add(birthdateText);

        JLabel emailLabel = new JLabel("Email:");
        emailText = new JTextField(20);
        panel.add(emailLabel);
        panel.add(emailText);

        JLabel phoneLabel = new JLabel("Phone:");
        phoneText = new JTextField(20);
        panel.add(phoneLabel);
        panel.add(phoneText);

        JLabel addressLabel = new JLabel("Address:");
        addressText = new JTextField(20);
        panel.add(addressLabel);
        panel.add(addressText);

        JLabel passwordLabel = new JLabel("Password:");
        passwordText = new JPasswordField(20);
        panel.add(passwordLabel);
        panel.add(passwordText);

        JLabel confirmPasswordLabel = new JLabel("Confirm password:");
        confirmPasswordText = new JPasswordField(20);
        panel.add(confirmPasswordLabel);
        panel.add(confirmPasswordText);

        JButton registerButton = new JButton("Register");
        panel.add(registerButton);

        // Ajout d'un ActionListener pour le bouton "Register"
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
        
                if (password.equals(confirmPassword)) {
                    // Les mots de passe correspondent, procédez à l'insertion dans la base de données
                    if (insertUserIntoDatabase(name, surname, birthdate, email, phone, address, password)) {
                        JOptionPane.showMessageDialog(null, "Successfully registered !");
                        // Réinitialisez les champs
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
                    // Les mots de passe ne correspondent pas, affichez un message d'erreur
                    JOptionPane.showMessageDialog(null, "Passwords are not matching", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }

    private boolean insertUserIntoDatabase(String name, String surname, String birthdate, String email, String phone, String address, String password) {
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://srv-bdens.insa-toulouse.fr:3306/projet_gei_008", "projet_gei_008", "ois3ohTh");

            String query = "INSERT INTO User (name, surname, birthdate, email, phone, address, password) VALUES (?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement preparedStatement = conn.prepareStatement(query);
            preparedStatement.setString(1, name);
            preparedStatement.setString(2, surname);
            preparedStatement.setString(3, birthdate);
            preparedStatement.setString(4, email);
            preparedStatement.setString(5, phone);
            preparedStatement.setString(6, address);
            preparedStatement.setString(7, password);

            int rowsInserted = preparedStatement.executeUpdate();
            conn.close();

            return rowsInserted > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static void main(String[] args) {
        RegisterForm registerForm = new RegisterForm();
        registerForm.setVisible(true);
    }
}
//>>>>>>> fb70cb4b136e53a232ac24a8062f24e6aa1d3fdd

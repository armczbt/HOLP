package com.holpapp.views;


import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.*;

public class LoginForm extends JFrame {

    private JTextField userText;
    private JPasswordField passwordText;


    public LoginForm() {
        setTitle("Login Form");
        setSize(250, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        JPanel panel = new JPanel();
        add(panel);

        JLabel imageLabel = new JLabel(new ImageIcon("public/img/HolpLittle.png"));
        add(imageLabel, BorderLayout.NORTH);

        JLabel userLabel = new JLabel("Email:");
        userText = new JTextField(20);
        panel.add(userLabel);
        panel.add(userText);

        JLabel passwordLabel = new JLabel("Password:");
        passwordText = new JPasswordField(20);
        panel.add(passwordLabel);
        panel.add(passwordText);

        JButton loginButton = new JButton("Login");
        panel.add(loginButton);

        // Ajout d'un ActionListener pour le bouton "Login"
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String email = userText.getText();
                String password = new String(passwordText.getPassword());

                if (authenticateUser(email, password)) {
                    JOptionPane.showMessageDialog(null, "Login successful!");
                } else {
                    JOptionPane.showMessageDialog(null, "Incorrect email or password");
                }
            }
        });
    }

    // Méthode pour authentifier l'utilisateur en vérifiant dans la base de données
    private boolean authenticateUser(String email, String password) {
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://srv-bdens.insa-toulouse.fr:3306/projet_gei_008", "projet_gei_008", "ois3ohTh");
            String query = "SELECT * FROM User WHERE email=? AND password=?";
            PreparedStatement preparedStatement = conn.prepareStatement(query);
            preparedStatement.setString(1, email);
            preparedStatement.setString(2, password);

            ResultSet resultSet = preparedStatement.executeQuery();
            boolean authenticated = resultSet.next(); // Vérifier si une ligne correspond

            conn.close();
            return authenticated;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static void main(String[] args) {
        LoginForm loginForm = new LoginForm();
        loginForm.setVisible(true);
    }
}

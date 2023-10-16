package com.holpapp;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.BorderLayout;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TypeUser extends JFrame {
    
    public TypeUser() {
        setTitle("Type of User");
        setSize(250, 750); 
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        add(panel);

        JLabel label = new JLabel("PLease choose the type of user you want to be :");
        panel.add(label);

        JButton helperButton = new JButton("Helper");
        panel.add(helperButton);

        JButton neederButton = new JButton("Needer");
        panel.add(neederButton);

        JButton validatingUserButton = new JButton("Validating User");
        panel.add(validatingUserButton);

        helperButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                HelperForm helperForm = new HelperForm();
                helperForm.setVisible(true);
            }
        });

        neederButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            NeederForm neederForm = new NeederForm();
            neederForm.setVisible(true);
            }
        });

        validatingUserButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            ValidatingUserFrom validatingUserFrom = new ValidatingUserFrom();
            validatingUserFrom.setVisible(true);
            }
        });

    }


}

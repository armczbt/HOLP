package com.holpapp;
import javax.swing.*;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TypeUser extends JFrame {
    

        public TypeUser() {
            setTitle("Type of User");
            setSize(500, 500);
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            setLocationRelativeTo(null);

            JPanel panel = new JPanel(new GridLayout(3, 3, 0, 0));
            panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
            add(panel);

            JLabel label = new JLabel("Please choose the type of user:");
            panel.add(label);

            ImageIcon helperIcon = new ImageIcon("public/img/Heart.webp");
            JLabel helperLabel = new JLabel(helperIcon);
            panel.add(helperLabel);

            ImageIcon neederIcon = new ImageIcon("public/img/Admin.webp");
            JLabel neederLabel = new JLabel(neederIcon);
            panel.add(neederLabel);

            ImageIcon validatingUserIcon = new ImageIcon("public/img/Admin.webp");
            JLabel validatingUserLabel = new JLabel(validatingUserIcon);
            panel.add(validatingUserLabel);

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
                    ValidatingUserForm validatingForm = new ValidatingUserForm();
                    validatingForm.setVisible(true);
                }
            });
     
    }
    public static void main(String[] args) {
        TypeUser typeUser = new TypeUser();
        typeUser.setVisible(true);
    }


}

package com.holpapp.views;
import javax.swing.*;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChoiceUserPage extends JFrame {
    

        public ChoiceUserPage() {
            setTitle("Type of User");
            setSize(500, 500);
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            setLocationRelativeTo(null);

            JPanel panel = new JPanel(new BorderLayout());
            panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
            add(panel);

            JLabel label = new JLabel("Please choose the type of user:");
            panel.add(label, BorderLayout.NORTH);

            JPanel buttonPanel = new JPanel(new FlowLayout());
            panel.add(buttonPanel, BorderLayout.CENTER);

            JButton helperButton = new JButton("Helper");
            buttonPanel.add(helperButton);

            JButton neederButton = new JButton("Needer");
            buttonPanel.add(neederButton);

            JButton validatingUserButton = new JButton("Validating User");
            buttonPanel.add(validatingUserButton);

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
        ChoiceUserPage typeUser = new ChoiceUserPage();
        typeUser.setVisible(true);
    }


}

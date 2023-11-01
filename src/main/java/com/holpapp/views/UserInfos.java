/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.holpapp.views;

import java.util.List;

import javax.swing.JOptionPane;

import com.holpapp.controllers.DatabaseController;
import com.holpapp.models.User;
import com.holpapp.views.Admin.AdminHome;
import com.holpapp.views.Helper.HelperHome;
import com.holpapp.views.Needer.NeederHome;

/**
 *
 * @author arman
 */
public class UserInfos extends javax.swing.JFrame {

    private User userSaved;
    List<String> attributes;

    /**
     * Creates new form UserInfos
     */
    public UserInfos(User user) {
        this.userSaved = user;
        this.attributes = DatabaseController.attributsGet(user);
        initComponents();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        nameLabel = new javax.swing.JLabel();
        surnameLabel = new javax.swing.JLabel();
        birthLabel = new javax.swing.JLabel();
        emailLabel = new javax.swing.JLabel();
        phoneLabel = new javax.swing.JLabel();
        addressLabel = new javax.swing.JLabel();
        passLabel = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();
        name = new javax.swing.JLabel();
        surname = new javax.swing.JLabel();
        birthdate = new javax.swing.JLabel();
        email = new javax.swing.JLabel();
        phone = new javax.swing.JLabel();
        address = new javax.swing.JLabel();
        password = new javax.swing.JLabel();
        roleLabel = new javax.swing.JLabel();
        att1Label = new javax.swing.JLabel();
        att2Label = new javax.swing.JLabel();
        role = new javax.swing.JLabel();
        att1 = new javax.swing.JLabel();
        att2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 236, 245));

        nameLabel.setFont(new java.awt.Font("Mluvka SemiBold", 0, 12)); // NOI18N
        nameLabel.setText("Name:");

        surnameLabel.setFont(new java.awt.Font("Mluvka SemiBold", 0, 12)); // NOI18N
        surnameLabel.setText("Surname:");

        birthLabel.setFont(new java.awt.Font("Mluvka SemiBold", 0, 12)); // NOI18N
        birthLabel.setText("Birthdate:");

        emailLabel.setFont(new java.awt.Font("Mluvka SemiBold", 0, 12)); // NOI18N
        emailLabel.setText("Email:");

        phoneLabel.setFont(new java.awt.Font("Mluvka SemiBold", 0, 12)); // NOI18N
        phoneLabel.setText("Phone:");

        addressLabel.setFont(new java.awt.Font("Mluvka SemiBold", 0, 12)); // NOI18N
        addressLabel.setText("Address:");

        passLabel.setFont(new java.awt.Font("Mluvka SemiBold", 0, 12)); // NOI18N
        passLabel.setText("Password:");

        backButton.setFont(new java.awt.Font("Mluvka SemiBold", 0, 14)); // NOI18N
        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        name.setFont(new java.awt.Font("Mluvka Light", 0, 12)); // NOI18N
        name.setText(userSaved.getName());

        surname.setFont(new java.awt.Font("Mluvka Light", 0, 12)); // NOI18N
        surname.setText(userSaved.getSurname());

        birthdate.setFont(new java.awt.Font("Mluvka Light", 0, 12)); // NOI18N
        birthdate.setText(userSaved.getBirthdate().toString());

        email.setFont(new java.awt.Font("Mluvka Light", 0, 12)); // NOI18N
        email.setText(userSaved.getEmail());

        phone.setFont(new java.awt.Font("Mluvka Light", 0, 12)); // NOI18N
        phone.setText(userSaved.getPhone());

        address.setFont(new java.awt.Font("Mluvka Light", 0, 12)); // NOI18N
        address.setText(userSaved.getAddress());

        password.setFont(new java.awt.Font("Mluvka Light", 0, 12)); // NOI18N
        password.setText(userSaved.getPassword());

        roleLabel.setFont(new java.awt.Font("Mluvka SemiBold", 0, 12)); // NOI18N
        roleLabel.setText("Role:");

        att1Label.setFont(new java.awt.Font("Mluvka SemiBold", 0, 12)); // NOI18N
        if(userSaved.getRole().equals("Helper")){
            att1Label.setText("Skills:");
        }
            else if(userSaved.getRole().equals("Needer")){
                att1Label.setText("Diseases:");
            }
            else if(userSaved.getRole().equals("Admin")){
                att1Label.setText("Building:");
            }else{
                att1Label.setText("Att1:");
            }
        

        att2Label.setFont(new java.awt.Font("Mluvka SemiBold", 0, 12)); // NOI18N
        if(userSaved.getRole().equals("Helper")){
            att2Label.setText("Availabilities:");
        }
            else if(userSaved.getRole().equals("Needer")){
                att2Label.setText("Availabilities:");
            }
            else if(userSaved.getRole().equals("Admin")){
                att2Label.setText("");
            }else{
                att2Label.setText("Att2:");
            }

        role.setFont(new java.awt.Font("Mluvka Light", 0, 12)); // NOI18N
        role.setText(userSaved.getRole());

        att1.setFont(new java.awt.Font("Mluvka Light", 0, 12)); // NOI18N
        att1.setText(attributes.get(0));

        att2.setFont(new java.awt.Font("Mluvka Light", 0, 12)); // NOI18N
        att2.setText(attributes.get(1));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(passLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(addressLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(address, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(phoneLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(phone, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(emailLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(nameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(29, 29, 29)
                                        .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(surnameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(surname, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(birthLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(birthdate, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(66, 66, 66)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(roleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                                    .addComponent(att2Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(att1Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(272, 272, 272)
                        .addComponent(backButton)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(role, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(att1, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                    .addComponent(att2, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameLabel)
                    .addComponent(name)
                    .addComponent(roleLabel)
                    .addComponent(role))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(surnameLabel)
                    .addComponent(surname)
                    .addComponent(att1Label)
                    .addComponent(att1))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(birthLabel)
                    .addComponent(birthdate)
                    .addComponent(att2Label)
                    .addComponent(att2))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailLabel)
                    .addComponent(email))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(phoneLabel)
                    .addComponent(phone))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addressLabel)
                    .addComponent(address))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passLabel)
                    .addComponent(password))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addComponent(backButton)
                .addGap(50, 50, 50))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
    
            if ("Helper".equals(userSaved.getRole())) {
                
                HelperHome helperHome = new HelperHome(userSaved);
                helperHome.setVisible(true);
                this.dispose();
            } else if ("Needer".equals(userSaved.getRole())) {
                
                NeederHome neederHome = new NeederHome(userSaved);
                neederHome.setVisible(true);
                this.dispose();
            } else if ("Admin".equals(userSaved.getRole())) {
               
                AdminHome adminHome = new AdminHome(userSaved);
                adminHome.setVisible(true);
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(this, "Unknown role: " + role);
            }
    }//GEN-LAST:event_backButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(UserInfos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserInfos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserInfos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserInfos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserInfos(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel address;
    private javax.swing.JLabel addressLabel;
    private javax.swing.JLabel att1;
    private javax.swing.JLabel att1Label;
    private javax.swing.JLabel att2;
    private javax.swing.JLabel att2Label;
    private javax.swing.JButton backButton;
    private javax.swing.JLabel birthLabel;
    private javax.swing.JLabel birthdate;
    private javax.swing.JLabel email;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel name;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JLabel passLabel;
    private javax.swing.JLabel password;
    private javax.swing.JLabel phone;
    private javax.swing.JLabel phoneLabel;
    private javax.swing.JLabel role;
    private javax.swing.JLabel roleLabel;
    private javax.swing.JLabel surname;
    private javax.swing.JLabel surnameLabel;
    // End of variables declaration//GEN-END:variables
}
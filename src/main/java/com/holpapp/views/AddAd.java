/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.holpapp.views;

import java.time.LocalDateTime;

import javax.swing.JOptionPane;

import com.holpapp.controllers.DatabaseController;
import com.holpapp.models.Ad;
import com.holpapp.models.User;
import com.holpapp.views.Admin.AdminHome;
import com.holpapp.views.Helper.HelperHome;
import com.holpapp.views.Needer.NeederHome;

/**
 *
 * @author arman
 */
public class AddAd extends javax.swing.JFrame {

    private User userSaved;

    /**
     * Creates new form AddAd
     */
    public AddAd(User user) {
        this.userSaved = user;
        initComponents();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        top = new javax.swing.JPanel();
        addLabel = new javax.swing.JLabel();
        bottom = new javax.swing.JPanel();
        connectedAs = new javax.swing.JLabel();
        adTitleLabel = new javax.swing.JLabel();
        adDescLabel = new javax.swing.JLabel();
        adWhenLabel = new javax.swing.JLabel();
        adWhereLabel = new javax.swing.JLabel();
        adTitle = new javax.swing.JTextField();
        adDesc = new javax.swing.JTextField();
        adWhen = new javax.swing.JTextField();
        adWhere = new javax.swing.JTextField();
        addAdButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        adWhereLabel1 = new javax.swing.JLabel();
        priority = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        top.setBackground(new java.awt.Color(255, 208, 230));

        addLabel.setFont(new java.awt.Font("Mluvka SemiBold", 1, 18)); // NOI18N
        addLabel.setText("Add an Ad");

        bottom.setBackground(new java.awt.Color(255, 236, 245));

        connectedAs.setFont(new java.awt.Font("Mluvka Medium", 0, 14)); // NOI18N
        connectedAs.setText("You're connected as a "+userSaved.getRole());

        adTitleLabel.setFont(new java.awt.Font("Mluvka Medium", 0, 14)); // NOI18N
        adTitleLabel.setText("Title:");

        adDescLabel.setFont(new java.awt.Font("Mluvka Medium", 0, 14)); // NOI18N
        adDescLabel.setText("Description :");

        adWhenLabel.setFont(new java.awt.Font("Mluvka Medium", 0, 14)); // NOI18N
        adWhenLabel.setText("When:");

        adWhereLabel.setFont(new java.awt.Font("Mluvka Medium", 0, 14)); // NOI18N
        adWhereLabel.setText("Where:");

        adTitle.setBackground(new java.awt.Color(255, 240, 245));
        adTitle.setFont(new java.awt.Font("Mluvka Medium", 0, 12)); // NOI18N
        adTitle.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(50, 50, 50)));
        adTitle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adTitleActionPerformed(evt);
            }
        });

        adDesc.setBackground(new java.awt.Color(255, 240, 245));
        adDesc.setFont(new java.awt.Font("Mluvka Medium", 0, 12)); // NOI18N
        adDesc.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(50, 50, 50)));
        adDesc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adDescActionPerformed(evt);
            }
        });

        adWhen.setBackground(new java.awt.Color(255, 240, 245));
        adWhen.setFont(new java.awt.Font("Mluvka Medium", 0, 12)); // NOI18N
        adWhen.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(50, 50, 50)));
        adWhen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adWhenActionPerformed(evt);
            }
        });

        adWhere.setBackground(new java.awt.Color(255, 240, 245));
        adWhere.setFont(new java.awt.Font("Mluvka Medium", 0, 12)); // NOI18N
        adWhere.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(50, 50, 50)));
        adWhere.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adWhereActionPerformed(evt);
            }
        });

        addAdButton.setBackground(new java.awt.Color(255, 208, 230));
        addAdButton.setFont(new java.awt.Font("Mluvka Medium", 0, 12)); // NOI18N
        addAdButton.setText("Add an ad");
        addAdButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addAdButtonActionPerformed(evt);
            }
        });

        backButton.setBackground(new java.awt.Color(255, 208, 230));
        backButton.setFont(new java.awt.Font("Mluvka Medium", 0, 12)); // NOI18N
        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        adWhereLabel1.setFont(new java.awt.Font("Mluvka Medium", 0, 14)); // NOI18N
        adWhereLabel1.setText("Priority:");

        priority.setFont(new java.awt.Font("Mluvka Medium", 0, 12)); // NOI18N
        priority.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Low", "Medium", "High" }));

        javax.swing.GroupLayout bottomLayout = new javax.swing.GroupLayout(bottom);
        bottom.setLayout(bottomLayout);
        bottomLayout.setHorizontalGroup(
            bottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bottomLayout.createSequentialGroup()
                .addGroup(bottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bottomLayout.createSequentialGroup()
                        .addGap(279, 279, 279)
                        .addComponent(connectedAs))
                    .addGroup(bottomLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(bottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(bottomLayout.createSequentialGroup()
                                .addComponent(backButton)
                                .addGap(235, 235, 235)
                                .addComponent(addAdButton))
                            .addGroup(bottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(bottomLayout.createSequentialGroup()
                                    .addComponent(adWhereLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(adWhere, javax.swing.GroupLayout.DEFAULT_SIZE, 569, Short.MAX_VALUE))
                                .addGroup(bottomLayout.createSequentialGroup()
                                    .addComponent(adWhenLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(adWhen))
                                .addGroup(bottomLayout.createSequentialGroup()
                                    .addGroup(bottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bottomLayout.createSequentialGroup()
                                            .addComponent(adDescLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                        .addGroup(bottomLayout.createSequentialGroup()
                                            .addComponent(adTitleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(58, 58, 58)))
                                    .addGroup(bottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(adTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 569, Short.MAX_VALUE)
                                        .addComponent(adDesc))))
                            .addGroup(bottomLayout.createSequentialGroup()
                                .addComponent(adWhereLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(priority, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        bottomLayout.setVerticalGroup(
            bottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bottomLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(connectedAs)
                .addGap(35, 35, 35)
                .addGroup(bottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adTitleLabel)
                    .addComponent(adTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(bottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adDescLabel)
                    .addComponent(adDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(bottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adWhenLabel)
                    .addComponent(adWhen, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(bottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adWhereLabel)
                    .addComponent(adWhere, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(bottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adWhereLabel1)
                    .addComponent(priority, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addGroup(bottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addAdButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29))
        );

        javax.swing.GroupLayout topLayout = new javax.swing.GroupLayout(top);
        top.setLayout(topLayout);
        topLayout.setHorizontalGroup(
            topLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, topLayout.createSequentialGroup()
                .addContainerGap(331, Short.MAX_VALUE)
                .addComponent(addLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(326, 326, 326))
            .addComponent(bottom, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        topLayout.setVerticalGroup(
            topLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(addLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(bottom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(top, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(top, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void adTitleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adTitleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_adTitleActionPerformed

    private void adDescActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adDescActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_adDescActionPerformed

    private void adWhenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adWhenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_adWhenActionPerformed

    private void adWhereActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adWhereActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_adWhereActionPerformed

    private void addAdButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addAdButtonActionPerformed
        LocalDateTime currentDateTime = LocalDateTime.now();
        Ad newAd = new Ad(null,userSaved.getRole(), adTitle.getText(), adDesc.getText(), adWhen.getText(), adWhere.getText(), userSaved.getId(), currentDateTime, "notChecked", null, priority.getSelectedItem().toString(),false);
        
        DatabaseController databaseController = new DatabaseController();
        boolean added = databaseController.addAd(newAd);

        if (added) {
        
            JOptionPane.showMessageDialog(this, "Ad added successfully.");
            String role = userSaved.getRole();
    
            if ("Helper".equals(role)) {
               
                HelperHome helperHome = new HelperHome(userSaved);
                helperHome.setVisible(true);
                this.dispose();
            } else if ("Needer".equals(role)) {
                NeederHome neederHome = new NeederHome(userSaved);
                neederHome.setVisible(true);
                this.dispose();
            } else if ("Admin".equals(role)) {
               
                AdminHome adminHome = new AdminHome(userSaved);
                adminHome.setVisible(true);
                this.dispose();
            }
        } else {
            
            JOptionPane.showMessageDialog(this, "Failed to add Ad. Please check your input.");
        }

    }//GEN-LAST:event_addAdButtonActionPerformed

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
            JOptionPane.showMessageDialog(this, "Unknown role: " + userSaved.getRole());
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
            java.util.logging.Logger.getLogger(AddAd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddAd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddAd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddAd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddAd(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField adDesc;
    private javax.swing.JLabel adDescLabel;
    private javax.swing.JTextField adTitle;
    private javax.swing.JLabel adTitleLabel;
    private javax.swing.JTextField adWhen;
    private javax.swing.JLabel adWhenLabel;
    private javax.swing.JTextField adWhere;
    private javax.swing.JLabel adWhereLabel;
    private javax.swing.JLabel adWhereLabel1;
    private javax.swing.JButton addAdButton;
    private javax.swing.JLabel addLabel;
    private javax.swing.JButton backButton;
    private javax.swing.JPanel bottom;
    private javax.swing.JLabel connectedAs;
    private javax.swing.JComboBox<String> priority;
    private javax.swing.JPanel top;
    // End of variables declaration//GEN-END:variables
}

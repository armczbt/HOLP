/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.holpapp.views.Helper;

import javax.swing.JOptionPane;

import com.holpapp.controllers.DatabaseController;
import com.holpapp.models.Helper;
import com.holpapp.models.User;
import com.holpapp.views.LoginForm;

/**
 *
 * @author arman
 */
public class HelperForm extends javax.swing.JFrame {

    private User userSaved;
    private int sCount;
    private int aCount;

    /**
     * Creates new form NeederForm
     */
    public HelperForm(User user) {
        initComponents();
        this.userSaved = user;
        sCount=0;
        aCount=0;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        topPanel = new javax.swing.JPanel();
        titleLabel = new javax.swing.JLabel();
        bottomPanel = new javax.swing.JPanel();
        calendar = new javax.swing.JLabel();
        availabilityLabel = new javax.swing.JLabel();
        availability = new javax.swing.JTextField();
        availabilitySeparator = new javax.swing.JSeparator();
        continueButton = new javax.swing.JButton();
        imagesPanel = new javax.swing.JPanel();
        helperIcon = new javax.swing.JLabel();
        helperLabel = new javax.swing.JLabel();
        skills = new javax.swing.JTextField();
        skillsSep = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        topPanel.setBackground(new java.awt.Color(255, 208, 230));

        titleLabel.setFont(new java.awt.Font("Mluvka Bold", 0, 24)); // NOI18N
        titleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLabel.setText("You want to be a helper !");

        javax.swing.GroupLayout topPanelLayout = new javax.swing.GroupLayout(topPanel);
        topPanel.setLayout(topPanelLayout);
        topPanelLayout.setHorizontalGroup(
            topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topPanelLayout.createSequentialGroup()
                .addGap(178, 178, 178)
                .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 487, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        topPanelLayout.setVerticalGroup(
            topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topPanelLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(titleLabel)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        bottomPanel.setBackground(new java.awt.Color(255, 236, 245));

        calendar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/calendarIcon.png"))); // NOI18N

        availabilityLabel.setFont(new java.awt.Font("Mluvka Medium", 0, 14)); // NOI18N
        availabilityLabel.setText("Availabilities:");

        availability.setBackground(new java.awt.Color(255, 236, 245));
        availability.setFont(new java.awt.Font("Mluvka Light", 0, 12)); // NOI18N
        availability.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        availability.setText("Availabilities");
        availability.setBorder(null);
        availability.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                availabilityFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                availabilityFocusLost(evt);
            }
        });
        availability.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                availabilityActionPerformed(evt);
            }
        });

        availabilitySeparator.setForeground(new java.awt.Color(0, 0, 0));

        continueButton.setFont(new java.awt.Font("Mluvka Bold", 0, 12)); // NOI18N
        continueButton.setText("Continue");
        continueButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                continueButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout bottomPanelLayout = new javax.swing.GroupLayout(bottomPanel);
        bottomPanel.setLayout(bottomPanelLayout);
        bottomPanelLayout.setHorizontalGroup(
            bottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bottomPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(availabilitySeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(241, 241, 241))
            .addGroup(bottomPanelLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(bottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(continueButton, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(bottomPanelLayout.createSequentialGroup()
                        .addComponent(calendar, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(availabilityLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(availability, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        bottomPanelLayout.setVerticalGroup(
            bottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bottomPanelLayout.createSequentialGroup()
                .addGroup(bottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bottomPanelLayout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addGroup(bottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(availabilityLabel)
                            .addComponent(availability, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(availabilitySeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bottomPanelLayout.createSequentialGroup()
                        .addContainerGap(64, Short.MAX_VALUE)
                        .addComponent(calendar, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addComponent(continueButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        imagesPanel.setBackground(new java.awt.Color(255, 236, 245));
        imagesPanel.setPreferredSize(new java.awt.Dimension(824, 170));

        helperIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/helperIcon.png"))); // NOI18N

        helperLabel.setFont(new java.awt.Font("Mluvka Medium", 0, 14)); // NOI18N
        helperLabel.setText("Skills (describe your skills)");

        skills.setBackground(new java.awt.Color(255, 236, 245));
        skills.setFont(new java.awt.Font("Mluvka Light", 0, 12)); // NOI18N
        skills.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        skills.setText("Skills");
        skills.setBorder(null);
        skills.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                skillsFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                skillsFocusLost(evt);
            }
        });

        skillsSep.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout imagesPanelLayout = new javax.swing.GroupLayout(imagesPanel);
        imagesPanel.setLayout(imagesPanelLayout);
        imagesPanelLayout.setHorizontalGroup(
            imagesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(imagesPanelLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(helperIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(imagesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(imagesPanelLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(helperLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(skills, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(148, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, imagesPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(skillsSep, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(245, 245, 245))))
        );
        imagesPanelLayout.setVerticalGroup(
            imagesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, imagesPanelLayout.createSequentialGroup()
                .addGap(0, 69, Short.MAX_VALUE)
                .addComponent(helperIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, imagesPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(imagesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(helperLabel)
                    .addComponent(skills, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(skillsSep, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(imagesPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 961, Short.MAX_VALUE)
            .addComponent(topPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(bottomPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(topPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(imagesPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(bottomPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void availabilityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_availabilityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_availabilityActionPerformed

    private void skillsFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_skillsFocusGained
        if(sCount==0){
            skills.setText("");
        }
        sCount++;
    }//GEN-LAST:event_skillsFocusGained

    private void availabilityFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_availabilityFocusGained
        if(aCount==0){
            availability.setText("");
        }
        aCount++;
    }//GEN-LAST:event_availabilityFocusGained

    private void skillsFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_skillsFocusLost
        if(skills.getText().isEmpty()){
            skills.setText("Skills");
            sCount=0;
       }
    }//GEN-LAST:event_skillsFocusLost

    private void availabilityFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_availabilityFocusLost
        if(availability.getText().isEmpty()){
            availability.setText("Availabilities");
            aCount=0;
       }
    }//GEN-LAST:event_availabilityFocusLost

    private void continueButtonActionPerformed(java.awt.event.ActionEvent evt) {
        String skills2 = skills.getText();
        String availabilities = availability.getText();
    
        Helper helper = new Helper(userSaved, skills2, availabilities);
    
        if (!userSaved.getEmail().isEmpty() && !skills2.isEmpty() && !availabilities.isEmpty()) {
            DatabaseController databaseController = new DatabaseController();
    
            boolean added = databaseController.addHelper(helper);
    
            if (added) {
                JOptionPane.showMessageDialog(this, "Helper added successfully.");
                LoginForm loginForm = new LoginForm();
                loginForm.setVisible(true);
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(this, "Failed to add Helper. Please check your input.");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Please fill in all the required fields.");
        }
    }
    //GEN-LAST:event_continueButtonActionPerformed

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
            java.util.logging.Logger.getLogger(HelperForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HelperForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HelperForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HelperForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HelperForm(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField availability;
    private javax.swing.JLabel availabilityLabel;
    private javax.swing.JSeparator availabilitySeparator;
    private javax.swing.JPanel bottomPanel;
    private javax.swing.JLabel calendar;
    private javax.swing.JButton continueButton;
    private javax.swing.JLabel helperIcon;
    private javax.swing.JLabel helperLabel;
    private javax.swing.JPanel imagesPanel;
    private javax.swing.JTextField skills;
    private javax.swing.JSeparator skillsSep;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JPanel topPanel;
    // End of variables declaration//GEN-END:variables
}

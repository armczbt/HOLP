/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.holpapp.views.Needer;


import java.awt.Dimension;
import java.util.List;

import javax.swing.Box;
import javax.swing.JLabel;

import com.holpapp.components.adComp;
import com.holpapp.controllers.DatabaseController;
import com.holpapp.models.Ad;
import com.holpapp.models.User;
import com.holpapp.views.AddAd;
import com.holpapp.views.UserInfos;

import net.miginfocom.swing.MigLayout;

/**
 *
 * @author arman
 */
public class NeederHome extends javax.swing.JFrame {

    private User userSaved;
    private List<Ad> ads;


    /**
     * Creates new form NeederForm
     */
    public NeederHome(User user) {
        this.userSaved = user;
        DatabaseController databaseController = new DatabaseController();
        this.ads = databaseController.getHelperAds();
        initComponents();

        adList.setLayout(new MigLayout("fillx, wrap 1", "center", ""));

        for (Ad ad : ads) {
            if (ad.getValidation().equals("1")&&(ad.getBeneficiary()==0)) {
                adComp adComp = new adComp(ad,userSaved);
                adList.add(Box.createRigidArea(new Dimension(0, 15))); 
                adList.add(adComp, "growx");
            }
        }

        bottomPanel.getVerticalScrollBar().setUnitIncrement(50);
       
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
        infoButton = new javax.swing.JButton();
        midPanel = new javax.swing.JPanel();
        herearelabel = new javax.swing.JLabel();
        addAdButton = new javax.swing.JButton();
        refButton = new javax.swing.JButton();
        bottomPanel = new javax.swing.JScrollPane();
        adList = new javax.swing.JPanel();
        adListSep = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        topPanel.setBackground(new java.awt.Color(255, 208, 230));

        titleLabel.setFont(new java.awt.Font("Mluvka Bold", 0, 24)); // NOI18N
        titleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLabel.setText("Hello "+userSaved.getName()+" !");

        infoButton.setBackground(new java.awt.Color(255, 236, 245));
        infoButton.setFont(new java.awt.Font("Mluvka Medium", 0, 12)); // NOI18N
        infoButton.setText("My infos");
        infoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                infoButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout topPanelLayout = new javax.swing.GroupLayout(topPanel);
        topPanel.setLayout(topPanelLayout);
        topPanelLayout.setHorizontalGroup(
            topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 487, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(infoButton)
                .addGap(30, 30, 30))
        );
        topPanelLayout.setVerticalGroup(
            topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topPanelLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(infoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(titleLabel))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        midPanel.setBackground(new java.awt.Color(255, 236, 245));

        herearelabel.setFont(new java.awt.Font("Mluvka SemiBold", 0, 14)); // NOI18N
        herearelabel.setText("Here are the latest helper ads:");

        addAdButton.setBackground(new java.awt.Color(255, 208, 230));
        addAdButton.setFont(new java.awt.Font("Mluvka Medium", 0, 12)); // NOI18N
        addAdButton.setText("Add an ad");
        addAdButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addAdButtonActionPerformed(evt);
            }
        });

        refButton.setBackground(new java.awt.Color(255, 208, 230));
        refButton.setFont(new java.awt.Font("Mluvka Medium", 0, 12)); // NOI18N
        refButton.setText("Refresh the list");
        refButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout midPanelLayout = new javax.swing.GroupLayout(midPanel);
        midPanel.setLayout(midPanelLayout);
        midPanelLayout.setHorizontalGroup(
            midPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(midPanelLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(refButton)
                .addGap(121, 121, 121)
                .addComponent(herearelabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(addAdButton)
                .addGap(26, 26, 26))
        );
        midPanelLayout.setVerticalGroup(
            midPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(midPanelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(midPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(herearelabel)
                    .addComponent(addAdButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(refButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        bottomPanel.setBackground(new java.awt.Color(255, 236, 245));
        bottomPanel.setBorder(null);

        adList.setBackground(new java.awt.Color(255, 236, 245));

        adListSep.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout adListLayout = new javax.swing.GroupLayout(adList);
        adList.setLayout(adListLayout);
        adListLayout.setHorizontalGroup(
            adListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(adListLayout.createSequentialGroup()
                .addGap(223, 223, 223)
                .addComponent(adListSep, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(251, Short.MAX_VALUE))
        );
        adListLayout.setVerticalGroup(
            adListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(adListLayout.createSequentialGroup()
                .addComponent(adListSep, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 541, Short.MAX_VALUE))
        );

        bottomPanel.setViewportView(adList);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(topPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(midPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(bottomPanel)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(topPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(midPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(bottomPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 535, Short.MAX_VALUE))
        );

        bottomPanel.getVerticalScrollBar().setUnitIncrement(50);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void infoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_infoButtonActionPerformed
        UserInfos userInfos = new UserInfos(userSaved);
        userInfos.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_infoButtonActionPerformed

    private void addAdButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addAdButtonActionPerformed
        AddAd addAd = new AddAd(userSaved);
        addAd.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_addAdButtonActionPerformed

    private void refButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refButtonActionPerformed
        adList.removeAll();
        DatabaseController databaseController = new DatabaseController();
        this.ads = databaseController.getHelperAds();
        // Ajoutez les nouvelles annonces
        for (Ad ad : ads) {
            if (ad.getValidation().equals("1") && (ad.getBeneficiary() == 0)) {
                adComp adComp = new adComp(ad, userSaved);
                adList.add(Box.createRigidArea(new Dimension(0, 15)));
                adList.add(adComp, "growx");
            }
        }
        validate();
        repaint();
    }//GEN-LAST:event_refButtonActionPerformed

    
                                                  

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
            java.util.logging.Logger.getLogger(NeederHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NeederHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NeederHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NeederHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NeederHome(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel adList;
    private javax.swing.JSeparator adListSep;
    private javax.swing.JButton addAdButton;
    private javax.swing.JScrollPane bottomPanel;
    private javax.swing.JLabel herearelabel;
    private javax.swing.JButton infoButton;
    private javax.swing.JPanel midPanel;
    private javax.swing.JButton refButton;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JPanel topPanel;
    // End of variables declaration//GEN-END:variables
}

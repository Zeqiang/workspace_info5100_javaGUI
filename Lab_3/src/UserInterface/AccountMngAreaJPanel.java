/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface;

import Bussiness.AccountDirectory;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author Eric
 */
public class AccountMngAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form AccountMngAreaJPanel
     */

    private JPanel processJPanel;
    private AccountDirectory accountDirectory;
    
    public AccountMngAreaJPanel(JPanel processJPanel, AccountDirectory accountDirectory) {
        initComponents();
        this.processJPanel = processJPanel;
        this.accountDirectory = accountDirectory;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CreateAccountBtn = new javax.swing.JButton();
        ManageAccountBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 204, 204));

        CreateAccountBtn.setText("Cteate Account");
        CreateAccountBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateAccountBtnActionPerformed(evt);
            }
        });

        ManageAccountBtn.setText("Manage Account");
        ManageAccountBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ManageAccountBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CreateAccountBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ManageAccountBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(493, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(CreateAccountBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ManageAccountBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(150, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void CreateAccountBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateAccountBtnActionPerformed
        // TODO add your handling code here:
        CreateAccountJPanel cajp = new CreateAccountJPanel(processJPanel , accountDirectory);
        processJPanel.add("CreateAccountJPanel" , cajp);
        CardLayout layout = (CardLayout)processJPanel.getLayout();
        layout.next(processJPanel);  
    }//GEN-LAST:event_CreateAccountBtnActionPerformed

    private void ManageAccountBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ManageAccountBtnActionPerformed
        // TODO add your handling code here:
        ManageAccountJPanel majp = new ManageAccountJPanel(processJPanel , accountDirectory);
        processJPanel.add("ManageAccountJPanel" , majp);
        CardLayout layout = (CardLayout)processJPanel.getLayout();
        layout.next(processJPanel); 
    }//GEN-LAST:event_ManageAccountBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CreateAccountBtn;
    private javax.swing.JButton ManageAccountBtn;
    // End of variables declaration//GEN-END:variables
}
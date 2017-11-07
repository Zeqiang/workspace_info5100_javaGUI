/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.Lab.Admin;

import Interface.Company.Admin.*;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Interface.SystemAdmin.ManageNetwork;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Eric
 */
public class LabAdminWorkArea extends javax.swing.JPanel {

    /**
     * Creates new form CompanyAdminWorkArea
     */
    JPanel processContainer;
    Enterprise enterprise;
    
    public LabAdminWorkArea(JPanel processContainer, Enterprise enterprise) {
        initComponents();
        
        this.processContainer = processContainer;
        this.enterprise = enterprise;
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        EmployeeMgtBtn = new javax.swing.JButton();
        UseraccountMgtBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("American Typewriter", 1, 24)); // NOI18N
        jLabel1.setText("Lab Admin WorkArea");

        EmployeeMgtBtn.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        EmployeeMgtBtn.setText("Employee Management");
        EmployeeMgtBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmployeeMgtBtnActionPerformed(evt);
            }
        });

        UseraccountMgtBtn.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        UseraccountMgtBtn.setText("Useraccount Management");
        UseraccountMgtBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UseraccountMgtBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(403, 403, 403)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(EmployeeMgtBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(UseraccountMgtBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(420, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1)
                .addGap(172, 172, 172)
                .addComponent(EmployeeMgtBtn)
                .addGap(160, 160, 160)
                .addComponent(UseraccountMgtBtn)
                .addContainerGap(228, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void EmployeeMgtBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmployeeMgtBtnActionPerformed
        // TODO add your handling code here:
        ManageEmployee_lab manageEmployee_lab = new ManageEmployee_lab(processContainer, enterprise);
        processContainer.add("ManageEmployee_lab", manageEmployee_lab);
        CardLayout layout = (CardLayout) processContainer.getLayout();
        layout.next(processContainer);
    }//GEN-LAST:event_EmployeeMgtBtnActionPerformed

    private void UseraccountMgtBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UseraccountMgtBtnActionPerformed
        // TODO add your handling code here:
        ManageUserAccount_lab manageUserAccount_lab = new ManageUserAccount_lab(processContainer, enterprise);
        processContainer.add("ManageUserAccount_lab", manageUserAccount_lab);
        CardLayout layout = (CardLayout) processContainer.getLayout();
        layout.next(processContainer);
    }//GEN-LAST:event_UseraccountMgtBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton EmployeeMgtBtn;
    private javax.swing.JButton UseraccountMgtBtn;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
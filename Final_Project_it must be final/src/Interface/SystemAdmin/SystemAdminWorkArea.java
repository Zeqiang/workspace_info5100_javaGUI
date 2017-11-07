/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.SystemAdmin;

import Business.EcoSystem;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author Eric
 */
public class SystemAdminWorkArea extends javax.swing.JPanel {

    /**
     * Creates new form SystemAdminWorkArea
     */
    JPanel processContainer;
    EcoSystem system;
    
    public SystemAdminWorkArea(JPanel processContainer, EcoSystem system) {
        initComponents();
        
        this.processContainer = processContainer;
        this.system = system;
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
        ManageNetworkBtn = new javax.swing.JButton();
        ManageEnterpriseBtn = new javax.swing.JButton();
        ManageAdminBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("American Typewriter", 1, 24)); // NOI18N
        jLabel1.setText("System Admin WorkArea");

        ManageNetworkBtn.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        ManageNetworkBtn.setText("Network Management");
        ManageNetworkBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ManageNetworkBtnActionPerformed(evt);
            }
        });

        ManageEnterpriseBtn.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        ManageEnterpriseBtn.setText("Enterprise Management");
        ManageEnterpriseBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ManageEnterpriseBtnActionPerformed(evt);
            }
        });

        ManageAdminBtn.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        ManageAdminBtn.setText("Enterprise Admin Management");
        ManageAdminBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ManageAdminBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel1)
                .addContainerGap(786, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ManageAdminBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ManageEnterpriseBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ManageNetworkBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(391, 391, 391))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel1)
                .addGap(115, 115, 115)
                .addComponent(ManageNetworkBtn)
                .addGap(96, 96, 96)
                .addComponent(ManageEnterpriseBtn)
                .addGap(96, 96, 96)
                .addComponent(ManageAdminBtn)
                .addContainerGap(236, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void ManageNetworkBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ManageNetworkBtnActionPerformed
        // TODO add your handling code here:
        ManageNetwork manageNetwork = new ManageNetwork(processContainer, system);
        processContainer.add("ManageNetwork", manageNetwork);
        CardLayout layout = (CardLayout) processContainer.getLayout();
        layout.next(processContainer);
    }//GEN-LAST:event_ManageNetworkBtnActionPerformed

    private void ManageEnterpriseBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ManageEnterpriseBtnActionPerformed
        // TODO add your handling code here:
        ManageEnterprise manageEnterprise = new ManageEnterprise(processContainer, system);
        processContainer.add("ManageEnterprise", manageEnterprise);
        CardLayout layout = (CardLayout) processContainer.getLayout();
        layout.next(processContainer);
    }//GEN-LAST:event_ManageEnterpriseBtnActionPerformed

    private void ManageAdminBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ManageAdminBtnActionPerformed
        // TODO add your handling code here:
        ManageEnterpriseAdmin manageEnterpriseAdmin = new ManageEnterpriseAdmin(processContainer, system);
        processContainer.add("ManageEnterpriseAdmin", manageEnterpriseAdmin);
        CardLayout layout = (CardLayout) processContainer.getLayout();
        layout.next(processContainer);
    }//GEN-LAST:event_ManageAdminBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ManageAdminBtn;
    private javax.swing.JButton ManageEnterpriseBtn;
    private javax.swing.JButton ManageNetworkBtn;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
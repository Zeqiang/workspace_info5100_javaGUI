/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.supplier;

import Business.Supplier;
import Business.SupplierDirectory;
import java.awt.CardLayout;
import javax.swing.JPanel;
import userInterface.admin.*;
import userInterface.*;

/**
 *
 * @author Eric
 */
public class SupplierWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageWorkAreaJPanel
     */
    JPanel processContainer;
    Supplier supplier;
    
    public SupplierWorkAreaJPanel(JPanel processContainer , Supplier supplier) {
        initComponents();
        this.processContainer = processContainer;
        this.supplier = supplier;
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
        ManageBtn = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("PingFang HK", 1, 24)); // NOI18N
        jLabel1.setText("Supplier Work Area");

        ManageBtn.setText("Manage ProductCatalog >>");
        ManageBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ManageBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(253, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ManageBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(245, 245, 245))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addGap(52, 52, 52)
                .addComponent(ManageBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(474, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void ManageBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ManageBtnActionPerformed
        // TODO add your handling code here:
        ManageProductJPanel mpjp = new ManageProductJPanel(processContainer , supplier);
        processContainer.add("ManageProductJPanel" , mpjp);
        CardLayout layout = (CardLayout) processContainer.getLayout();
        layout.next(processContainer);
    }//GEN-LAST:event_ManageBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ManageBtn;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.admin;

import bussiness.Supplier;
import bussiness.SupplierDirectory;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import userInterface.*;

/**
 *
 * @author Eric
 */
public class AddSupplierJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateJPanel
     */
    JPanel processContainer;
    SupplierDirectory supplierDirectory;
    
    public AddSupplierJPanel(JPanel processContainer , SupplierDirectory supplierDirectory) {
        initComponents();
        this.processContainer = processContainer;
        this.supplierDirectory = supplierDirectory;
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
        jLabel2 = new javax.swing.JLabel();
        SupplierNameTextF = new javax.swing.JTextField();
        AddSupplierBtn = new javax.swing.JButton();
        BackBtn = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("PingFang HK", 1, 24)); // NOI18N
        jLabel1.setText("Add New Supplier");

        jLabel2.setText("Supplier Name :");

        AddSupplierBtn.setText("Add");
        AddSupplierBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddSupplierBtnActionPerformed(evt);
            }
        });

        BackBtn.setText("<Back");
        BackBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(248, 248, 248))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(163, 163, 163)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SupplierNameTextF, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(BackBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(AddSupplierBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(193, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel1)
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(SupplierNameTextF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(139, 139, 139)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BackBtn)
                    .addComponent(AddSupplierBtn))
                .addContainerGap(182, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void BackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackBtnActionPerformed
        // TODO add your handling code here:
        processContainer.remove(this);
        
        Component[] componentArray = processContainer.getComponents();
        Component component = componentArray[componentArray.length-1];
        ManageSupplierJPanel msjp = (ManageSupplierJPanel) component;
        msjp.populateTable();
        
        CardLayout layout = (CardLayout)processContainer.getLayout();
        layout.previous(processContainer);
    }//GEN-LAST:event_BackBtnActionPerformed

    private void AddSupplierBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddSupplierBtnActionPerformed
        // TODO add your handling code here:
        String supplierName = SupplierNameTextF.getText();
        Supplier supplier = supplierDirectory.searchSupplier(supplierName);
        if(supplier == null){
            supplier = supplierDirectory.addSupplier();
            supplier.setSupplierName(supplierName);
            
            JOptionPane.showMessageDialog(null, "Suplier add Successfully", "Informetion", JOptionPane.INFORMATION_MESSAGE);
            SupplierNameTextF.setText("");
        }else{
            JOptionPane.showMessageDialog(null, "Suplier exists", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_AddSupplierBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddSupplierBtn;
    private javax.swing.JButton BackBtn;
    private javax.swing.JTextField SupplierNameTextF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}

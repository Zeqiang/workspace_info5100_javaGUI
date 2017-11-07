/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.supplier;

import Business.Product;
import Business.Supplier;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import jdk.nashorn.internal.scripts.JO;
import userInterface.admin.*;
import userInterface.*;

/**
 *
 * @author Eric
 */
public class SearchProductJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageWorkAreaJPanel
     */
    JPanel processContainer;
    Supplier supplier;
    
    public SearchProductJPanel(JPanel processContainer , Supplier supplier) {
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
        jLabel2 = new javax.swing.JLabel();
        NumberTextF = new javax.swing.JTextField();
        SearchBtn = new javax.swing.JButton();
        BackBtn = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("PingFang HK", 1, 24)); // NOI18N
        jLabel1.setText("Search For Product");

        jLabel2.setText("Product ID :");

        SearchBtn.setText("Search Now >>");
        SearchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchBtnActionPerformed(evt);
            }
        });

        BackBtn.setText("< Back");
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
                .addGap(157, 157, 157)
                .addComponent(jLabel2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(230, 230, 230))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(NumberTextF, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SearchBtn)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addComponent(BackBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel1)
                .addGap(84, 84, 84)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(NumberTextF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SearchBtn))
                .addGap(93, 93, 93)
                .addComponent(BackBtn)
                .addContainerGap(324, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void BackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackBtnActionPerformed
        // TODO add your handling code here:
        processContainer.remove(this);
        
//        Component[] componentArray = processContainer.getComponents();
//        Component component = componentArray[componentArray.length-1];
//        ManageProductJPanel mpjp = (ManageProductJPanel) component;
//        mpjp.refreshTable();
        
        CardLayout layout = (CardLayout)processContainer.getLayout();
        layout.previous(processContainer);
    }//GEN-LAST:event_BackBtnActionPerformed

    private void SearchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchBtnActionPerformed
        // TODO add your handling code here:
        int productId = Integer.parseInt(NumberTextF.getText());
        try{
            Product product = supplier.getProductCatalog().searchProduct(productId);
        
            ProductDetailJPanel pdjp = new ProductDetailJPanel(processContainer , product);
            processContainer.add("ProductDetailJPanel" , pdjp);
            CardLayout layout = (CardLayout)processContainer.getLayout();
            layout.next(processContainer);
        }catch(Exception ee){
            JOptionPane.showMessageDialog(null, "Could not find any product", "Information", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_SearchBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackBtn;
    private javax.swing.JTextField NumberTextF;
    private javax.swing.JButton SearchBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
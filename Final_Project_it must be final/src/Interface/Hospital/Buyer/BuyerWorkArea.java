/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.Hospital.Buyer;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.HospitalEnterprise;
import Business.Network.Network;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Eric
 */
public class BuyerWorkArea extends javax.swing.JPanel {

    /**
     * Creates new form BuyerWorkArea
     */
    JPanel processContainer;
    Network network;
    HospitalEnterprise hospitalEnterprise;
    
    public BuyerWorkArea(JPanel processContainer, Network network, HospitalEnterprise hospitalEnterprise) {
        initComponents();
        
        this.processContainer = processContainer;
        this.network = network;
        this.hospitalEnterprise = hospitalEnterprise;
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
        BrowseBtn = new javax.swing.JButton();
        OrderBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("American Typewriter", 1, 24)); // NOI18N
        jLabel1.setText("Hospital(Buyer) WorkArea");

        BrowseBtn.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        BrowseBtn.setText("Browse Medicine >>");
        BrowseBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BrowseBtnActionPerformed(evt);
            }
        });

        OrderBtn.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        OrderBtn.setText("View Orders >>");
        OrderBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OrderBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(407, 407, 407)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(OrderBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BrowseBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(444, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1)
                .addGap(133, 133, 133)
                .addComponent(BrowseBtn)
                .addGap(134, 134, 134)
                .addComponent(OrderBtn)
                .addContainerGap(293, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void BrowseBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BrowseBtnActionPerformed
        // TODO add your handling code here:
        BrowseMedicine browseMedicine = new BrowseMedicine(processContainer, network, hospitalEnterprise);
        processContainer.add("BrowseMedicine", browseMedicine);
        CardLayout layout = (CardLayout) processContainer.getLayout();
        layout.next(processContainer);
    }//GEN-LAST:event_BrowseBtnActionPerformed

    private void OrderBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OrderBtnActionPerformed
        // TODO add your handling code here:
        ViewOrders viewOrders = new ViewOrders(processContainer, hospitalEnterprise);
        processContainer.add("ViewOrders", viewOrders);
        CardLayout layout = (CardLayout) processContainer.getLayout();
        layout.next(processContainer);
    }//GEN-LAST:event_OrderBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BrowseBtn;
    private javax.swing.JButton OrderBtn;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}

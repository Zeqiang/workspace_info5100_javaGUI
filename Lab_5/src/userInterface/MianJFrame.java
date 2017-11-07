/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface;

import Business.Business;
import Business.MasterOrderCatalog;
import Business.SupplierDirectory;
import java.awt.CardLayout;
import userInterface.admin.AdminWorkAreaJPanel;
import userInterface.customer.CustomerWorkAreaJPanel;
import userInterface.supplier.LoginJPanel;

/**
 *
 * @author Eric
 */
public class MianJFrame extends javax.swing.JFrame {

    /**
     * Creates new form MianJFrame
     */
    private SupplierDirectory supplierDirectory;
    private MasterOrderCatalog masterOrderCatalog;
    
    public MianJFrame() {
        initComponents();
        
        Business business = new Business();
        supplierDirectory = business.getSupplierDirectory();
        masterOrderCatalog = business.getMasterOrderCatalog();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SplitPane = new javax.swing.JSplitPane();
        controlJPanel = new javax.swing.JPanel();
        SupplierBtn = new javax.swing.JButton();
        AdminBtn = new javax.swing.JButton();
        CustomerBtn = new javax.swing.JButton();
        processContainer = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        SplitPane.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        SupplierBtn.setText("Supplier Entrance");
        SupplierBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SupplierBtnActionPerformed(evt);
            }
        });

        AdminBtn.setText("Administrator Entrance");
        AdminBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdminBtnActionPerformed(evt);
            }
        });

        CustomerBtn.setText("Customer Entrance");
        CustomerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CustomerBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout controlJPanelLayout = new javax.swing.GroupLayout(controlJPanel);
        controlJPanel.setLayout(controlJPanelLayout);
        controlJPanelLayout.setHorizontalGroup(
            controlJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlJPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(AdminBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                .addComponent(SupplierBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63)
                .addComponent(CustomerBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        controlJPanelLayout.setVerticalGroup(
            controlJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlJPanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(controlJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SupplierBtn)
                    .addComponent(AdminBtn)
                    .addComponent(CustomerBtn))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        SplitPane.setTopComponent(controlJPanel);

        processContainer.setLayout(new java.awt.CardLayout());
        SplitPane.setRightComponent(processContainer);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SplitPane)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SplitPane, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SupplierBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SupplierBtnActionPerformed
        // TODO add your handling code here:
        LoginJPanel lijp = new LoginJPanel(processContainer , supplierDirectory);
        processContainer.add("LoginJPanel" , lijp);
        CardLayout layout = (CardLayout) processContainer.getLayout();
        layout.next(processContainer);
    }//GEN-LAST:event_SupplierBtnActionPerformed

    private void AdminBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdminBtnActionPerformed
        // TODO add your handling code here:
        AdminWorkAreaJPanel awajp = new AdminWorkAreaJPanel(processContainer , supplierDirectory);
        processContainer.add("AdminWorkAreaJPanel" , awajp);
        CardLayout layout = (CardLayout) processContainer.getLayout();
        layout.next(processContainer);
    }//GEN-LAST:event_AdminBtnActionPerformed

    private void CustomerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CustomerBtnActionPerformed
        // TODO add your handling code here:
        CustomerWorkAreaJPanel cwajp = new CustomerWorkAreaJPanel(processContainer , supplierDirectory , masterOrderCatalog);
        processContainer.add("CustomerWorkAreaJPanel" , cwajp);
        CardLayout layout = (CardLayout) processContainer.getLayout();
        layout.next(processContainer);
    }//GEN-LAST:event_CustomerBtnActionPerformed

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
            java.util.logging.Logger.getLogger(MianJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MianJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MianJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MianJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                MianJFrame mainjf = new MianJFrame();
                mainjf.setLocationRelativeTo(null);
                mainjf.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AdminBtn;
    private javax.swing.JButton CustomerBtn;
    private javax.swing.JSplitPane SplitPane;
    private javax.swing.JButton SupplierBtn;
    private javax.swing.JPanel controlJPanel;
    private javax.swing.JPanel processContainer;
    // End of variables declaration//GEN-END:variables
}

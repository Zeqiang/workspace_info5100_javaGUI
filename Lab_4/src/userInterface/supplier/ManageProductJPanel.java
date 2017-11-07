/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.supplier;

import bussiness.Product;
import bussiness.Supplier;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import userInterface.admin.*;
import userInterface.*;

/**
 *
 * @author Eric
 */
public class ManageProductJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageWorkAreaJPanel
     */
    JPanel processContainer;
    Supplier supplier;
    
    public ManageProductJPanel(JPanel processContainer , Supplier supplier) {
        initComponents();
        this.processContainer = processContainer;
        this.supplier = supplier;
        
        SupplierNameTextF.setText(supplier.getSupplierName());
        
        refreshTable();
    }

    public void refreshTable(){
//        int rowCount = SupplierJtb.getRowCount();
        DefaultTableModel dtm = (DefaultTableModel) ProductJtb.getModel();
        dtm.setRowCount(0);
        
//        for(int i = rowCount - 1 ; i>=0 ; i--){
//            dtm.removeRow(i);
//        }
        
        for(Product product : supplier.getProductCatalog().getProductCatalog()){
            Object row[] = new Object[3];
            row[0] = product;
            row[1] = product.getModelNumber();
            row[2] = product.getPrice();
            dtm.addRow(row);
        }
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
        jScrollPane1 = new javax.swing.JScrollPane();
        ProductJtb = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        SupplierNameTextF = new javax.swing.JTextField();
        SearchBtn = new javax.swing.JButton();
        DeleteBtn = new javax.swing.JButton();
        DetailBtn = new javax.swing.JButton();
        AddBtn = new javax.swing.JButton();
        BackBtn = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("PingFang HK", 1, 24)); // NOI18N
        jLabel1.setText("Manage Product Catalog");

        ProductJtb.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ProDuct Name", "Product ID", "Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(ProductJtb);
        if (ProductJtb.getColumnModel().getColumnCount() > 0) {
            ProductJtb.getColumnModel().getColumn(0).setResizable(false);
            ProductJtb.getColumnModel().getColumn(1).setResizable(false);
            ProductJtb.getColumnModel().getColumn(2).setResizable(false);
        }

        jLabel2.setText("Supplier Name :");

        SupplierNameTextF.setEnabled(false);

        SearchBtn.setText("Search >>");
        SearchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchBtnActionPerformed(evt);
            }
        });

        DeleteBtn.setText("Delete Product");
        DeleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteBtnActionPerformed(evt);
            }
        });

        DetailBtn.setText("View Detail");
        DetailBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DetailBtnActionPerformed(evt);
            }
        });

        AddBtn.setText("Add Product");
        AddBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddBtnActionPerformed(evt);
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
            .addGroup(layout.createSequentialGroup()
                .addGap(229, 229, 229)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(205, 205, 205))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(SupplierNameTextF, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(SearchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 580, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(DeleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(DetailBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(AddBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE))))
                    .addComponent(BackBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(63, 63, 63))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(SupplierNameTextF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SearchBtn))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(DeleteBtn))
                    .addComponent(DetailBtn))
                .addGap(18, 18, 18)
                .addComponent(AddBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(BackBtn)
                .addGap(45, 45, 45))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void BackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackBtnActionPerformed
        // TODO add your handling code here:
        processContainer.remove(this);
        CardLayout layout = (CardLayout)processContainer.getLayout();
        layout.previous(processContainer);
    }//GEN-LAST:event_BackBtnActionPerformed

    private void DeleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteBtnActionPerformed
        // TODO add your handling code here:
        int selectedRow = ProductJtb.getSelectedRow();
        if(selectedRow >= 0){
            int dialogBtn = JOptionPane.YES_NO_OPTION;
            int dialogResult = JOptionPane.showConfirmDialog(null, "Do You Want to Delete the Accout?", "Warning", dialogBtn);
            if(dialogResult == JOptionPane.YES_OPTION){
                Product product = (Product)ProductJtb.getValueAt(selectedRow, 0);
                supplier.getProductCatalog().deleteProduct(product);
                refreshTable();
            }
        }else{
            JOptionPane.showMessageDialog(null, "Please Select a Row", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_DeleteBtnActionPerformed

    private void DetailBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DetailBtnActionPerformed
        // TODO add your handling code here:
        int selectedRow = ProductJtb.getSelectedRow();
        if(selectedRow >= 0){
            Product product = (Product)ProductJtb.getValueAt(selectedRow, 0);
            ProductDetailJPanel pdjp = new ProductDetailJPanel(processContainer , product);
            processContainer.add("ProductDetailJPanel" , pdjp);
            CardLayout layout = (CardLayout)processContainer.getLayout();
            layout.next(processContainer);
        }else{
            JOptionPane.showMessageDialog(null, "Please Select a Row", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_DetailBtnActionPerformed

    private void AddBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddBtnActionPerformed
        // TODO add your handling code here:
        CreateProductJPanel cpjp = new CreateProductJPanel(processContainer , supplier);
        processContainer.add("CreateProductJPanel" , cpjp);
        CardLayout layout = (CardLayout) processContainer.getLayout();
        layout.next(processContainer);
    }//GEN-LAST:event_AddBtnActionPerformed

    private void SearchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchBtnActionPerformed
        // TODO add your handling code here:
        SearchProductJPanel spjp = new SearchProductJPanel(processContainer , supplier);
        processContainer.add("SearchProductJPanel" , spjp);
        CardLayout layout = (CardLayout) processContainer.getLayout();
        layout.next(processContainer);
    }//GEN-LAST:event_SearchBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddBtn;
    private javax.swing.JButton BackBtn;
    private javax.swing.JButton DeleteBtn;
    private javax.swing.JButton DetailBtn;
    private javax.swing.JTable ProductJtb;
    private javax.swing.JButton SearchBtn;
    private javax.swing.JTextField SupplierNameTextF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}

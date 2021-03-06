/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.Hospital.Buyer;

import Business.EcoSystem;
import Business.Enterprise.CompanyEnterprise;
import Business.Enterprise.Enterprise;
import Business.Enterprise.HospitalEnterprise;
import Business.Medicine.Medicine;
import Business.Network.Network;
import Business.Order.Order;
import Business.Order.OrderItem;
import Business.Organization.Organization;
import Business.WorkQueue.MedicineTrade;
import Interface.Company.Saler.SalerMedicineDetail;
import java.awt.CardLayout;
import java.awt.Component;
import java.sql.Date;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Eric
 */
public class BrowseMedicine extends javax.swing.JPanel {

    /**
     * Creates new form BrowseMedicine
     */
    JPanel processContainer;
    Network network;
    HospitalEnterprise hospitalEnterprise;
    Order cart;
    boolean isCheckedout = false;
    
    public BrowseMedicine(JPanel processContainer, Network network, HospitalEnterprise hospitalEnterprise) {
        initComponents();
        
        this.processContainer = processContainer;
        this.network = network;
        this.hospitalEnterprise = hospitalEnterprise;      
        
        populateCombo();
        
        if(!isCheckedout){
            cart = new Order();
        }
    }
    
    private void populateCombo(){
        EnterpriseComboBox.removeAllItems();
        for(Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()){
            if (enterprise.getEnterpriseType().getValue().equals(Enterprise.EnterpriseType.MedicineCompany.getValue())){
                EnterpriseComboBox.addItem(enterprise);
            }
        }
        populateTable();
    }
    
    public void populateTable() {
        
        DefaultTableModel model = (DefaultTableModel) MedicineTable.getModel();
        model.setRowCount(0);
        
        CompanyEnterprise companyEnterprise = (CompanyEnterprise)EnterpriseComboBox.getSelectedItem();
        
        for (MedicineTrade medicineTrade : companyEnterprise.getMedicineList()) {
            Object[] row = new Object[4];
            row[0] = medicineTrade;
            row[1] = medicineTrade.getMedicine().getFunction();
            row[2] = medicineTrade.getSalePrice();
            row[3] = medicineTrade.getAvailability();
            model.addRow(row);
        }
    }
    
    public void refreshOrderTable() {
        
        DefaultTableModel model = (DefaultTableModel) OrderTable.getModel();
        model.setRowCount(0);
        
        for (OrderItem orderitem : cart.getOrderItemList()) {
            Object[] row = new Object[4];
            row[0] = orderitem;
            row[1] = orderitem.getPrice();
            row[2] = orderitem.getQuantity();
            row[3] = orderitem.getAmount();
            model.addRow(row);
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

        BackBtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        EnterpriseComboBox = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        MedicineTable = new javax.swing.JTable();
        MedicineDetailBtn = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        quantitySpinner = new javax.swing.JSpinner();
        addtoCartBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        OrderTable = new javax.swing.JTable();
        CheckOutBtn = new javax.swing.JButton();
        RemoveBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        BackBtn.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        BackBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interface/Company/Admin/back.png"))); // NOI18N
        BackBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackBtnActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("American Typewriter", 1, 24)); // NOI18N
        jLabel3.setText("Borwse Medicine");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Enterprise Medicine Catalog", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        EnterpriseComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnterpriseComboBoxActionPerformed(evt);
            }
        });

        MedicineTable.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        MedicineTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Medicine_Name", "Purpose", "Sale Price", "Avail"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(MedicineTable);

        MedicineDetailBtn.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        MedicineDetailBtn.setText("View Medicine Detail");
        MedicineDetailBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MedicineDetailBtnActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Quantity:");

        quantitySpinner.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        addtoCartBtn.setText("ADD TO CART");
        addtoCartBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addtoCartBtnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Enterprise :");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(MedicineDetailBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(quantitySpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(addtoCartBtn))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(EnterpriseComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 597, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(EnterpriseComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MedicineDetailBtn)
                    .addComponent(jLabel5)
                    .addComponent(quantitySpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addtoCartBtn))
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Shopping Cart", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        OrderTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item Name", "Price", "Quantity", "Total Amount"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(OrderTable);

        CheckOutBtn.setText("Check out");
        CheckOutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckOutBtnActionPerformed(evt);
            }
        });

        RemoveBtn.setText("Remove");
        RemoveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoveBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(RemoveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(CheckOutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 597, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RemoveBtn)
                    .addComponent(CheckOutBtn))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interface/Hospital/Buyer/shopping cart.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(BackBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(158, 158, 158))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(31, 31, 31)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BackBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void EnterpriseComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnterpriseComboBoxActionPerformed
        // TODO add your handling code here:
        populateTable();
    }//GEN-LAST:event_EnterpriseComboBoxActionPerformed

    private void MedicineDetailBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MedicineDetailBtnActionPerformed
        // TODO add your handling code here:
        int selectedRow = MedicineTable.getSelectedRow();
        if(selectedRow >= 0){
            MedicineTrade medicine = (MedicineTrade)MedicineTable.getValueAt(selectedRow, 0);
            Medicine med = medicine.getMedicine();
            SalerMedicineDetail md = new SalerMedicineDetail(processContainer , med);
            processContainer.add("SaleMedicineDetail" , md);
            CardLayout layout = (CardLayout)processContainer.getLayout();
            layout.next(processContainer);
        }else{
            JOptionPane.showMessageDialog(null, "Please Select a Row");
        }
    }//GEN-LAST:event_MedicineDetailBtnActionPerformed

    private void addtoCartBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addtoCartBtnActionPerformed
        // TODO add your handling code here:
        int selectedRow = MedicineTable.getSelectedRow();

        if(selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please Select a Row");
            return;
        }
        
        MedicineTrade medicineT = (MedicineTrade)MedicineTable.getValueAt(selectedRow, 0);
        int fetchQty = (Integer)quantitySpinner.getValue();

        if(fetchQty <= 0){
            JOptionPane.showMessageDialog(null, "Quantity cannot be less than 1");
            return;
        }

        if(fetchQty <= medicineT.getAvailability()){
            boolean alreadyPresent = false;
            
            for(OrderItem orderItem : cart.getOrderItemList()){
                if(orderItem.getMedicine() == medicineT){
                    int oldAvail = medicineT.getAvailability();
                    int newAvail = oldAvail - fetchQty;                   
                    medicineT.setAvailability(newAvail);
                    
                    orderItem.setMedicine(medicineT);
                    orderItem.setPrice(medicineT.getSalePrice());
                    orderItem.setQuantity(fetchQty + orderItem.getQuantity());
                    orderItem.setAmount(orderItem.getPrice() * orderItem.getQuantity());
                    
                    alreadyPresent = true;
                    
                    populateTable();
                    refreshOrderTable();
                    break;
                }
            }
            if(!alreadyPresent){
                int oldAvail = medicineT.getAvailability();
                int newAvail = oldAvail - fetchQty;
                medicineT.setAvailability(newAvail);
                
                cart.addMoreInOrder(medicineT, fetchQty, medicineT.getSalePrice());
                
                populateTable();
                refreshOrderTable();
            }
        }else{
            JOptionPane.showMessageDialog(null, "Quantity cannot be bigger than Availibility");
        }
    }//GEN-LAST:event_addtoCartBtnActionPerformed

    private void CheckOutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckOutBtnActionPerformed
        // TODO add your handling code here:
        if(cart.getOrderItemList().size() > 0){
            
            hospitalEnterprise.createOrder(cart);
            
            long l = System.currentTimeMillis();//得到long类型当前时间
            Date date = new Date(l);//new日期对象
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//转换提日期输出格式
            
            cart.setOrderDate(dateFormat.format(date));
            float i = 0;
            for(OrderItem oi : cart.getOrderItemList()){
                i = i + oi.getAmount();
            }
            cart.setTotalAmount(i);
            
            JOptionPane.showMessageDialog(null, "Order Placed successfully");
            
            cart = new Order();
            refreshOrderTable();
            populateTable();
            isCheckedout = true;
        }else{
            JOptionPane.showMessageDialog(null, "No Order Placed");
            return;
        }
    }//GEN-LAST:event_CheckOutBtnActionPerformed

    private void RemoveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemoveBtnActionPerformed
        int selectedRow = OrderTable.getSelectedRow();
        if(selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please Select a Row");
            return;
        }
        OrderItem oi = (OrderItem)OrderTable.getValueAt(selectedRow, 0);
        
        int oldAvail = oi.getMedicine().getAvailability();
        int oldQty = oi.getQuantity();
        int newQty = oldQty + oldAvail;
        
        oi.getMedicine().setAvailability(newQty);
        cart.removeOrderItem(oi);
        
        JOptionPane.showMessageDialog(null, "QrderItem Removed from Cart");
        
        refreshOrderTable();
        populateTable();
    }//GEN-LAST:event_RemoveBtnActionPerformed

    private void BackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackBtnActionPerformed
        // TODO add your handling code here:
        processContainer.remove(this);
        Component[] componentArray = processContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        BuyerWorkArea buyerWorkArea = (BuyerWorkArea) component;
        
        CardLayout layout = (CardLayout)processContainer.getLayout();
        layout.previous(processContainer);
    }//GEN-LAST:event_BackBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackBtn;
    private javax.swing.JButton CheckOutBtn;
    private javax.swing.JComboBox EnterpriseComboBox;
    private javax.swing.JButton MedicineDetailBtn;
    private javax.swing.JTable MedicineTable;
    private javax.swing.JTable OrderTable;
    private javax.swing.JButton RemoveBtn;
    private javax.swing.JButton addtoCartBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSpinner quantitySpinner;
    // End of variables declaration//GEN-END:variables
}

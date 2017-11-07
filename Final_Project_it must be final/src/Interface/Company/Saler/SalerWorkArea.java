/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.Company.Saler;

import Business.Enterprise.CompanyEnterprise;
import Business.Enterprise.Enterprise;
import Business.Enterprise.LabEnterprise;
import Business.Medicine.Medicine;
import Business.Network.Network;
import Business.WorkQueue.MedicineTrade;
import Business.WorkQueue.ResearchRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Eric
 */
public class SalerWorkArea extends javax.swing.JPanel {

    /**
     * Creates new form SalerWorkArea
     */
    
    JPanel processContainer;
    CompanyEnterprise enterprise;
    Network network;
    MedicineTrade medicineT;
    
    public SalerWorkArea(JPanel processContainer, CompanyEnterprise enterprise, Network network) {
        initComponents();
        
        this.processContainer = processContainer;
        this.enterprise = enterprise;
        this.network = network;
        medicineT = new MedicineTrade();
        
        populateTable();
        populateList();
        
        NameTextF.setEnabled(false);
        FloorTextF.setEnabled(false);
        SaleTextF.setEnabled(false);
        AvalTextF.setEnabled(false);
        UpdateBtn.setEnabled(true);
        SaveBtn.setEnabled(false);
        
    }
    
    public void populateTable() {
        
        DefaultTableModel model = (DefaultTableModel) MedicineTable.getModel();
        model.setRowCount(0);
        
        for(Enterprise enterprise_1 : network.getEnterpriseDirectory().getEnterpriseList()){
            if(enterprise_1.getEnterpriseType().equals(Enterprise.EnterpriseType.ResearchLab)){
                LabEnterprise labE = (LabEnterprise)enterprise_1;
                for(WorkRequest workR : labE.getWorkQueue().getWorkRequestList()){
                    ResearchRequest rer = (ResearchRequest)workR;
                    if(rer.getSponsor().equals(enterprise.getName()) && rer.getStatus().equals(WorkRequest.STATUS_7)){
                        
                        Object[] row = new Object[5];
                        row[0] = rer;
                        row[1] = rer.getMedicine().getFunction();
                        row[2] = rer.getMoneyReceive();
                        row[3] = rer.getStatus();
                        row[4] = rer.getLabName();
                        model.addRow(row);
                        
                    }
                }
            }
        }
    }
    
    public void populateList() {
        
        DefaultTableModel model = (DefaultTableModel) MedicineList.getModel();
        model.setRowCount(0);
        
        for(MedicineTrade mt : enterprise.getMedicineList()){
            Object[] row = new Object[6];
            row[0] = mt;
            row[1] = mt.getCost();
            row[2] = mt.getFloorPrice();
            row[3] = mt.getSalePrice();
            row[4] = mt.getLabName();
            row[5] = mt.getAvailability();
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

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        viewDetailBtn = new javax.swing.JButton();
        saleBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        MedicineTable = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        MedicineList = new javax.swing.JTable();
        UpdateBtn = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        NameTextF = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        FloorTextF = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        SaleTextF = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        AvalTextF = new javax.swing.JTextField();
        SaveBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("American Typewriter", 1, 24)); // NOI18N
        jLabel1.setText("Enterprise Saler WorkArea");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Avaliable Medicine Catalog", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        viewDetailBtn.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        viewDetailBtn.setText("View Medicine Detail");
        viewDetailBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewDetailBtnActionPerformed(evt);
            }
        });

        saleBtn.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        saleBtn.setText("Send to Sale List");
        saleBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saleBtnActionPerformed(evt);
            }
        });

        MedicineTable.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        MedicineTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Medicine_Name", "Applicability", "Costs", "Status", "LabName"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(MedicineTable);
        if (MedicineTable.getColumnModel().getColumnCount() > 0) {
            MedicineTable.getColumnModel().getColumn(0).setResizable(false);
            MedicineTable.getColumnModel().getColumn(1).setResizable(false);
            MedicineTable.getColumnModel().getColumn(2).setResizable(false);
            MedicineTable.getColumnModel().getColumn(3).setResizable(false);
            MedicineTable.getColumnModel().getColumn(4).setResizable(false);
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(viewDetailBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(290, 290, 290)
                        .addComponent(saleBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 597, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(viewDetailBtn)
                    .addComponent(saleBtn))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Medicine List", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        MedicineList.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        MedicineList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Medicine_Name", "Cost", "Floor Price", "Sale Price", "LabName", "Availiablity"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(MedicineList);
        if (MedicineList.getColumnModel().getColumnCount() > 0) {
            MedicineList.getColumnModel().getColumn(0).setResizable(false);
            MedicineList.getColumnModel().getColumn(1).setResizable(false);
            MedicineList.getColumnModel().getColumn(2).setResizable(false);
            MedicineList.getColumnModel().getColumn(3).setResizable(false);
            MedicineList.getColumnModel().getColumn(4).setResizable(false);
            MedicineList.getColumnModel().getColumn(5).setResizable(false);
        }

        UpdateBtn.setText("Update");
        UpdateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 597, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(UpdateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(UpdateBtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Update", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        jLabel3.setText("Medicine Name :");

        jLabel4.setText("Floor Price :");

        jLabel5.setText("Sale Price :");

        jLabel6.setText("Avaliablity :");

        SaveBtn.setText("Save");
        SaveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(AvalTextF, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SaleTextF, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(FloorTextF, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NameTextF, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(SaveBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(NameTextF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(FloorTextF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(SaleTextF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(AvalTextF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(SaveBtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interface/Company/Saler/sale.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(67, 67, 67)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(jLabel2)))))
                .addContainerGap(88, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel1)
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(8, 8, 8))
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(109, 109, 109))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void viewDetailBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewDetailBtnActionPerformed
        // TODO add your handling code here:
        int selectedRow = MedicineTable.getSelectedRow();
        if(selectedRow >= 0){
            ResearchRequest researchRequest = (ResearchRequest)MedicineTable.getValueAt(selectedRow, 0);
            Medicine med = researchRequest.getMedicine();
            SalerMedicineDetail md = new SalerMedicineDetail(processContainer , med);
            processContainer.add("SaleMedicineDetail" , md);
            CardLayout layout = (CardLayout)processContainer.getLayout();
            layout.next(processContainer);
        }else{
            JOptionPane.showMessageDialog(null, "Please Select a Row");
        }
    }//GEN-LAST:event_viewDetailBtnActionPerformed

    private void saleBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saleBtnActionPerformed
        // TODO add your handling code here:
        int selectedRow = MedicineTable.getSelectedRow();
        if(selectedRow >= 0){
            
            ResearchRequest researchRequest = (ResearchRequest)MedicineTable.getValueAt(selectedRow, 0);

            MedicineTrade Tmedicine = new MedicineTrade();            
            Tmedicine.setMedicine(researchRequest.getMedicine());
            Tmedicine.setLabName(researchRequest.getLabName());
            Tmedicine.setCost(String.valueOf(researchRequest.getMoneyReceive()));
            Tmedicine.setAvailability(0);
            
            enterprise.addMedicine(Tmedicine);
            populateList();
            
        }else{
            JOptionPane.showMessageDialog(null, "Please Select a Row");
        }
    }//GEN-LAST:event_saleBtnActionPerformed

    private void UpdateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateBtnActionPerformed
        // TODO add your handling code here:
        
        int selectedRow = MedicineList.getSelectedRow();
        if(selectedRow >= 0){
            medicineT = (MedicineTrade)MedicineList.getValueAt(selectedRow, 0);
            
            NameTextF.setText(medicineT.getMedicine().getMedicineName());
            FloorTextF.setText(String.valueOf(medicineT.getFloorPrice()));
            SaleTextF.setText(String.valueOf(medicineT.getSalePrice()));
            AvalTextF.setText(String.valueOf(medicineT.getAvailability()));
            
            NameTextF.setEnabled(false);
            FloorTextF.setEnabled(true);
            SaleTextF.setEnabled(true);
            AvalTextF.setEnabled(true);
            UpdateBtn.setEnabled(false);
            SaveBtn.setEnabled(true);
            
        }else{
            JOptionPane.showMessageDialog(null, "Please Select a Medicine");
        }
    }//GEN-LAST:event_UpdateBtnActionPerformed

    private void SaveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveBtnActionPerformed
        // TODO add your handling code here:
        
        medicineT.setFloorPrice(Float.parseFloat(FloorTextF.getText()));
        medicineT.setSalePrice(Float.parseFloat(SaleTextF.getText()));
        medicineT.setAvailability(Integer.parseInt(AvalTextF.getText()));
        
        NameTextF.setEnabled(false);
        FloorTextF.setEnabled(false);
        SaleTextF.setEnabled(false);
        AvalTextF.setEnabled(false);
        UpdateBtn.setEnabled(true);
        SaveBtn.setEnabled(false);
        
        populateList();
    }//GEN-LAST:event_SaveBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AvalTextF;
    private javax.swing.JTextField FloorTextF;
    private javax.swing.JTable MedicineList;
    private javax.swing.JTable MedicineTable;
    private javax.swing.JTextField NameTextF;
    private javax.swing.JTextField SaleTextF;
    private javax.swing.JButton SaveBtn;
    private javax.swing.JButton UpdateBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton saleBtn;
    private javax.swing.JButton viewDetailBtn;
    // End of variables declaration//GEN-END:variables
}

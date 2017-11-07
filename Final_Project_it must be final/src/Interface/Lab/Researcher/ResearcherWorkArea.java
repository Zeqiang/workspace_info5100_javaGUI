/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.Lab.Researcher;

import Business.Enterprise.Enterprise;
import Business.Enterprise.LabEnterprise;
import Business.Network.Network;
//import Business.TestMedicine.TestMedicine;
import Business.UserAccount.UserAccount;
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
public class ResearcherWorkArea extends javax.swing.JPanel {

    /**
     * Creates new form ResearcherWorkArea
     */
    JPanel processContainer;
    LabEnterprise enterprise;
    UserAccount useraccount;
    Network network;
    
    public ResearcherWorkArea(JPanel processContainer, LabEnterprise enterprise, UserAccount useraccount, Network network) {
        initComponents();
        this.processContainer= processContainer;
        this.enterprise = enterprise;
        this.useraccount = useraccount;
        this.network = network;
        
        ResearcherLabel.setText(useraccount.getEmployee().getName());
        
        populateTable();
        
    }
    public void populateTable(){
        DefaultTableModel model = (DefaultTableModel) testRequestjTable.getModel();
        model.setRowCount(0);
        
        for (WorkRequest workrequest : enterprise.getWorkQueue().getWorkRequestList()) {
            ResearchRequest s = (ResearchRequest) workrequest;
            Object[] row = new Object[5];
            row[0] = s;
            row[1] = s.getAssistantEmployee();
            row[2] = s.getVolunteermanagerEmployee();
            row[3] = s.getStatus();
            row[4] = s.getResult();
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
        CreateTestjButton = new javax.swing.JButton();
        ComfirmBtn = new javax.swing.JButton();
        contraindicationjTextField = new javax.swing.JTextField();
        userAgeConditionTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        testRequestjTable = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        ResearcherLabel = new javax.swing.JLabel();
        cerateMedicinejButton = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Researcher Work Area");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Your Work Table", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        CreateTestjButton.setText("Create Test");
        CreateTestjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateTestjButtonActionPerformed(evt);
            }
        });

        ComfirmBtn.setText("Test Confirm");
        ComfirmBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComfirmBtnActionPerformed(evt);
            }
        });

        jLabel4.setText("Contraindication:");

        testRequestjTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Medicine Name", "Assistant", "VolunteerResearcher", "Status", "Result"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(testRequestjTable);

        jLabel5.setText("Age Adaption:");

        ResearcherLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ResearcherLabel.setText("jLabel3");

        cerateMedicinejButton.setText("Create Medicine");
        cerateMedicinejButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerateMedicinejButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 671, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(contraindicationjTextField)
                            .addComponent(userAgeConditionTextField)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 532, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ComfirmBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cerateMedicinejButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CreateTestjButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(ResearcherLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jSeparator1))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ResearcherLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cerateMedicinejButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CreateTestjButton)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(contraindicationjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userAgeConditionTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addComponent(ComfirmBtn)
                .addContainerGap())
        );

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interface/Lab/Researcher/medical research3.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 14, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(31, 31, 31)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(109, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cerateMedicinejButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerateMedicinejButtonActionPerformed
        // TODO add your handling code here:
        MedicineCreate medicineCreate = new MedicineCreate(processContainer, enterprise, useraccount, network);
        processContainer.add("MedicineCreate", medicineCreate);
        CardLayout layout = (CardLayout) processContainer.getLayout();
        layout.next(processContainer);
    }//GEN-LAST:event_cerateMedicinejButtonActionPerformed

    private void CreateTestjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateTestjButtonActionPerformed
        // TODO add your handling code here:
        TestCreate testCreate = new TestCreate(processContainer, enterprise, useraccount);
        processContainer.add("TestCreate", testCreate);
        CardLayout layout = (CardLayout) processContainer.getLayout();
        layout.next(processContainer);
    }//GEN-LAST:event_CreateTestjButtonActionPerformed

    private void ComfirmBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComfirmBtnActionPerformed
        // TODO add your handling code here:
        int selectedRow = testRequestjTable.getSelectedRow();

        if(contraindicationjTextField.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Plesae Enter Contraindication");
            return;
        }
        if(userAgeConditionTextField.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Plesae Enter Age Adaption");
            return;
        }
        
        if (selectedRow >= 0) {
            ResearchRequest request = (ResearchRequest) testRequestjTable.getValueAt(selectedRow, 0);
            if(request.getStatus() == WorkRequest.STATUS_6){
                request.setStatus(WorkRequest.STATUS_7);
                request.getMedicine().setContraindication(contraindicationjTextField.getText());
                request.getMedicine().setUserAgeCondition(userAgeConditionTextField.getText());
                JOptionPane.showMessageDialog(null, "Medicine Has Moved to Company");
        }else{
            JOptionPane.showMessageDialog(null, "Please Select a Row");
        }
    }//GEN-LAST:event_ComfirmBtnActionPerformed

}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ComfirmBtn;
    private javax.swing.JButton CreateTestjButton;
    private javax.swing.JLabel ResearcherLabel;
    private javax.swing.JButton cerateMedicinejButton;
    private javax.swing.JTextField contraindicationjTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable testRequestjTable;
    private javax.swing.JTextField userAgeConditionTextField;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.Hospital;

import Entity.Center.RescueCenter;
import Entity.Hospital.PetHospital;
import Entity.Hospital.PetHospitalDirectory;
import Entity.StrayAnimal.StrayAnimal;
import Entity.System.EcoSystem;
import java.awt.CardLayout;
import java.awt.Color;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author liumingyu
 */
public class ManageHospitalJpanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageHospitalJpanel
     */
    private JPanel rightpanel;
    private EcoSystem ecoSystem;
    private PetHospital petHospital;
    
    public ManageHospitalJpanel(JPanel rightpanel, EcoSystem ecoSystem, PetHospital petHospital) {
        initComponents();
        this.rightpanel = rightpanel;
        this.ecoSystem = ecoSystem;
        this.petHospital = petHospital;
        
        populate();
    }
    
    public void populate()
    {
        int rowCount = AcceptTable.getRowCount();
        DefaultTableModel dtm = (DefaultTableModel)AcceptTable.getModel();
        jScrollPane1.getViewport().setBackground(new Color(249,246,246));
        for(int i = rowCount - 1; i >= 0; i--)
        {
            dtm.removeRow(i);
        }
        
        int rowCount1 = ProcessTable.getRowCount();
        DefaultTableModel ptm = (DefaultTableModel)ProcessTable.getModel();
        jScrollPane2.getViewport().setBackground(new Color(249,246,246));
        for(int m = rowCount1 - 1; m >= 0; m--)
        {
            ptm.removeRow(m);
        }
        
        for(StrayAnimal s : this.petHospital.getStrayanimalDir().getStrayAnimalDirectory())
        {
            if(s.getTraceStatus().toString() == "waiting")
            {
                Object row[] = new Object[dtm.getColumnCount()];
                row[0] = s;
                row[1] = s.getSpecies();
                row[2] = s.getStatus();
                row[3] = s.getTraceStatus();
            
                dtm.addRow(row);
            }
            
            else if(s.getTraceStatus().toString() == "curing")
            {
                Object row1[] = new Object[dtm.getColumnCount()];
                row1[0] = s;
                row1[1] = s.getSpecies();
                row1[2] = s.getStatus();
                row1[3] = s.getTraceStatus();
                ptm.addRow(row1);
            }
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        AcceptTable = new javax.swing.JTable();
        AcceptBtn = new javax.swing.JButton();
        RejectBtn = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        CureBtn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        ProcessTable = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(881, 614));

        jPanel1.setBackground(new java.awt.Color(249, 246, 246));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(153, 153, 153)));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interface/Hospital/Hospital.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 834, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(249, 246, 246));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(153, 153, 153)));

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 32)); // NOI18N
        jLabel2.setText("Manage Hospital Panel");

        jPanel3.setBackground(new java.awt.Color(249, 246, 246));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(153, 153, 153)));

        AcceptTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Animal ID", "Species", "Healthy Status", "Trace Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(AcceptTable);
        if (AcceptTable.getColumnModel().getColumnCount() > 0) {
            AcceptTable.getColumnModel().getColumn(0).setResizable(false);
            AcceptTable.getColumnModel().getColumn(1).setResizable(false);
            AcceptTable.getColumnModel().getColumn(2).setResizable(false);
            AcceptTable.getColumnModel().getColumn(3).setResizable(false);
        }

        AcceptBtn.setBackground(new java.awt.Color(255, 255, 255));
        AcceptBtn.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        AcceptBtn.setText("Accept");
        AcceptBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AcceptBtnActionPerformed(evt);
            }
        });

        RejectBtn.setBackground(new java.awt.Color(255, 255, 255));
        RejectBtn.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        RejectBtn.setText("Reject");
        RejectBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RejectBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(RejectBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(AcceptBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(14, 14, 14))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RejectBtn)
                    .addComponent(AcceptBtn))
                .addGap(47, 47, 47))
        );

        jPanel4.setBackground(new java.awt.Color(249, 246, 246));
        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(153, 153, 153)));

        CureBtn.setBackground(new java.awt.Color(255, 255, 255));
        CureBtn.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        CureBtn.setText("Cure");
        CureBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CureBtnActionPerformed(evt);
            }
        });

        ProcessTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Animal ID", "Species", "Healthy Status", "Trace Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(ProcessTable);
        if (ProcessTable.getColumnModel().getColumnCount() > 0) {
            ProcessTable.getColumnModel().getColumn(0).setResizable(false);
            ProcessTable.getColumnModel().getColumn(1).setResizable(false);
            ProcessTable.getColumnModel().getColumn(2).setResizable(false);
            ProcessTable.getColumnModel().getColumn(3).setResizable(false);
        }

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(CureBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(114, 114, 114))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addComponent(CureBtn)
                .addGap(48, 48, 48))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(220, 220, 220)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(37, 37, 37))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 850, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void AcceptBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AcceptBtnActionPerformed
        // TODO add your handling code here:
        int selectedRow = AcceptTable.getSelectedRow();
        
        if(selectedRow >= 0)
        {
            StrayAnimal sah = (StrayAnimal)AcceptTable.getValueAt(selectedRow, 0);
            sah.setTraceStatus("curing");
            populate();
        }
        
        else
        {
            JOptionPane.showMessageDialog(null, "Please select a Row!!");
        }
    }//GEN-LAST:event_AcceptBtnActionPerformed

    private void RejectBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RejectBtnActionPerformed
        // TODO add your handling code here:
        int selectedRow1 = AcceptTable.getSelectedRow();
        
        if(selectedRow1 >= 0)
        {   
            StrayAnimal sah1 = (StrayAnimal)AcceptTable.getValueAt(selectedRow1, 0);
            sah1.setTraceStatus("available");
            this.petHospital.getStrayanimalDir().deleteStrayAnimal(sah1);
            populate();
        }
        
        else
        {
            JOptionPane.showMessageDialog(null, "Please select a Row!!");
        }
    }//GEN-LAST:event_RejectBtnActionPerformed

    private void CureBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CureBtnActionPerformed
        // TODO add your handling code here:
        int selectedRow2 = ProcessTable.getSelectedRow();
        
        if(selectedRow2 >= 0)
        {   
            Random rand = new Random();
            int randNum = rand.nextInt(101)+0;
            if(randNum < this.petHospital.getSuccessRate()){
                StrayAnimal sah1 = (StrayAnimal)ProcessTable.getValueAt(selectedRow2, 0);    
                sah1.setTraceStatus("completed");
                sah1.setStatus("Healthy"); 
                JOptionPane.showMessageDialog(null, "SuccessRate: " + this.petHospital.getSuccessRate()+ "%, cure successfully!");
            }
            else{
                StrayAnimal sah1 = (StrayAnimal)ProcessTable.getValueAt(selectedRow2, 0);    
                sah1.setTraceStatus("available");
                JOptionPane.showMessageDialog(null, "SuccessRate: " + this.petHospital.getSuccessRate()+ "%, cure failed!");

            }
            
            populate();
        }
        
        else
        {
            JOptionPane.showMessageDialog(null, "Please select a Row!!");
        }
    }//GEN-LAST:event_CureBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AcceptBtn;
    private javax.swing.JTable AcceptTable;
    private javax.swing.JButton CureBtn;
    private javax.swing.JTable ProcessTable;
    private javax.swing.JButton RejectBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
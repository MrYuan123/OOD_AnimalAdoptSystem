/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.Admain;

import Interface.Hospital.*;
import Entity.Account.Account;
import Entity.AdopterCenter.AdopterCenter;
import Entity.AdopterCenter.AdopterCenterDirectory;
import Entity.Center.RescueCenter;
import Entity.Center.RescueCenterDirectory;
import Entity.Hospital.PetHospital;
import Entity.Hospital.PetHospitalDirectory;
import Entity.Network.Network;
import Entity.Network.NetworkDirectory;
import Entity.Organization.Organization;
import Entity.System.EcoSystem;
import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author liumingyu
 */
public class ManageEnterpriseJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageEnterpriseJPanel
     */
    private JPanel rightpanel;
    private EcoSystem ecoSystem;
    private String currentLocation;
    private String currentType;
    
    public ManageEnterpriseJPanel(JPanel rightpanel, EcoSystem ecoSystem) {
        initComponents();
        this.rightpanel = rightpanel;
        this.ecoSystem = ecoSystem;
        
        popOrganizationComboBox();
        populate();
    }
    
    public void popOrganizationComboBox()
    {
        LocationComboBox.removeAllItems();

        for (Network network : ecoSystem.getNetworkDir().getNetworkList())
        {
            LocationComboBox.addItem(network.getLocation());
        }
    }
    
    public void populate()
    {
        int rowCount = enterpriseTbl.getRowCount();
        jScrollPane1.getViewport().setBackground(new Color(249,246,246));
        DefaultTableModel dtm = (DefaultTableModel)enterpriseTbl.getModel();
        for(int i = rowCount - 1; i >= 0; i--)
        {
            dtm.removeRow(i);
        }
        
        for(Network network : this.ecoSystem.getNetworkDir().getNetworkList())
        {
            for(PetHospital petHospital : network.getEnterpriseDir().getPethospitalDir().getPetHospitalList())
            {
                Object row[] = new Object[dtm.getColumnCount()];
                row[0] = network;
                row[1] = "Pet Hospital";
                row[2] = petHospital.getName();
                row[3] = petHospital.getAddress();
                dtm.addRow(row);
            }
            
            for(RescueCenter rescueCenter : network.getEnterpriseDir().getRescuecenterDir().getRcd())
            {
                Object row[] = new Object[dtm.getColumnCount()];
                row[0] = network;
                row[1] = "Rescue Center";
                row[2] = rescueCenter.getName();
                row[3] = rescueCenter.getAddress();
                dtm.addRow(row);
            }
            
            for(AdopterCenter adopterCenter : network.getEnterpriseDir().getAdoptercenterDir().getAdopterCenterDir())
            {
                Object row[] = new Object[dtm.getColumnCount()];
                row[0] = network;
                row[1] = "Adopter Center";
                row[2] = adopterCenter.getName();
                row[3] = adopterCenter.getAddress();
                dtm.addRow(row);
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

        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        enterpriseTbl = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        AddressTxt = new javax.swing.JTextField();
        RegisterBtn = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        NameTxt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        LocationComboBox = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        BackBtn = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        TypeComboBox = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(881, 614));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(249, 246, 246));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(153, 153, 153)));

        enterpriseTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Location", "Enterprise Type", "Enterprise Name", "Enterprise Address"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(enterpriseTbl);
        if (enterpriseTbl.getColumnModel().getColumnCount() > 0) {
            enterpriseTbl.getColumnModel().getColumn(0).setResizable(false);
            enterpriseTbl.getColumnModel().getColumn(1).setResizable(false);
            enterpriseTbl.getColumnModel().getColumn(2).setResizable(false);
            enterpriseTbl.getColumnModel().getColumn(3).setResizable(false);
        }

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 631, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(122, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 860, 250));

        jPanel1.setBackground(new java.awt.Color(249, 246, 246));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(153, 153, 153)));

        jLabel2.setFont(new java.awt.Font("Mshtakan", 1, 18)); // NOI18N
        jLabel2.setText("Enterprise Address：");

        AddressTxt.setFont(new java.awt.Font("Mshtakan", 1, 18)); // NOI18N
        AddressTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddressTxtActionPerformed(evt);
            }
        });

        RegisterBtn.setBackground(new java.awt.Color(255, 255, 255));
        RegisterBtn.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        RegisterBtn.setText("Create");
        RegisterBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterBtnActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Mshtakan", 1, 18)); // NOI18N
        jLabel5.setText("Enterprise Name：");

        NameTxt.setFont(new java.awt.Font("Mshtakan", 1, 18)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Mshtakan", 1, 18)); // NOI18N
        jLabel6.setText("Location：");

        LocationComboBox.setBackground(new java.awt.Color(255, 255, 255));
        LocationComboBox.setFont(new java.awt.Font("Mshtakan", 1, 18)); // NOI18N
        LocationComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Network" }));
        LocationComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LocationComboBoxActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Apple SD Gothic Neo", 1, 36)); // NOI18N
        jLabel4.setText("Create Enterprise Panel");

        BackBtn.setBackground(new java.awt.Color(255, 255, 255));
        BackBtn.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        BackBtn.setText("Back <<");
        BackBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackBtnActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Mshtakan", 1, 18)); // NOI18N
        jLabel11.setText("Enterprise Type：");

        TypeComboBox.setBackground(new java.awt.Color(255, 255, 255));
        TypeComboBox.setFont(new java.awt.Font("Mshtakan", 1, 18)); // NOI18N
        TypeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Rescue Center", "Pet Hospital", "Adopter Center" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(BackBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(LocationComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(TypeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(NameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(RegisterBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(AddressTxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(83, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(BackBtn)))
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LocationComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AddressTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TypeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(RegisterBtn)
                .addGap(33, 33, 33))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 860, 340));
    }// </editor-fold>//GEN-END:initComponents

    private void RegisterBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisterBtnActionPerformed
        // TODO add your handling code here:
        if(NameTxt.getText().isEmpty() || AddressTxt.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Some input text is empty!");
            NameTxt.setText("");
            AddressTxt.setText("");
        }
        
        else
        {
            currentLocation = LocationComboBox.getSelectedItem().toString();
            currentType = TypeComboBox.getSelectedItem().toString();
            String name = NameTxt.getText();
            String address = AddressTxt.getText();
            if(currentType.equalsIgnoreCase("Rescue Center"))
            {
                RescueCenterDirectory rcd = ecoSystem.getNetworkDir().searchNetwork(currentLocation).getEnterpriseDir().getRescuecenterDir();
                if(rcd.searchRescueCenter(name) == null){
                    RescueCenter rescuecenter = rcd.createRescueCenter();
                    rescuecenter.setName(name);
                    rescuecenter.setAddress(address);
                }else{
                    JOptionPane.showMessageDialog(null, "Name has existed!");
                    return;
                }
                
            }

            else if(currentType.equalsIgnoreCase("Pet Hospital"))
            {
                PetHospitalDirectory phd = ecoSystem.getNetworkDir().searchNetwork(currentLocation).getEnterpriseDir().getPethospitalDir();
                if(phd.searchPetHospital(name) == null){
                    PetHospital pethospital = phd.createPetHospital();
                    pethospital.setName(name);
                    pethospital.setAddress(address);
                }else{
                    JOptionPane.showMessageDialog(null, "Name has existed!");
                    return;
                }  
            }

            else if(currentType.equalsIgnoreCase("Adopter Center"))
            {
                AdopterCenterDirectory acd = ecoSystem.getNetworkDir().searchNetwork(currentLocation).getEnterpriseDir().getAdoptercenterDir();
                if(acd.searchAdopterCenter(name) == null){
                    AdopterCenter adoptercenter = acd.createAdopterCenter();
                    adoptercenter.setName(name);
                    adoptercenter.setAddress(address);
                }else{
                    JOptionPane.showMessageDialog(null, "Name has existed!");
                    return;
                }
            }

            else
            {
                JOptionPane.showMessageDialog(null, "Please select an enterprise type!");
                return;
            }

            JOptionPane.showMessageDialog(null, "Create Enterprise Successfully!");

            NameTxt.setText("");
            AddressTxt.setText("");

            populate();
        }        
    }//GEN-LAST:event_RegisterBtnActionPerformed

    private void BackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackBtnActionPerformed
        // TODO add your handling code here:
           this.rightpanel.remove(this);
        CardLayout cardlayout =  (CardLayout)this.rightpanel.getLayout();
        cardlayout.previous(rightpanel);
    }//GEN-LAST:event_BackBtnActionPerformed

    private void LocationComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LocationComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LocationComboBoxActionPerformed

    private void AddressTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddressTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AddressTxtActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AddressTxt;
    private javax.swing.JButton BackBtn;
    private javax.swing.JComboBox<String> LocationComboBox;
    private javax.swing.JTextField NameTxt;
    private javax.swing.JButton RegisterBtn;
    private javax.swing.JComboBox<String> TypeComboBox;
    private javax.swing.JTable enterpriseTbl;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}

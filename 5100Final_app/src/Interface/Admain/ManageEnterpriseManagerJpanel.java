/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.Admain;

import Interface.Hospital.*;
import Entity.Account.Account;
import Entity.Account.AccountDirectory;
import Entity.AdopterCenter.AdopterCenter;
import Entity.AdopterCenter.AdopterCenterDirectory;
import Entity.Center.RescueCenter;
import Entity.Center.RescueCenterDirectory;
import Entity.EnterpriseDirectory.EnterpriseDirectory;
import Entity.Hospital.PetHospital;
import Entity.Hospital.PetHospitalDirectory;
import Entity.Network.Network;
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
public class ManageEnterpriseManagerJpanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageEnterpriseJPanel
     */
    private JPanel rightpanel;
    private EcoSystem ecoSystem;
    
    public ManageEnterpriseManagerJpanel(JPanel rightpanel, EcoSystem ecoSystem) {
        initComponents();
        this.rightpanel = rightpanel;
        this.ecoSystem = ecoSystem;
        
        populate();
        popOrganizationComboBox();
    }
    
    public void populate()
    {
        int rowCount = enterprisemanagerTbl.getRowCount();
        jScrollPane1.getViewport().setBackground(new Color(249,246,246));
        DefaultTableModel dtm = (DefaultTableModel) enterprisemanagerTbl.getModel();
        for(int i = rowCount - 1; i >= 0; i--)
        {
            dtm.removeRow(i);
        }
        
        for(Network network : this.ecoSystem.getNetworkDir().getNetworkList())
        {
            for(PetHospital petHospital : network.getEnterpriseDir().getPethospitalDir().getPetHospitalList())
            {
                for(Account account : petHospital.getManageraccountDir().getAccountList())
                {
                    Object row[] = new Object[dtm.getColumnCount()];
                    row[0] = network;
                    row[1] = network.getEnterpriseDir().getPethospitalDir();
                    row[2] = petHospital.getName();
                    row[3] = account.getName();
                    row[4] = account.getPassword();
                    dtm.addRow(row);
                }
            }
            
            for(RescueCenter rescueCenter : network.getEnterpriseDir().getRescuecenterDir().getRcd())
            {
                for(Account account : rescueCenter.getManageraccountDir().getAccountList())
                {
                    Object row[] = new Object[dtm.getColumnCount()];
                    row[0] = network;
                    row[1] = network.getEnterpriseDir().getRescuecenterDir();
                    row[2] = rescueCenter.getName();
                    row[3] = account.getName();
                    row[4] = account.getPassword();
                    dtm.addRow(row);
                }
            }
            
            for(AdopterCenter adopterCenter : network.getEnterpriseDir().getAdoptercenterDir().getAdopterCenterDir())
            {
                for(Account account : adopterCenter.getManageraccountDir().getAccountList())
                {
                    Object row[] = new Object[dtm.getColumnCount()];
                    row[0] = network;
                    row[1] = network.getEnterpriseDir().getAdoptercenterDir();
                    row[2] = adopterCenter.getName();
                    row[3] = account.getName();
                    row[4] = account.getPassword();
                    dtm.addRow(row);
                }
            }
        }
    }
    
    public void popOrganizationComboBox()
    {
        LocationComboBox.removeAllItems();
        LocationComboBox.addItem(null);
        for (Network network : ecoSystem.getNetworkDir().getNetworkList())
        {
            LocationComboBox.addItem(network);
        }
    }
    
    private void populateEnterpriseComboBox(Network network)
    {
        TypeComboBox.removeAllItems();
        TypeComboBox.addItem(null);
        if(!network.getEnterpriseDir().getPethospitalDir().getPetHospitalList().isEmpty())
        {
            PetHospitalDirectory petHospitalDirectory = network.getEnterpriseDir().getPethospitalDir();
            TypeComboBox.addItem(petHospitalDirectory);
        }
        
        if(!network.getEnterpriseDir().getRescuecenterDir().getRcd().isEmpty())
        {
            RescueCenterDirectory rescueCenterDirectory = network.getEnterpriseDir().getRescuecenterDir();
            TypeComboBox.addItem(rescueCenterDirectory);
        }
        
        if(!network.getEnterpriseDir().getAdoptercenterDir().getAdopterCenterDir().isEmpty())
        {
            AdopterCenterDirectory adopterCenterDirectory = network.getEnterpriseDir().getAdoptercenterDir();
            TypeComboBox.addItem(adopterCenterDirectory);
        }
    }
    
    private void populateHospitalNameComboBox(PetHospitalDirectory petHospitalDirectory)
    {
        EnterpriseNameComboBox.removeAllItems();
        if(!petHospitalDirectory.getPetHospitalList().isEmpty())
        {
            for (PetHospital petHospital : petHospitalDirectory.getPetHospitalList())
            {
                EnterpriseNameComboBox.addItem(petHospital);
            }
        }
    }
    
    private void populateRescueNameComboBox(RescueCenterDirectory rescueCenterDirectory)
    {
        EnterpriseNameComboBox.removeAllItems();
        if(!rescueCenterDirectory.getRcd().isEmpty())
        {
            for (RescueCenter rescueCenter : rescueCenterDirectory.getRcd())
            {
                EnterpriseNameComboBox.addItem(rescueCenter);
            }
        }
    }
    
    private void populateAdopterNameComboBox(AdopterCenterDirectory adopterCenterDirectory)
    {
        EnterpriseNameComboBox.removeAllItems();
        if(!adopterCenterDirectory.getAdopterCenterDir().isEmpty())
        {
            for (AdopterCenter adopterCenter : adopterCenterDirectory.getAdopterCenterDir())
            {
                EnterpriseNameComboBox.addItem(adopterCenter);
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
        enterprisemanagerTbl = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        NameTxt = new javax.swing.JTextField();
        RegisterBtn = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        LocationComboBox = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        BackBtn = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        PasswordTxt = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        RepasswordTxt = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        TypeComboBox = new javax.swing.JComboBox();
        jLabel12 = new javax.swing.JLabel();
        EnterpriseNameComboBox = new javax.swing.JComboBox();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(881, 614));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(249, 246, 246));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(153, 153, 153)));

        enterprisemanagerTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NetWork", "Enterprise Type", "Enterprise Name", "Manager Name", "Manager Password"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(enterprisemanagerTbl);
        if (enterprisemanagerTbl.getColumnModel().getColumnCount() > 0) {
            enterprisemanagerTbl.getColumnModel().getColumn(0).setResizable(false);
            enterprisemanagerTbl.getColumnModel().getColumn(1).setResizable(false);
            enterprisemanagerTbl.getColumnModel().getColumn(2).setResizable(false);
            enterprisemanagerTbl.getColumnModel().getColumn(3).setResizable(false);
            enterprisemanagerTbl.getColumnModel().getColumn(4).setResizable(false);
        }

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 642, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(115, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 860, 250));

        jPanel1.setBackground(new java.awt.Color(249, 246, 246));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(153, 153, 153)));

        jLabel2.setFont(new java.awt.Font("Mshtakan", 1, 18)); // NOI18N
        jLabel2.setText("UserName:");

        NameTxt.setFont(new java.awt.Font("Mshtakan", 1, 18)); // NOI18N
        NameTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NameTxtActionPerformed(evt);
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

        jLabel6.setFont(new java.awt.Font("Mshtakan", 1, 18)); // NOI18N
        jLabel6.setText("Location：");

        LocationComboBox.setBackground(new java.awt.Color(255, 255, 255));
        LocationComboBox.setFont(new java.awt.Font("Mshtakan", 1, 18)); // NOI18N
        LocationComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LocationComboBoxActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Apple SD Gothic Neo", 1, 36)); // NOI18N
        jLabel4.setText("Create Enterprise Manager");

        BackBtn.setBackground(new java.awt.Color(255, 255, 255));
        BackBtn.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        BackBtn.setText("Back <<");
        BackBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackBtnActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Mshtakan", 1, 18)); // NOI18N
        jLabel9.setText("Password:");

        PasswordTxt.setFont(new java.awt.Font("Mshtakan", 1, 18)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Mshtakan", 1, 18)); // NOI18N
        jLabel10.setText("Re_Password:");

        RepasswordTxt.setFont(new java.awt.Font("Mshtakan", 1, 18)); // NOI18N

        jLabel11.setFont(new java.awt.Font("Mshtakan", 1, 18)); // NOI18N
        jLabel11.setText("Enterprise Type：");

        TypeComboBox.setBackground(new java.awt.Color(255, 255, 255));
        TypeComboBox.setFont(new java.awt.Font("Mshtakan", 1, 18)); // NOI18N
        TypeComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TypeComboBoxActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Mshtakan", 1, 18)); // NOI18N
        jLabel12.setText("Enterprise Name：");

        EnterpriseNameComboBox.setBackground(new java.awt.Color(255, 255, 255));
        EnterpriseNameComboBox.setFont(new java.awt.Font("Mshtakan", 1, 18)); // NOI18N
        EnterpriseNameComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnterpriseNameComboBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(BackBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(63, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addComponent(LocationComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(18, 18, 18)
                        .addComponent(EnterpriseNameComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(18, 18, 18)
                        .addComponent(TypeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(PasswordTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(RegisterBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(RepasswordTxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(3, 3, 3)))
                .addGap(107, 107, 107))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(BackBtn)))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11)
                            .addComponent(TypeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(LocationComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(NameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(PasswordTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RepasswordTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(EnterpriseNameComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(RegisterBtn)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 860, 350));
    }// </editor-fold>//GEN-END:initComponents

    private void RegisterBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisterBtnActionPerformed
        // TODO add your handling code here:
        if(NameTxt.getText().isEmpty() || PasswordTxt.getText().isEmpty() || RepasswordTxt.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Some input text is empty!");
            NameTxt.setText("");
            PasswordTxt.setText("");
            RepasswordTxt.setText("");
        }else{
            if(!this.ecoSystem.newName(NameTxt.getText())){
                JOptionPane.showMessageDialog(null, "Username has existed!");
                return;
            }
            if(this.EnterpriseNameComboBox.getSelectedItem() == null){
                JOptionPane.showMessageDialog(null, "Please select a enterprise!");
                return; 
            }
            
            if(RepasswordTxt.getText().equals(PasswordTxt.getText())){
                Object org = this.EnterpriseNameComboBox.getSelectedItem();
                if(org instanceof PetHospital){
                    PetHospital now = (PetHospital)org;
                    Account newa = now.getManageraccountDir().createAccount();
                    newa.setName(NameTxt.getText());
                    newa.setPassword(PasswordTxt.getText());
                    
                    JOptionPane.showMessageDialog(null, "Create Enterprise Manager Successfully!");
                    
                    NameTxt.setText("");
                    PasswordTxt.setText("");
                    RepasswordTxt.setText("");
                }else if(org instanceof RescueCenter){    
                    RescueCenter now = (RescueCenter)org;
                    Account newa = now.getManageraccountDir().createAccount();
                    newa.setName(NameTxt.getText());
                    newa.setPassword(PasswordTxt.getText());
                    
                    JOptionPane.showMessageDialog(null, "Create Enterprise Manager Successfully!");
                    
                    NameTxt.setText("");
                    PasswordTxt.setText("");
                    RepasswordTxt.setText("");
                }else{
                        AdopterCenter now = (AdopterCenter)org;
                        Account newa = now.getManageraccountDir().createAccount();
                        newa.setName(NameTxt.getText());
                        newa.setPassword(PasswordTxt.getText());

                        JOptionPane.showMessageDialog(null, "Create Enterprise Manager Successfully!");

                        NameTxt.setText("");
                        PasswordTxt.setText("");
                        RepasswordTxt.setText("");
                }
                populate();
            }else{
                JOptionPane.showMessageDialog(null, "Something Wrong, Please Check!");
            }
        }
    }//GEN-LAST:event_RegisterBtnActionPerformed

    private void BackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackBtnActionPerformed
        // TODO add your handling code here:
        this.rightpanel.remove(this);
        CardLayout cardlayout =  (CardLayout)this.rightpanel.getLayout();
        cardlayout.previous(rightpanel);
    }//GEN-LAST:event_BackBtnActionPerformed

    private void TypeComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TypeComboBoxActionPerformed
        // TODO add your handling code here:
        if(this.TypeComboBox.getSelectedItem()!=null)
        {
            if(TypeComboBox.getSelectedItem().toString().equalsIgnoreCase("Pet Hospital"))
            {
                PetHospitalDirectory petHospitalDirectory = (PetHospitalDirectory) TypeComboBox.getSelectedItem();
                populateHospitalNameComboBox(petHospitalDirectory);
            }
            
            else if(TypeComboBox.getSelectedItem().toString().equalsIgnoreCase("Rescue Center"))
            {
                RescueCenterDirectory rescueCenterDirectory = (RescueCenterDirectory) TypeComboBox.getSelectedItem();
                populateRescueNameComboBox(rescueCenterDirectory);
            }
            
            else
            {
                AdopterCenterDirectory adopterCenterDirectory = (AdopterCenterDirectory) TypeComboBox.getSelectedItem();
                populateAdopterNameComboBox(adopterCenterDirectory);
            }
        }
        
        else
        {
            this.EnterpriseNameComboBox.removeAllItems();
        }
    }//GEN-LAST:event_TypeComboBoxActionPerformed

    private void LocationComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LocationComboBoxActionPerformed
        // TODO add your handling code here:
        if (LocationComboBox.getSelectedItem() != null)
        {
            TypeComboBox.removeAllItems();
            EnterpriseNameComboBox.removeAllItems();
            Network network = (Network) LocationComboBox.getSelectedItem();
            populateEnterpriseComboBox(network);
        }
        
        else
        {
            this.TypeComboBox.removeAllItems();
            this.EnterpriseNameComboBox.removeAllItems();
        }
    }//GEN-LAST:event_LocationComboBoxActionPerformed

    private void EnterpriseNameComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnterpriseNameComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EnterpriseNameComboBoxActionPerformed

    private void NameTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NameTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NameTxtActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackBtn;
    private javax.swing.JComboBox EnterpriseNameComboBox;
    private javax.swing.JComboBox LocationComboBox;
    private javax.swing.JTextField NameTxt;
    private javax.swing.JTextField PasswordTxt;
    private javax.swing.JButton RegisterBtn;
    private javax.swing.JTextField RepasswordTxt;
    private javax.swing.JComboBox TypeComboBox;
    private javax.swing.JTable enterprisemanagerTbl;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.Admain;

import Entity.Network.NetworkDirectory;
import Entity.System.EcoSystem;
import java.awt.CardLayout;
import javax.swing.JOptionPane;

/**
 *
 * @author liumingyu
 */
public class Admain extends javax.swing.JPanel {

    /**
     * Creates new form Admain
     */
    private EcoSystem ecoSystem;
    
    public Admain(EcoSystem ecoSystem) {
        initComponents();
        this.ecoSystem = ecoSystem;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        UserNameTxt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        PasswordTxt = new javax.swing.JTextField();
        LoginBtn = new javax.swing.JButton();
        Rightpanel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(881, 614));

        jSplitPane1.setBackground(new java.awt.Color(255, 255, 255));
        jSplitPane1.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(153, 153, 153)));

        jPanel1.setBackground(new java.awt.Color(249, 246, 246));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(153, 153, 153)));

        jLabel1.setFont(new java.awt.Font("Mshtakan", 1, 14)); // NOI18N
        jLabel1.setText("UserName:");

        UserNameTxt.setFont(new java.awt.Font("Mshtakan", 1, 14)); // NOI18N
        UserNameTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserNameTxtActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Mshtakan", 1, 14)); // NOI18N
        jLabel2.setText("Password:");

        PasswordTxt.setFont(new java.awt.Font("Mshtakan", 1, 14)); // NOI18N
        PasswordTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordTxtActionPerformed(evt);
            }
        });

        LoginBtn.setBackground(new java.awt.Color(255, 255, 255));
        LoginBtn.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        LoginBtn.setText("Login");
        LoginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(UserNameTxt)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PasswordTxt)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(LoginBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(UserNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PasswordTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(LoginBtn)
                .addContainerGap(347, Short.MAX_VALUE))
        );

        jSplitPane1.setLeftComponent(jPanel1);

        Rightpanel.setBackground(new java.awt.Color(249, 246, 246));
        Rightpanel.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(153, 153, 153)));
        Rightpanel.setPreferredSize(new java.awt.Dimension(539, 501));
        Rightpanel.setLayout(new java.awt.CardLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interface/RescueCenter/rescuecenterpage.png"))); // NOI18N
        Rightpanel.add(jLabel3, "card2");

        jSplitPane1.setRightComponent(Rightpanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSplitPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 869, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSplitPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void UserNameTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserNameTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UserNameTxtActionPerformed

    private void PasswordTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PasswordTxtActionPerformed

    private void LoginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginBtnActionPerformed
        // TODO add your handling code here:
        if(UserNameTxt.getText().equals("zhu") && PasswordTxt.getText().equals("zhu"))
        {
            JOptionPane.showMessageDialog(null, "Login as an admin successfully!");
            AdminManageJpanel ampanel = new AdminManageJpanel(Rightpanel, ecoSystem);
            this.Rightpanel.add(ampanel);
            CardLayout layout = (CardLayout)Rightpanel.getLayout();
            layout.next(Rightpanel);
        }
        
        else
        {
            JOptionPane.showMessageDialog(null, "Something Wrong, Please Check!");
        }
    }//GEN-LAST:event_LoginBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton LoginBtn;
    private javax.swing.JTextField PasswordTxt;
    private javax.swing.JPanel Rightpanel;
    private javax.swing.JTextField UserNameTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSplitPane jSplitPane1;
    // End of variables declaration//GEN-END:variables
}

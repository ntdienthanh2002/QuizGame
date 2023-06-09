/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quizgame;

import static connect.ConnectModifier.conn;
import static connect.ConnectModifier.createConnection;
import ht.AA;
import ht.AP;
import ht.Tam;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import static models.AccountPlayerModifier.fullname;
import static quizgame.Start.jButtonAccountPlayer;

/**
 *
 * @author PC
 */
public class ChangeInfoPlayer extends javax.swing.JFrame {

    /**
     * Creates new form ChangeInfo
     */
    public ChangeInfoPlayer() {
        initComponents();
        loadData();
    }

    //----------------------
    public ArrayList<AP> LoadList() {
        createConnection();
        PreparedStatement ps = null;
        ResultSet rs = null;
        Statement st = null;
        int value = Tam.tampplayer;
        ArrayList<AP> LoadList = new ArrayList<>();
        try {
            String sql1 = "SELECT * FROM AccountPlayer WHERE Phone='" + value + "'";
            st = conn.createStatement();
            rs = st.executeQuery(sql1);
            AP lo;

            while (rs.next()) {
                lo = new AP(rs.getInt("AccPlayerID"), rs.getInt("Phone"), rs.getString("Email"), rs.getString("Fullname"), rs.getString("Gender"), rs.getInt("Status"));
                LoadList.add(lo);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return LoadList;
    }

    public void loadData() {
        ArrayList<AP> list = LoadList();
        for (int i = 0; i < list.size(); i++) {
            String a = list.get(i).getEmail();
            String b = list.get(i).getFullname();
            String c = list.get(i).getGender();

            jTextFieldEmail.setText(a);
            jTextFieldFullname.setText(b);
            if (c.equals("Male")) {
                jRadioButtonMale.setSelected(true);
            } else {
                jRadioButtonMale.setSelected(true);
            }
        }
    }

    //----------------------
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButtonBack = new javax.swing.JButton();
        jLabelEmail = new javax.swing.JLabel();
        jTextFieldEmail = new javax.swing.JTextField();
        jLabelFullname = new javax.swing.JLabel();
        jTextFieldFullname = new javax.swing.JTextField();
        jLabelGender = new javax.swing.JLabel();
        jButtonSave = new javax.swing.JButton();
        jButtonChangePassword = new javax.swing.JButton();
        jRadioButtonMale = new javax.swing.JRadioButton();
        jRadioButtonFemale = new javax.swing.JRadioButton();
        jLabelChangeAccountInformation = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Quiz Game Online");
        setResizable(false);

        jButtonBack.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jButtonBack.setText("Back");
        jButtonBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBackActionPerformed(evt);
            }
        });

        jLabelEmail.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabelEmail.setText("Email:");

        jTextFieldEmail.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jLabelFullname.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabelFullname.setText("Full Name:");

        jTextFieldFullname.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jLabelGender.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabelGender.setText("Gender: ");

        jButtonSave.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jButtonSave.setText("Save");
        jButtonSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSaveActionPerformed(evt);
            }
        });

        jButtonChangePassword.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jButtonChangePassword.setText("Change password");
        jButtonChangePassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonChangePasswordActionPerformed(evt);
            }
        });

        jRadioButtonMale.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jRadioButtonMale.setText("Male");

        jRadioButtonFemale.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jRadioButtonFemale.setText("Female");

        jLabelChangeAccountInformation.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabelChangeAccountInformation.setText("Change the account information");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addComponent(jTextFieldEmail))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelFullname)
                            .addComponent(jLabelGender)
                            .addComponent(jLabelEmail))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldFullname)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jRadioButtonMale)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jRadioButtonFemale)
                                .addGap(88, 88, 88))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButtonSave)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonChangePassword)
                                .addGap(8, 8, 8)))))
                .addGap(107, 107, 107))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonBack)
                .addGap(18, 18, 18)
                .addComponent(jLabelChangeAccountInformation)
                .addGap(0, 14, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonBack)
                    .addComponent(jLabelChangeAccountInformation))
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelEmail)
                    .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelFullname)
                    .addComponent(jTextFieldFullname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelGender)
                    .addComponent(jRadioButtonMale)
                    .addComponent(jRadioButtonFemale))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSave)
                    .addComponent(jButtonChangePassword))
                .addGap(212, 212, 212))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBackActionPerformed
        Start start = new Start();
        start.setLocationRelativeTo(null);
        jButtonAccountPlayer.setText(fullname);
        start.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonBackActionPerformed

    private void jButtonSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSaveActionPerformed
        createConnection();
        String gender = "";
        if (jRadioButtonMale.isSelected()) {
            gender = "Male";
        }
        if (jRadioButtonMale.isSelected()) {
            gender = "Female";
        }
        String em = jTextFieldEmail.getText();
        String fn = jTextFieldFullname.getText();

        StringBuilder sb = new StringBuilder();

        if (fn.equals("")) {
            sb.append("Please check Fullname can't be empty !\n");
        }
        if (em.equals("")) {
            sb.append("Please check Email can't be empty !\n");
        }
        if (sb.length() > 0) {
            JOptionPane.showMessageDialog(this, sb.toString(), "System", JOptionPane.ERROR_MESSAGE);
        } else {
            try {
                int value = Tam.tampplayer;
                String query = "UPDATE AccountPlayer SET Fullname=?, Email=? , Gender=? WHERE Phone ='" + value + "'";
                PreparedStatement ps = conn.prepareStatement(query);

                ps.setString(1, fn);
                ps.setString(2, em);
                ps.setString(3, gender);
                ps.executeUpdate();
                JFrame frame = new JFrame("JOptionPane showMessageDialog example");
                JOptionPane.showMessageDialog(frame,
                        "Update success !");
            } catch (Exception e) {
                JOptionPane.showConfirmDialog(null, e);
            }
        }
    }//GEN-LAST:event_jButtonSaveActionPerformed

    private void jButtonChangePasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonChangePasswordActionPerformed
        ChangePasswordPlayer changePasswordPlayer = new ChangePasswordPlayer();
        changePasswordPlayer.setLocationRelativeTo(null);
        changePasswordPlayer.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonChangePasswordActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ChangeInfoPlayer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChangeInfoPlayer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChangeInfoPlayer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChangeInfoPlayer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ChangeInfoPlayer changeInfoPlayer = new ChangeInfoPlayer();
                changeInfoPlayer.setLocationRelativeTo(null);
                changeInfoPlayer.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBack;
    private javax.swing.JButton jButtonChangePassword;
    private javax.swing.JButton jButtonSave;
    private javax.swing.JLabel jLabelChangeAccountInformation;
    private javax.swing.JLabel jLabelEmail;
    private javax.swing.JLabel jLabelFullname;
    private javax.swing.JLabel jLabelGender;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButtonFemale;
    private javax.swing.JRadioButton jRadioButtonMale;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldFullname;
    // End of variables declaration//GEN-END:variables
}

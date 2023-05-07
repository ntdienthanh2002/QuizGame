/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ht;

import static connect.ConnectModifier.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Properties;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;
import javax.mail.PasswordAuthentication;
import javax.swing.JFrame;

/**
 *
 * @author PC
 */
public class ForgotPasswordAdmin extends javax.swing.JFrame {

    /**
     * Creates new form ForgotPassword
     */
    public ForgotPasswordAdmin() {
        initComponents();
    }

    //--------------------
    public ArrayList<AA> LoadList() {
        createConnection();
        PreparedStatement ps = null;
        ResultSet rs = null;
        Statement st = null;
        String value = jTextFieldForgotPassword.getText();
        ArrayList<AA> LoadList = new ArrayList<>();

        try {
            String sql1 = "SELECT * FROM AccountAdmin WHERE Username='" + value + "'";
            st = conn.createStatement();
            rs = st.executeQuery(sql1);
            AA lo;

            while (rs.next()) {
                lo = new AA(rs.getInt("AccAdminID"), rs.getString("Username"), rs.getString("Password"), rs.getString("Fullname"), rs.getString("Email"));
                LoadList.add(lo);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return LoadList;
    }

    public void EmailData() {
        ArrayList<AA> list = LoadList();
        for (int i = 0; i < list.size(); i++) {

            String a = list.get(i).getEmail();
            Tam.emailtam = a;

        }
    }

    //--------------------
    /**
     *
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButtonBack = new javax.swing.JButton();
        jTextFieldForgotPassword = new javax.swing.JTextField();
        jLabelUsername = new javax.swing.JLabel();
        jButtonForgotPassword = new javax.swing.JButton();
        jLabelForgotPassword = new javax.swing.JLabel();

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

        jTextFieldForgotPassword.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jLabelUsername.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabelUsername.setText("Username:");

        jButtonForgotPassword.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jButtonForgotPassword.setText("Forgot Password");
        jButtonForgotPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonForgotPasswordActionPerformed(evt);
            }
        });

        jLabelForgotPassword.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabelForgotPassword.setText("Forgot Password");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButtonBack)
                        .addGap(80, 80, 80)
                        .addComponent(jLabelForgotPassword))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(jLabelUsername)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldForgotPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(210, 210, 210)
                        .addComponent(jButtonForgotPassword)))
                .addContainerGap(153, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonBack)
                    .addComponent(jLabelForgotPassword))
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelUsername)
                    .addComponent(jTextFieldForgotPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addComponent(jButtonForgotPassword)
                .addContainerGap(275, Short.MAX_VALUE))
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

    private void jButtonForgotPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonForgotPasswordActionPerformed
        createConnection();
        String us = jTextFieldForgotPassword.getText();
        StringBuilder sb = new StringBuilder();
        String value = us;
        if (us.equals("")) {
            sb.append("Please check Username can't be empty !\n");
        }
        if (sb.length() > 0) {
            JOptionPane.showMessageDialog(this, sb.toString(), "System", JOptionPane.ERROR_MESSAGE);
        } else {
            try {
                String query = "SELECT * FROM AccountAdmin WHERE Username = '" + value + "'";

                PreparedStatement ps = conn.prepareStatement(query);

                ResultSet rs = null;
                rs = ps.executeQuery();
                if (rs.next()) {
//dung username thi` lam`
                    Random rand = new Random();
                    Tam.randomPW = rand.nextInt(99999);
                    String password = String.valueOf(Tam.randomPW);
                    EmailData();
                    try {
                        SendEmail.send_Email();

                    } catch (MessagingException ex) {
                        Logger.getLogger(ForgotPasswordAdmin.class.getName()).log(Level.SEVERE, null, ex);
                    }

                    String query1 = "UPDATE AccountAdmin SET Password=? WHERE Username ='" + value + "'";
                    PreparedStatement ps1 = conn.prepareStatement(query1);
                    ps1.setString(1, password);
                    ps1.executeUpdate();

                    JFrame frame = new JFrame("JOptionPane showMessageDialog example");
                    JOptionPane.showMessageDialog(frame,
                            "Password has been sent to email");

                } else {
                    JFrame frame = new JFrame("JOptionPane showMessageDialog example");
                    JOptionPane.showMessageDialog(frame,
                            "Username doesn't exist!",
                            "System",
                            JOptionPane.ERROR_MESSAGE);
                }
            } catch (Exception e) {
                JOptionPane.showConfirmDialog(null, e);
            }
        }
    }//GEN-LAST:event_jButtonForgotPasswordActionPerformed

    private void jButtonBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBackActionPerformed
        LoginAccountAdmin loginAccountAdmin = new LoginAccountAdmin();
        loginAccountAdmin.setLocationRelativeTo(null);
        loginAccountAdmin.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonBackActionPerformed

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
            java.util.logging.Logger.getLogger(ForgotPasswordAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ForgotPasswordAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ForgotPasswordAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ForgotPasswordAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ForgotPasswordAdmin forgotPasswordAdmin = new ForgotPasswordAdmin();
                forgotPasswordAdmin.setLocationRelativeTo(null);
                forgotPasswordAdmin.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBack;
    private javax.swing.JButton jButtonForgotPassword;
    private javax.swing.JLabel jLabelForgotPassword;
    private javax.swing.JLabel jLabelUsername;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextFieldForgotPassword;
    // End of variables declaration//GEN-END:variables

    private void SendEmail() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
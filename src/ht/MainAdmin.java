/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ht;

/**
 *
 * @author PC
 */
public class MainAdmin extends javax.swing.JFrame {

    /**
     * Creates new form MainAdmin
     */
    public MainAdmin() {
        initComponents();
        HT();
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
        jButtonQuestionsAndAnswers = new javax.swing.JButton();
        jButtonAccountAdmin = new javax.swing.JButton();
        jButtonAccountPlayer = new javax.swing.JButton();
        jButtonFeedback = new javax.swing.JButton();
        jButtonInformationAccount = new javax.swing.JButton();
        jLabelAdminManager = new javax.swing.JLabel();
        jLabelHello = new javax.swing.JLabel();
        jLabelName = new javax.swing.JLabel();
        jButtonLogout = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Quiz Game Online");
        setResizable(false);

        jButtonQuestionsAndAnswers.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jButtonQuestionsAndAnswers.setText("Questions and answers");
        jButtonQuestionsAndAnswers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonQuestionsAndAnswersActionPerformed(evt);
            }
        });

        jButtonAccountAdmin.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jButtonAccountAdmin.setText("Account Admin");
        jButtonAccountAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAccountAdminActionPerformed(evt);
            }
        });

        jButtonAccountPlayer.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jButtonAccountPlayer.setText("Account Player");
        jButtonAccountPlayer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAccountPlayerActionPerformed(evt);
            }
        });

        jButtonFeedback.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jButtonFeedback.setText("Feedback");
        jButtonFeedback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFeedbackActionPerformed(evt);
            }
        });

        jButtonInformationAccount.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jButtonInformationAccount.setText("Information Account");
        jButtonInformationAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInformationAccountActionPerformed(evt);
            }
        });

        jLabelAdminManager.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabelAdminManager.setText("Admin Manager");

        jLabelHello.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabelHello.setText("Hello, ");

        jLabelName.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabelName.setText("Username");

        jButtonLogout.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jButtonLogout.setText("Log out");
        jButtonLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLogoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelHello)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelName)
                        .addGap(36, 36, 36))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonLogout)
                        .addContainerGap())))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addComponent(jLabelAdminManager)
                .addContainerGap(168, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(192, 192, 192)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonInformationAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonFeedback, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonAccountPlayer, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonAccountAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonQuestionsAndAnswers))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelHello)
                    .addComponent(jLabelName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonLogout)
                .addGap(25, 25, 25)
                .addComponent(jLabelAdminManager)
                .addGap(53, 53, 53)
                .addComponent(jButtonQuestionsAndAnswers)
                .addGap(18, 18, 18)
                .addComponent(jButtonAccountAdmin)
                .addGap(18, 18, 18)
                .addComponent(jButtonAccountPlayer)
                .addGap(18, 18, 18)
                .addComponent(jButtonFeedback)
                .addGap(18, 18, 18)
                .addComponent(jButtonInformationAccount)
                .addContainerGap(68, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void HT() {
        jLabelName.setText(Tam.tam);
    }

    private void jButtonQuestionsAndAnswersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonQuestionsAndAnswersActionPerformed
        QuestionAdmin questionAdmin = new QuestionAdmin();
        questionAdmin.setLocationRelativeTo(null);
        questionAdmin.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonQuestionsAndAnswersActionPerformed

    private void jButtonFeedbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFeedbackActionPerformed
        FeedbackAdmin feedbackAdmin = new FeedbackAdmin();
        feedbackAdmin.setLocationRelativeTo(null);
        feedbackAdmin.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonFeedbackActionPerformed

    private void jButtonAccountAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAccountAdminActionPerformed
        AccountAdmin accountAdmin = new AccountAdmin();
        accountAdmin.setLocationRelativeTo(null);
        accountAdmin.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonAccountAdminActionPerformed

    private void jButtonInformationAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInformationAccountActionPerformed
        ChangeInfoAdmin changeInfoAdmin = new ChangeInfoAdmin();
        changeInfoAdmin.setLocationRelativeTo(null);
        changeInfoAdmin.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonInformationAccountActionPerformed

    private void jButtonAccountPlayerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAccountPlayerActionPerformed
        AccountPlayer accountPlayer = new AccountPlayer();
        accountPlayer.setLocationRelativeTo(null);
        accountPlayer.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonAccountPlayerActionPerformed

    private void jButtonLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLogoutActionPerformed
        LoginAccountAdmin loginAccountAdmin = new LoginAccountAdmin();
        loginAccountAdmin.setLocationRelativeTo(null);
        loginAccountAdmin.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonLogoutActionPerformed

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
            java.util.logging.Logger.getLogger(MainAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                MainAdmin mainAdmin = new MainAdmin();
                mainAdmin.setLocationRelativeTo(null);
                mainAdmin.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAccountAdmin;
    private javax.swing.JButton jButtonAccountPlayer;
    private javax.swing.JButton jButtonFeedback;
    private javax.swing.JButton jButtonInformationAccount;
    private javax.swing.JButton jButtonLogout;
    private javax.swing.JButton jButtonQuestionsAndAnswers;
    private javax.swing.JLabel jLabelAdminManager;
    private javax.swing.JLabel jLabelHello;
    private javax.swing.JLabel jLabelName;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}

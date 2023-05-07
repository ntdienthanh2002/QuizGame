/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quizgame;

import data.FeedbackAccountPlayer;
import data.Feedbacks;
import java.sql.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import static models.AccountPlayerModifier.fullname;
import models.FeedbackAccountPlayerModifier;
import static models.FeedbackAccountPlayerModifier.*;
import static quizgame.Start.jButtonAccountPlayer;

/**
 *
 * @author THANH
 */
public class FeedbackPlayer extends javax.swing.JFrame {

    FeedbackAccountPlayerModifier feedbackAccountPlayerModifier;
    List<Feedbacks> feedbacksList = new ArrayList<>();

    /**
     * Creates new form Feedback
     */
    public FeedbackPlayer() {
        initComponents();
        getAllFeedback();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPaneFeedback = new javax.swing.JTabbedPane();
        jPanelViewFeedback = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableViewFeedback = new javax.swing.JTable();
        jPanelWriteFeedback = new javax.swing.JPanel();
        jLabelPhoneNumberWriteFeedback = new javax.swing.JLabel();
        jLabelWriteFeedback = new javax.swing.JLabel();
        jTextFieldPhoneNumberWriteFeedback = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaWriteFeedback = new javax.swing.JTextArea();
        jButtonSendFeedback = new javax.swing.JButton();
        jLabelErrorWriteFeedback = new javax.swing.JLabel();
        jButtonReset = new javax.swing.JButton();
        jPanelDeleteFeedback = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableDeleteFeedback = new javax.swing.JTable();
        jLabelPhoneNumberDeleteFeedback = new javax.swing.JLabel();
        jTextFieldPhoneNumberDeleteFeedback = new javax.swing.JTextField();
        jButtonDeleteFeedback = new javax.swing.JButton();
        jButtonSearchFeedback = new javax.swing.JButton();
        jLabelErrorDeleteFeedback = new javax.swing.JLabel();
        jButtonBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Quiz Game Online");

        jTabbedPaneFeedback.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        jTabbedPaneFeedback.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jTabbedPaneFeedback.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabbedPaneFeedbackMouseClicked(evt);
            }
        });

        jTableViewFeedback.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jTableViewFeedback.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Fullname", "Feedback"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTableViewFeedback.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane2.setViewportView(jTableViewFeedback);

        javax.swing.GroupLayout jPanelViewFeedbackLayout = new javax.swing.GroupLayout(jPanelViewFeedback);
        jPanelViewFeedback.setLayout(jPanelViewFeedbackLayout);
        jPanelViewFeedbackLayout.setHorizontalGroup(
            jPanelViewFeedbackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelViewFeedbackLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 692, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelViewFeedbackLayout.setVerticalGroup(
            jPanelViewFeedbackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelViewFeedbackLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 424, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPaneFeedback.addTab("View feedback", jPanelViewFeedback);

        jLabelPhoneNumberWriteFeedback.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabelPhoneNumberWriteFeedback.setText("Enter your phone number");

        jLabelWriteFeedback.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabelWriteFeedback.setText("Enter your feedback");

        jTextFieldPhoneNumberWriteFeedback.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jScrollPane1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jTextAreaWriteFeedback.setColumns(20);
        jTextAreaWriteFeedback.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jTextAreaWriteFeedback.setRows(5);
        jScrollPane1.setViewportView(jTextAreaWriteFeedback);

        jButtonSendFeedback.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jButtonSendFeedback.setText("Send");
        jButtonSendFeedback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSendFeedbackActionPerformed(evt);
            }
        });

        jLabelErrorWriteFeedback.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jButtonReset.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jButtonReset.setText("Reset");
        jButtonReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonResetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelWriteFeedbackLayout = new javax.swing.GroupLayout(jPanelWriteFeedback);
        jPanelWriteFeedback.setLayout(jPanelWriteFeedbackLayout);
        jPanelWriteFeedbackLayout.setHorizontalGroup(
            jPanelWriteFeedbackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelWriteFeedbackLayout.createSequentialGroup()
                .addGroup(jPanelWriteFeedbackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelWriteFeedbackLayout.createSequentialGroup()
                        .addGap(313, 313, 313)
                        .addComponent(jButtonSendFeedback)
                        .addGap(78, 78, 78)
                        .addComponent(jButtonReset))
                    .addGroup(jPanelWriteFeedbackLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(jPanelWriteFeedbackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelPhoneNumberWriteFeedback)
                            .addComponent(jLabelWriteFeedback))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelWriteFeedbackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabelErrorWriteFeedback, javax.swing.GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE)
                            .addComponent(jTextFieldPhoneNumberWriteFeedback)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE))))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        jPanelWriteFeedbackLayout.setVerticalGroup(
            jPanelWriteFeedbackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelWriteFeedbackLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanelWriteFeedbackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPhoneNumberWriteFeedback)
                    .addComponent(jTextFieldPhoneNumberWriteFeedback, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelWriteFeedbackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelWriteFeedback)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabelErrorWriteFeedback, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addGroup(jPanelWriteFeedbackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSendFeedback)
                    .addComponent(jButtonReset))
                .addContainerGap(141, Short.MAX_VALUE))
        );

        jTabbedPaneFeedback.addTab("Write feedback", jPanelWriteFeedback);

        jTableDeleteFeedback.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jTableDeleteFeedback.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "FeedID", "Feedback"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jTableDeleteFeedback);

        jLabelPhoneNumberDeleteFeedback.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabelPhoneNumberDeleteFeedback.setText("Enter your phone number");

        jTextFieldPhoneNumberDeleteFeedback.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jButtonDeleteFeedback.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jButtonDeleteFeedback.setText("Delete");
        jButtonDeleteFeedback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteFeedbackActionPerformed(evt);
            }
        });

        jButtonSearchFeedback.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jButtonSearchFeedback.setText("Search");
        jButtonSearchFeedback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSearchFeedbackActionPerformed(evt);
            }
        });

        jLabelErrorDeleteFeedback.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        javax.swing.GroupLayout jPanelDeleteFeedbackLayout = new javax.swing.GroupLayout(jPanelDeleteFeedback);
        jPanelDeleteFeedback.setLayout(jPanelDeleteFeedbackLayout);
        jPanelDeleteFeedbackLayout.setHorizontalGroup(
            jPanelDeleteFeedbackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDeleteFeedbackLayout.createSequentialGroup()
                .addGroup(jPanelDeleteFeedbackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelDeleteFeedbackLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 692, Short.MAX_VALUE))
                    .addGroup(jPanelDeleteFeedbackLayout.createSequentialGroup()
                        .addGroup(jPanelDeleteFeedbackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelDeleteFeedbackLayout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addComponent(jLabelPhoneNumberDeleteFeedback)
                                .addGap(33, 33, 33)
                                .addGroup(jPanelDeleteFeedbackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabelErrorDeleteFeedback, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextFieldPhoneNumberDeleteFeedback, javax.swing.GroupLayout.DEFAULT_SIZE, 327, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addComponent(jButtonSearchFeedback))
                            .addGroup(jPanelDeleteFeedbackLayout.createSequentialGroup()
                                .addGap(314, 314, 314)
                                .addComponent(jButtonDeleteFeedback)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanelDeleteFeedbackLayout.setVerticalGroup(
            jPanelDeleteFeedbackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDeleteFeedbackLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(jPanelDeleteFeedbackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPhoneNumberDeleteFeedback)
                    .addComponent(jTextFieldPhoneNumberDeleteFeedback, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSearchFeedback))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelErrorDeleteFeedback, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(jButtonDeleteFeedback)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        jTabbedPaneFeedback.addTab("Delete feedback", jPanelDeleteFeedback);

        jButtonBack.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jButtonBack.setText("Back");
        jButtonBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPaneFeedback)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonBack, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonBack)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTabbedPaneFeedback))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void getAllFeedback() {
        feedbackAccountPlayerModifier = new FeedbackAccountPlayerModifier();
        DefaultTableModel defaultTableModel = new DefaultTableModel();
        jTableViewFeedback.setModel(defaultTableModel);

        defaultTableModel.addColumn("Fullname");
        defaultTableModel.addColumn("Feedback");

        List<FeedbackAccountPlayer> feedbackAccountPlayer = feedbackAccountPlayerModifier.viewFeedback();

        for (FeedbackAccountPlayer feedbackAccountPlayer1 : feedbackAccountPlayer) {
            defaultTableModel.addRow(new Object[]{
                feedbackAccountPlayer1.getFullname(), feedbackAccountPlayer1.getFeedback()
            });
        }
    }

    private void getAllFeedbackOnDeleteAfterSearch(int phone) {
        feedbackAccountPlayerModifier = new FeedbackAccountPlayerModifier();
        DefaultTableModel defaultTableModel = new DefaultTableModel();
        jTableDeleteFeedback.setModel(defaultTableModel);

        defaultTableModel.addColumn("FeedID");
        defaultTableModel.addColumn("Feedback");

        List<Feedbacks> feedbackAccountPlayer = feedbackAccountPlayerModifier.findPhoneDeleteFeedback(phone);

        for (Feedbacks feedbackAccountPlayer1 : feedbackAccountPlayer) {
            defaultTableModel.addRow(new Object[]{
                feedbackAccountPlayer1.getFeedID(), feedbackAccountPlayer1.getFeedback()
            });
        }
    }
    private void jButtonSendFeedbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSendFeedbackActionPerformed
        if (jTextFieldPhoneNumberWriteFeedback.getText().length() == 0
                || jTextAreaWriteFeedback.getText().length() == 0) {
            jLabelErrorWriteFeedback.setText("Please fill in all information!!");
        } else {
            if (checkPhoneNumberWriteFeedback()) {
                jLabelErrorWriteFeedback.setText("Incorrect phone number");
            } else {
                int phone = Integer.parseInt(jTextFieldPhoneNumberWriteFeedback.getText());
                String feedback = jTextAreaWriteFeedback.getText();
                writeFeedback(phone, feedback);
                jLabelErrorWriteFeedback.setText("Feedback sent successfully");
            }
        }
    }//GEN-LAST:event_jButtonSendFeedbackActionPerformed

    private void jButtonDeleteFeedbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteFeedbackActionPerformed
        int column = 0;
        int row = jTableDeleteFeedback.getSelectedRow();
        if (row < 0) {
            jLabelErrorDeleteFeedback.setText("Please select the feedback you want to delete!!");
        } else {
            String value = jTableDeleteFeedback.getModel().getValueAt(row, column).toString();
            int selected = Integer.parseInt(value);
            if (selected > 0) {
                deleteFeedback(selected);
                DefaultTableModel defaultTableModel = (DefaultTableModel) jTableDeleteFeedback.getModel();
                if (jTableDeleteFeedback.getSelectedRowCount() == 1) {
                    defaultTableModel.removeRow(jTableDeleteFeedback.getSelectedRow());
                    jLabelErrorDeleteFeedback.setText("Delete feedback successfully");
                }
            }
        }
    }//GEN-LAST:event_jButtonDeleteFeedbackActionPerformed

    private void jButtonSearchFeedbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSearchFeedbackActionPerformed
        if (jTextFieldPhoneNumberDeleteFeedback.getText().length() == 0) {
            jLabelErrorDeleteFeedback.setText("Please enter your phone number!!");
        } else {
            if (checkPhoneNumberDeleteFeedback()) {
                jLabelErrorDeleteFeedback.setText("Incorrect phone number");
            } else {
                int phone = Integer.parseInt(jTextFieldPhoneNumberDeleteFeedback.getText());
                getAllFeedbackOnDeleteAfterSearch(phone);
            }
        }
    }//GEN-LAST:event_jButtonSearchFeedbackActionPerformed

    private void jButtonBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBackActionPerformed
        Start start = new Start();
        start.setLocationRelativeTo(null);
        start.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonBackActionPerformed

    private void jButtonResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonResetActionPerformed
        jTextFieldPhoneNumberWriteFeedback.setText("");
        jTextAreaWriteFeedback.setText("");
        jLabelErrorWriteFeedback.setText("");
    }//GEN-LAST:event_jButtonResetActionPerformed

    private void jTabbedPaneFeedbackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPaneFeedbackMouseClicked
        getAllFeedback();
    }//GEN-LAST:event_jTabbedPaneFeedbackMouseClicked

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
            java.util.logging.Logger.getLogger(FeedbackPlayer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FeedbackPlayer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FeedbackPlayer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FeedbackPlayer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FeedbackPlayer feedbackPlayer = new FeedbackPlayer();
                feedbackPlayer.setLocationRelativeTo(null);
                feedbackPlayer.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBack;
    private javax.swing.JButton jButtonDeleteFeedback;
    private javax.swing.JButton jButtonReset;
    private javax.swing.JButton jButtonSearchFeedback;
    private javax.swing.JButton jButtonSendFeedback;
    private javax.swing.JLabel jLabelErrorDeleteFeedback;
    private javax.swing.JLabel jLabelErrorWriteFeedback;
    private javax.swing.JLabel jLabelPhoneNumberDeleteFeedback;
    private javax.swing.JLabel jLabelPhoneNumberWriteFeedback;
    private javax.swing.JLabel jLabelWriteFeedback;
    private javax.swing.JPanel jPanelDeleteFeedback;
    private javax.swing.JPanel jPanelViewFeedback;
    private javax.swing.JPanel jPanelWriteFeedback;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPaneFeedback;
    private javax.swing.JTable jTableDeleteFeedback;
    private javax.swing.JTable jTableViewFeedback;
    private javax.swing.JTextArea jTextAreaWriteFeedback;
    public static javax.swing.JTextField jTextFieldPhoneNumberDeleteFeedback;
    public static javax.swing.JTextField jTextFieldPhoneNumberWriteFeedback;
    // End of variables declaration//GEN-END:variables
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quizgame;

/**
 *
 * @author THANH
 */
public class Rules extends javax.swing.JFrame {

    /**
     * Creates new form Rules
     */
    public Rules() {
        initComponents();
        rules();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelRulesOfTheGame = new javax.swing.JLabel();
        jButtonBack = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaRules = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Quiz Game Online");
        setResizable(false);

        jLabelRulesOfTheGame.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabelRulesOfTheGame.setText("Rules of the game");

        jButtonBack.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jButtonBack.setText("Back");
        jButtonBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBackActionPerformed(evt);
            }
        });

        jTextAreaRules.setEditable(false);
        jTextAreaRules.setColumns(20);
        jTextAreaRules.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jTextAreaRules.setRows(5);
        jScrollPane1.setViewportView(jTextAreaRules);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonBack)
                        .addGap(91, 91, 91)
                        .addComponent(jLabelRulesOfTheGame)
                        .addGap(0, 150, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelRulesOfTheGame)
                    .addComponent(jButtonBack))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 417, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rules() {
        jTextAreaRules.setText("The questions will be randomly generated, so that players don't get\n"
                + " duplicate questions. Each player must log in to his or her account before\n"
                + " starting to play the game. A question will have four answers and the player\n"
                + " must choose one answer. If the player answers correctly will receive a\n"
                + " certain amount of bonus points and that bonus point will continue to be\n"
                + " increased through each following question. Conversely, if the player\n"
                + " answers incorrectly, they will have to stop the game and a message will\n"
                + " appear on the screen about the number of points they have achieved.\n\n"
                + " From questions 1 to 12, the player can view the question and can decide to\n"
                + " top the game to preserve the number of points available. In question 13,\n"
                + " if the player decides to see the question, the player must answer and must\n"
                + " not stop the game to preserve the score.\n\n"
                + " With each play, the player will have 3 help rights: 50 - 50, flip and double\n"
                + " dip. As follows:\n\n"
                + " ● 50 - 50: Out of the four choices, two wrong answers are deleted, with\n"
                + " only two options available to the player.\n"
                + " ● Flip: If the player feels they can't answer the question, they can flip the\n"
                + " question and another question will be generated automatically.\n"
                + " ● Double dip: Here the player has two attempts to answer the question but\n"
                + " is not allowed to leave the game if the first choice fails.");
    }
    private void jButtonBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBackActionPerformed
        Start start = new Start();
        start.setLocationRelativeTo(null);
        start.setVisible(true);
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
            java.util.logging.Logger.getLogger(Rules.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Rules.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Rules.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Rules.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Rules rules = new Rules();
                rules.setLocationRelativeTo(null);
                rules.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBack;
    private javax.swing.JLabel jLabelRulesOfTheGame;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaRules;
    // End of variables declaration//GEN-END:variables
}

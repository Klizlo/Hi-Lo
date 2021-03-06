/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.hilo;

import java.awt.Dimension;
import java.util.Random;

/**
 *
 * @author Klizlo
 * @version 2.0
 * 
 */
public class HiLo extends javax.swing.JFrame {

    private int number;
    private int numberOfTries;
    
    /**
     * Creates new form NewJFrame
     */
    public HiLo() {
        this.setTitle("Hi-Lo - Guessing Game");
        initComponents();
        playAgainBtn.setVisible(false);
    }
    /**
     * This method checks that the entered number is correct
     */
    public void guessCheck(){
        String guessText = guessTxt.getText();
        String message = "";
        try{
            int guess= Integer.parseInt(guessText);

            numberOfTries++;
            if(guess < number)
                message = guess + " is too low. Try again.";
            else if(guess == number){
                message = guess + " is correct! You win after "+numberOfTries+" tries!";
                // set visible the play again button
                playAgainBtn.setVisible(true);
            }
            else
                message = guess + " is too high. Try again.";
        }catch(Exception e){
            message = "Enter the number between 1 and 100";
        }finally{
            outputLbl.setText(message);

            //Add focus on the guess text field and select the entered text
            guessTxt.requestFocus();
            guessTxt.selectAll();
        }
    }
    /**
     * This method draws new a number at the beginning of the game
    */
    public void newGame(){
        number = new Random().nextInt(100)+1;
        numberOfTries = 0;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        guessBtn = new javax.swing.JButton();
        guessTxt = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        titleLbl = new javax.swing.JLabel();
        outputLbl = new javax.swing.JLabel();
        playAgainBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(98, 0));
        setPreferredSize(new java.awt.Dimension(98, 300));

        guessBtn.setText("Guess");
        guessBtn.setActionCommand("guessButton");
        guessBtn.setMaximumSize(new java.awt.Dimension(84, 22));
        guessBtn.setMinimumSize(new java.awt.Dimension(84, 22));
        guessBtn.setPreferredSize(new java.awt.Dimension(84, 22));
        guessBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guessBtnActionPerformed(evt);
            }
        });

        guessTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guessTxtActionPerformed(evt);
            }
        });

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Enter a number between 1 and 100:");

        titleLbl.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        titleLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLbl.setText("Hi-Lo Guessing Game");
        titleLbl.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        titleLbl.setName(""); // NOI18N

        outputLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        outputLbl.setName("output"); // NOI18N

        playAgainBtn.setText("Play again");
        playAgainBtn.setToolTipText("");
        playAgainBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playAgainBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(titleLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(playAgainBtn)
                        .addGap(43, 43, 43)
                        .addComponent(guessBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(outputLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE)
                                .addGap(28, 28, 28)
                                .addComponent(guessTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(63, 63, 63))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(titleLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(guessTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(guessBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(playAgainBtn))
                .addGap(24, 24, 24)
                .addComponent(outputLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void guessBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guessBtnActionPerformed
        // TODO add your handling code here:
        guessCheck();
    }//GEN-LAST:event_guessBtnActionPerformed

    private void playAgainBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playAgainBtnActionPerformed
        // TODO add your handling code here:
        newGame();
        outputLbl.setText("");
        guessTxt.setText("");
        playAgainBtn.setVisible(false);
    }//GEN-LAST:event_playAgainBtnActionPerformed

    private void guessTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guessTxtActionPerformed
        // TODO add your handling code here:
        guessCheck();
    }//GEN-LAST:event_guessTxtActionPerformed

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(HiLo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HiLo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HiLo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HiLo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                HiLo hilo = new HiLo();
                hilo.newGame();
                hilo.setSize(new Dimension(400,300));
                hilo.setVisible(true);
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton guessBtn;
    private javax.swing.JTextField guessTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel outputLbl;
    private javax.swing.JButton playAgainBtn;
    private javax.swing.JLabel titleLbl;
    // End of variables declaration//GEN-END:variables
}

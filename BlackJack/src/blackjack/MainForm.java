/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjack;

import data.*;
import graphic.*;

/**
 *
 * @author Krish
 */
public class MainForm extends javax.swing.JFrame {
    
    private Table table;
    private CardHolder dealerCards;
    private CardHolder playerCards;

    /**
     * Creates new form MainForm
     */
    public MainForm() {
        initComponents();
        
        table = new Table();
        dealerCards = new CardHolder();
        playerCards = new CardHolder();
        dealerPanel.add(dealerCards);
        playerPanel.add(playerCards);
        
        startNewGame();
        
        
    }
    
    private void refreshCards(boolean showDealerCards){
        
        dealerCards.clear();
        playerCards.clear();
        
        for(Card c : table.getPlayerCards()){
            playerCards.addCard(new CardImage(c,false));
        }
        for(Card c : table.getDealerCards()){
            dealerCards.addCard(new CardImage(c,!showDealerCards));
        }
        this.playerPointsLabel.setText("Punkti:" + table.getPlayerPoints());
        
        if(showDealerCards){
            dealerPointsLabel.setText("Punkti: " + table.getDealerPoints());
            dealerPointsLabel.setVisible(true);
        }
        
    }
    
    private void startNewGame(){
        
        playAgainButton.setVisible(false);
        dealerPointsLabel.setVisible(false);
        informationLabel.setVisible(false);
        stopButton.setVisible(true);
        dealCardButton.setVisible(true);
        
        table.startNewGame();
        refreshCards(false);
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
        dealerPanel = new javax.swing.JPanel();
        playerPanel = new javax.swing.JPanel();
        dealCardButton = new javax.swing.JButton();
        stopButton = new javax.swing.JButton();
        playAgainButton = new javax.swing.JButton();
        playerPointsLabel = new javax.swing.JLabel();
        dealerPointsLabel = new javax.swing.JLabel();
        informationLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        dealerPanel.setBackground(new java.awt.Color(153, 255, 153));

        playerPanel.setBackground(new java.awt.Color(153, 255, 153));

        dealCardButton.setText("Vēl kārti");
        dealCardButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dealCardButtonActionPerformed(evt);
            }
        });

        stopButton.setText("Pietiek");
        stopButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stopButtonActionPerformed(evt);
            }
        });

        playAgainButton.setBackground(new java.awt.Color(153, 255, 153));
        playAgainButton.setText("Spēlēt vēlreiz");
        playAgainButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playAgainButtonActionPerformed(evt);
            }
        });

        playerPointsLabel.setText("Punkti:");

        dealerPointsLabel.setText("Dīlera punkti:");

        informationLabel.setFont(new java.awt.Font("Geneva", 0, 18)); // NOI18N
        informationLabel.setText("Paziņojums");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dealerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(playerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(dealerPointsLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
                    .addComponent(playerPointsLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(playAgainButton)
                .addGap(56, 56, 56)
                .addComponent(stopButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(dealCardButton)
                .addGap(16, 16, 16))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(informationLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(143, 143, 143))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(dealerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dealerPointsLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(informationLabel)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dealCardButton)
                    .addComponent(stopButton)
                    .addComponent(playAgainButton)
                    .addComponent(playerPointsLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(playerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void dealCardButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dealCardButtonActionPerformed
        table.givePlayerCard();
        refreshCards(false);
    }//GEN-LAST:event_dealCardButtonActionPerformed

    private void stopButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stopButtonActionPerformed
        table.dealerTurn();
        refreshCards(true);
        String result = table.getResult();
        informationLabel.setText(result);
        informationLabel.setVisible(true);
        playAgainButton.setVisible(true);
        stopButton.setVisible(false);
        dealCardButton.setVisible(false);
    }//GEN-LAST:event_stopButtonActionPerformed

    private void playAgainButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playAgainButtonActionPerformed
        startNewGame();
    }//GEN-LAST:event_playAgainButtonActionPerformed

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
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton dealCardButton;
    private javax.swing.JPanel dealerPanel;
    private javax.swing.JLabel dealerPointsLabel;
    private javax.swing.JLabel informationLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton playAgainButton;
    private javax.swing.JPanel playerPanel;
    private javax.swing.JLabel playerPointsLabel;
    private javax.swing.JButton stopButton;
    // End of variables declaration//GEN-END:variables
}

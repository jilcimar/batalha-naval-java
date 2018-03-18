
package br.com.telaInicial;

import br.com.Ajuda.JFrameTelaAjuda;
import br.com.jogo.JFrameTabuleiro;

public class JFrameTelaInicial extends javax.swing.JFrame {

    public JFrameTelaInicial() {
        initComponents();
        
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botaoJogar = new javax.swing.JButton();
        botaoajuda = new javax.swing.JButton();
        botaoSair = new javax.swing.JButton();
        fundolabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(801, 596));
        setResizable(false);
        getContentPane().setLayout(null);

        botaoJogar.setFont(new java.awt.Font("Nyala", 1, 18)); // NOI18N
        botaoJogar.setText("PLAY");
        botaoJogar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoJogarActionPerformed(evt);
            }
        });
        getContentPane().add(botaoJogar);
        botaoJogar.setBounds(40, 270, 90, 40);

        botaoajuda.setFont(new java.awt.Font("Nyala", 1, 18)); // NOI18N
        botaoajuda.setText("AJUDA");
        botaoajuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoajudaActionPerformed(evt);
            }
        });
        getContentPane().add(botaoajuda);
        botaoajuda.setBounds(40, 350, 90, 40);

        botaoSair.setFont(new java.awt.Font("Nyala", 1, 18)); // NOI18N
        botaoSair.setText("SAIR");
        botaoSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSairActionPerformed(evt);
            }
        });
        getContentPane().add(botaoSair);
        botaoSair.setBounds(40, 430, 90, 40);

        fundolabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/telaInicial/batalha naval.jpg"))); // NOI18N
        getContentPane().add(fundolabel);
        fundolabel.setBounds(-90, 0, 900, 570);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoJogarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoJogarActionPerformed
  
        JFrameTabuleiro novo = new JFrameTabuleiro();
        novo.show();
        this.dispose();
    }//GEN-LAST:event_botaoJogarActionPerformed

    private void botaoSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSairActionPerformed
       this.dispose();
    }//GEN-LAST:event_botaoSairActionPerformed

    private void botaoajudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoajudaActionPerformed
       JFrameTelaAjuda nova = new JFrameTelaAjuda();
       nova.show();
       this.dispose();
    }//GEN-LAST:event_botaoajudaActionPerformed

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
            java.util.logging.Logger.getLogger(JFrameTelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameTelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameTelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameTelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameTelaInicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoJogar;
    private javax.swing.JButton botaoSair;
    private javax.swing.JButton botaoajuda;
    private javax.swing.JLabel fundolabel;
    // End of variables declaration//GEN-END:variables
}

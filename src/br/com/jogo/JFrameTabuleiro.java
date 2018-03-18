package br.com.jogo;

import br.com.telaInicial.JFrameTelaInicial;
import java.util.Random;

public class JFrameTabuleiro extends javax.swing.JFrame {
    public JFrameTabuleiro() {
        initComponents();
        criatabuleiro();
        preenchematriz();
        Contador.zerartabuleiro();
    }
    public static Campo matriz[][] = new Campo[10][10];
    public void criatabuleiro() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                matriz[i][j] = new Campo();
                matriz[i][j].setIcon(new javax.swing.ImageIcon("imagens/maar.jpg"));
                mostraMatriz.add(matriz[i][j]);
            }
        }
    }
    public void preenchematriz() {
        Random sorteio = new Random();
        int quantidadeSubarino = 10;
        int linha = 0;
        int coluna = 0;
        // Preechendo os submarinos aleatórios
        while (quantidadeSubarino > 0) {
            linha = sorteio.nextInt(9);
            coluna = sorteio.nextInt(9);
            matriz[linha][coluna].setItem(1);
            quantidadeSubarino--;
        }
        int quantidadeBarcos = 6;
        int linha1 = 0;
        int coluna1 = 0;
        // Preechendo os barcos de 2 partes aleatórios
        while (quantidadeBarcos > 0) {
            linha1 = sorteio.nextInt(9);
            coluna1 = sorteio.nextInt(9);
            if (matriz[linha1][coluna1 + 1].getParte() != 1 && matriz[linha1][coluna1].getItem() != 2) {
                matriz[linha1][coluna1].setItem(2);
                matriz[linha1][coluna1].setParte(1);
                matriz[linha1][coluna1 + 1].setItem(2);
                matriz[linha1][coluna1 + 1].setParte(2);
                quantidadeBarcos--;
            }
        }
        //Preechendo as bomba 
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (matriz[i][j].getItem() != 1 && matriz[i][j].getItem() != 2) {
                    matriz[i][j].setItem(3);
                }
            }
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mostraMatriz = new javax.swing.JPanel();
        botaoReiniciarTabuleiro = new javax.swing.JButton();
        botaoSairdoJogo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        mostraMatriz.setLayout(new java.awt.GridLayout(10, 10));

        botaoReiniciarTabuleiro.setBackground(new java.awt.Color(255, 255, 255));
        botaoReiniciarTabuleiro.setFont(new java.awt.Font("Metal Lord", 0, 12)); // NOI18N
        botaoReiniciarTabuleiro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/jogo/reiniciar.png"))); // NOI18N
        botaoReiniciarTabuleiro.setText("reiniciar");
        botaoReiniciarTabuleiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoReiniciarTabuleiroActionPerformed(evt);
            }
        });

        botaoSairdoJogo.setBackground(new java.awt.Color(255, 255, 255));
        botaoSairdoJogo.setFont(new java.awt.Font("Metal Lord", 0, 12)); // NOI18N
        botaoSairdoJogo.setIcon(new javax.swing.ImageIcon("C:\\Users\\Jilcimar Fernandes\\Pictures\\Imagens Projeto POO\\exit.png")); // NOI18N
        botaoSairdoJogo.setText("sair");
        botaoSairdoJogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSairdoJogoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(mostraMatriz, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(botaoSairdoJogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botaoReiniciarTabuleiro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(mostraMatriz, javax.swing.GroupLayout.PREFERRED_SIZE, 596, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botaoSairdoJogo, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botaoReiniciarTabuleiro, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoReiniciarTabuleiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoReiniciarTabuleiroActionPerformed
        JFrameTabuleiro novo = new JFrameTabuleiro();
        this.dispose();
        novo.show();
    }//GEN-LAST:event_botaoReiniciarTabuleiroActionPerformed

    private void botaoSairdoJogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSairdoJogoActionPerformed
        this.dispose();
        JFrameTelaInicial volta = new JFrameTelaInicial();
        volta.show();
    }//GEN-LAST:event_botaoSairdoJogoActionPerformed

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
            java.util.logging.Logger.getLogger(JFrameTabuleiro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameTabuleiro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameTabuleiro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameTabuleiro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameTabuleiro().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoReiniciarTabuleiro;
    private javax.swing.JButton botaoSairdoJogo;
    private javax.swing.JPanel mostraMatriz;
    // End of variables declaration//GEN-END:variables

}

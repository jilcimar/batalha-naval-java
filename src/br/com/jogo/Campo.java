package br.com.jogo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class Campo extends JButton implements ActionListener {

    private int item;
    // 1 -Submarino 
    // 2 -Barco de 2 partes
    private int parte;
    // parte do barco
    int chances = 0;
    boolean clicou = false;
    boolean virou = false;

    public Campo() {
        addActionListener(this);
    }

    public int getItem() {
        return item;
    }

    public void setItem(int item) {
        this.item = item;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // if que controla as vidas     
        if (Contador.getContador() < 30) {
            Contador.contaclique();
            if ((Contador.getAcertoTotal() + Contador.getAcertos()) < 5) {
                if (getItem() == 1 && getItem() != 2 && clicou == false) {
                    setIcon(new javax.swing.ImageIcon("imagens/barco.jpg"));
                    Contador.aumentarsubmarino();
                    clicou = true;
                } else if (getItem() == 2 && clicou == false) {
                    if (getParte() == 1) {
                        setIcon(new javax.swing.ImageIcon("imagens/lado1.jpg"));
                        clicou = true;
                        virou = true;
                    } else if (getParte() == 2 && clicou == false) {
                        setIcon(new javax.swing.ImageIcon("imagens/lado2.jpg"));
                        clicou = true;
                        virou = true;
                    }
                    Contador.contadorBarcos();
                    Contador.verificaacertos();

                } else if (getItem() == 3 && clicou == false) {
                    setIcon(new javax.swing.ImageIcon("imagens/bomba.jpg"));
                    Contador.aumentarBomba();
                    clicou = true;
                } else {
                    JOptionPane.showMessageDialog(this, "ESSE CAMPO JÁ FOI SELECIONADO");
                }

            } else {
                JOptionPane.showMessageDialog(this, "\t PARABÉNS, VOCÊ AFUNDOU 5 EMBARCAÇÕES "
                        + "\n --------------------------------------------------------------------"
                        + "\n TOTAL DE CLIQUE NA PARTIDA: "
                        + (Contador.getTotaldeclique() - 1) + "\n TOTAL DE TIROS NA ÁGUA: " + Contador.getContador()
                        + "\n BARCOS AFUNDADOS: " + Contador.getAcertoTotal() + "\n SUBMARINOS AFUNDADOS: " + Contador.getAcertos() + "\n VIDAS RESTANTES NA PARTIDA: " + (30 - Contador.getContador()) + "\n --------------------------------------------------------------------");

            }
            // BLOCO DAS VIDAS ACABA AQUI
        } else {
            JOptionPane.showMessageDialog(this, "\t SUAS VIDAS ACABARAM "
                    + "\n --------------------------------------------------------------------"
                    + "\n TOTAL DE CLIQUE NA PARTIDA: "
                    + (Contador.getTotaldeclique() - 1) + "\n TOTAL DE TIROS NA ÁGUA: " + Contador.getContador()
                    + "\n BARCOS AFUNDADOS: " + Contador.getAcertoTotal() + "\n SUBMARINOS AFUNDADOS: " + Contador.getAcertos() + "\n VIDAS RESTANTES NA PARTIDA: " + (30 - Contador.getContador()));
        }
    }
    public int getParte() {
        return parte;
    }
    public void setParte(int parte) {
        this.parte = parte;
    }
}

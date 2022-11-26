/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package a3_maq_vendas_final.telas;

import a3_maq_vendas_final.banco.Banco;
import a3_maq_vendas_final.classes.Maquina;
import a3_maq_vendas_final.classes.Produto;
import java.sql.SQLException;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author gatra
 */
public class Interface extends javax.swing.JFrame {

    Banco init;
    Produto p1;
    Produto p2;
    Produto p3;
    Produto p4;
    Produto p5;
    Produto p6;
    Produto p7;
    Produto p8;
    Produto p9;
    Produto compra_atual;
    Maquina maquina;

    /**
     * Creates new form Interface
     *
     * @throws java.sql.SQLException
     */
    public Interface() throws SQLException {
        initComponents();
        init = new Banco();
        p1 = init.Read(1);
        p2 = init.Read(2);
        p3 = init.Read(3);
        p4 = init.Read(4);
        p5 = init.Read(5);
        p6 = init.Read(6);
        p7 = init.Read(7);
        p8 = init.Read(8);
        p9 = init.Read(9);
        maquina = new Maquina(p1, p2, p3, p4, p5, p6, p7, p8, p9);
        prod_pos1.setText(maquina.getPos1().getNome());
        prod_pos2.setText(maquina.getPos2().getNome());
        prod_pos3.setText(maquina.getPos3().getNome());
        prod_pos4.setText(maquina.getPos4().getNome());
        prod_pos5.setText(maquina.getPos5().getNome());
        prod_pos6.setText(maquina.getPos6().getNome());
        prod_pos7.setText(maquina.getPos7().getNome());
        prod_pos8.setText(maquina.getPos8().getNome());
        prod_pos9.setText(maquina.getPos9().getNome());

        tela.setText("Escolha um pruduto:");

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tela = new javax.swing.JLabel();
        Input = new javax.swing.JTextField();
        jButtonOK = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        prod_pos9 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButtonX = new javax.swing.JButton();
        prod_pos5 = new javax.swing.JLabel();
        prod_pos1 = new javax.swing.JLabel();
        prod_pos2 = new javax.swing.JLabel();
        prod_pos8 = new javax.swing.JLabel();
        prod_pos7 = new javax.swing.JLabel();
        prod_pos4 = new javax.swing.JLabel();
        prod_pos3 = new javax.swing.JLabel();
        prod_pos6 = new javax.swing.JLabel();
        pay_button = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(0, 0));
        setPreferredSize(new java.awt.Dimension(800, 800));
        setSize(new java.awt.Dimension(800, 800));
        getContentPane().setLayout(null);

        tela.setText("tela");
        getContentPane().add(tela);
        tela.setBounds(620, 190, 150, 30);
        getContentPane().add(Input);
        Input.setBounds(620, 220, 150, 40);

        jButtonOK.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jButtonOK.setText("OK");
        jButtonOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOKActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonOK);
        jButtonOK.setBounds(700, 420, 70, 40);

        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jButton1.setText("1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(620, 270, 40, 40);

        jButton2.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jButton2.setText("2");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(670, 270, 40, 40);

        jButton3.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jButton3.setText("3");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(720, 270, 50, 40);

        jButton4.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jButton4.setText("4");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(620, 320, 40, 40);

        jButton5.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jButton5.setText("5");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(670, 320, 40, 40);

        jButton6.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jButton6.setText("6");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6);
        jButton6.setBounds(720, 320, 50, 40);

        jButton7.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jButton7.setText("7");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7);
        jButton7.setBounds(620, 370, 40, 40);

        prod_pos9.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        prod_pos9.setText("prod_pos9");
        getContentPane().add(prod_pos9);
        prod_pos9.setBounds(430, 540, 90, 80);

        jButton8.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jButton8.setText("8");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8);
        jButton8.setBounds(670, 370, 40, 40);

        jButton9.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jButton9.setText("9");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton9);
        jButton9.setBounds(720, 370, 50, 40);

        jButtonX.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jButtonX.setText("X");
        jButtonX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonXActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonX);
        jButtonX.setBounds(620, 420, 60, 40);

        prod_pos5.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        prod_pos5.setText("prod_pos5");
        getContentPane().add(prod_pos5);
        prod_pos5.setBounds(280, 340, 90, 80);

        prod_pos1.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        prod_pos1.setText("prod_pos1");
        getContentPane().add(prod_pos1);
        prod_pos1.setBounds(150, 120, 80, 80);

        prod_pos2.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        prod_pos2.setText("prod_pos2");
        getContentPane().add(prod_pos2);
        prod_pos2.setBounds(280, 120, 80, 80);

        prod_pos8.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        prod_pos8.setText("prod_pos8");
        getContentPane().add(prod_pos8);
        prod_pos8.setBounds(290, 540, 100, 80);

        prod_pos7.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        prod_pos7.setText("prod_pos7");
        getContentPane().add(prod_pos7);
        prod_pos7.setBounds(147, 540, 90, 80);

        prod_pos4.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        prod_pos4.setText("prod_pos4");
        getContentPane().add(prod_pos4);
        prod_pos4.setBounds(140, 340, 90, 80);

        prod_pos3.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        prod_pos3.setText("prod_pos3");
        getContentPane().add(prod_pos3);
        prod_pos3.setBounds(417, 120, 90, 80);

        prod_pos6.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        prod_pos6.setText("prod_pos6");
        getContentPane().add(prod_pos6);
        prod_pos6.setBounds(427, 340, 90, 80);

        pay_button.setText("Pagar");
        pay_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pay_buttonActionPerformed(evt);
            }
        });
        getContentPane().add(pay_button);
        pay_button.setBounds(620, 500, 150, 40);

        background.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/a3_maq_vendas_final/imagens/A3 machine front.png"))); // NOI18N
        getContentPane().add(background);
        background.setBounds(0, 0, 810, 800);

        setSize(new java.awt.Dimension(816, 808));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOKActionPerformed
        int produto_escolhido = 0;
        int quantidade_escolhida;

        produto_escolhido = Integer.parseInt(Input.getText());
        switch (produto_escolhido) {
            case 1:
                tela.setText("O valor e R$" + maquina.getPos1().getPreco_venda());
                compra_atual = maquina.getPos1();
                break;
            case 2:
                tela.setText("O valor e R$" + maquina.getPos2().getPreco_venda());
                compra_atual = maquina.getPos2();
                break;
            case 3:
                tela.setText("O valor e R$" + maquina.getPos3().getPreco_venda());
                compra_atual = maquina.getPos3();
                break;
            case 4:
                tela.setText("O valor e R$" + maquina.getPos4().getPreco_venda());
                compra_atual = maquina.getPos4();
                break;
            case 5:
                tela.setText("O valor e R$" + maquina.getPos5().getPreco_venda());
                compra_atual = maquina.getPos5();
                break;
            case 6:
                tela.setText("O valor e R$" + maquina.getPos6().getPreco_venda());
                compra_atual = maquina.getPos6();
                break;
            case 7:
                tela.setText("O valor e R$" + maquina.getPos7().getPreco_venda());
                compra_atual = maquina.getPos7();
                break;
            case 8:
                tela.setText("O valor e R$" + maquina.getPos8().getPreco_venda());
                compra_atual = maquina.getPos8();
                break;
            case 9:
                tela.setText("O valor e R$" + maquina.getPos9().getPreco_venda());
                compra_atual = maquina.getPos9();
                break;
            default:
                tela.setText("Selecione outro produto");
                break;
        }
        Input.setText("");

    }//GEN-LAST:event_jButtonOKActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Input.setText(Input.getText() + "1");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Input.setText(Input.getText() + "2");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Input.setText(Input.getText() + "3");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        Input.setText(Input.getText() + "4");
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        Input.setText(Input.getText() + "5");
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        Input.setText(Input.getText() + "6");
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        Input.setText(Input.getText() + "7");
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        Input.setText(Input.getText() + "8");
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        Input.setText(Input.getText() + "9");
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButtonXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonXActionPerformed
        Input.setText("");
    }//GEN-LAST:event_jButtonXActionPerformed

    private void pay_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pay_buttonActionPerformed
        compra_atual.venda();
        
        
        try {
            //JOptionPane.showMessageDialog(null,"Venda realizada");
            TimeUnit.SECONDS.sleep(5);
            tela.setText("Escolha um pruduto:");
        } catch (InterruptedException ex) {
            Logger.getLogger(Interface.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_pay_buttonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Input;
    private javax.swing.JLabel background;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JButton jButtonOK;
    private javax.swing.JButton jButtonX;
    private javax.swing.JButton pay_button;
    private javax.swing.JLabel prod_pos1;
    private javax.swing.JLabel prod_pos2;
    private javax.swing.JLabel prod_pos3;
    private javax.swing.JLabel prod_pos4;
    private javax.swing.JLabel prod_pos5;
    private javax.swing.JLabel prod_pos6;
    private javax.swing.JLabel prod_pos7;
    private javax.swing.JLabel prod_pos8;
    private javax.swing.JLabel prod_pos9;
    private javax.swing.JLabel tela;
    // End of variables declaration//GEN-END:variables
}
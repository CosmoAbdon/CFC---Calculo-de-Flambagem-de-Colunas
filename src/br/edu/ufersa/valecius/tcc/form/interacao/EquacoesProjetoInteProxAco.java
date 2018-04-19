/*
 * Copyright (C) 2018 cosmo
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 */
package br.edu.ufersa.valecius.tcc.form.interacao;

import br.edu.ufersa.valecius.tcc.form.admissivel.*;
import br.edu.ufersa.valecius.tcc.form.*;
import br.edu.ufersa.valecius.tcc.utils.VariavelCl;
import static java.lang.Math.sqrt;
import javax.swing.JOptionPane;

/**
 *
 * @author cosmo
 */
public class EquacoesProjetoInteProxAco extends javax.swing.JFrame {

    /**
     * Creates new form EquacoesProjetoAco
     */
    VariavelCl vci;
    public EquacoesProjetoInteProxAco(VariavelCl vc) {
        initComponents();
        vci = vc;
        
        if(vci.getTipo() == 0){
            jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/ufersa/valecius/tcc/res/Abas Retas-Excentrico.png")));
        }else if(vci.getTipo() == 1){
            jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/ufersa/valecius/tcc/res/Retangular-Excentrico.png")));
        }else if(vci.getTipo() == 2){
            jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/ufersa/valecius/tcc/res/Retangular-Vazado-Excentrico.png")));
        }else if(vci.getTipo() == 3){
            jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/ufersa/valecius/tcc/res/Circular-Cheio-Excentrico.png")));
        }else if(vci.getTipo() == 4){
            jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/ufersa/valecius/tcc/res/Circular-Vazado-Excentrico.png")));
        }
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jtf_ex = new javax.swing.JTextField();
        jtf_ey = new javax.swing.JTextField();
        jb_calc = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jtf_sigmaF = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jLabel1.setText("DADOS ADICIONAIS - CARGAS EXCÊNTRICAS");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/ufersa/valecius/tcc/res/ufersa-icon2.png"))); // NOI18N

        jLabel4.setText("DISTÂNCIA DA CARGA ATÉ O EIXO Y (ex)");

        jLabel5.setText("DISTÂNCIA DA CARGA ATÉ O EIXO X (ey)");

        jtf_ex.setText("0.0");

        jtf_ey.setText("0.0");

        jb_calc.setText("Calcular");
        jb_calc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_calcActionPerformed(evt);
            }
        });

        jLabel6.setText("cm");

        jLabel7.setText("cm");

        jLabel8.setText("TENSÃO ADMISSÍVEL À FLEXÃO");

        jtf_sigmaF.setText("0.0");
        jtf_sigmaF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_sigmaFActionPerformed(evt);
            }
        });

        jLabel9.setText("MPa");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(195, 195, 195)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel4)
                        .addGap(10, 10, 10)
                        .addComponent(jtf_ex, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(jLabel6))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel5)
                        .addGap(10, 10, 10)
                        .addComponent(jtf_ey, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(jLabel7))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel8)
                        .addGap(59, 59, 59)
                        .addComponent(jtf_sigmaF, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(jLabel9))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(420, 420, 420)
                        .addComponent(jb_calc)))
                .addGap(10, 10, 10))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(57, 57, 57)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtf_ex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6))))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtf_ey, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7))))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtf_sigmaF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))))
                .addGap(27, 27, 27)
                .addComponent(jb_calc))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jb_calcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_calcActionPerformed
        // TODO add your handling code here:

        Double value = null;
        Double ex = Double.parseDouble(jtf_ex.getText())  / 100;
        Double ey = Double.parseDouble(jtf_ey.getText()) / 100;
        Double of = Double.parseDouble(jtf_sigmaF.getText()) * 1000000;
        vci.setSigmaF(of);
        
        try{
            
             value = vci.getA()*vci.getIx()*vci.getIy()*vci.getSigmaF()*vci.getResObj()/(vci.getIx()*vci.getIy()*vci.getSigmaF()+ey*vci.getCy()*vci.getA()*vci.getIy()*vci.getResObj()+ex*vci.getCx()*vci.getA()*vci.getIx()*vci.getSigmaF());
             
             String str = String.format("%.2f", value);
             JOptionPane.showMessageDialog(rootPane,  "A carga crítica é : " + value + " N");
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Erro !");
        }

    }//GEN-LAST:event_jb_calcActionPerformed

    private void jtf_sigmaFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_sigmaFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_sigmaFActionPerformed

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
            java.util.logging.Logger.getLogger(EquacoesProjetoInteProxAco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EquacoesProjetoInteProxAco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EquacoesProjetoInteProxAco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EquacoesProjetoInteProxAco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                VariavelCl vcc = null;
                new EquacoesProjetoInteProxAco(vcc).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton jb_calc;
    private javax.swing.JTextField jtf_ex;
    private javax.swing.JTextField jtf_ey;
    private javax.swing.JTextField jtf_sigmaF;
    // End of variables declaration//GEN-END:variables
}

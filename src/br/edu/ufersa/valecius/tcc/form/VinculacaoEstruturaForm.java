/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ufersa.valecius.tcc.form;

import br.edu.ufersa.valecius.tcc.utils.VariavelCl;
import javax.swing.JOptionPane;

/**
 *
 * @author cosmo
 */
public class VinculacaoEstruturaForm extends javax.swing.JFrame {

    /**
     * Creates new form VinculacaoEstruturaForm
     */
    VariavelCl vci;
    public VinculacaoEstruturaForm(VariavelCl vc) {
        initComponents();
        vci = vc;
        System.out.println(vc.getTipo());
        System.out.println(vc.getIx());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jl_k2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jl_k1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jl_k07 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jl_k05 = new javax.swing.JLabel();
        jrb_engLivre = new javax.swing.JRadioButton();
        jrb_pinPin = new javax.swing.JRadioButton();
        jrb_engPin = new javax.swing.JRadioButton();
        jrb_engEng = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        jtf_compCol = new javax.swing.JTextField();
        jb_prox = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("VINCULAÇÃO DA ESTRUTURA EM ANÁLISE");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/ufersa/valecius/tcc/res/ufersa-icon2.png"))); // NOI18N

        jLabel3.setText("k = 2");

        jl_k2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/ufersa/valecius/tcc/res/k2.jpeg"))); // NOI18N

        jLabel5.setText("k = 1");

        jl_k1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/ufersa/valecius/tcc/res/k1.jpeg"))); // NOI18N

        jLabel7.setText("k = 0.7");

        jl_k07.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/ufersa/valecius/tcc/res/k0-7.jpeg"))); // NOI18N

        jLabel9.setText("k = 0.5");

        jl_k05.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/ufersa/valecius/tcc/res/k0-5.jpeg"))); // NOI18N

        buttonGroup1.add(jrb_engLivre);
        jrb_engLivre.setSelected(true);
        jrb_engLivre.setText("Engaste/Livre");

        buttonGroup1.add(jrb_pinPin);
        jrb_pinPin.setText("Pino/Pino");

        buttonGroup1.add(jrb_engPin);
        jrb_engPin.setText("Engaste/Pino");

        buttonGroup1.add(jrb_engEng);
        jrb_engEng.setText("Engaste/Engaste");

        jLabel4.setText("Comprimento da Coluna (Metros) :");

        jb_prox.setText("Próximo");
        jb_prox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_proxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jrb_engLivre)
                .addGap(29, 29, 29)
                .addComponent(jrb_pinPin)
                .addGap(69, 69, 69)
                .addComponent(jrb_engPin)
                .addGap(32, 32, 32)
                .addComponent(jrb_engEng))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                .addGroup(layout.createSequentialGroup()
                    .addGap(20, 20, 20)
                    .addComponent(jLabel4)
                    .addGap(18, 18, 18)
                    .addComponent(jtf_compCol, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jb_prox))
                .addGroup(layout.createSequentialGroup()
                    .addGap(30, 30, 30)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(71, 71, 71)
                            .addComponent(jLabel1))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(30, 30, 30)
                            .addComponent(jLabel3)
                            .addGap(126, 126, 126)
                            .addComponent(jLabel5)
                            .addGap(116, 116, 116)
                            .addComponent(jLabel7)
                            .addGap(113, 113, 113)
                            .addComponent(jLabel9))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jl_k2)
                            .addGap(59, 59, 59)
                            .addComponent(jl_k1)
                            .addGap(59, 59, 59)
                            .addComponent(jl_k07)
                            .addGap(49, 49, 49)
                            .addComponent(jl_k05)))
                    .addGap(57, 57, 57)
                    .addComponent(jLabel2)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel1)
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7)
                            .addComponent(jLabel9))
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jl_k2)
                            .addComponent(jl_k1)
                            .addComponent(jl_k07)
                            .addComponent(jl_k05)))
                    .addComponent(jLabel2))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jrb_engLivre)
                            .addComponent(jrb_pinPin)
                            .addComponent(jrb_engPin)
                            .addComponent(jrb_engEng))
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jtf_compCol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 28, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jb_prox)
                        .addContainerGap())))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jb_proxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_proxActionPerformed
        // TODO add your handling code here:
        
        if(jrb_engLivre.isSelected())
            vci.setK(2.0);
        else if(jrb_pinPin.isSelected())
            vci.setK(1.0);
        else if(jrb_engPin.isSelected())
            vci.setK(0.7);
        else if(jrb_engEng.isSelected())
            vci.setK(0.5);
        
        try{
         Double l = Double.parseDouble(jtf_compCol.getText());
         vci.setL(l);
         vci.setLef(vci.getL() * vci.getK());
         
            MenuMetodoResolucaoForm menuMetodoResolucaoForm = new MenuMetodoResolucaoForm(vci);
            menuMetodoResolucaoForm.show();
            this.dispose();
         
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Valor vazio ou nulo !");
        }
        
    }//GEN-LAST:event_jb_proxActionPerformed

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
            java.util.logging.Logger.getLogger(VinculacaoEstruturaForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VinculacaoEstruturaForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VinculacaoEstruturaForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VinculacaoEstruturaForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                VariavelCl vcc = null;
                new VinculacaoEstruturaForm(vcc).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton jb_prox;
    private javax.swing.JLabel jl_k05;
    private javax.swing.JLabel jl_k07;
    private javax.swing.JLabel jl_k1;
    private javax.swing.JLabel jl_k2;
    private javax.swing.JRadioButton jrb_engEng;
    private javax.swing.JRadioButton jrb_engLivre;
    private javax.swing.JRadioButton jrb_engPin;
    private javax.swing.JRadioButton jrb_pinPin;
    private javax.swing.JTextField jtf_compCol;
    // End of variables declaration//GEN-END:variables
}

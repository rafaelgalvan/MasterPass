/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package masterpass;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
/**
 *
 * @author rafael
 */
public class SenhaJFrame extends javax.swing.JFrame {

    List<Senha> listaSenha;
    private int numeroGerado;
    /**
     * Creates new form MainJFrame
     */
    public SenhaJFrame()
    {
        initComponents();
        numeroGerado = 0;
        listaSenha = new ArrayList<Senha>();
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
        btnCaixa1 = new javax.swing.JButton();
        btnCaixa2 = new javax.swing.JButton();
        btnCaixa3 = new javax.swing.JButton();
        btnCaixa4 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btnCaixaComum = new javax.swing.JButton();
        btnCaixaRapido = new javax.swing.JButton();
        btnCaixaPrioritario = new javax.swing.JButton();
        textSenhaGerada = new javax.swing.JTextField();
        labelSuaSenha = new javax.swing.JLabel();
        labelTipoAtendimento = new javax.swing.JLabel();
        labelClientes = new javax.swing.JLabel();
        labelCaixas = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        labelSenhaEscolhida = new javax.swing.JLabel();
        labelCaixaEscolhido = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MasterPass");
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(102, 102, 102), new java.awt.Color(0, 0, 0)));
        jPanel1.setPreferredSize(new java.awt.Dimension(322, 200));

        btnCaixa1.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        btnCaixa1.setText("Caixa 1");

        btnCaixa2.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        btnCaixa2.setText("Caixa 3");

        btnCaixa3.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        btnCaixa3.setText("Caixa 2");

        btnCaixa4.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        btnCaixa4.setText("Caixa 4");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCaixa1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCaixa2, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCaixa3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCaixa4, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE))
                .addGap(35, 35, 35))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnCaixa3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(54, 54, 54)
                        .addComponent(btnCaixa4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnCaixa1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(54, 54, 54)
                        .addComponent(btnCaixa2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(35, 35, 35))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(102, 102, 102), new java.awt.Color(0, 0, 0)));
        jPanel2.setPreferredSize(new java.awt.Dimension(322, 120));

        btnCaixaComum.setFont(new java.awt.Font("Ubuntu", 1, 16)); // NOI18N
        btnCaixaComum.setText("Comum");
        btnCaixaComum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCaixaComumActionPerformed(evt);
            }
        });

        btnCaixaRapido.setFont(new java.awt.Font("Ubuntu", 1, 16)); // NOI18N
        btnCaixaRapido.setText("Rápido");
        btnCaixaRapido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCaixaRapidoActionPerformed(evt);
            }
        });

        btnCaixaPrioritario.setFont(new java.awt.Font("Ubuntu", 1, 16)); // NOI18N
        btnCaixaPrioritario.setText("Prioritário");
        btnCaixaPrioritario.setPreferredSize(new java.awt.Dimension(108, 33));
        btnCaixaPrioritario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCaixaPrioritarioActionPerformed(evt);
            }
        });

        textSenhaGerada.setEditable(false);

        labelSuaSenha.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        labelSuaSenha.setText("Sua Senha é:");

        labelTipoAtendimento.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        labelTipoAtendimento.setText("Escolha seu tipo de atendimento");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnCaixaComum, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCaixaRapido, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCaixaPrioritario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(textSenhaGerada)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(labelSuaSenha)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(labelTipoAtendimento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(labelTipoAtendimento)
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCaixaComum)
                    .addComponent(btnCaixaRapido)
                    .addComponent(btnCaixaPrioritario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(labelSuaSenha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textSenhaGerada)
                .addContainerGap())
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnCaixaComum, btnCaixaPrioritario, btnCaixaRapido});

        labelClientes.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        labelClientes.setText("Para Clientes:");

        labelCaixas.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        labelCaixas.setText("Para Caixas:");

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(102, 102, 102), new java.awt.Color(0, 0, 0)));

        labelSenhaEscolhida.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        labelSenhaEscolhida.setText("jLabel5");

        labelCaixaEscolhido.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        labelCaixaEscolhido.setText("jLabel6");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(273, 273, 273)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelCaixaEscolhido)
                    .addComponent(labelSenhaEscolhida))
                .addGap(273, 273, 273))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(labelSenhaEscolhida)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                .addComponent(labelCaixaEscolhido)
                .addGap(55, 55, 55))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelClientes))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelCaixas)))
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelClientes)
                    .addComponent(labelCaixas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCaixaComumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCaixaComumActionPerformed
        numeroGerado++;
        Senha objSenha = new Senha(numeroGerado, 'C');
        listaSenha.add(objSenha);
        textSenhaGerada.setText(objSenha.getTipoSenha() + "-" + objSenha.getNumeroSenha());
    }//GEN-LAST:event_btnCaixaComumActionPerformed

    private void btnCaixaRapidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCaixaRapidoActionPerformed
        numeroGerado++;
        Senha objSenha = new Senha(numeroGerado, 'R');
        listaSenha.add(objSenha);
        textSenhaGerada.setText(objSenha.getTipoSenha() + "-" + objSenha.getNumeroSenha());
    }//GEN-LAST:event_btnCaixaRapidoActionPerformed

    private void btnCaixaPrioritarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCaixaPrioritarioActionPerformed
        numeroGerado++;
        Senha objSenha = new Senha(numeroGerado, 'P');
        listaSenha.add(objSenha);
        textSenhaGerada.setText(objSenha.getTipoSenha() + "-" + objSenha.getNumeroSenha());
    }//GEN-LAST:event_btnCaixaPrioritarioActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
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
            java.util.logging.Logger.getLogger(SenhaJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SenhaJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SenhaJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SenhaJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run() {
                new SenhaJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCaixa1;
    private javax.swing.JButton btnCaixa2;
    private javax.swing.JButton btnCaixa3;
    private javax.swing.JButton btnCaixa4;
    private javax.swing.JButton btnCaixaComum;
    private javax.swing.JButton btnCaixaPrioritario;
    private javax.swing.JButton btnCaixaRapido;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel labelCaixaEscolhido;
    private javax.swing.JLabel labelCaixas;
    private javax.swing.JLabel labelClientes;
    private javax.swing.JLabel labelSenhaEscolhida;
    private javax.swing.JLabel labelSuaSenha;
    private javax.swing.JLabel labelTipoAtendimento;
    private javax.swing.JTextField textSenhaGerada;
    // End of variables declaration//GEN-END:variables
}

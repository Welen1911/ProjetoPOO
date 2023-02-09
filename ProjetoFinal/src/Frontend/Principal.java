package Frontend;

import Backend.Client.Cliente;
import java.util.List;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Digim
 */
public class Principal extends javax.swing.JFrame {

    public static Cliente cliente;
    public static List<Cliente> listaCliente;
    
    /**
     * Creates new form Home
     */
    public Principal() {
        initComponents();
    }
    
    public Principal(Cliente cliente, List<Cliente> listaClientes) {
        initComponents();
        this.cliente = cliente;
        this.listaCliente = listaClientes;
        jLNomeCliente.setText(this.cliente.getNome());
        jLSaldoCorrente.setText(String.valueOf(this.cliente.getContaCorrente().getSaldo()));        
        jLSaldoPoupanca.setText(String.valueOf(this.cliente.getContaPoupanca().getSaldo()));

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabelCorrente = new javax.swing.JLabel();
        jLSaldoCorrente = new javax.swing.JLabel();
        jLabelPoupanca = new javax.swing.JLabel();
        jLSaldoPoupanca = new javax.swing.JLabel();
        jLNomeCliente = new javax.swing.JLabel();
        jBtnTransferir = new javax.swing.JButton();
        jBtnDepositar = new javax.swing.JButton();
        jBtnSacar = new javax.swing.JButton();
        jBtnExtrato = new javax.swing.JButton();
        jBtnResgatar = new javax.swing.JButton();
        jBtnGuardar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        JBtnSair = new javax.swing.JButton();

        jMenuItem1.setText("jMenuItem1");

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(0, 123, 255));

        jLabelCorrente.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCorrente.setText("Corrente  R$ ");

        jLSaldoCorrente.setForeground(new java.awt.Color(255, 255, 255));
        jLSaldoCorrente.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLSaldoCorrente.setText("0");

        jLabelPoupanca.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPoupanca.setText("Poupança R$ ");

        jLSaldoPoupanca.setForeground(new java.awt.Color(255, 255, 255));
        jLSaldoPoupanca.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLSaldoPoupanca.setText("0");

        jLNomeCliente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLNomeCliente.setForeground(new java.awt.Color(255, 255, 255));
        jLNomeCliente.setText("Nome do usuário");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLNomeCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelPoupanca)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLSaldoPoupanca, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelCorrente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLSaldoCorrente, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCorrente)
                    .addComponent(jLSaldoCorrente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPoupanca)
                    .addComponent(jLSaldoPoupanca))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLNomeCliente)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jBtnTransferir.setBackground(new java.awt.Color(255, 255, 255));
        jBtnTransferir.setText("Transferir");
        jBtnTransferir.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 123, 255), 3));
        jBtnTransferir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnTransferirActionPerformed(evt);
            }
        });

        jBtnDepositar.setBackground(new java.awt.Color(255, 255, 255));
        jBtnDepositar.setText("Depositar");
        jBtnDepositar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 123, 255), 3));
        jBtnDepositar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnDepositarActionPerformed(evt);
            }
        });

        jBtnSacar.setBackground(new java.awt.Color(255, 255, 255));
        jBtnSacar.setText("Sacar");
        jBtnSacar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 123, 255), 3));
        jBtnSacar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnSacarActionPerformed(evt);
            }
        });

        jBtnExtrato.setBackground(new java.awt.Color(255, 255, 255));
        jBtnExtrato.setText("Extrato");
        jBtnExtrato.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 123, 255), 3));
        jBtnExtrato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnExtratoActionPerformed(evt);
            }
        });

        jBtnResgatar.setBackground(new java.awt.Color(255, 255, 255));
        jBtnResgatar.setText("Resgatar");
        jBtnResgatar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 123, 255), 3));
        jBtnResgatar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnResgatarActionPerformed(evt);
            }
        });

        jBtnGuardar.setBackground(new java.awt.Color(255, 255, 255));
        jBtnGuardar.setText("Guardar");
        jBtnGuardar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 123, 255), 3));
        jBtnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnGuardarActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(31, 95, 213));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Venha Conhecer!");

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Melhores fundos e CDB's para se investir em 2023. ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(67, 67, 67))
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(20, 20, 20))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        JBtnSair.setBackground(new java.awt.Color(255, 255, 255));
        JBtnSair.setText("📴 Sair");
        JBtnSair.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));
        JBtnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBtnSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jBtnGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBtnTransferir, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jBtnResgatar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBtnDepositar, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jBtnExtrato, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBtnSacar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(JBtnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JBtnSair, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnTransferir, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnDepositar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnSacar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnExtrato, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnResgatar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnDepositarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnDepositarActionPerformed
        try {
            this.dispose();
            Depositar depositar = new Depositar(cliente, listaCliente);
            depositar.setVisible(true);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jBtnDepositarActionPerformed

    private void JBtnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBtnSairActionPerformed
        Login voltaLogin = new Login(listaCliente);
        this.dispose();
        voltaLogin.setVisible(true);
    }//GEN-LAST:event_JBtnSairActionPerformed

    private void jBtnSacarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnSacarActionPerformed
         try {
            this.dispose();
            Sacar sacar = new Sacar(cliente, listaCliente);
            sacar.setVisible(true);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jBtnSacarActionPerformed

    private void jBtnExtratoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnExtratoActionPerformed
        try {
            this.dispose();
            Extrato extrato = new Extrato(cliente, listaCliente);
            extrato.setVisible(true);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jBtnExtratoActionPerformed

    private void jBtnTransferirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnTransferirActionPerformed
        try {
            this.dispose();
            Transferir transferir = new Transferir(cliente, listaCliente);
            transferir.setVisible(true);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jBtnTransferirActionPerformed

    private void jBtnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnGuardarActionPerformed
        try {
            if(cliente.getContaCorrente().getSaldo() == 0) {
                throw new Exception("Não há saldo para guardar da conta corrente!");
            } 
            
            this.dispose();
            Guardar guardar = new Guardar(cliente, listaCliente);
            guardar.setVisible(true);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_jBtnGuardarActionPerformed

    private void jBtnResgatarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnResgatarActionPerformed
        try {
            if(cliente.getContaPoupanca().getSaldo() == 0) {
                throw new Exception("Não há saldo para resgatar da conta poupança!");
            } 
            
            this.dispose();
            Resgatar resgatar = new Resgatar(cliente, listaCliente);
            resgatar.setVisible(true);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        } 
    }//GEN-LAST:event_jBtnResgatarActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBtnSair;
    private javax.swing.JButton jBtnDepositar;
    private javax.swing.JButton jBtnExtrato;
    private javax.swing.JButton jBtnGuardar;
    private javax.swing.JButton jBtnResgatar;
    private javax.swing.JButton jBtnSacar;
    private javax.swing.JButton jBtnTransferir;
    private javax.swing.JLabel jLNomeCliente;
    private javax.swing.JLabel jLSaldoCorrente;
    private javax.swing.JLabel jLSaldoPoupanca;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelCorrente;
    private javax.swing.JLabel jLabelPoupanca;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}

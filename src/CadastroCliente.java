/*
 Claudia Abilio - PI - UC 15 - 2025
 */

import javax.swing.JOptionPane;
import java.awt.image.BufferedImage;

public class CadastroCliente extends javax.swing.JFrame {

    public CadastroCliente() {
        BufferedImage img = new BufferedImage(1, 1, BufferedImage.TYPE_INT_ARGB);
        setIconImage(img);

        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        lbnMenuPrincipal = new javax.swing.JLabel();
        lblNomeCliente = new javax.swing.JLabel();
        lblEnderecoCliente = new javax.swing.JLabel();
        lblTelefoneCliente = new javax.swing.JLabel();
        txtNomeCliente = new javax.swing.JTextField();
        txtEnderecoCliente = new javax.swing.JTextField();
        txtIdCliente = new javax.swing.JTextField();
        btnVoltar = new javax.swing.JButton();
        btnSalvarCliente = new javax.swing.JButton();
        txtTelefoneCliente = new javax.swing.JTextField();
        lblNomeCliente1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Sistema Pizzaria Dona Massa");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 204, 102));
        jPanel1.setForeground(new java.awt.Color(0, 0, 0));

        lbnMenuPrincipal.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        lbnMenuPrincipal.setForeground(new java.awt.Color(0, 0, 0));
        lbnMenuPrincipal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbnMenuPrincipal.setText("CADASTRO DE CLIENTES");
        lbnMenuPrincipal.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblNomeCliente.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        lblNomeCliente.setForeground(new java.awt.Color(0, 0, 0));
        lblNomeCliente.setText("Nome: ");

        lblEnderecoCliente.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        lblEnderecoCliente.setForeground(new java.awt.Color(0, 0, 0));
        lblEnderecoCliente.setText("Endereço:");

        lblTelefoneCliente.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        lblTelefoneCliente.setForeground(new java.awt.Color(0, 0, 0));
        lblTelefoneCliente.setText("Telefone:");

        txtNomeCliente.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        txtNomeCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeClienteActionPerformed(evt);
            }
        });

        txtEnderecoCliente.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        txtEnderecoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEnderecoClienteActionPerformed(evt);
            }
        });

        txtIdCliente.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        txtIdCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdClienteActionPerformed(evt);
            }
        });

        btnVoltar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnVoltar.setForeground(new java.awt.Color(0, 0, 0));
        btnVoltar.setText("VOLTAR");
        btnVoltar.setPreferredSize(new java.awt.Dimension(92, 31));
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        btnSalvarCliente.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnSalvarCliente.setForeground(new java.awt.Color(0, 0, 0));
        btnSalvarCliente.setText("SALVAR");
        btnSalvarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarClienteActionPerformed(evt);
            }
        });

        txtTelefoneCliente.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        txtTelefoneCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefoneClienteActionPerformed(evt);
            }
        });

        lblNomeCliente1.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        lblNomeCliente1.setForeground(new java.awt.Color(0, 0, 0));
        lblNomeCliente1.setText("Id:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSalvarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblEnderecoCliente)
                            .addComponent(lblNomeCliente)
                            .addComponent(lblTelefoneCliente)
                            .addComponent(lblNomeCliente1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEnderecoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTelefoneCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(lbnMenuPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 535, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(lbnMenuPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNomeCliente1))
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblNomeCliente)
                        .addGap(30, 30, 30)
                        .addComponent(lblEnderecoCliente))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtEnderecoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTelefoneCliente)
                    .addComponent(txtTelefoneCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 136, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalvarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtNomeClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeClienteActionPerformed

    private void txtEnderecoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEnderecoClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEnderecoClienteActionPerformed

    private void txtIdClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdClienteActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed


    private void btnSalvarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarClienteActionPerformed
       
        if (txtNomeCliente.getText().isEmpty() || txtEnderecoCliente.getText().isEmpty() || txtIdCliente.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Favor preencher todos os campos de texto.");
            return;
        }

        int id = Integer.parseInt(txtIdCliente.getText());
        String nome = txtNomeCliente.getText();
        String endereco = txtEnderecoCliente.getText();
        String telefone = txtTelefoneCliente.getText();

        if (!telefone.matches("\\d{2} \\d{4,5}-\\d{4}")) {
            JOptionPane.showMessageDialog(this, "Telefone inválido. Use o formato XX XXXX-XXXX ou XX XXXXX-XXXX.");
            return;
        }
        // Criação do objeto Cliente
        Cliente cliente = new Cliente(id, nome, endereco, telefone);
        Global.clientes.add(cliente);

        // Exibir mensagem de sucesso
        JOptionPane.showMessageDialog(this, "Cliente cadastrado com sucesso !!!");

        // Limpar os campos de entrada
        txtIdCliente.setText("");
        txtNomeCliente.setText("");
        txtEnderecoCliente.setText("");
        txtTelefoneCliente.setText("");

    }//GEN-LAST:event_btnSalvarClienteActionPerformed

    private void txtTelefoneClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefoneClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefoneClienteActionPerformed

    public static void main(String args[]) {
                
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSalvarCliente;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JLabel lblEnderecoCliente;
    private javax.swing.JLabel lblNomeCliente;
    private javax.swing.JLabel lblNomeCliente1;
    private javax.swing.JLabel lblTelefoneCliente;
    private javax.swing.JLabel lbnMenuPrincipal;
    private javax.swing.JTextField txtEnderecoCliente;
    private javax.swing.JTextField txtIdCliente;
    private javax.swing.JTextField txtNomeCliente;
    private javax.swing.JTextField txtTelefoneCliente;
    // End of variables declaration//GEN-END:variables
}

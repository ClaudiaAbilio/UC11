/*
 Claudia Abilio - PI - UC 15 - 2025
 */

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.image.BufferedImage;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.time.format.DateTimeParseException;

public class CadastroPedido extends javax.swing.JFrame {

    public CadastroPedido() {

        BufferedImage img = new BufferedImage(1, 1, BufferedImage.TYPE_INT_ARGB);
        setIconImage(img);

        initComponents();
        
        cboProduto.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) { 
                    String nomeProduto = (String) cboProduto.getSelectedItem();
                    if (nomeProduto != null && !nomeProduto.isEmpty()) {
                       
                        getProdutoIdByName(nomeProduto);
                    }
                }
            }
        });

        carregarClientes();
        carregarProdutos();
        setInitialPrice();
    }

    private void setInitialPrice() {
        
        String nomeProduto = (String) cboProduto.getSelectedItem();
        if (nomeProduto != null && !nomeProduto.isEmpty()) {
            
            getProdutoIdByName(nomeProduto);
        }
    }

    private void carregarClientes() {
        for (Cliente cliente : Global.clientes) {
            cboCliente.addItem(cliente.getNome());
        }
    }

    private void carregarProdutos() {
        for (Produto produto : Global.produtos) {
            cboProduto.addItem(produto.getNome());
            txtPrecoPedido.setText(String.valueOf(produto.getPreco()));
        }
    }

    private int getProdutoIdByName(String nomeProduto) {
        for (Produto produto : Global.produtos) {
            if (produto.getNome().equalsIgnoreCase(nomeProduto.trim())) {
              
                txtPrecoPedido.setText(String.valueOf(produto.getPreco()));
                
                return produto.getId();
            }
        }
        return -1; // Produto não encontrado
    }

    private int getClienteIdByName(String nomeCliente) {
        for (Cliente cliente : Global.clientes) {
            if (cliente.getNome().equals(nomeCliente)) {
                return cliente.getId();  // Cliente encontrado, retorna seu ID
            }
        }
        return -1; // Cliente não encontrado
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbnCadastroPedido = new javax.swing.JLabel();
        lblNomeClientePedido = new javax.swing.JLabel();
        lblNomeProdtuoPedido = new javax.swing.JLabel();
        lblQuantidadePedido = new javax.swing.JLabel();
        txtQuantidadePedido = new javax.swing.JTextField();
        lblValorTotalPedido = new javax.swing.JLabel();
        txtTotalPedido = new javax.swing.JTextField();
        lblDataPedido = new javax.swing.JLabel();
        txtDataPedido = new javax.swing.JTextField();
        btnVoltarCadastroPedido = new javax.swing.JButton();
        btnAddDetalhe = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDetalhePedido = new javax.swing.JTable();
        lblQuantidadePedido2 = new javax.swing.JLabel();
        txtPrecoPedido = new javax.swing.JTextField();
        cboCliente = new javax.swing.JComboBox<>();
        cboProduto = new javax.swing.JComboBox<>();
        btnSalvarPedido = new javax.swing.JButton();
        lblPedidoID = new javax.swing.JLabel();
        txtPedidoID = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Sistema Pizzaria Donna Massa");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 204, 102));
        jPanel1.setPreferredSize(new java.awt.Dimension(594, 525));

        lbnCadastroPedido.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        lbnCadastroPedido.setForeground(new java.awt.Color(0, 0, 0));
        lbnCadastroPedido.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbnCadastroPedido.setText("CADASTRO DE PEDIDOS");
        lbnCadastroPedido.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblNomeClientePedido.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        lblNomeClientePedido.setForeground(new java.awt.Color(0, 0, 0));
        lblNomeClientePedido.setText("Cliente:");

        lblNomeProdtuoPedido.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        lblNomeProdtuoPedido.setForeground(new java.awt.Color(0, 0, 0));
        lblNomeProdtuoPedido.setText("Produto:");

        lblQuantidadePedido.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        lblQuantidadePedido.setForeground(new java.awt.Color(0, 0, 0));
        lblQuantidadePedido.setText("Quantidade:");

        txtQuantidadePedido.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        txtQuantidadePedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQuantidadePedidoActionPerformed(evt);
            }
        });

        lblValorTotalPedido.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        lblValorTotalPedido.setForeground(new java.awt.Color(0, 0, 0));
        lblValorTotalPedido.setText("Valor Total:");

        txtTotalPedido.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        txtTotalPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalPedidoActionPerformed(evt);
            }
        });

        lblDataPedido.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        lblDataPedido.setForeground(new java.awt.Color(0, 0, 0));
        lblDataPedido.setText("Data:");

        txtDataPedido.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        txtDataPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDataPedidoActionPerformed(evt);
            }
        });

        btnVoltarCadastroPedido.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnVoltarCadastroPedido.setForeground(new java.awt.Color(0, 0, 0));
        btnVoltarCadastroPedido.setText("VOLTAR");
        btnVoltarCadastroPedido.setPreferredSize(new java.awt.Dimension(92, 31));
        btnVoltarCadastroPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarCadastroPedidoActionPerformed(evt);
            }
        });

        btnAddDetalhe.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnAddDetalhe.setForeground(new java.awt.Color(0, 0, 0));
        btnAddDetalhe.setText("Adicionar");
        btnAddDetalhe.setActionCommand("");
        btnAddDetalhe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddDetalheActionPerformed(evt);
            }
        });

        tblDetalhePedido.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        tblDetalhePedido.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Quantidade:", "Produto:", "Preço:", "Total:"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                true, true, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblDetalhePedido);

        lblQuantidadePedido2.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        lblQuantidadePedido2.setForeground(new java.awt.Color(0, 0, 0));
        lblQuantidadePedido2.setText("Preço:");

        txtPrecoPedido.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        txtPrecoPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecoPedidoActionPerformed(evt);
            }
        });

        btnSalvarPedido.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnSalvarPedido.setForeground(new java.awt.Color(0, 0, 0));
        btnSalvarPedido.setText("CADASTRAR");
        btnSalvarPedido.setEnabled(false);
        btnSalvarPedido.setPreferredSize(new java.awt.Dimension(92, 31));
        btnSalvarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarPedidoActionPerformed(evt);
            }
        });

        lblPedidoID.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        lblPedidoID.setForeground(new java.awt.Color(0, 0, 0));
        lblPedidoID.setText("Pedido ID");

        txtPedidoID.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        txtPedidoID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPedidoIDActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbnCadastroPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnVoltarCadastroPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblNomeProdtuoPedido)
                                    .addComponent(cboProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblQuantidadePedido, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtQuantidadePedido))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblQuantidadePedido2)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtPrecoPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(12, 12, 12)
                                        .addComponent(btnAddDetalhe, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblPedidoID, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPedidoID))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblNomeClientePedido)
                                    .addComponent(cboCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtDataPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblDataPedido))))))
                .addGap(26, 26, 26))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnSalvarPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblValorTotalPedido)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTotalPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(29, 29, 29))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbnCadastroPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNomeClientePedido, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblDataPedido))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cboCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDataPedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lblPedidoID)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPedidoID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNomeProdtuoPedido)
                            .addComponent(lblQuantidadePedido))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtQuantidadePedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cboProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblQuantidadePedido2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtPrecoPedido)
                            .addComponent(btnAddDetalhe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTotalPedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblValorTotalPedido))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVoltarCadastroPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalvarPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 542, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddDetalheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddDetalheActionPerformed
                
         if (txtPedidoID.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Favor preencher o campo ID !!");
            return;
        }
         
         if (txtQuantidadePedido.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Favor preencher o campo Quantidade !!");
            return;
        }
                  
         if (txtDataPedido.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Favor preencher o campo Data !!");
            return;
        }

        int idPedido = Integer.parseInt(txtPedidoID.getText());
        String nomeProduto = (String) cboProduto.getSelectedItem();
        int produtoId = getProdutoIdByName(nomeProduto);
        int quantidade = Integer.parseInt(txtQuantidadePedido.getText());
        double precoUnitario = Double.parseDouble(txtPrecoPedido.getText());

        
        DefaultTableModel model = (DefaultTableModel) tblDetalhePedido.getModel();
        double total = quantidade * precoUnitario;
        model.addRow(new Object[]{quantidade, nomeProduto, precoUnitario, total});

        
        DetalhePedido detalhe = new DetalhePedido(idPedido, produtoId, quantidade, precoUnitario);

        
        Pedido pedidoCorrespondente = null;
        for (Pedido pedido : Global.pedidos) {
            if (pedido.getId() == idPedido) {
                pedidoCorrespondente = pedido;
                break;
            }
        }
        
        if (pedidoCorrespondente == null) {
            pedidoCorrespondente = new Pedido(idPedido, LocalDate.now(), 0, 0.0); 
            Global.pedidos.add(pedidoCorrespondente);
        }
        
        pedidoCorrespondente.adicionarDetalhe(detalhe);

        
        Global.detalhepedidos.add(detalhe);
        
        txtTotalPedido.setText(String.valueOf(pedidoCorrespondente.getTotal()));
       
        txtQuantidadePedido.setText("");
        txtPrecoPedido.setText("");
        
        btnSalvarPedido.setEnabled(true);
    }//GEN-LAST:event_btnAddDetalheActionPerformed

    private void btnVoltarCadastroPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarCadastroPedidoActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnVoltarCadastroPedidoActionPerformed

    private void txtDataPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDataPedidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDataPedidoActionPerformed

    private void txtTotalPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalPedidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalPedidoActionPerformed

    private void txtQuantidadePedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQuantidadePedidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQuantidadePedidoActionPerformed

    private void txtPrecoPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecoPedidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecoPedidoActionPerformed

    private void btnSalvarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarPedidoActionPerformed
     
        if (txtPedidoID.getText().isEmpty() || txtDataPedido.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Favor preencher todos os campos !!");
            return;
        }

        String nomeCliente = (String) cboCliente.getSelectedItem();
        int clienteId = getClienteIdByName(nomeCliente);
        
        
        LocalDate dataPedido ;
        try {
            // Consistir o campo data
            String dataStr = txtDataPedido.getText();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yy");
            dataPedido = LocalDate.parse(dataStr, formatter);
        } catch (DateTimeParseException e) {
            JOptionPane.showMessageDialog(this, "Data inválida. Entre com a data no formato dd/MM/yy.");
            return; // Retorna para que o usuário possa corrigir a data
        }

        int idPedido = Integer.parseInt(txtPedidoID.getText());
     
        Pedido pedidoCorrespondente = null;
        for (Pedido pedido : Global.pedidos) {
            if (pedido.getId() == idPedido) {
                pedidoCorrespondente = pedido;
                pedidoCorrespondente.setClienteId(clienteId);
                pedidoCorrespondente.setDataVenda(dataPedido);
                break;
            }
        }
       
        JOptionPane.showMessageDialog(this, "Pedido cadastrado com sucesso !!!");
       
        txtPedidoID.setText("");
        cboCliente.setSelectedIndex(0);
        txtDataPedido.setText("");
        
        DefaultTableModel model = (DefaultTableModel) tblDetalhePedido.getModel();
        model.setRowCount(0);
    }//GEN-LAST:event_btnSalvarPedidoActionPerformed

    private void txtPedidoIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPedidoIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPedidoIDActionPerformed
  
    public static void main(String args[]) {
                
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CadastroPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
              
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroPedido().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddDetalhe;
    private javax.swing.JButton btnSalvarPedido;
    private javax.swing.JButton btnVoltarCadastroPedido;
    private javax.swing.JComboBox<String> cboCliente;
    private javax.swing.JComboBox<String> cboProduto;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDataPedido;
    private javax.swing.JLabel lblNomeClientePedido;
    private javax.swing.JLabel lblNomeProdtuoPedido;
    private javax.swing.JLabel lblPedidoID;
    private javax.swing.JLabel lblQuantidadePedido;
    private javax.swing.JLabel lblQuantidadePedido2;
    private javax.swing.JLabel lblValorTotalPedido;
    private javax.swing.JLabel lbnCadastroPedido;
    private javax.swing.JTable tblDetalhePedido;
    private javax.swing.JTextField txtDataPedido;
    private javax.swing.JTextField txtPedidoID;
    private javax.swing.JTextField txtPrecoPedido;
    private javax.swing.JTextField txtQuantidadePedido;
    private javax.swing.JTextField txtTotalPedido;
    // End of variables declaration//GEN-END:variables
}

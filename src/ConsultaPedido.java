/*
 Claudia Abilio - PI - UC 15 - 2025
 */

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;
public class ConsultaPedido extends javax.swing.JFrame {

        public ConsultaPedido() {
        BufferedImage img = new BufferedImage(1, 1, BufferedImage.TYPE_INT_ARGB);
        setIconImage(img);
        initComponents();
        carregarPedidos();
              
       
        tblConsultaPedido.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                if (e.getClickCount() == 1) {
                    int selectedRow = tblConsultaPedido.getSelectedRow();
                    if (selectedRow != -1) {
                        int pedidoId = (int) tblConsultaPedido.getValueAt(selectedRow, 0);
                        carregarDetalhesPedido(pedidoId);
                    }
                }
            }
        });
    }

    private void carregarPedidos() {
        DefaultTableModel model = (DefaultTableModel) tblConsultaPedido.getModel();
        model.setRowCount(0); 

        for (Pedido pedido : Global.pedidos) {
            
            Cliente cliente = null;
            for (Cliente c : Global.clientes) {
                if (c.getId() == pedido.getClienteId()) {
                    cliente = c;
                    break;
                }
            }
            
            if (cliente != null) {
                model.addRow(new Object[]{
                    pedido.getId(),
                    pedido.getDataVenda(),
                    cliente.getNome(),
                    pedido.getTotal() 
                });
            }
        }
    }

    private void carregarDetalhesPedido(int pedidoId) {
        DefaultTableModel model = (DefaultTableModel) tblDetalhePedido.getModel();
        model.setRowCount(0); 

        for (DetalhePedido detalhe : Global.detalhepedidos) {
            if (detalhe.getVendaId() == pedidoId) {
                
                String nomeProduto = getNomeProdutoById(detalhe.getProdutoId());

                model.addRow(new Object[]{
                    detalhe.getQuantidade(),
                    nomeProduto,
                    detalhe.getPrecoUnitario(),
                    detalhe.getQuantidade() * detalhe.getPrecoUnitario() 
                });
            }
        }
    }

    private String getNomeProdutoById(int produtoId) {
        for (Produto produto : Global.produtos) {
            if (produto.getId() == produtoId) {
                return produto.getNome();
            }
        }
        return "Produto não encontrado"; 
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblConsultaPedido = new javax.swing.JTable();
        btnVoltarConsultaPedido = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblDetalhePedido = new javax.swing.JTable();
        btnExcluirPedido = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Sistema Pizzaria Donna Massa");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 204, 102));
        jPanel1.setPreferredSize(new java.awt.Dimension(594, 525));

        jLabel1.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CONSULTA DE PEDIDOS");
        jLabel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel1.setPreferredSize(new java.awt.Dimension(43, 50));

        tblConsultaPedido.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id Pedido", "Data:", "Nome do Cliente:", "Valor Total:"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblConsultaPedido);

        btnVoltarConsultaPedido.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnVoltarConsultaPedido.setForeground(new java.awt.Color(0, 0, 0));
        btnVoltarConsultaPedido.setText("VOLTAR");
        btnVoltarConsultaPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarConsultaPedidoActionPerformed(evt);
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
        jScrollPane3.setViewportView(tblDetalhePedido);

        btnExcluirPedido.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnExcluirPedido.setForeground(new java.awt.Color(0, 0, 0));
        btnExcluirPedido.setText("EXCLUIR PEDIDO");
        btnExcluirPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirPedidoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnVoltarConsultaPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnExcluirPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 565, Short.MAX_VALUE)
                    .addComponent(jScrollPane3))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVoltarConsultaPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExcluirPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 526, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnVoltarConsultaPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarConsultaPedidoActionPerformed
        dispose();
    }//GEN-LAST:event_btnVoltarConsultaPedidoActionPerformed

    private void btnExcluirPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirPedidoActionPerformed
        int selectedRow = tblConsultaPedido.getSelectedRow();
        if (selectedRow != -1) {
            int confirmacao = JOptionPane.showConfirmDialog(null, "Você tem certeza que deseja excluir este pedido?", "Confirmação de Exclusão", JOptionPane.YES_NO_OPTION);
            if (confirmacao == JOptionPane.YES_OPTION) {
                 int pedidoId = (int) tblConsultaPedido.getValueAt(selectedRow, 0);
                 deletePedido(pedidoId);
                 ((DefaultTableModel) tblConsultaPedido.getModel()).removeRow(selectedRow);
            
            DefaultTableModel detalheModel = (DefaultTableModel) tblDetalhePedido.getModel();
            detalheModel.setRowCount(0);
        }
    }//GEN-LAST:event_btnExcluirPedidoActionPerformed
    }
    private void deletePedido(int pedidoId) {
        
        Global.pedidos.removeIf(pedido -> pedido.getId() == pedidoId);
        
        Global.detalhepedidos.removeIf(detalhe -> detalhe.getVendaId() == pedidoId);
        
        JOptionPane.showMessageDialog(this, "Pedido excluído com sucesso !!!");
    }
    
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ConsultaPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsultaPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsultaPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsultaPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
               
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsultaPedido().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExcluirPedido;
    private javax.swing.JButton btnVoltarConsultaPedido;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tblConsultaPedido;
    private javax.swing.JTable tblDetalhePedido;
    // End of variables declaration//GEN-END:variables
}

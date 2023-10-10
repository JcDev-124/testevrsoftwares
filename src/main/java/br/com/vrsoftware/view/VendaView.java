/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.com.vrsoftware.view;

import br.com.vrsoftware.utils.FormatarData;
import br.com.vrsoftware.model.EnumStatus;
import br.com.vrsoftware.model.OrdemVenda;
import br.com.vrsoftware.model.Produto;
import br.com.vrsoftware.model.Vendas;
import br.com.vrsoftware.controller.ClienteController;
import br.com.vrsoftware.controller.OrdemVendasController;
import br.com.vrsoftware.controller.ProdutoController;
import br.com.vrsoftware.controller.VendasController;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.time.LocalDate;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Julio
 */
public class VendaView extends javax.swing.JFrame {

    private DefaultTableModel model;
    ProdutoController controller = new ProdutoController();

    /**
     * Creates new form VendaView
     */
    public VendaView() {

        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        setResizable(false);
        initComponents();

        //setando algumas coisas iniciais
        lblErroDescricao.setVisible(false);
        lblErroQuantidade.setVisible(false);

        lblClienteErro.setVisible(false);

        addChangeListenerProduto(txtDescricao, btbRegistrar, lblErroDescricao, txtPrecoProduto, txtQuantidadeComprada, txtTotal);
        addChangeListenerQuantidade(txtQuantidadeComprada, btbRegistrar, lblErroQuantidade);
        btnFinalizar.setEnabled(false);
        monitorarAlteracoesNaTabela(tblProdutos, btnFinalizar);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        txtDescricao = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        txtPrecoProduto = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        txtQuantidadeComprada = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        txtTotal = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProdutos = new javax.swing.JTable();
        jPanel8 = new javax.swing.JPanel();
        txtSubTotal = new javax.swing.JTextField();
        btbRegistrar = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        btnFinalizar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtCliente = new javax.swing.JTextField();
        btnFechar = new javax.swing.JButton();
        lblErroQuantidade = new javax.swing.JLabel();
        lblErroDescricao = new javax.swing.JLabel();
        lblClienteErro = new javax.swing.JLabel();
        btnRegistraCliente = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Descrição do produto"));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtDescricao)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(txtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Preço"));

        txtPrecoProduto.setEditable(false);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtPrecoProduto, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(txtPrecoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("Quantidade"));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtQuantidadeComprada, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(txtQuantidadeComprada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder("Total"));

        txtTotal.setEditable(false);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtTotal, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2.setText("VENDA");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Produtos\n"));

        tblProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Produto", "Quantidade", "Preço"
            }
        ));
        jScrollPane1.setViewportView(tblProdutos);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder("Subtotal"));

        txtSubTotal.setEditable(false);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtSubTotal, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtSubTotal, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                .addContainerGap())
        );

        btbRegistrar.setText("Registrar");
        btbRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btbRegistrarActionPerformed(evt);
            }
        });

        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        btnFinalizar.setText("Finalizar venda");
        btnFinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalizarActionPerformed(evt);
            }
        });

        jLabel1.setText("Cliente");

        txtCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtClienteActionPerformed(evt);
            }
        });

        btnFechar.setText("X");
        btnFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharActionPerformed(evt);
            }
        });

        lblErroQuantidade.setForeground(new java.awt.Color(255, 0, 51));
        lblErroQuantidade.setText("* campo inválido");

        lblErroDescricao.setForeground(new java.awt.Color(255, 0, 51));
        lblErroDescricao.setText("*produto nao cadastrado");

        lblClienteErro.setForeground(new java.awt.Color(255, 51, 51));
        lblClienteErro.setText("* cliente nao cadastrado");

        btnRegistraCliente.setText("Registrar Cliente");
        btnRegistraCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistraClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblErroDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btbRegistrar)
                                .addGap(18, 18, 18)
                                .addComponent(btnLimpar))
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(lblErroQuantidade))))
                        .addGap(9, 9, 9)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lblClienteErro, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btnFinalizar)
                                        .addComponent(txtCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGap(18, 18, 18)
                            .addComponent(btnRegistraCliente)))
                    .addComponent(btnFechar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(jLabel2))
                            .addComponent(btnFechar))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblErroDescricao)
                        .addGap(7, 7, 7)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblErroQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btbRegistrar)
                            .addComponent(btnLimpar)))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblClienteErro)
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 37, Short.MAX_VALUE)
                        .addComponent(btnFinalizar))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(btnRegistraCliente))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btbRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btbRegistrarActionPerformed
        // TODO add your handling code here:
        OrdemVendasController controllerVendas = new OrdemVendasController();
        Integer quantidade;

        String descricao = txtDescricao.getText();
        Double preco = controller.retornaProdutoPorNome(descricao.toUpperCase()).getPreco();
        txtPrecoProduto.setText(preco.toString());
        txtTotal.setText(String.valueOf(0));
        quantidade = Integer.parseInt(txtQuantidadeComprada.getText());
        Double total = preco * quantidade;
        txtTotal.setText(total.toString());
        txtSubTotal.setText(String.valueOf(0));

        addChangeListenerAtualizaValor(txtTotal, txtSubTotal, total);

        model = (DefaultTableModel) tblProdutos.getModel();

        if (atualizaTabela(tblProdutos, txtDescricao.getText().toUpperCase(), Integer.parseInt(txtQuantidadeComprada.getText())) == false) {
            model.addRow(new Object[]{descricao.toUpperCase(), quantidade, preco});
        }
        limparCampos();
        btnFinalizar.setEnabled(false);


    }//GEN-LAST:event_btbRegistrarActionPerformed


    private void btnFinalizarActionPerformed(java.awt.event.ActionEvent evt) {
        model = (DefaultTableModel) tblProdutos.getModel();
        percorrerJTable(tblProdutos);
        atualizaEstoque(tblProdutos);

        ClienteController controller = new ClienteController();
        VendasController controllerVenda = new VendasController();

        String cliente = txtCliente.getText();
        Integer id = controller.pegarCliente(cliente).getId();

        EnumStatus status = EnumStatus.FINALIZADO;
        String valor = txtSubTotal.getText();
        Double valorTotal = Double.parseDouble(valor);

        Vendas venda = new Vendas(FormatarData.parseData(FormatarData.formataData(LocalDate.now())), id, status, valorTotal);
        controllerVenda.inserirVenda(venda);

        model.setRowCount(0);
        limparCampos();
        limpaCamposFinalizar();

        JOptionPane.showMessageDialog(null, "Venda finalizada", "Mensagem", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnFinalizarActionPerformed


    private void btnFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharActionPerformed
        // TODO add your handling code here:

        this.dispose();
        SistemaView s = new SistemaView();
        s.setVisible(true);
        s.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnFecharActionPerformed

    private void txtClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtClienteActionPerformed

    private void btnRegistraClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistraClienteActionPerformed
        // TODO add your handling code here:
        model = (DefaultTableModel) tblProdutos.getModel();

        ClienteController controller = new ClienteController();

        btnFinalizar.setEnabled(false);
        String nome = txtCliente.getText();
        Integer id = controller.pegarCliente(nome).getId();
        
        if(id == null ) model.setRowCount(0);
        int rowCount = tblProdutos.getRowCount();

        if (rowCount == 0) {
            btnFinalizar.setEnabled(false);
        } else {
            btnFinalizar.setEnabled(true);
        }


    }//GEN-LAST:event_btnRegistraClienteActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        // TODO add your handling code here:
        txtPrecoProduto.setText("");
        txtQuantidadeComprada.setText("");
        txtDescricao.setText("");
        txtTotal.setText("");
        lblErroDescricao.setVisible(false);
        lblErroQuantidade.setVisible(false);
        btbRegistrar.setEnabled(false);

    }//GEN-LAST:event_btnLimparActionPerformed

    private static void addChangeListenerAtualizaValor(JTextField textField, JTextField textField2, Double valor) {
        textField.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                textChanged();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                textChanged();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                textChanged();
            }

            private void textChanged() {
                Double valorAtual = Double.valueOf(textField2.getText());
                textField2.setText(String.valueOf(valorAtual + valor));
            }

        });
    }

    private static void addChangeListenerProduto(JTextField textField, JButton btnSalvar, JLabel lblErro, JTextField lblPreco,
                                                 JTextField lblQuantidade, JTextField txtTotal) {

        textField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    textChanged(textField, btnSalvar, lblErro, lblPreco, lblQuantidade, txtTotal);
                }
            }
        });

        textField.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                // No longer needed here
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                // No longer needed here
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                // No longer needed here
            }
        });
    }

    private static void textChanged(JTextField textField, JButton btnSalvar, JLabel lblErro, JTextField lblPreco,
                                    JTextField lblQuantidade, JTextField txtTotal) {
        ProdutoController controller = new ProdutoController();
        Produto produto = new Produto();

        String descricao = textField.getText();
        produto = controller.retornaProdutoPorNome(descricao);
        if (produto != null) {
            String preco = produto.getPreco().toString();
            lblPreco.setText(preco);
            lblQuantidade.setText("1");
            Double total = Double.parseDouble(lblQuantidade.getText()) * produto.getPreco();
            txtTotal.setText(total.toString());
            btnSalvar.setEnabled(true);
            lblErro.setVisible(false);
        } else {
            btnSalvar.setEnabled(false);
            lblErro.setVisible(true);
        }
    }


    private static void addChangeListenerQuantidade(JTextField textField, JButton btnSalvar, JLabel lblErroQuantidade) {
        textField.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                textChanged();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                textChanged();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                textChanged();
            }

            private void textChanged() {
                String text = textField.getText();

                if (text.matches("\\d+") && Integer.parseInt(text) >= 0) {
                    btnSalvar.setEnabled(true);
                    lblErroQuantidade.setVisible(false);
                } else {
                    btnSalvar.setEnabled(false);
                    lblErroQuantidade.setVisible(true);
                }
            }
        });
    }

    public static void monitorarAlteracoesNaTabela(JTable table, JButton btnFinalizar) {
        table.getModel().addTableModelListener(new TableModelListener() {
            @Override
            public void tableChanged(TableModelEvent e) {
                int rowCount = table.getRowCount();
                if (rowCount == 0) {
                    btnFinalizar.setEnabled(false);
                } else {
                    btnFinalizar.setEnabled(true);
                }
            }
        });
    }

    public static void percorrerJTable(JTable table) {
        OrdemVendasController controller = new OrdemVendasController();
        ProdutoController controllerProduto = new ProdutoController();
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        int rowCount = model.getRowCount();

        for (int i = 0; i < rowCount; i++) {
            // Obtém os valores das colunas 0, 1 e 2 para a linha atual
            String col0Value = (String) model.getValueAt(i, 0);
            Integer col1Value = (Integer) model.getValueAt(i, 1);
            Double col2Value = (Double) model.getValueAt(i, 2);
            Integer id = controllerProduto.retornaProdutoPorNome(col0Value).getId();
            OrdemVenda ordemVendas = new OrdemVenda(id, col1Value, col2Value);
            controller.inserirOrdemVendas(ordemVendas);
        }
    }

    private void limparCampos() {
        txtPrecoProduto.setText("");
        txtQuantidadeComprada.setText("");
        txtTotal.setText("");
        txtDescricao.setText("");
        lblErroDescricao.setVisible(false);
        lblErroQuantidade.setVisible(false);
    }

    private void limpaCamposFinalizar() {
        txtCliente.setText("");
        txtSubTotal.setText("");
        lblClienteErro.setText("");

    }

    public static boolean atualizaTabela(JTable table, String targetString, Integer incrementValue) {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        int rowCount = model.getRowCount();

        for (int i = 0; i < rowCount; i++) {
            Object value = model.getValueAt(i, 0);
            if (value != null && value.toString().equals(targetString)) {
                int currentValue = (int) model.getValueAt(i, 1);
                model.setValueAt(currentValue + incrementValue, i, 1);
                return true;

            }
        }
        return false;
    }

    public static void atualizaEstoque(JTable table) {

        ProdutoController controller = new ProdutoController();
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        int rowCount = model.getRowCount();

        for (int i = 0; i < rowCount; i++) {
            String nome = (String) model.getValueAt(i, 0);
            Integer quantidade = (Integer) model.getValueAt(i, 1);
            Double preco = (Double) model.getValueAt(i, 2);
            Produto produto = new Produto(nome, preco, quantidade * -1);

            controller.atualizaProduto(produto);

        }
    }

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
            java.util.logging.Logger.getLogger(VendaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VendaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VendaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VendaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VendaView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btbRegistrar;
    private javax.swing.JButton btnFechar;
    private javax.swing.JButton btnFinalizar;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnRegistraCliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblClienteErro;
    private javax.swing.JLabel lblErroDescricao;
    private javax.swing.JLabel lblErroQuantidade;
    private javax.swing.JTable tblProdutos;
    private javax.swing.JTextField txtCliente;
    private javax.swing.JTextField txtDescricao;
    private javax.swing.JTextField txtPrecoProduto;
    private javax.swing.JTextField txtQuantidadeComprada;
    private javax.swing.JTextField txtSubTotal;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
}

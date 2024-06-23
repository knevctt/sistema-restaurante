/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package integrador.telas;

import integrador.dao.ProdutosDAO;
import integrador.dao.TipoDeProdutosDAO;
import integrador.dao.funcionariosDAO;
import integrador.model.Funcionarios;
import integrador.model.Produtos;
import integrador.model.TipoDeProduto;
import javax.swing.JOptionPane;
import integrador.utilitarios.Utilitarios;
import java.awt.event.KeyEvent;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class Estoque extends javax.swing.JFrame {

    /**
     * Creates new form funcionarios
     */
    
    public void listar(){
        ProdutosDAO dao = new ProdutosDAO();
        List<Produtos> lista = dao.Listar();
        DefaultTableModel dados = (DefaultTableModel)tabela.getModel();
        dados.setNumRows(0);
        for(Produtos p : lista){
            dados.addRow(new Object[]{
                p.getIdProduct(),
                p.getNameProduct(),
                p.getPrice(),
                p.getStock(),
                p.getTipodeproduto().getProductType()
            });
        }
    }
    
    public Estoque() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PainelControleEstoque = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        PainelGuiasMenuControle = new javax.swing.JTabbedPane();
        CadastrarProdutos = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        idProduto = new javax.swing.JTextField();
        txtDescricao = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        botaoSalvar = new javax.swing.JButton();
        btnPesquisar = new javax.swing.JButton();
        botaoNovo = new javax.swing.JButton();
        botaoEditar = new javax.swing.JButton();
        botaoExcluir = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        txtPreco = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtQuantidade = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        cbTipoProduto = new javax.swing.JComboBox();
        ConsultarFuncionarios = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        txtPesquisaDescricao = new javax.swing.JTextField();
        btnPesquisa = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Estoque");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        PainelControleEstoque.setBackground(new java.awt.Color(0, 0, 0));
        PainelControleEstoque.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel1.setFont(new java.awt.Font("MonoLisa-BoldItalic", 1, 32)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(207, 181, 59));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CONTROLE DE ESTOQUE");

        javax.swing.GroupLayout PainelControleEstoqueLayout = new javax.swing.GroupLayout(PainelControleEstoque);
        PainelControleEstoque.setLayout(PainelControleEstoqueLayout);
        PainelControleEstoqueLayout.setHorizontalGroup(
            PainelControleEstoqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PainelControleEstoqueLayout.setVerticalGroup(
            PainelControleEstoqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelControleEstoqueLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        PainelGuiasMenuControle.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        CadastrarProdutos.setBackground(new java.awt.Color(204, 204, 204));
        CadastrarProdutos.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        CadastrarProdutos.setPreferredSize(new java.awt.Dimension(1100, 700));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("Codigo:");

        idProduto.setEditable(false);
        idProduto.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        idProduto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        idProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idProdutoActionPerformed(evt);
            }
        });

        txtDescricao.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtDescricao.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        txtDescricao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDescricaoActionPerformed(evt);
            }
        });
        txtDescricao.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtDescricaoKeyPressed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Preço:");

        botaoSalvar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        botaoSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icone salvar.png"))); // NOI18N
        botaoSalvar.setText("Salvar");
        botaoSalvar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        botaoSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSalvarActionPerformed(evt);
            }
        });

        btnPesquisar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icone pesquisar.png"))); // NOI18N
        btnPesquisar.setText("Pesquisar");
        btnPesquisar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        botaoNovo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        botaoNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icone novo.png"))); // NOI18N
        botaoNovo.setText("Novo");
        botaoNovo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        botaoNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoNovoActionPerformed(evt);
            }
        });

        botaoEditar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        botaoEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icone editar.png"))); // NOI18N
        botaoEditar.setText("Editar");
        botaoEditar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        botaoEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoEditarActionPerformed(evt);
            }
        });

        botaoExcluir.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        botaoExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icone excluir.png"))); // NOI18N
        botaoExcluir.setText("Excluir");
        botaoExcluir.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        botaoExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoExcluirActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel9.setText("Descrição:");

        txtPreco.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtPreco.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        txtPreco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecoActionPerformed(evt);
            }
        });
        txtPreco.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPrecoKeyPressed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel10.setText("Qtd. Estoque");

        txtQuantidade.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtQuantidade.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        txtQuantidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQuantidadeActionPerformed(evt);
            }
        });
        txtQuantidade.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtQuantidadeKeyPressed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel12.setText("Produto tipo:");

        cbTipoProduto.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cbTipoProduto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        cbTipoProduto.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                cbTipoProdutoAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        cbTipoProduto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbTipoProdutoMouseClicked(evt);
            }
        });
        cbTipoProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbTipoProdutoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout CadastrarProdutosLayout = new javax.swing.GroupLayout(CadastrarProdutos);
        CadastrarProdutos.setLayout(CadastrarProdutosLayout);
        CadastrarProdutosLayout.setHorizontalGroup(
            CadastrarProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CadastrarProdutosLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(CadastrarProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CadastrarProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(CadastrarProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbTipoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(CadastrarProdutosLayout.createSequentialGroup()
                        .addGroup(CadastrarProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(CadastrarProdutosLayout.createSequentialGroup()
                                .addComponent(botaoNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botaoSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botaoEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botaoExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 475, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(idProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(CadastrarProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtPreco, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtQuantidade, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)))
                .addGap(0, 25, Short.MAX_VALUE))
        );
        CadastrarProdutosLayout.setVerticalGroup(
            CadastrarProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CadastrarProdutosLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(CadastrarProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(idProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(CadastrarProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesquisar))
                .addGap(18, 18, 18)
                .addGroup(CadastrarProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(CadastrarProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(0, 16, Short.MAX_VALUE)
                .addGroup(CadastrarProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbTipoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGap(60, 60, 60)
                .addGroup(CadastrarProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoSalvar)
                    .addComponent(botaoNovo)
                    .addComponent(botaoEditar)
                    .addComponent(botaoExcluir))
                .addContainerGap(90, Short.MAX_VALUE))
        );

        PainelGuiasMenuControle.addTab("Cadastrar Produtos", CadastrarProdutos);

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel11.setText("Descrição do Produto:");

        txtPesquisaDescricao.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtPesquisaDescricao.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        txtPesquisaDescricao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPesquisaDescricaoActionPerformed(evt);
            }
        });
        txtPesquisaDescricao.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPesquisaDescricaoKeyReleased(evt);
            }
        });

        btnPesquisa.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnPesquisa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icone pesquisar.png"))); // NOI18N
        btnPesquisa.setText("Pesquisar");
        btnPesquisa.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        btnPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisaActionPerformed(evt);
            }
        });

        tabela.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        tabela.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Descrição:", "Preço", "Estoque", "Tipo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.Double.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tabela.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabela);
        if (tabela.getColumnModel().getColumnCount() > 0) {
            tabela.getColumnModel().getColumn(0).setHeaderValue("ID");
            tabela.getColumnModel().getColumn(1).setHeaderValue("Descrição:");
            tabela.getColumnModel().getColumn(2).setHeaderValue("Preço");
            tabela.getColumnModel().getColumn(3).setHeaderValue("Estoque");
            tabela.getColumnModel().getColumn(4).setHeaderValue("Tipo");
        }

        javax.swing.GroupLayout ConsultarFuncionariosLayout = new javax.swing.GroupLayout(ConsultarFuncionarios);
        ConsultarFuncionarios.setLayout(ConsultarFuncionariosLayout);
        ConsultarFuncionariosLayout.setHorizontalGroup(
            ConsultarFuncionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ConsultarFuncionariosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ConsultarFuncionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 762, Short.MAX_VALUE)
                    .addGroup(ConsultarFuncionariosLayout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtPesquisaDescricao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        ConsultarFuncionariosLayout.setVerticalGroup(
            ConsultarFuncionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ConsultarFuncionariosLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(ConsultarFuncionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPesquisaDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesquisa))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        PainelGuiasMenuControle.addTab("Consulta de Produtos", ConsultarFuncionarios);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelControleEstoque, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(PainelGuiasMenuControle, javax.swing.GroupLayout.DEFAULT_SIZE, 774, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PainelControleEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(PainelGuiasMenuControle, javax.swing.GroupLayout.PREFERRED_SIZE, 502, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botaoSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSalvarActionPerformed
        Produtos obj = new Produtos();
        obj.setNameProduct(txtDescricao.getText());
        obj.setPrice(Double.valueOf(txtPreco.getText()));
        obj.setStock(Integer.valueOf(txtQuantidade.getText()));
        obj.setTipodeproduto((TipoDeProduto)cbTipoProduto.getSelectedItem());
        
        ProdutosDAO dao = new ProdutosDAO();
        dao.Salvar(obj);
        Utilitarios util = new Utilitarios();
        util.LimpaTela(CadastrarProdutos);
    }//GEN-LAST:event_botaoSalvarActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        
        String nameProduct = txtDescricao.getText();
        
        Produtos obj = new Produtos();
        ProdutosDAO dao = new ProdutosDAO();
        
        TipoDeProduto tp = new TipoDeProduto();
        TipoDeProdutosDAO tpdao = new TipoDeProdutosDAO();
        
        
        obj = dao.BuscarProdutos(nameProduct);
        
        if(obj.getNameProduct() != null){
            
            idProduto.setText(String.valueOf(obj.getIdProduct()));
            txtDescricao.setText(obj.getNameProduct());
            txtPreco.setText(String.valueOf(obj.getPrice()));
            txtQuantidade.setText(String.valueOf(obj.getStock()));
        
            tp = tpdao.BuscarTipoDeProdutos(obj.getTipodeproduto().getProductType());
            cbTipoProduto.getModel().setSelectedItem(tp);
            
        }else{
            JOptionPane.showMessageDialog(null, "Produto nao encontrado");
        }
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void txtDescricaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDescricaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDescricaoActionPerformed

    private void botaoNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoNovoActionPerformed
        
        
        Utilitarios util = new Utilitarios();
        util.LimpaTela(CadastrarProdutos);
    }//GEN-LAST:event_botaoNovoActionPerformed

    private void botaoEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoEditarActionPerformed
        Produtos obj = new Produtos();
        obj.setIdProduct(Integer.valueOf(idProduto.getText()));
        obj.setNameProduct(txtDescricao.getText());
        obj.setPrice(Double.valueOf(txtPreco.getText()));
        obj.setStock(Integer.valueOf(txtQuantidade.getText()));
        
        TipoDeProduto tp = new TipoDeProduto();
        tp = (TipoDeProduto) cbTipoProduto.getSelectedItem();
        
        obj.setTipodeproduto(tp);
        
        ProdutosDAO dao = new ProdutosDAO();
        dao.Editar(obj);
        Utilitarios util = new Utilitarios();
        util.LimpaTela(CadastrarProdutos);
    }//GEN-LAST:event_botaoEditarActionPerformed

    private void botaoExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoExcluirActionPerformed
        Produtos obj = new Produtos();
        obj.setIdProduct(Integer.valueOf(idProduto.getText()));
        ProdutosDAO dao = new ProdutosDAO();
        dao.Excluir(obj);
        Utilitarios util = new Utilitarios();
        util.LimpaTela(CadastrarProdutos);
    }//GEN-LAST:event_botaoExcluirActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        listar();
        
        //esse utilitarios é pra colocar icone na janela no canto superior esquerdo
        Utilitarios u = new Utilitarios();
        u.InserirIcone(this);
    }//GEN-LAST:event_formWindowActivated

    private void btnPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisaActionPerformed
        String nameProduct = "%" + txtPesquisaDescricao.getText() + "%";
        ProdutosDAO dao = new ProdutosDAO();
        List<Produtos> lista = dao.Filtrar(nameProduct);
        DefaultTableModel dados = (DefaultTableModel)tabela.getModel();
        dados.setNumRows(0);
        for(Produtos p : lista){
            dados.addRow(new Object[]{
                p.getIdProduct(),
                p.getNameProduct(),
                p.getPrice(),
                p.getStock(),
                p.getTipodeproduto().getProductType()
            });
        }
    }//GEN-LAST:event_btnPesquisaActionPerformed

    private void txtPesquisaDescricaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPesquisaDescricaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPesquisaDescricaoActionPerformed

    private void txtPesquisaDescricaoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesquisaDescricaoKeyReleased
        String nameProduct = "%" + txtPesquisaDescricao.getText() + "%";
        ProdutosDAO dao = new ProdutosDAO();
        List<Produtos> lista = dao.Filtrar(nameProduct);
        DefaultTableModel dados = (DefaultTableModel)tabela.getModel();
        dados.setNumRows(0);
        for(Produtos p : lista){
            dados.addRow(new Object[]{
                p.getIdProduct(),
                p.getNameProduct(),
                p.getPrice(),
                p.getStock(),
                p.getTipodeproduto().getProductType()
            });
        }
    }//GEN-LAST:event_txtPesquisaDescricaoKeyReleased

    private void txtDescricaoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDescricaoKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            String nameProduct = txtDescricao.getText();
        
        Produtos obj = new Produtos();
        ProdutosDAO dao = new ProdutosDAO();
        
        TipoDeProduto tp = new TipoDeProduto();
        TipoDeProdutosDAO tpdao = new TipoDeProdutosDAO();
        
        
        obj = dao.BuscarProdutos(nameProduct);
        
        if(obj.getNameProduct() != null){
            
            idProduto.setText(String.valueOf(obj.getIdProduct()));
            txtDescricao.setText(obj.getNameProduct());
            txtPreco.setText(String.valueOf(obj.getPrice()));
            txtQuantidade.setText(String.valueOf(obj.getStock()));
        
            tp = tpdao.BuscarTipoDeProdutos(obj.getTipodeproduto().getProductType());
            cbTipoProduto.getModel().setSelectedItem(tp);
            }else{
            JOptionPane.showMessageDialog(null, "Produto nao encontrado");
        }
        }
    }//GEN-LAST:event_txtDescricaoKeyPressed

    private void tabelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaMouseClicked
        PainelGuiasMenuControle.setSelectedIndex(0);
        idProduto.setText(tabela.getValueAt(tabela.getSelectedRow(), 0).toString());
        txtDescricao.setText(tabela.getValueAt(tabela.getSelectedRow(), 1).toString());
        txtPreco.setText(tabela.getValueAt(tabela.getSelectedRow(), 2).toString());
        txtQuantidade.setText(tabela.getValueAt(tabela.getSelectedRow(), 3).toString());
        
        TipoDeProduto tp = new TipoDeProduto();
        TipoDeProdutosDAO tpDAO = new TipoDeProdutosDAO();
        
        tp = tpDAO.BuscarTipoDeProdutos(tabela.getValueAt(tabela.getSelectedRow(), 4).toString());
        cbTipoProduto.removeAllItems();
        cbTipoProduto.getModel().setSelectedItem(tp);
    }//GEN-LAST:event_tabelaMouseClicked

    private void txtPrecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecoActionPerformed

    private void txtPrecoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecoKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecoKeyPressed

    private void txtQuantidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQuantidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQuantidadeActionPerformed

    private void txtQuantidadeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtQuantidadeKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQuantidadeKeyPressed

    private void idProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idProdutoActionPerformed

    private void cbTipoProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbTipoProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbTipoProdutoActionPerformed

    private void cbTipoProdutoAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_cbTipoProdutoAncestorAdded
        
    }//GEN-LAST:event_cbTipoProdutoAncestorAdded

    private void cbTipoProdutoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbTipoProdutoMouseClicked
        TipoDeProdutosDAO dao = new TipoDeProdutosDAO();
        List<TipoDeProduto> lista = dao.Listar();
        cbTipoProduto.removeAllItems();
        for(TipoDeProduto tp : lista){
        cbTipoProduto.addItem(tp);        
        }
    }//GEN-LAST:event_cbTipoProdutoMouseClicked

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Estoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Estoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Estoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Estoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Estoque().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel CadastrarProdutos;
    private javax.swing.JPanel ConsultarFuncionarios;
    private javax.swing.JPanel PainelControleEstoque;
    private javax.swing.JTabbedPane PainelGuiasMenuControle;
    private javax.swing.JButton botaoEditar;
    private javax.swing.JButton botaoExcluir;
    private javax.swing.JButton botaoNovo;
    private javax.swing.JButton botaoSalvar;
    private javax.swing.JButton btnPesquisa;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JComboBox cbTipoProduto;
    private javax.swing.JTextField idProduto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabela;
    private javax.swing.JTextField txtDescricao;
    private javax.swing.JTextField txtPesquisaDescricao;
    private javax.swing.JTextField txtPreco;
    private javax.swing.JTextField txtQuantidade;
    // End of variables declaration//GEN-END:variables
}

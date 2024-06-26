/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package integrador.telas;

import integrador.dao.ProdutosDAO;
import integrador.dao.TipoDeProdutosDAO;
import integrador.model.Produtos;
import integrador.model.TipoDeProduto;
import javax.swing.JOptionPane;
import integrador.utilitarios.Utilitarios;
import java.awt.event.KeyEvent;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class FormularioEstoque extends javax.swing.JDialog {

    int idProduto;
    int qtd_atualizada;
    
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
    
    public FormularioEstoque(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
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
        PainelGuiasEstoque = new javax.swing.JTabbedPane();
        DadosDoProduto = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        txtDescricao = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        botaoSalvar = new javax.swing.JButton();
        btnPesquisar = new javax.swing.JButton();
        botaoNovo = new javax.swing.JButton();
        botaoEditar = new javax.swing.JButton();
        botaoExcluir = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        txtQtdAtual = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtQtd_Nova = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        btnAdicionar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Estoque");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        PainelControleEstoque.setBackground(new java.awt.Color(60, 110, 113));
        PainelControleEstoque.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel1.setFont(new java.awt.Font("MonoLisa-BoldItalic", 1, 32)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Estoque");

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

        PainelGuiasEstoque.setFont(new java.awt.Font("MonoLisa-Regular", 0, 14)); // NOI18N

        DadosDoProduto.setBackground(new java.awt.Color(40, 75, 99));
        DadosDoProduto.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        DadosDoProduto.setPreferredSize(new java.awt.Dimension(1100, 700));

        jLabel2.setFont(new java.awt.Font("MonoLisa-Regular", 0, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(217, 217, 217));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("Codigo:");

        txtCodigo.setEditable(false);
        txtCodigo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtCodigo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txtCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoActionPerformed(evt);
            }
        });

        txtDescricao.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtDescricao.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
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

        jLabel3.setFont(new java.awt.Font("MonoLisa-Regular", 0, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(217, 217, 217));
        jLabel3.setText("Qtd. Atual:");

        botaoSalvar.setFont(new java.awt.Font("MonoLisa-Regular", 0, 12)); // NOI18N
        botaoSalvar.setForeground(new java.awt.Color(53, 53, 53));
        botaoSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icone salvar.png"))); // NOI18N
        botaoSalvar.setText("Salvar");
        botaoSalvar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        botaoSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSalvarActionPerformed(evt);
            }
        });

        btnPesquisar.setFont(new java.awt.Font("MonoLisa-Regular", 0, 12)); // NOI18N
        btnPesquisar.setForeground(new java.awt.Color(53, 53, 53));
        btnPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icone pesquisar.png"))); // NOI18N
        btnPesquisar.setText("Pesquisar");
        btnPesquisar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        botaoNovo.setFont(new java.awt.Font("MonoLisa-Regular", 0, 12)); // NOI18N
        botaoNovo.setForeground(new java.awt.Color(53, 53, 53));
        botaoNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icone novo.png"))); // NOI18N
        botaoNovo.setText("Novo");
        botaoNovo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        botaoNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoNovoActionPerformed(evt);
            }
        });

        botaoEditar.setFont(new java.awt.Font("MonoLisa-Regular", 0, 12)); // NOI18N
        botaoEditar.setForeground(new java.awt.Color(53, 53, 53));
        botaoEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icone editar.png"))); // NOI18N
        botaoEditar.setText("Editar");
        botaoEditar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        botaoEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoEditarActionPerformed(evt);
            }
        });

        botaoExcluir.setFont(new java.awt.Font("MonoLisa-Regular", 0, 12)); // NOI18N
        botaoExcluir.setForeground(new java.awt.Color(53, 53, 53));
        botaoExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icone excluir.png"))); // NOI18N
        botaoExcluir.setText("Excluir");
        botaoExcluir.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        botaoExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoExcluirActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("MonoLisa-Regular", 0, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(217, 217, 217));
        jLabel9.setText("Descrição:");

        txtQtdAtual.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtQtdAtual.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txtQtdAtual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQtdAtualActionPerformed(evt);
            }
        });
        txtQtdAtual.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtQtdAtualKeyPressed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("MonoLisa-Regular", 0, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(217, 217, 217));
        jLabel10.setText("Quantidade:");

        txtQtd_Nova.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtQtd_Nova.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txtQtd_Nova.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQtd_NovaActionPerformed(evt);
            }
        });
        txtQtd_Nova.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtQtd_NovaKeyPressed(evt);
            }
        });

        jScrollPane2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

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
        jScrollPane2.setViewportView(tabela);
        if (tabela.getColumnModel().getColumnCount() > 0) {
            tabela.getColumnModel().getColumn(0).setHeaderValue("ID");
            tabela.getColumnModel().getColumn(1).setHeaderValue("Descrição:");
            tabela.getColumnModel().getColumn(2).setHeaderValue("Preço");
            tabela.getColumnModel().getColumn(3).setHeaderValue("Estoque");
            tabela.getColumnModel().getColumn(4).setHeaderValue("Tipo");
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 265, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        btnAdicionar.setFont(new java.awt.Font("MonoLisa-Regular", 0, 14)); // NOI18N
        btnAdicionar.setForeground(new java.awt.Color(53, 53, 53));
        btnAdicionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icone add.png"))); // NOI18N
        btnAdicionar.setText("Adicionar");
        btnAdicionar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        btnAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout DadosDoProdutoLayout = new javax.swing.GroupLayout(DadosDoProduto);
        DadosDoProduto.setLayout(DadosDoProdutoLayout);
        DadosDoProdutoLayout.setHorizontalGroup(
            DadosDoProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DadosDoProdutoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(DadosDoProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(DadosDoProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DadosDoProdutoLayout.createSequentialGroup()
                        .addGroup(DadosDoProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(DadosDoProdutoLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(botaoNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botaoSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botaoEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botaoExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, DadosDoProdutoLayout.createSequentialGroup()
                                .addComponent(txtQtdAtual, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(102, 102, 102)
                                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(14, 14, 14)
                                .addComponent(txtQtd_Nova, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtDescricao, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(18, 18, 18)
                        .addGroup(DadosDoProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnPesquisar, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                            .addComponent(btnAdicionar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(38, 38, 38))
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        DadosDoProdutoLayout.setVerticalGroup(
            DadosDoProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DadosDoProdutoLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(DadosDoProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(DadosDoProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(DadosDoProdutoLayout.createSequentialGroup()
                        .addGroup(DadosDoProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnPesquisar))
                        .addGap(18, 18, 18)
                        .addGroup(DadosDoProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtQtdAtual, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(DadosDoProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtQtd_Nova, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel10)))
                .addGap(30, 30, 30)
                .addGroup(DadosDoProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoSalvar)
                    .addComponent(botaoNovo)
                    .addComponent(botaoEditar)
                    .addComponent(botaoExcluir))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        PainelGuiasEstoque.addTab("Dados do produto", DadosDoProduto);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelControleEstoque, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(PainelGuiasEstoque, javax.swing.GroupLayout.DEFAULT_SIZE, 815, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PainelControleEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(PainelGuiasEstoque, javax.swing.GroupLayout.DEFAULT_SIZE, 547, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botaoSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSalvarActionPerformed
        Produtos obj = new Produtos();
        obj.setNameProduct(txtDescricao.getText());
        obj.setPrice(Double.valueOf(txtQtdAtual.getText()));
        obj.setStock(Integer.valueOf(txtQtd_Nova.getText()));
        
        ProdutosDAO dao = new ProdutosDAO();
        dao.Salvar(obj);
        Utilitarios util = new Utilitarios();
        util.LimpaTela(DadosDoProduto);
    }//GEN-LAST:event_botaoSalvarActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        
        String nameProduct = txtDescricao.getText();
        
        Produtos obj = new Produtos();
        ProdutosDAO dao = new ProdutosDAO();
        
        TipoDeProduto tp = new TipoDeProduto();
        TipoDeProdutosDAO tpdao = new TipoDeProdutosDAO();
        
        
        obj = dao.BuscarProdutos(nameProduct);
        
        if(obj.getNameProduct() != null){
            
            txtCodigo.setText(String.valueOf(obj.getIdProduct()));
            txtDescricao.setText(obj.getNameProduct());
            txtQtdAtual.setText(String.valueOf(obj.getPrice()));
            txtQtd_Nova.setText(String.valueOf(obj.getStock()));
        
            tp = tpdao.BuscarTipoDeProdutos(obj.getTipodeproduto().getProductType());
            
        }else{
            JOptionPane.showMessageDialog(null, "Produto nao encontrado");
        }
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void txtDescricaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDescricaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDescricaoActionPerformed

    private void botaoNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoNovoActionPerformed
        
        
        Utilitarios util = new Utilitarios();
        util.LimpaTela(DadosDoProduto);
    }//GEN-LAST:event_botaoNovoActionPerformed

    private void botaoEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoEditarActionPerformed
        Produtos obj = new Produtos();
        obj.setIdProduct(Integer.valueOf(txtCodigo.getText()));
        obj.setNameProduct(txtDescricao.getText());
        obj.setPrice(Double.valueOf(txtQtdAtual.getText()));
        obj.setStock(Integer.valueOf(txtQtd_Nova.getText()));
        
        TipoDeProduto tp = new TipoDeProduto();
        
        obj.setTipodeproduto(tp);
        
        ProdutosDAO dao = new ProdutosDAO();
        dao.Editar(obj);
        Utilitarios util = new Utilitarios();
        util.LimpaTela(DadosDoProduto);
    }//GEN-LAST:event_botaoEditarActionPerformed

    private void botaoExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoExcluirActionPerformed
        Produtos obj = new Produtos();
        obj.setIdProduct(Integer.valueOf(txtCodigo.getText()));
        ProdutosDAO dao = new ProdutosDAO();
        dao.Excluir(obj);
        Utilitarios util = new Utilitarios();
        util.LimpaTela(DadosDoProduto);
    }//GEN-LAST:event_botaoExcluirActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        listar();
        
        //esse utilitarios é pra colocar icone na janela no canto superior esquerdo
        Utilitarios u = new Utilitarios();
        u.InserirIconeJDialog(this);
    }//GEN-LAST:event_formWindowActivated

    private void txtDescricaoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDescricaoKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            String nameProduct = txtDescricao.getText();
        
        Produtos obj = new Produtos();
        ProdutosDAO dao = new ProdutosDAO();
        
        TipoDeProduto tp = new TipoDeProduto();
        TipoDeProdutosDAO tpdao = new TipoDeProdutosDAO();
        
        
        obj = dao.BuscarProdutos(nameProduct);
        
        if(obj.getNameProduct() != null){
            
            txtCodigo.setText(String.valueOf(obj.getIdProduct()));
            txtDescricao.setText(obj.getNameProduct());
            txtQtdAtual.setText(String.valueOf(obj.getPrice()));
            txtQtd_Nova.setText(String.valueOf(obj.getStock()));
        
            tp = tpdao.BuscarTipoDeProdutos(obj.getTipodeproduto().getProductType());
            }else{
            JOptionPane.showMessageDialog(null, "Produto nao encontrado");
        }
        }
    }//GEN-LAST:event_txtDescricaoKeyPressed

    private void txtQtdAtualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQtdAtualActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQtdAtualActionPerformed

    private void txtQtdAtualKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtQtdAtualKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQtdAtualKeyPressed

    private void txtQtd_NovaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQtd_NovaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQtd_NovaActionPerformed

    private void txtQtd_NovaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtQtd_NovaKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQtd_NovaKeyPressed

    private void txtCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoActionPerformed

    private void tabelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaMouseClicked
        idProduto = Integer.parseInt(tabela.getValueAt(tabela.getSelectedRow(), 0).toString());
        txtCodigo.setText(tabela.getValueAt(tabela.getSelectedRow(), 0).toString());
        txtDescricao.setText(tabela.getValueAt(tabela.getSelectedRow(), 1).toString());
        txtQtdAtual.setText(tabela.getValueAt(tabela.getSelectedRow(), 3).toString());
    }//GEN-LAST:event_tabelaMouseClicked

    private void btnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarActionPerformed
        try {
            int qtdAtual, qtd_nova;
            qtdAtual = Integer.valueOf(txtQtdAtual.getText());
            qtd_nova = Integer.valueOf(txtQtd_Nova.getText());       
            qtd_atualizada = qtdAtual + qtd_nova;
            ProdutosDAO daop = new ProdutosDAO();
            daop.adicionarEstoque(idProduto, qtd_atualizada);
            new Utilitarios().LimpaTela(DadosDoProduto);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Erro: " + e);
        }
    }//GEN-LAST:event_btnAdicionarActionPerformed

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
            java.util.logging.Logger.getLogger(FormularioEstoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormularioEstoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormularioEstoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormularioEstoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
//                new FormularioEstoque().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel DadosDoProduto;
    private javax.swing.JPanel PainelControleEstoque;
    private javax.swing.JTabbedPane PainelGuiasEstoque;
    private javax.swing.JButton botaoEditar;
    private javax.swing.JButton botaoExcluir;
    private javax.swing.JButton botaoNovo;
    private javax.swing.JButton botaoSalvar;
    private javax.swing.JButton btnAdicionar;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tabela;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtDescricao;
    private javax.swing.JTextField txtQtdAtual;
    private javax.swing.JTextField txtQtd_Nova;
    // End of variables declaration//GEN-END:variables
}

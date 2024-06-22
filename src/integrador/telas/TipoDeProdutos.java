/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package integrador.telas;

import integrador.dao.TipoDeProdutosDAO;
import integrador.dao.funcionariosDAO;
import integrador.model.Funcionarios;
import integrador.model.TipoDeProduto;
import javax.swing.JOptionPane;
import integrador.utilitarios.Utilitarios;
import java.awt.event.KeyEvent;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class TipoDeProdutos extends javax.swing.JFrame {

    /**
     * Creates new form funcionarios
     */
    
    public void listar(){
        TipoDeProdutosDAO dao = new TipoDeProdutosDAO();
        List<TipoDeProduto> lista = dao.Listar();
        DefaultTableModel dados = (DefaultTableModel)tabela.getModel();
        dados.setNumRows(0);
        for(TipoDeProduto f : lista){
            dados.addRow(new Object[]{
                f.getIdProductType(),
                f.getProductType(),
            });
        }
    }
    
    public TipoDeProdutos() {
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

        PainelTipoProdutos = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        PainelGuiasTipoProdutos = new javax.swing.JTabbedPane();
        CadastrarFuncionarios = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        idProduto = new javax.swing.JTextField();
        tipoProdutoDescricao = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        botaoSalvar = new javax.swing.JButton();
        botaoPesquisarTipoDeProduto = new javax.swing.JButton();
        botaoNovo = new javax.swing.JButton();
        botaoEditar = new javax.swing.JButton();
        botaoExcluir = new javax.swing.JButton();
        ConsultarTipoProdutos = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        consultaTipoProdutos = new javax.swing.JTextField();
        botaoPesquisarTipoProdutos = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("TipoDeProdutos");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        PainelTipoProdutos.setBackground(new java.awt.Color(0, 0, 0));
        PainelTipoProdutos.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel1.setFont(new java.awt.Font("MonoLisa-BoldItalic", 1, 32)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(207, 181, 59));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Tipo de Produtos");

        javax.swing.GroupLayout PainelTipoProdutosLayout = new javax.swing.GroupLayout(PainelTipoProdutos);
        PainelTipoProdutos.setLayout(PainelTipoProdutosLayout);
        PainelTipoProdutosLayout.setHorizontalGroup(
            PainelTipoProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PainelTipoProdutosLayout.setVerticalGroup(
            PainelTipoProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelTipoProdutosLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        PainelGuiasTipoProdutos.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        CadastrarFuncionarios.setBackground(new java.awt.Color(204, 204, 204));
        CadastrarFuncionarios.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        CadastrarFuncionarios.setPreferredSize(new java.awt.Dimension(1100, 700));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("ID:");

        idProduto.setEditable(false);
        idProduto.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        idProduto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        tipoProdutoDescricao.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tipoProdutoDescricao.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        tipoProdutoDescricao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipoProdutoDescricaoActionPerformed(evt);
            }
        });
        tipoProdutoDescricao.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tipoProdutoDescricaoKeyPressed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Tipo de Produto:");

        botaoSalvar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        botaoSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icone salvar.png"))); // NOI18N
        botaoSalvar.setText("Salvar");
        botaoSalvar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        botaoSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSalvarActionPerformed(evt);
            }
        });

        botaoPesquisarTipoDeProduto.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        botaoPesquisarTipoDeProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icone pesquisar.png"))); // NOI18N
        botaoPesquisarTipoDeProduto.setText("Pesquisar");
        botaoPesquisarTipoDeProduto.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        botaoPesquisarTipoDeProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoPesquisarTipoDeProdutoActionPerformed(evt);
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

        javax.swing.GroupLayout CadastrarFuncionariosLayout = new javax.swing.GroupLayout(CadastrarFuncionarios);
        CadastrarFuncionarios.setLayout(CadastrarFuncionariosLayout);
        CadastrarFuncionariosLayout.setHorizontalGroup(
            CadastrarFuncionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CadastrarFuncionariosLayout.createSequentialGroup()
                .addGap(210, 210, 210)
                .addComponent(botaoNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botaoSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botaoEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botaoExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 283, Short.MAX_VALUE))
            .addGroup(CadastrarFuncionariosLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(idProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tipoProdutoDescricao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botaoPesquisarTipoDeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );
        CadastrarFuncionariosLayout.setVerticalGroup(
            CadastrarFuncionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CadastrarFuncionariosLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(CadastrarFuncionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(idProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tipoProdutoDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoPesquisarTipoDeProduto))
                .addGap(83, 83, 83)
                .addGroup(CadastrarFuncionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoSalvar)
                    .addComponent(botaoNovo)
                    .addComponent(botaoEditar)
                    .addComponent(botaoExcluir))
                .addContainerGap(159, Short.MAX_VALUE))
        );

        PainelGuiasTipoProdutos.addTab("Cadastrar tipo de produtos", CadastrarFuncionarios);

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel11.setText("Tipo de produto:");

        consultaTipoProdutos.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        consultaTipoProdutos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        consultaTipoProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultaTipoProdutosActionPerformed(evt);
            }
        });
        consultaTipoProdutos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                consultaTipoProdutosKeyReleased(evt);
            }
        });

        botaoPesquisarTipoProdutos.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        botaoPesquisarTipoProdutos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icone pesquisar.png"))); // NOI18N
        botaoPesquisarTipoProdutos.setText("Pesquisar");
        botaoPesquisarTipoProdutos.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        botaoPesquisarTipoProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoPesquisarTipoProdutosActionPerformed(evt);
            }
        });

        jScrollPane1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        tabela.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        tabela.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "TIPO DE PRODUTOS"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class
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

        javax.swing.GroupLayout ConsultarTipoProdutosLayout = new javax.swing.GroupLayout(ConsultarTipoProdutos);
        ConsultarTipoProdutos.setLayout(ConsultarTipoProdutosLayout);
        ConsultarTipoProdutosLayout.setHorizontalGroup(
            ConsultarTipoProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ConsultarTipoProdutosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ConsultarTipoProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(ConsultarTipoProdutosLayout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(consultaTipoProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botaoPesquisarTipoProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 201, Short.MAX_VALUE)))
                .addContainerGap())
        );
        ConsultarTipoProdutosLayout.setVerticalGroup(
            ConsultarTipoProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ConsultarTipoProdutosLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(ConsultarTipoProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(consultaTipoProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoPesquisarTipoProdutos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        PainelGuiasTipoProdutos.addTab("Consulta de tipo de produtos", ConsultarTipoProdutos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelTipoProdutos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(PainelGuiasTipoProdutos, javax.swing.GroupLayout.DEFAULT_SIZE, 923, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PainelTipoProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(PainelGuiasTipoProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(123, 123, 123))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        listar();
        
        //esse utilitarios é pra colocar icone na janela no canto superior esquerdo
        Utilitarios u = new Utilitarios();
        u.InserirIcone(this);
    }//GEN-LAST:event_formWindowActivated

    private void botaoPesquisarTipoProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoPesquisarTipoProdutosActionPerformed
        String fullname = "%" + consultaTipoProdutos.getText() + "%";
        funcionariosDAO dao = new funcionariosDAO();
        List<Funcionarios> lista = dao.Filtrar(fullname);
        DefaultTableModel dados = (DefaultTableModel)tabela.getModel();
        dados.setNumRows(0);
        for(Funcionarios f : lista){
            dados.addRow(new Object[]{
                f.getIdEmployee(),
                f.getFullname(),
                f.getRG(),
                f.getCPF(),
                f.getLogin(),
                f.getEmployeePassword(),
                f.getFk_idEmployeeLevel(),
                f.getFk_idEmployeeSex(),
            });
        }
    

    }//GEN-LAST:event_botaoPesquisarTipoProdutosActionPerformed

    private void consultaTipoProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultaTipoProdutosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_consultaTipoProdutosActionPerformed

    private void consultaTipoProdutosKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_consultaTipoProdutosKeyReleased
        String fullname = "%" + consultaTipoProdutos.getText() + "%";
        funcionariosDAO dao = new funcionariosDAO();
        List<Funcionarios> lista = dao.Filtrar(fullname);
        DefaultTableModel dados = (DefaultTableModel)tabela.getModel();
        dados.setNumRows(0);
        for(Funcionarios f : lista){
            dados.addRow(new Object[]{
                f.getIdEmployee(),
                f.getFullname(),
                f.getRG(),
                f.getCPF(),
                f.getLogin(),
                f.getEmployeePassword(),
                f.getFk_idEmployeeLevel(),
                f.getFk_idEmployeeSex(),
            });
        }
    }//GEN-LAST:event_consultaTipoProdutosKeyReleased

    private void tabelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaMouseClicked
        PainelGuiasTipoProdutos.setSelectedIndex(0);
        idProduto.setText(tabela.getValueAt(tabela.getSelectedRow(), 0).toString());
        tipoProdutoDescricao.setText(tabela.getValueAt(tabela.getSelectedRow(), 1).toString());
    }//GEN-LAST:event_tabelaMouseClicked

    private void botaoExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoExcluirActionPerformed
        TipoDeProduto obj = new TipoDeProduto();
        obj.setIdProductType(Integer.valueOf(idProduto.getText()));
        TipoDeProdutosDAO dao = new TipoDeProdutosDAO();
        dao.Excluir(obj);
        Utilitarios util = new Utilitarios();
        util.LimpaTela(CadastrarFuncionarios);
    }//GEN-LAST:event_botaoExcluirActionPerformed

    private void botaoEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoEditarActionPerformed

        TipoDeProduto obj = new TipoDeProduto();
        obj.setProductType(tipoProdutoDescricao.getText());
        obj.setIdProductType(Integer.valueOf(idProduto.getText()));       
        
        TipoDeProdutosDAO dao = new TipoDeProdutosDAO();
        dao.Editar(obj);
        Utilitarios util = new Utilitarios();
        util.LimpaTela(CadastrarFuncionarios);
    }//GEN-LAST:event_botaoEditarActionPerformed

    private void botaoNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoNovoActionPerformed
        Utilitarios util = new Utilitarios();
        util.LimpaTela(CadastrarFuncionarios);
    }//GEN-LAST:event_botaoNovoActionPerformed

    private void botaoPesquisarTipoDeProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoPesquisarTipoDeProdutoActionPerformed
        String productType = tipoProdutoDescricao.getText();
        TipoDeProduto obj = new TipoDeProduto();
        TipoDeProdutosDAO dao = new TipoDeProdutosDAO();
        obj = dao.BuscarTipoDeProdutos(productType);
        if(obj.getProductType() != null){
            idProduto.setText(String.valueOf(obj.getIdProductType()));
            tipoProdutoDescricao.setText(obj.getProductType());
            }else{
            JOptionPane.showMessageDialog(null, "Tipo de produto nao encontrado");
        }
    }//GEN-LAST:event_botaoPesquisarTipoDeProdutoActionPerformed

    private void botaoSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSalvarActionPerformed
        TipoDeProduto obj = new TipoDeProduto();
        obj.setProductType(tipoProdutoDescricao.getText());
        
        TipoDeProdutosDAO dao = new TipoDeProdutosDAO();
        dao.Salvar(obj);
        Utilitarios util = new Utilitarios();
        util.LimpaTela(CadastrarFuncionarios);
    }//GEN-LAST:event_botaoSalvarActionPerformed

    private void tipoProdutoDescricaoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tipoProdutoDescricaoKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            String productType = tipoProdutoDescricao.getText();
        TipoDeProduto obj = new TipoDeProduto();
        TipoDeProdutosDAO dao = new TipoDeProdutosDAO();
        obj = dao.BuscarTipoDeProdutos(productType);
        if(obj.getProductType() != null){
            idProduto.setText(String.valueOf(obj.getIdProductType()));
            tipoProdutoDescricao.setText(obj.getProductType());
                }else{
                JOptionPane.showMessageDialog(null, "Tipo de produto nao encontrado");
            }
        }
    }//GEN-LAST:event_tipoProdutoDescricaoKeyPressed

    private void tipoProdutoDescricaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipoProdutoDescricaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tipoProdutoDescricaoActionPerformed

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
            java.util.logging.Logger.getLogger(TipoDeProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TipoDeProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TipoDeProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TipoDeProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TipoDeProdutos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel CadastrarFuncionarios;
    private javax.swing.JPanel ConsultarTipoProdutos;
    private javax.swing.JTabbedPane PainelGuiasTipoProdutos;
    private javax.swing.JPanel PainelTipoProdutos;
    private javax.swing.JButton botaoEditar;
    private javax.swing.JButton botaoExcluir;
    private javax.swing.JButton botaoNovo;
    private javax.swing.JButton botaoPesquisarTipoDeProduto;
    private javax.swing.JButton botaoPesquisarTipoProdutos;
    private javax.swing.JButton botaoSalvar;
    private javax.swing.JTextField consultaTipoProdutos;
    private javax.swing.JTextField idProduto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabela;
    private javax.swing.JTextField tipoProdutoDescricao;
    // End of variables declaration//GEN-END:variables
}

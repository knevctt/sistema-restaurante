/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package integrador.telas;

import integrador.dao.SexualidadesDAO;
import integrador.model.Sexualidades;
import javax.swing.JOptionPane;
import integrador.utilitarios.Utilitarios;
import java.awt.event.KeyEvent;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class CadastroSexualidades extends javax.swing.JDialog {

    /**
     * Creates new form funcionarios
     */
    
    public void listar(){
        SexualidadesDAO dao = new SexualidadesDAO();
        List<Sexualidades> lista = dao.Listar();
        DefaultTableModel dados = (DefaultTableModel)tabela.getModel();
        dados.setNumRows(0);
        for(Sexualidades f : lista){
            dados.addRow(new Object[]{
                f.getIdSex(),
                f.getSexName(),
            });
        }
    }
    
    public CadastroSexualidades(java.awt.Frame parent, boolean modal) {
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

        PainelTipoSexualidade = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        PainelGuiasTipoSexualidade = new javax.swing.JTabbedPane();
        CadastrarTipoSexualidade = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtIdSexo = new javax.swing.JTextField();
        txtSexualidade = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        botaoSalvar = new javax.swing.JButton();
        botaoPesquisarTipoDeProduto = new javax.swing.JButton();
        botaoNovo = new javax.swing.JButton();
        botaoEditar = new javax.swing.JButton();
        botaoExcluir = new javax.swing.JButton();
        ConsultarTipoSexualidade = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        consultaTipoSexualidade = new javax.swing.JTextField();
        btnPesquisarSexualidade = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Formulario sexualidades");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        PainelTipoSexualidade.setBackground(new java.awt.Color(60, 110, 113));
        PainelTipoSexualidade.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel1.setFont(new java.awt.Font("MonoLisa-BoldItalic", 1, 32)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Cadastro sexualidades");

        javax.swing.GroupLayout PainelTipoSexualidadeLayout = new javax.swing.GroupLayout(PainelTipoSexualidade);
        PainelTipoSexualidade.setLayout(PainelTipoSexualidadeLayout);
        PainelTipoSexualidadeLayout.setHorizontalGroup(
            PainelTipoSexualidadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 923, Short.MAX_VALUE)
        );
        PainelTipoSexualidadeLayout.setVerticalGroup(
            PainelTipoSexualidadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelTipoSexualidadeLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        PainelGuiasTipoSexualidade.setFont(new java.awt.Font("MonoLisa-Regular", 0, 14)); // NOI18N

        CadastrarTipoSexualidade.setBackground(new java.awt.Color(40, 75, 99));
        CadastrarTipoSexualidade.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        CadastrarTipoSexualidade.setPreferredSize(new java.awt.Dimension(1100, 700));

        jLabel2.setBackground(new java.awt.Color(217, 217, 217));
        jLabel2.setFont(new java.awt.Font("MonoLisa-Regular", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(217, 217, 217));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("ID:");

        txtIdSexo.setEditable(false);
        txtIdSexo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtIdSexo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        txtSexualidade.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtSexualidade.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txtSexualidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSexualidadeActionPerformed(evt);
            }
        });
        txtSexualidade.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSexualidadeKeyPressed(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(217, 217, 217));
        jLabel3.setFont(new java.awt.Font("MonoLisa-Regular", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(217, 217, 217));
        jLabel3.setText("Tipo de Produto:");

        botaoSalvar.setFont(new java.awt.Font("MonoLisa-Regular", 0, 14)); // NOI18N
        botaoSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icone salvar.png"))); // NOI18N
        botaoSalvar.setText("Salvar");
        botaoSalvar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        botaoSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSalvarActionPerformed(evt);
            }
        });

        botaoPesquisarTipoDeProduto.setFont(new java.awt.Font("MonoLisa-Regular", 0, 14)); // NOI18N
        botaoPesquisarTipoDeProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icone pesquisar.png"))); // NOI18N
        botaoPesquisarTipoDeProduto.setText("Pesquisar");
        botaoPesquisarTipoDeProduto.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        botaoPesquisarTipoDeProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoPesquisarTipoDeProdutoActionPerformed(evt);
            }
        });

        botaoNovo.setFont(new java.awt.Font("MonoLisa-Regular", 0, 14)); // NOI18N
        botaoNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icone novo.png"))); // NOI18N
        botaoNovo.setText("Novo");
        botaoNovo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        botaoNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoNovoActionPerformed(evt);
            }
        });

        botaoEditar.setFont(new java.awt.Font("MonoLisa-Regular", 0, 14)); // NOI18N
        botaoEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icone editar.png"))); // NOI18N
        botaoEditar.setText("Editar");
        botaoEditar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        botaoEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoEditarActionPerformed(evt);
            }
        });

        botaoExcluir.setFont(new java.awt.Font("MonoLisa-Regular", 0, 14)); // NOI18N
        botaoExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icone excluir.png"))); // NOI18N
        botaoExcluir.setText("Excluir");
        botaoExcluir.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        botaoExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoExcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout CadastrarTipoSexualidadeLayout = new javax.swing.GroupLayout(CadastrarTipoSexualidade);
        CadastrarTipoSexualidade.setLayout(CadastrarTipoSexualidadeLayout);
        CadastrarTipoSexualidadeLayout.setHorizontalGroup(
            CadastrarTipoSexualidadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CadastrarTipoSexualidadeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtIdSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtSexualidade, javax.swing.GroupLayout.DEFAULT_SIZE, 486, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botaoPesquisarTipoDeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(CadastrarTipoSexualidadeLayout.createSequentialGroup()
                .addGap(228, 228, 228)
                .addComponent(botaoNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botaoSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botaoEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botaoExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        CadastrarTipoSexualidadeLayout.setVerticalGroup(
            CadastrarTipoSexualidadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CadastrarTipoSexualidadeLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(CadastrarTipoSexualidadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtIdSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSexualidade, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoPesquisarTipoDeProduto))
                .addGap(65, 65, 65)
                .addGroup(CadastrarTipoSexualidadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoSalvar)
                    .addComponent(botaoNovo)
                    .addComponent(botaoEditar)
                    .addComponent(botaoExcluir))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        PainelGuiasTipoSexualidade.addTab("Cadastrar tipo de sexualidade", CadastrarTipoSexualidade);

        ConsultarTipoSexualidade.setBackground(new java.awt.Color(40, 75, 99));

        jLabel11.setFont(new java.awt.Font("MonoLisa-Regular", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(217, 217, 217));
        jLabel11.setText("Tipo de sexualidade:");

        consultaTipoSexualidade.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        consultaTipoSexualidade.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        consultaTipoSexualidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultaTipoSexualidadeActionPerformed(evt);
            }
        });
        consultaTipoSexualidade.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                consultaTipoSexualidadeKeyReleased(evt);
            }
        });

        btnPesquisarSexualidade.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnPesquisarSexualidade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icone pesquisar.png"))); // NOI18N
        btnPesquisarSexualidade.setText("Pesquisar");
        btnPesquisarSexualidade.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        btnPesquisarSexualidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarSexualidadeActionPerformed(evt);
            }
        });

        jScrollPane1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        tabela.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        tabela.setFont(new java.awt.Font("MonoLisa-Regular", 0, 12)); // NOI18N
        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "TIPO DE SEXUALIDADE"
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

        javax.swing.GroupLayout ConsultarTipoSexualidadeLayout = new javax.swing.GroupLayout(ConsultarTipoSexualidade);
        ConsultarTipoSexualidade.setLayout(ConsultarTipoSexualidadeLayout);
        ConsultarTipoSexualidadeLayout.setHorizontalGroup(
            ConsultarTipoSexualidadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ConsultarTipoSexualidadeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ConsultarTipoSexualidadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(ConsultarTipoSexualidadeLayout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(consultaTipoSexualidade, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPesquisarSexualidade, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 138, Short.MAX_VALUE)))
                .addContainerGap())
        );
        ConsultarTipoSexualidadeLayout.setVerticalGroup(
            ConsultarTipoSexualidadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ConsultarTipoSexualidadeLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(ConsultarTipoSexualidadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(consultaTipoSexualidade, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesquisarSexualidade))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        PainelGuiasTipoSexualidade.addTab("Consulta de tipo de sexualidade", ConsultarTipoSexualidade);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelTipoSexualidade, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(PainelGuiasTipoSexualidade, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PainelTipoSexualidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(PainelGuiasTipoSexualidade, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        listar();
        
        //esse utilitarios é pra colocar icone na janela no canto superior esquerdo
        Utilitarios u = new Utilitarios();
        u.InserirIconeJDialog(this);
    }//GEN-LAST:event_formWindowActivated

    private void btnPesquisarSexualidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarSexualidadeActionPerformed
        String sexName = "%" + consultaTipoSexualidade.getText() + "%";
        SexualidadesDAO dao = new SexualidadesDAO();
        List<Sexualidades> lista = dao.Filtrar(sexName);
        DefaultTableModel dados = (DefaultTableModel)tabela.getModel();
        dados.setNumRows(0);
        for(Sexualidades f : lista){
            dados.addRow(new Object[]{
                f.getIdSex(),
                f.getSexName(),
            });
        }
    

    }//GEN-LAST:event_btnPesquisarSexualidadeActionPerformed

    private void consultaTipoSexualidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultaTipoSexualidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_consultaTipoSexualidadeActionPerformed

    private void consultaTipoSexualidadeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_consultaTipoSexualidadeKeyReleased
        String sexName = "%" + consultaTipoSexualidade.getText() + "%";
        SexualidadesDAO dao = new SexualidadesDAO();
        List<Sexualidades> lista = dao.Filtrar(sexName);
        DefaultTableModel dados = (DefaultTableModel)tabela.getModel();
        dados.setNumRows(0);
        for(Sexualidades f : lista){
            dados.addRow(new Object[]{
                f.getIdSex(),
                f.getSexName(),
            });
        }
    }//GEN-LAST:event_consultaTipoSexualidadeKeyReleased

    private void tabelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaMouseClicked
        PainelGuiasTipoSexualidade.setSelectedIndex(0);
        txtIdSexo.setText(tabela.getValueAt(tabela.getSelectedRow(), 0).toString());
        txtSexualidade.setText(tabela.getValueAt(tabela.getSelectedRow(), 1).toString());
    }//GEN-LAST:event_tabelaMouseClicked

    private void botaoExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoExcluirActionPerformed
        Sexualidades obj = new Sexualidades();
        obj.setIdSex(Integer.valueOf(txtIdSexo.getText()));
        SexualidadesDAO dao = new SexualidadesDAO();
        dao.Excluir(obj);
        Utilitarios util = new Utilitarios();
        util.LimpaTela(CadastrarTipoSexualidade);
    }//GEN-LAST:event_botaoExcluirActionPerformed

    private void botaoEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoEditarActionPerformed

        Sexualidades obj = new Sexualidades();
        obj.setSexName(txtSexualidade.getText());
        obj.setIdSex(Integer.valueOf(txtIdSexo.getText()));       
        
        SexualidadesDAO dao = new SexualidadesDAO();
        dao.Editar(obj);
        Utilitarios util = new Utilitarios();
        util.LimpaTela(CadastrarTipoSexualidade);
    }//GEN-LAST:event_botaoEditarActionPerformed

    private void botaoNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoNovoActionPerformed
        Utilitarios util = new Utilitarios();
        util.LimpaTela(CadastrarTipoSexualidade);
    }//GEN-LAST:event_botaoNovoActionPerformed

    private void botaoPesquisarTipoDeProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoPesquisarTipoDeProdutoActionPerformed
        String sexName = txtSexualidade.getText();
        Sexualidades obj = new Sexualidades();
        SexualidadesDAO dao = new SexualidadesDAO();
        obj = dao.BuscarTipoDeSexualidade(sexName);
        if(obj.getSexName() != null){
            txtIdSexo.setText(String.valueOf(obj.getIdSex()));
            txtSexualidade.setText(obj.getSexName());
            }else{
            JOptionPane.showMessageDialog(null, "Tipo de sexualidade nao encontrado");
        }
    }//GEN-LAST:event_botaoPesquisarTipoDeProdutoActionPerformed

    private void botaoSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSalvarActionPerformed
    Sexualidades obj = new Sexualidades();
        obj.setSexName(txtSexualidade.getText());
        
        SexualidadesDAO dao = new SexualidadesDAO();
        dao.Salvar(obj);
        Utilitarios util = new Utilitarios();
        util.LimpaTela(CadastrarTipoSexualidade);
    }//GEN-LAST:event_botaoSalvarActionPerformed

    private void txtSexualidadeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSexualidadeKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            String sexName = txtSexualidade.getText();
            Sexualidades obj = new Sexualidades();
            SexualidadesDAO dao = new SexualidadesDAO();
            obj = dao.BuscarTipoDeSexualidade(sexName);
        if(obj.getSexName() != null){
            txtIdSexo.setText(String.valueOf(obj.getIdSex()));
            txtSexualidade.setText(obj.getSexName());
            }else{
                JOptionPane.showMessageDialog(null, "Tipo de produto nao encontrado");
            }
        }
    }//GEN-LAST:event_txtSexualidadeKeyPressed

    private void txtSexualidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSexualidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSexualidadeActionPerformed

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
            java.util.logging.Logger.getLogger(CadastroSexualidades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroSexualidades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroSexualidades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroSexualidades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
//                new CadastroSexualidades().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel CadastrarTipoSexualidade;
    private javax.swing.JPanel ConsultarTipoSexualidade;
    public javax.swing.JTabbedPane PainelGuiasTipoSexualidade;
    private javax.swing.JPanel PainelTipoSexualidade;
    private javax.swing.JButton botaoEditar;
    private javax.swing.JButton botaoExcluir;
    private javax.swing.JButton botaoNovo;
    private javax.swing.JButton botaoPesquisarTipoDeProduto;
    private javax.swing.JButton botaoSalvar;
    private javax.swing.JButton btnPesquisarSexualidade;
    private javax.swing.JTextField consultaTipoSexualidade;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabela;
    private javax.swing.JTextField txtIdSexo;
    private javax.swing.JTextField txtSexualidade;
    // End of variables declaration//GEN-END:variables
}

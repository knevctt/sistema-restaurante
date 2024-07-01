package integrador.telas;

import integrador.dao.ClientesDAO;
import integrador.dao.SexualidadesDAO;
import integrador.model.Clientes;
import integrador.model.Sexualidades;
import integrador.utilitarios.Utilitarios;
import java.awt.event.KeyEvent;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class CadastroClientes extends javax.swing.JDialog {
    
    public void listar(){
        ClientesDAO dao = new ClientesDAO();
        List<Clientes> lista = dao.Listar();
        DefaultTableModel dados = (DefaultTableModel)tabela.getModel();
        dados.setNumRows(0);
        for(Clientes c : lista){
            dados.addRow(new Object[]{
                c.getId(),
                c.getNome(),
                c.getRG(),
                c.getCPF(),
                c.getEmail(),
                c.getTelefone(),
                c.getCep(),
                c.getEndereco(),
                c.getNumero(),
                c.getComplemento(),
                c.getBairro(),
                c.getCidade(),
                c.getEstado(),
                c.getSexualidade().getSexName()
            });
        }
    }
    
    public CadastroClientes(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PainelDeGuias = new javax.swing.JTabbedPane();
        DadosPessoais = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        txtNome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtRG = new javax.swing.JFormattedTextField();
        txtCPF = new javax.swing.JFormattedTextField();
        botaoSalvar = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        sexoCliente = new javax.swing.JComboBox();
        botaoPesquisarFuncionario = new javax.swing.JButton();
        botaoNovo = new javax.swing.JButton();
        botaoEditar = new javax.swing.JButton();
        botaoExcluir = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtTelefone = new javax.swing.JFormattedTextField();
        txtCEP = new javax.swing.JFormattedTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        cbUF = new javax.swing.JComboBox<>();
        txtEmail = new javax.swing.JFormattedTextField();
        txtBairro = new javax.swing.JFormattedTextField();
        txtComplemento = new javax.swing.JFormattedTextField();
        txtEndereco = new javax.swing.JFormattedTextField();
        txtCidade = new javax.swing.JFormattedTextField();
        txtNumero = new javax.swing.JFormattedTextField();
        ConsultaDeClientes = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        txtPesquisarNome = new javax.swing.JTextField();
        botaoPesquisarTableFuncionarios = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        Painel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Formulário de Clientes");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        PainelDeGuias.setBackground(new java.awt.Color(40, 75, 99));
        PainelDeGuias.setFont(new java.awt.Font("MonoLisa-Regular", 0, 14)); // NOI18N

        DadosPessoais.setBackground(new java.awt.Color(40, 75, 99));
        DadosPessoais.setForeground(new java.awt.Color(217, 217, 217));
        DadosPessoais.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        DadosPessoais.setPreferredSize(new java.awt.Dimension(1100, 700));

        jLabel2.setFont(new java.awt.Font("MonoLisa-Regular", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(217, 217, 217));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("ID:");

        txtId.setEditable(false);
        txtId.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtId.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdActionPerformed(evt);
            }
        });

        txtNome.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtNome.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });
        txtNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNomeKeyPressed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("MonoLisa-Regular", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(217, 217, 217));
        jLabel3.setText("Nome Completo:");

        jLabel4.setFont(new java.awt.Font("MonoLisa-Regular", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(217, 217, 217));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("RG:");

        jLabel5.setFont(new java.awt.Font("MonoLisa-Regular", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(217, 217, 217));
        jLabel5.setText("CPF:");

        txtRG.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        try {
            txtRG.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###-#")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtRG.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtRG.setPreferredSize(new java.awt.Dimension(64, 29));
        txtRG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRGActionPerformed(evt);
            }
        });

        txtCPF.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        try {
            txtCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCPF.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtCPF.setPreferredSize(new java.awt.Dimension(64, 29));
        txtCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCPFActionPerformed(evt);
            }
        });

        botaoSalvar.setBackground(new java.awt.Color(217, 217, 217));
        botaoSalvar.setFont(new java.awt.Font("MonoLisa-Bold", 0, 14)); // NOI18N
        botaoSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icone salvar.png"))); // NOI18N
        botaoSalvar.setText("Salvar");
        botaoSalvar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        botaoSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSalvarActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("MonoLisa-Regular", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(217, 217, 217));
        jLabel12.setText("Sexo");

        sexoCliente.setFont(new java.awt.Font("MonoLisa-Regular", 0, 14)); // NOI18N
        sexoCliente.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        sexoCliente.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                sexoClienteAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        sexoCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sexoClienteMouseClicked(evt);
            }
        });
        sexoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sexoClienteActionPerformed(evt);
            }
        });

        botaoPesquisarFuncionario.setBackground(new java.awt.Color(217, 217, 217));
        botaoPesquisarFuncionario.setFont(new java.awt.Font("MonoLisa-Bold", 0, 14)); // NOI18N
        botaoPesquisarFuncionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icone pesquisar.png"))); // NOI18N
        botaoPesquisarFuncionario.setText("Pesquisar");
        botaoPesquisarFuncionario.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        botaoPesquisarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoPesquisarFuncionarioActionPerformed(evt);
            }
        });

        botaoNovo.setBackground(new java.awt.Color(217, 217, 217));
        botaoNovo.setFont(new java.awt.Font("MonoLisa-Bold", 0, 14)); // NOI18N
        botaoNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icone novo.png"))); // NOI18N
        botaoNovo.setText("Novo");
        botaoNovo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        botaoNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoNovoActionPerformed(evt);
            }
        });

        botaoEditar.setBackground(new java.awt.Color(217, 217, 217));
        botaoEditar.setFont(new java.awt.Font("MonoLisa-Bold", 0, 14)); // NOI18N
        botaoEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icone editar.png"))); // NOI18N
        botaoEditar.setText("Editar");
        botaoEditar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        botaoEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoEditarActionPerformed(evt);
            }
        });

        botaoExcluir.setBackground(new java.awt.Color(217, 217, 217));
        botaoExcluir.setFont(new java.awt.Font("MonoLisa-Bold", 0, 14)); // NOI18N
        botaoExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icone excluir.png"))); // NOI18N
        botaoExcluir.setText("Excluir");
        botaoExcluir.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        botaoExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoExcluirActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("MonoLisa-Regular", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(217, 217, 217));
        jLabel6.setText("Email:");

        jLabel7.setFont(new java.awt.Font("MonoLisa-Regular", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(217, 217, 217));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel7.setText("Telefone:");

        txtTelefone.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        try {
            txtTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtTelefone.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtTelefone.setPreferredSize(new java.awt.Dimension(64, 29));
        txtTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefoneActionPerformed(evt);
            }
        });

        txtCEP.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        try {
            txtCEP.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCEP.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtCEP.setPreferredSize(new java.awt.Dimension(64, 29));
        txtCEP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCEPActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("MonoLisa-Regular", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(217, 217, 217));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel8.setText("CEP:");

        jLabel9.setFont(new java.awt.Font("MonoLisa-Regular", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(217, 217, 217));
        jLabel9.setText("Endereço:");

        jLabel10.setFont(new java.awt.Font("MonoLisa-Regular", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(217, 217, 217));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel10.setText("Complemento");

        jLabel13.setFont(new java.awt.Font("MonoLisa-Regular", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(217, 217, 217));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel13.setText("Bairro:");

        jLabel14.setFont(new java.awt.Font("MonoLisa-Regular", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(217, 217, 217));
        jLabel14.setText("N°");

        jLabel15.setFont(new java.awt.Font("MonoLisa-Regular", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(217, 217, 217));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel15.setText("Cidade:");

        jLabel16.setFont(new java.awt.Font("MonoLisa-Regular", 0, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(217, 217, 217));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel16.setText("UF:");

        cbUF.setFont(new java.awt.Font("MonoLisa-Regular", 0, 14)); // NOI18N
        cbUF.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" }));
        cbUF.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        txtEmail.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txtEmail.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        txtBairro.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txtBairro.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        txtComplemento.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txtComplemento.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        txtEndereco.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txtEndereco.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        txtCidade.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txtCidade.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        txtNumero.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txtNumero.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        javax.swing.GroupLayout DadosPessoaisLayout = new javax.swing.GroupLayout(DadosPessoais);
        DadosPessoais.setLayout(DadosPessoaisLayout);
        DadosPessoaisLayout.setHorizontalGroup(
            DadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DadosPessoaisLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(botaoNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botaoSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botaoEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botaoExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(257, 257, 257))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DadosPessoaisLayout.createSequentialGroup()
                .addGroup(DadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(DadosPessoaisLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(DadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(DadosPessoaisLayout.createSequentialGroup()
                                .addGroup(DadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(DadosPessoaisLayout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(DadosPessoaisLayout.createSequentialGroup()
                                        .addComponent(jLabel15)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtCidade)))
                                .addGroup(DadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(DadosPessoaisLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel16)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cbUF, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel12)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(sexoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 159, Short.MAX_VALUE))
                                    .addGroup(DadosPessoaisLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtEndereco)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel14)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(DadosPessoaisLayout.createSequentialGroup()
                                .addGroup(DadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(DadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(DadosPessoaisLayout.createSequentialGroup()
                                        .addComponent(txtRG, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(56, 56, 56)
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtEmail))
                                    .addGroup(DadosPessoaisLayout.createSequentialGroup()
                                        .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtNome)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(botaoPesquisarFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, DadosPessoaisLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCEP, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBairro)))
                .addGap(27, 27, 27))
        );
        DadosPessoaisLayout.setVerticalGroup(
            DadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DadosPessoaisLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(DadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(DadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(botaoPesquisarFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(DadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(DadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(txtRG, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtEmail))
                .addGap(0, 16, Short.MAX_VALUE)
                .addGroup(DadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DadosPessoaisLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(DadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 21, Short.MAX_VALUE)
                        .addGroup(DadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12)
                            .addComponent(sexoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbUF, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15))
                        .addGap(39, 39, 39))
                    .addGroup(DadosPessoaisLayout.createSequentialGroup()
                        .addGroup(DadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtBairro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(DadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtCEP, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel13)
                                .addComponent(jLabel8)
                                .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel7)))
                        .addGap(18, 18, 18)
                        .addGroup(DadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(91, 91, 91)))
                .addGroup(DadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoSalvar)
                    .addComponent(botaoNovo)
                    .addComponent(botaoEditar)
                    .addComponent(botaoExcluir))
                .addContainerGap())
        );

        PainelDeGuias.addTab("Dados pessoais", DadosPessoais);

        ConsultaDeClientes.setBackground(new java.awt.Color(40, 75, 99));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(217, 217, 217));
        jLabel11.setText("Nome Completo:");

        txtPesquisarNome.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtPesquisarNome.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txtPesquisarNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPesquisarNomeActionPerformed(evt);
            }
        });
        txtPesquisarNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPesquisarNomeKeyReleased(evt);
            }
        });

        botaoPesquisarTableFuncionarios.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        botaoPesquisarTableFuncionarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icone pesquisar.png"))); // NOI18N
        botaoPesquisarTableFuncionarios.setText("Pesquisar");
        botaoPesquisarTableFuncionarios.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        botaoPesquisarTableFuncionarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoPesquisarTableFuncionariosActionPerformed(evt);
            }
        });
        botaoPesquisarTableFuncionarios.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                botaoPesquisarTableFuncionariosKeyPressed(evt);
            }
        });

        jScrollPane1.setBackground(new java.awt.Color(40, 75, 99));

        tabela.setBackground(new java.awt.Color(40, 75, 99));
        tabela.setFont(new java.awt.Font("MonoLisa-Regular", 0, 11)); // NOI18N
        tabela.setForeground(new java.awt.Color(217, 217, 217));
        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NOME", "RG", "CPF", "EMAIL", "TELEFONE", "CEP", "ENDERECO", "Nº", "COMPLEMENTO", "Bairro", "Cidade:", "UF", "SEXO"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
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

        javax.swing.GroupLayout ConsultaDeClientesLayout = new javax.swing.GroupLayout(ConsultaDeClientes);
        ConsultaDeClientes.setLayout(ConsultaDeClientesLayout);
        ConsultaDeClientesLayout.setHorizontalGroup(
            ConsultaDeClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ConsultaDeClientesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtPesquisarNome, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botaoPesquisarTableFuncionarios, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(289, Short.MAX_VALUE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        ConsultaDeClientesLayout.setVerticalGroup(
            ConsultaDeClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ConsultaDeClientesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ConsultaDeClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPesquisarNome, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoPesquisarTableFuncionarios))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        PainelDeGuias.addTab("Consulta de clientes", ConsultaDeClientes);

        Painel.setBackground(new java.awt.Color(60, 110, 113));
        Painel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("MonoLisa-BoldItalic", 1, 32)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Cadastro de Clientes");

        javax.swing.GroupLayout PainelLayout = new javax.swing.GroupLayout(Painel);
        Painel.setLayout(PainelLayout);
        PainelLayout.setHorizontalGroup(
            PainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1029, Short.MAX_VALUE)
        );
        PainelLayout.setVerticalGroup(
            PainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Painel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(PainelDeGuias, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(Painel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PainelDeGuias, javax.swing.GroupLayout.PREFERRED_SIZE, 408, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

    private void txtNomeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNomeKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
        String nome = txtNome.getText();
        
        Clientes obj = new Clientes();
        ClientesDAO dao = new ClientesDAO();
        
        Sexualidades s = new Sexualidades();
        SexualidadesDAO daos = new SexualidadesDAO();

        obj = dao.BuscarClientes(nome);
        if(obj.getNome() != null){
            txtId.setText(String.valueOf(obj.getId()));
            txtNome.setText(obj.getNome());
            txtRG.setText(obj.getRG());
            txtCPF.setText(obj.getCPF());
            txtEmail.setText(obj.getEmail());
            txtTelefone.setText(obj.getTelefone());
            txtCEP.setText(obj.getCep());
            txtBairro.setText(obj.getBairro());
            txtComplemento.setText(obj.getComplemento());
            txtEndereco.setText(obj.getEndereco());
            txtNumero.setText(String.valueOf(obj.getNumero()));
            txtCidade.setText(obj.getCidade());
            cbUF.setSelectedItem(obj.getEstado());

            s = daos.BuscarTipoDeSexualidade(obj.getSexualidade().getSexName());
            sexoCliente.getModel().setSelectedItem(s);

        }else{
            JOptionPane.showMessageDialog(null, "Cliente nao encontrado");
        }
        }
    }//GEN-LAST:event_txtNomeKeyPressed

    private void txtCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCPFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCPFActionPerformed

    private void botaoSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSalvarActionPerformed
        Clientes obj = new Clientes();
        obj.setNome(txtNome.getText());
        obj.setRG(txtRG.getText());
        obj.setCPF(txtCPF.getText());
        obj.setEmail(txtEmail.getText());
        obj.setTelefone(txtTelefone.getText());
        obj.setCep(txtCEP.getText());
        obj.setEndereco(txtEndereco.getText());
        obj.setNumero(Integer.valueOf(txtNumero.getText()));
        obj.setComplemento(txtComplemento.getText());
        obj.setBairro(txtBairro.getText());
        obj.setCidade(txtCidade.getText());
        obj.setEstado(cbUF.getSelectedItem().toString());
        obj.setSexualidade((Sexualidades)sexoCliente.getSelectedItem());

        ClientesDAO dao = new ClientesDAO();
        dao.Salvar(obj);
        Utilitarios util = new Utilitarios();
        util.LimpaTela(DadosPessoais);
    }//GEN-LAST:event_botaoSalvarActionPerformed

    private void sexoClienteAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_sexoClienteAncestorAdded

    }//GEN-LAST:event_sexoClienteAncestorAdded

    private void sexoClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sexoClienteMouseClicked
        SexualidadesDAO dao = new SexualidadesDAO();
        List<Sexualidades> lista = dao.Listar();
        sexoCliente.removeAllItems();
        for(Sexualidades s : lista){
            sexoCliente.addItem(s);
        }
    }//GEN-LAST:event_sexoClienteMouseClicked

    private void sexoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sexoClienteActionPerformed

    }//GEN-LAST:event_sexoClienteActionPerformed

    private void botaoPesquisarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoPesquisarFuncionarioActionPerformed
        String nome = txtNome.getText();
        
        Clientes obj = new Clientes();
        ClientesDAO dao = new ClientesDAO();
        
        Sexualidades s = new Sexualidades();
        SexualidadesDAO daos = new SexualidadesDAO();

        obj = dao.BuscarClientes(nome);
        if(obj.getNome() != null){
            txtId.setText(String.valueOf(obj.getId()));
            txtNome.setText(obj.getNome());
            txtRG.setText(obj.getRG());
            txtCPF.setText(obj.getCPF());
            txtEmail.setText(obj.getEmail());
            txtTelefone.setText(obj.getTelefone());
            txtCEP.setText(obj.getCep());
            txtBairro.setText(obj.getBairro());
            txtComplemento.setText(obj.getComplemento());
            txtEndereco.setText(obj.getEndereco());
            txtNumero.setText(String.valueOf(obj.getNumero()));
            txtCidade.setText(obj.getCidade());
            cbUF.setSelectedItem(obj.getEstado());

            s = daos.BuscarTipoDeSexualidade(obj.getSexualidade().getSexName());
            sexoCliente.getModel().setSelectedItem(s);

        }else{
            JOptionPane.showMessageDialog(null, "Cliente nao encontrado");
        }
    }//GEN-LAST:event_botaoPesquisarFuncionarioActionPerformed

    private void botaoNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoNovoActionPerformed
        Utilitarios util = new Utilitarios();
        util.LimpaTela(DadosPessoais);
    }//GEN-LAST:event_botaoNovoActionPerformed

    private void botaoEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoEditarActionPerformed
        Clientes obj = new Clientes();
        obj.setNome(txtNome.getText());
        obj.setRG(txtRG.getText());
        obj.setCPF(txtCPF.getText());
        obj.setEmail(txtEmail.getText());
        obj.setTelefone(txtTelefone.getText());
        obj.setCep(txtCEP.getText());
        obj.setEndereco(txtEndereco.getText());
        obj.setNumero(Integer.valueOf(txtNumero.getText()));
        obj.setComplemento(txtComplemento.getText());
        obj.setBairro(txtBairro.getText());
        obj.setCidade(txtCidade.getText());
        obj.setEstado(cbUF.getSelectedItem().toString());
        obj.setSexualidade((Sexualidades)sexoCliente.getSelectedItem());
        obj.setId(Integer.valueOf(txtId.getText()));
        ClientesDAO dao = new ClientesDAO();
        dao.Editar(obj);
        Utilitarios util = new Utilitarios();
        util.LimpaTela(DadosPessoais);
    }//GEN-LAST:event_botaoEditarActionPerformed

    private void botaoExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoExcluirActionPerformed
        Clientes obj = new Clientes();
        obj.setId(Integer.valueOf(txtId.getText()));

        ClientesDAO dao = new ClientesDAO();
        dao.Excluir(obj);
        Utilitarios util = new Utilitarios();
        util.LimpaTela(DadosPessoais);
    }//GEN-LAST:event_botaoExcluirActionPerformed

    private void txtPesquisarNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPesquisarNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPesquisarNomeActionPerformed

    private void txtPesquisarNomeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesquisarNomeKeyReleased
        String nome = "%"+txtPesquisarNome.getText()+"%";
        ClientesDAO dao = new ClientesDAO();
        List<Clientes> lista = dao.Filtrar(nome);
        DefaultTableModel dados = (DefaultTableModel)tabela.getModel();
        dados.setNumRows(0);
        for(Clientes c : lista){
            dados.addRow(new Object[]{
                c.getId(),
                c.getNome(),
                c.getRG(),
                c.getCPF(),
                c.getEmail(),
                c.getTelefone(),
                c.getCep(),
                c.getEndereco(),
                c.getNumero(),
                c.getComplemento(),
                c.getBairro(),
                c.getCidade(),
                c.getEstado(),
                c.getSexualidade().getSexName()
            });
        }
    }//GEN-LAST:event_txtPesquisarNomeKeyReleased

    private void botaoPesquisarTableFuncionariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoPesquisarTableFuncionariosActionPerformed
        String nome = "%"+txtPesquisarNome.getText()+"%";
        ClientesDAO dao = new ClientesDAO();
        List<Clientes> lista = dao.Filtrar(nome);
        DefaultTableModel dados = (DefaultTableModel)tabela.getModel();
        dados.setNumRows(0);
        for(Clientes c : lista){
            dados.addRow(new Object[]{
                c.getId(),
                c.getNome(),
                c.getRG(),
                c.getCPF(),
                c.getEmail(),
                c.getTelefone(),
                c.getCep(),
                c.getEndereco(),
                c.getNumero(),
                c.getComplemento(),
                c.getBairro(),
                c.getCidade(),
                c.getEstado(),
                c.getSexualidade().getSexName()
            });
        }
    }//GEN-LAST:event_botaoPesquisarTableFuncionariosActionPerformed

    private void tabelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaMouseClicked
        PainelDeGuias.setSelectedIndex(0);
        txtId.setText(tabela.getValueAt(tabela.getSelectedRow(), 0).toString());
        txtNome.setText(tabela.getValueAt(tabela.getSelectedRow(), 1).toString());
        txtRG.setText(tabela.getValueAt(tabela.getSelectedRow(), 2).toString());
        txtCPF.setText(tabela.getValueAt(tabela.getSelectedRow(), 3).toString());
        txtEmail.setText(tabela.getValueAt(tabela.getSelectedRow(), 4).toString());
        txtTelefone.setText(tabela.getValueAt(tabela.getSelectedRow(), 5).toString());
        txtCEP.setText(tabela.getValueAt(tabela.getSelectedRow(), 6).toString());
        txtEndereco.setText(tabela.getValueAt(tabela.getSelectedRow(), 7).toString());
        txtNumero.setText(tabela.getValueAt(tabela.getSelectedRow(), 8).toString());
        txtComplemento.setText(tabela.getValueAt(tabela.getSelectedRow(), 9).toString());
        txtBairro.setText(tabela.getValueAt(tabela.getSelectedRow(), 10).toString());
        txtCidade.setText(tabela.getValueAt(tabela.getSelectedRow(), 11).toString());
        cbUF.setSelectedItem(tabela.getValueAt(tabela.getSelectedRow(), 12).toString());

        Sexualidades s = new Sexualidades();
        SexualidadesDAO daos = new SexualidadesDAO();
        s = daos.BuscarTipoDeSexualidade(tabela.getValueAt(tabela.getSelectedRow(), 13).toString());
        sexoCliente.getModel().setSelectedItem(s);
    }//GEN-LAST:event_tabelaMouseClicked

    private void txtRGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRGActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRGActionPerformed

    private void txtTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefoneActionPerformed

    private void txtCEPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCEPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCEPActionPerformed

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        listar();
        Utilitarios u = new Utilitarios();
        u.InserirIconeJDialog(this);
    }//GEN-LAST:event_formWindowActivated

    private void botaoPesquisarTableFuncionariosKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_botaoPesquisarTableFuncionariosKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_botaoPesquisarTableFuncionariosKeyPressed

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
            java.util.logging.Logger.getLogger(CadastroClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
//                new CadastroClientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ConsultaDeClientes;
    private javax.swing.JPanel DadosPessoais;
    private javax.swing.JPanel Painel;
    public javax.swing.JTabbedPane PainelDeGuias;
    private javax.swing.JButton botaoEditar;
    private javax.swing.JButton botaoExcluir;
    private javax.swing.JButton botaoNovo;
    private javax.swing.JButton botaoPesquisarFuncionario;
    private javax.swing.JButton botaoPesquisarTableFuncionarios;
    private javax.swing.JButton botaoSalvar;
    private javax.swing.JComboBox<String> cbUF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox sexoCliente;
    private javax.swing.JTable tabela;
    private javax.swing.JFormattedTextField txtBairro;
    private javax.swing.JFormattedTextField txtCEP;
    private javax.swing.JFormattedTextField txtCPF;
    private javax.swing.JFormattedTextField txtCidade;
    private javax.swing.JFormattedTextField txtComplemento;
    private javax.swing.JFormattedTextField txtEmail;
    private javax.swing.JFormattedTextField txtEndereco;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNome;
    private javax.swing.JFormattedTextField txtNumero;
    private javax.swing.JTextField txtPesquisarNome;
    private javax.swing.JFormattedTextField txtRG;
    private javax.swing.JFormattedTextField txtTelefone;
    // End of variables declaration//GEN-END:variables
}

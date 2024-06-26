package integrador.telas;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import integrador.dao.ConexaoBanco;
import integrador.utilitarios.Utilitarios;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;

public class login extends javax.swing.JFrame {

    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    
    public login() {
        initComponents();
        try {
            conn = new ConexaoBanco().conectar();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro inesperado:\n" + ex.getMessage(), "ERRO!", ERROR_MESSAGE);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ImageIcon icon = new ImageIcon(getClass().getResource("/imagensFundo/fundo principal sistema.jpg"));
        Image image = icon.getImage();
        painelLogin = new javax.swing.JDesktopPane(){
            public void paintComponent(Graphics g){
                g.drawImage(image, 0, 0, getWidth(), getHeight(), this
                );
            }

        };
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        usuario = new javax.swing.JFormattedTextField();
        senha = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        Entrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("LOGIN");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Unispace", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(207, 181, 59));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("                         TERRABRASIL GRILL");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(207, 181, 59));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("                                                                        LOGIN");

        usuario.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usuarioActionPerformed(evt);
            }
        });

        senha.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        senha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                senhaActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(207, 181, 59));
        jLabel3.setText("SENHA");

        Entrar.setBackground(new java.awt.Color(207, 181, 59));
        Entrar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Entrar.setForeground(new java.awt.Color(51, 51, 51));
        Entrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/entrarImg.png"))); // NOI18N
        Entrar.setText("ENTRAR");
        Entrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EntrarActionPerformed(evt);
            }
        });

        painelLogin.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        painelLogin.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        painelLogin.setLayer(usuario, javax.swing.JLayeredPane.DEFAULT_LAYER);
        painelLogin.setLayer(senha, javax.swing.JLayeredPane.DEFAULT_LAYER);
        painelLogin.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        painelLogin.setLayer(Entrar, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout painelLoginLayout = new javax.swing.GroupLayout(painelLogin);
        painelLogin.setLayout(painelLoginLayout);
        painelLoginLayout.setHorizontalGroup(
            painelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1932, Short.MAX_VALUE)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelLoginLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(painelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Entrar)
                    .addComponent(senha, javax.swing.GroupLayout.PREFERRED_SIZE, 493, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 493, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(707, 707, 707))
        );
        painelLoginLayout.setVerticalGroup(
            painelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelLoginLayout.createSequentialGroup()
                .addGap(212, 212, 212)
                .addComponent(jLabel1)
                .addGap(31, 31, 31)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(senha, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Entrar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(519, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelLogin)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelLogin)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        this.setExtendedState(this.MAXIMIZED_BOTH);
        
        //esse utilitarios é pra colocar icone na janela no canto superior esquerdo
        Utilitarios u = new Utilitarios();
        u.InserirIcone(this);
    }//GEN-LAST:event_formWindowActivated

    private void EntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EntrarActionPerformed
                String sql = "select * from employee where login=? and employeePassword=?";
            try {
                pst = conn.prepareStatement(sql); // Inicializa o PreparedStatement
                pst.setString(1, usuario.getText());
                pst.setString(2, new String(senha.getPassword()));

                rs = pst.executeQuery();
                if (rs.next()) {
                    area_de_trabalho novaTela = new area_de_trabalho();
                    novaTela.usuarioLogado = rs.getString("fullName");
                    JOptionPane.showMessageDialog(null, "Seja bem vindo ao sistema!\n" + novaTela.usuarioLogado);

                    int employeeLevel = rs.getInt("fk_idEmployeeLevel");
                    
                    if(employeeLevel == 5){
                        // Acesso total para admin
                    } else if(employeeLevel == 2 || employeeLevel == 3 || employeeLevel == 4){
                        novaTela.menuConsultarFuncionarios.setEnabled(false);
                        novaTela.menuCadastrarFuncionarios.setEnabled(false);
                        novaTela.menuHistoricoDeVendas.setEnabled(false);               
                        novaTela.menuCadastrarSexualidades.setVisible(false);
                        novaTela.menuConsultarSexualidades.setVisible(false);
                        novaTela.menuTiposDeProduto.setVisible(false);
                        novaTela.menuConsultarNivel.setVisible(false);
                        novaTela.menuCadastrarNivel.setVisible(false);
                    } else if(employeeLevel == 1){
                        novaTela.menuCadastrarSexualidades.setEnabled(false);
                        novaTela.menuTiposDeProduto.setVisible(false);
                        novaTela.menuConsultarSexualidades.setEnabled(false);
                        novaTela.menuConsultarNivel.setEnabled(false);
                        novaTela.menuCadastrarNivel.setEnabled(false);
                    }
                        novaTela.setVisible(true);
                        this.dispose(); // Fecha a tela de login apos logar
                } else {
                    JOptionPane.showMessageDialog(null, "Usuário e/ou senha incorretos");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Ocorreu um erro ao tentar realizar o login. Tente novamente.");
                e.printStackTrace(); // Registra o erro para depuração
            } finally {
                try {
                    if (rs != null) rs.close();
                    if (pst != null) pst.close();
                } catch (Exception e) {
                    // Log ou tratamento adicional se necessário
                }
            }
    }//GEN-LAST:event_EntrarActionPerformed

    private void senhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_senhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_senhaActionPerformed

    private void usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usuarioActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Entrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JDesktopPane painelLogin;
    private javax.swing.JPasswordField senha;
    private javax.swing.JFormattedTextField usuario;
    // End of variables declaration//GEN-END:variables
}

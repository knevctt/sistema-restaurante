package integrador.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoBanco {
    private final String servidor;
    private final String banco;
    private final String usuario;
    private final String senha;
    private Connection conexao;

    public ConexaoBanco() {
        this.servidor = "200.195.171.122";  // Endereço IP do servidor MySQL
        this.banco = "grupo10_mensalKauan";  // Nome do banco de dados
        this.usuario = "grupo10";  // Usuário do banco de dados
        this.senha = "gopMi1PKCuJpaB29";  // Senha do usuário
    }

    public Connection conectar() {
        try {
            this.conexao = DriverManager.getConnection("jdbc:mysql://" + this.servidor + "/" + this.banco, this.usuario, this.senha);
            return this.conexao;
        } catch (SQLException ex) {
            throw new RuntimeException("Erro ao conectar ao banco de dados", ex);
        }
    }

    public Connection getConnection() {
        return conexao;
    }
}

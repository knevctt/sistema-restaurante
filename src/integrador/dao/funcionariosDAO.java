package integrador.dao;

import integrador.model.Funcionarios;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class funcionariosDAO {
    
    private final Connection conn;

    public funcionariosDAO(){
        this.conn = new ConexaoBanco().conectar();
    }
    
    public void salvar(Funcionarios obj){
        try{
            // 1 cria o SQL
            String sql = "insert into employee(FullName, RG, CPF, login, employeePassword, fk_idEmployeeLevel, fk_idEmployeeSex)" 
                         + "values(?,?,?,?,?,?,?)";
            // 2 preparar a conexao SQL para se conectar com o banco
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, obj.getFullname());
            stmt.setInt(2, obj.getRG());
            stmt.setString(3, obj.getCPF());
            stmt.setString(4, obj.getLogin());
            stmt.setString(5, obj.getEmployeePassword());
            stmt.setInt(6, obj.getFk_idEmployeeLevel());
            stmt.setInt(7, obj.getFk_idEmployeeSex());
            //stmt.setBytes(8, obj.getImagem());
            
            // 3 Passo executar sql
            stmt.executeUpdate();
            // 4 fechar conexao
            stmt.close();
            JOptionPane.showMessageDialog(null, "Funcionario Salvo com Sucesso!");
        } catch(SQLException erro){
            JOptionPane.showMessageDialog(null, "Erro ao salvar o cliente: " + erro.getMessage());
        }
    }

    public void setFullname(String text) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

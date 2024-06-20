package integrador.dao;

import integrador.model.Funcionarios;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class funcionariosDAO {
    
    private final Connection conn;

    public funcionariosDAO(){
        this.conn = new ConexaoBanco().conectar();
    }
    
    public void Salvar(Funcionarios obj){
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
    
    public void Editar(Funcionarios obj){
        try{
            // 1 cria o SQL
            String sql = "UPDATE employee SET fullName = ?, RG = ?, CPF = ?, login = ?, employeePassword = ?, fk_idEmployeeLevel = ?, fk_idEmployeeSex = ? WHERE idEmployee = ?";
            // 2 preparar a conexao SQL para se conectar com o banco
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, obj.getFullname());
            stmt.setInt(2, obj.getRG());
            stmt.setString(3, obj.getCPF());
            stmt.setString(4, obj.getLogin());
            stmt.setString(5, obj.getEmployeePassword());
            stmt.setInt(6, obj.getFk_idEmployeeLevel());
            stmt.setInt(7, obj.getFk_idEmployeeSex());
            stmt.setInt(8, obj.getIdEmployee());
            
            // 3 Passo executar sql
            stmt.executeUpdate();
            // 4 fechar conexao
            stmt.close();
            JOptionPane.showMessageDialog(null, "Funcionario editado com Sucesso!");
        } catch(SQLException erro){
            JOptionPane.showMessageDialog(null, "Erro ao editar o cliente: " + erro.getMessage());
        }
    }
    
    public void Excluir(Funcionarios obj){
    
        try{
            String sql = "DELETE FROM employee WHERE idEmployee = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, obj.getIdEmployee());
            stmt.execute();
            stmt.close();
            JOptionPane.showMessageDialog(null, "Usuario excluido com sucesso!");
        }catch(SQLException erro){
            JOptionPane.showMessageDialog(null, "Erro ao excluir usuario: " + erro);
        }
    
    }

    public void setFullname(String text) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public Funcionarios BuscarFuncionario(String fullName){
        try{
            String sql = "SELECT * FROM employee WHERE fullname = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, fullName);
            ResultSet rs = stmt.executeQuery();
            Funcionarios obj = new Funcionarios();
            if(rs.next()){
                obj.setIdEmployee(rs.getInt("idEmployee"));
                obj.setFullname(rs.getString("fullname"));
                obj.setRG(rs.getInt("RG"));
                obj.setCPF(rs.getString("CPF"));
                obj.setLogin(rs.getString("login"));
                obj.setEmployeePassword(rs.getString("employeePassword"));
                obj.setFk_idEmployeeLevel(rs.getInt("fk_idEmployeeLevel"));
                obj.setFk_idEmployeeSex(rs.getInt("fk_idEmployeeSex"));
            }
            return obj;    
        }catch(SQLException erro){
           JOptionPane.showMessageDialog(null, "Erro ao buscar o cliente: " + erro.getMessage());
        }
        return null;
    }
    
        public List<Funcionarios>Listar(){
            List<Funcionarios> lista = new ArrayList<>();
            try{
                String sql = "SELECT * FROM employee";
                PreparedStatement stmt = conn.prepareStatement(sql);
                ResultSet rs = stmt.executeQuery();
                
                while(rs.next()){
                    Funcionarios obj = new Funcionarios();
                    
                obj.setIdEmployee(rs.getInt("idEmployee"));
                obj.setFullname(rs.getString("fullname"));
                obj.setRG(rs.getInt("RG"));
                obj.setCPF(rs.getString("CPF"));
                obj.setLogin(rs.getString("login"));
                obj.setEmployeePassword(rs.getString("employeePassword"));
                obj.setFk_idEmployeeLevel(rs.getInt("fk_idEmployeeLevel"));
                obj.setFk_idEmployeeSex(rs.getInt("fk_idEmployeeSex"));
                lista.add(obj);
                }
                return lista;
            }catch(SQLException erro){
                JOptionPane.showMessageDialog(null,"Erro ao criar a lista: " + erro);
            }
                return null;
    }
        
    public List<Funcionarios>Filtrar(String fullname){
            List<Funcionarios> lista = new ArrayList<>();
            try{
                String sql = "SELECT * FROM employee WHERE fullname like ?";
                PreparedStatement stmt = conn.prepareStatement(sql);
                stmt.setString(1, fullname);
                ResultSet rs = stmt.executeQuery();
                
                while(rs.next()){
                    Funcionarios obj = new Funcionarios();
                    
                obj.setIdEmployee(rs.getInt("idEmployee"));
                obj.setFullname(rs.getString("fullname"));
                obj.setRG(rs.getInt("RG"));
                obj.setCPF(rs.getString("CPF"));
                obj.setLogin(rs.getString("login"));
                obj.setEmployeePassword(rs.getString("employeePassword"));
                obj.setFk_idEmployeeLevel(rs.getInt("fk_idEmployeeLevel"));
                obj.setFk_idEmployeeSex(rs.getInt("fk_idEmployeeSex"));
                lista.add(obj);
                }
                return lista;
            }catch(SQLException erro){
                JOptionPane.showMessageDialog(null,"Erro ao criar a lista: " + erro);
            }
                return null;
    }
    
    
}

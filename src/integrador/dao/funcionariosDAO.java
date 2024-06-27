package integrador.dao;

import integrador.model.Funcionarios;
import integrador.model.NivelAcesso;
import integrador.model.Sexualidades;
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
            
            stmt.setInt(6, obj.getNivelAcesso().getIdLevel());
            stmt.setInt(7, obj.getSexualidades().getIdSex());
            
            // 3 Passo executar sql
            stmt.execute();
            // 4 fechar conexao
            stmt.close();
            JOptionPane.showMessageDialog(null, "Funcionario Salvo com Sucesso!");
        } catch(SQLException erro){
            JOptionPane.showMessageDialog(null, "Erro ao salvar o funcionario: " + erro.getMessage());
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
            
            stmt.setInt(6, obj.getNivelAcesso().getIdLevel());
            stmt.setInt(7, obj.getSexualidades().getIdSex());
            
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
            String sql = 
            "SELECT e.idEmployee, e.fullName, e.RG, e.CPF, e.login, e.employeePassword, a.accessLevel, s.sexName " +
            "FROM employee AS e " +
            "INNER JOIN sex AS s ON (e.fk_idEmployeeSex = s.idSex) " +
            "INNER JOIN accessLevel AS a ON (e.fk_idEmployeeLevel = a.idLevel) WHERE e.fullName = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, fullName);
            ResultSet rs = stmt.executeQuery();
            
            Funcionarios obj = new Funcionarios();
            Sexualidades s = new Sexualidades();
            NivelAcesso na = new NivelAcesso();
            
            if(rs.next()){
                obj.setIdEmployee(rs.getInt("e.idEmployee"));
                obj.setFullname(rs.getString("e.fullname"));
                obj.setRG(rs.getInt("e.RG"));
                obj.setCPF(rs.getString("e.CPF"));
                obj.setLogin(rs.getString("e.login"));
                obj.setEmployeePassword(rs.getString("e.employeePassword"));
                
                na.setAccessLevel(rs.getString("a.accessLevel"));
                obj.setNivelAcesso(na);
                
                s.setSexName(rs.getString("s.sexName"));
                obj.setSexualidades(s);
            
            }
            return obj;    
        }catch(SQLException erro){
           JOptionPane.showMessageDialog(null, "Erro ao buscar o funcionario: " + erro.getMessage());
        }
        return null;
    }

public List<Funcionarios> Listar() {
    List<Funcionarios> lista = new ArrayList<>();
    try {
        String sql = "SELECT e.idEmployee, e.fullName, e.RG, e.CPF, e.login, e.employeePassword, a.accessLevel, s.sexName FROM employee AS e INNER JOIN sex AS s ON e.fk_idEmployeeSex = s.idSex INNER JOIN accessLevel AS a ON e.fk_idEmployeeLevel = a.idLevel";
        PreparedStatement stmt = conn.prepareStatement(sql);
        ResultSet rs = stmt.executeQuery();
        
        while (rs.next()) {
            Funcionarios obj = new Funcionarios();
            Sexualidades sexu = new Sexualidades(); 
            NivelAcesso na = new NivelAcesso();
            
            obj.setIdEmployee(rs.getInt("e.idEmployee"));
            obj.setFullname(rs.getString("e.fullName"));
            obj.setRG(rs.getInt("e.RG"));
            obj.setCPF(rs.getString("e.CPF"));
            obj.setLogin(rs.getString("e.login"));
            obj.setEmployeePassword(rs.getString("e.employeePassword"));
            
            na.setAccessLevel(rs.getString("a.accessLevel"));
            obj.setNivelAcesso(na);
            sexu.setSexName(rs.getString("s.sexName"));
            obj.setSexualidades(sexu);
            
            lista.add(obj);
        }
    } catch (SQLException erro) {
        JOptionPane.showMessageDialog(null, "Erro ao criar a lista: " + erro);
    }
    return lista;
}

        
    public List<Funcionarios>Filtrar(String fullname){
            List<Funcionarios> lista = new ArrayList<>();
            try{
                String sql = "SELECT e.idEmployee, e.fullName, e.RG, e.CPF, e.login, e.employeePassword, a.accessLevel, s.sexName " +
                "FROM employee AS e " +
                "INNER JOIN sex AS s ON e.fk_idEmployeeSex = s.idSex " +
                "INNER JOIN accessLevel AS a ON e.fk_idEmployeeLevel = a.idLevel WHERE e.fullname like ?";
                PreparedStatement stmt = conn.prepareStatement(sql);
                stmt.setString(1, fullname);
                ResultSet rs = stmt.executeQuery();
                
                while(rs.next()){
                Funcionarios obj = new Funcionarios();
                Sexualidades s = new Sexualidades();    
                NivelAcesso na = new NivelAcesso();
                
                obj.setIdEmployee(rs.getInt("e.idEmployee"));
                obj.setFullname(rs.getString("e.fullname"));
                obj.setRG(rs.getInt("e.RG"));
                obj.setCPF(rs.getString("e.CPF"));
                obj.setLogin(rs.getString("e.login"));
                obj.setEmployeePassword(rs.getString("e.employeePassword"));
                
                na.setAccessLevel(rs.getString("a.accessLevel"));
                obj.setNivelAcesso(na);
                
                s.setSexName(rs.getString("s.sexName"));
                obj.setSexualidades(s);
                
                lista.add(obj);
                }
                return lista;
            }catch(SQLException erro){
                JOptionPane.showMessageDialog(null,"Erro ao criar a lista: " + erro);
            }
                return null;
    }
    
    
}

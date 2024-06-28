
package integrador.dao;

import java.sql.SQLException;
import integrador.model.Clientes;
import integrador.model.Sexualidades;
import java.sql.Connection;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ClientesDAO {
    private final Connection conn;

    public ClientesDAO(){
        this.conn = new ConexaoBanco().conectar();
    }
    
    public void Salvar(Clientes obj){
        try{
            // 1 cria o SQL
            String sql = "insert into cliente(nome, RG, CPF, email, telefone, cep, endereco, numero, complemento, bairro, cidade, estado, idSex)" 
                         + "values(?,?,?,?,?,?,?,?,?,?,?,?,?)";
            // 2 preparar a conexao SQL para se conectar com o banco
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, obj.getNome());
            stmt.setString(2, obj.getRG());
            stmt.setString(3, obj.getCPF());
            stmt.setString(4, obj.getEmail());
            stmt.setString(5, obj.getTelefone());            
            stmt.setString(6, obj.getCep());
            stmt.setString(7, obj.getEndereco());
            stmt.setInt(8, obj.getNumero());
            stmt.setString(9, obj.getComplemento());
            stmt.setString(10, obj.getBairro());
            stmt.setString(11, obj.getCidade());
            stmt.setString(12, obj.getEstado());
            
            stmt.setInt(13, obj.getSexualidade().getIdSex());
            
            // 3 Passo executar sql
            stmt.execute();
            // 4 fechar conexao
            stmt.close();
            JOptionPane.showMessageDialog(null, "Cliente Salvo com Sucesso!");
        
        } catch(SQLException erro){
            JOptionPane.showMessageDialog(null, "Erro ao salvar o cliente: " + erro.getMessage());
        }
        
        
    }
    
    public void Editar(Clientes obj){
        try{
            // 1 cria o SQL
            String sql = "UPDATE cliente SET nome= ?, RG = ?, CPF = ?, email = ?, telefone = ?, cep = ?, endereco = ?, numero = ?, complemento = ?, bairro = ?, cidade = ?, estado = ?, idSex = ? WHERE id = ?";
            // 2 preparar a conexao SQL para se conectar com o banco
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, obj.getNome());
            stmt.setString(2, obj.getRG());
            stmt.setString(3, obj.getCPF());
            stmt.setString(4, obj.getEmail());
            stmt.setString(5, obj.getTelefone());            
            stmt.setString(6, obj.getCep());
            stmt.setString(7, obj.getEndereco());
            stmt.setInt(8, obj.getNumero());
            stmt.setString(9, obj.getComplemento());
            stmt.setString(10, obj.getBairro());
            stmt.setString(11, obj.getCidade());
            stmt.setString(12, obj.getEstado());
            
            stmt.setInt(13, obj.getSexualidade().getIdSex());
            
            stmt.setInt(14, obj.getId());
            
            // 3 Passo executar sql
            stmt.execute();
            // 4 fechar conexao
            stmt.close();
            JOptionPane.showMessageDialog(null, "Cliente editado com Sucesso!");
        
        } catch(SQLException erro){
            JOptionPane.showMessageDialog(null, "Erro ao editar o cliente: " + erro.getMessage());
        }
        
        
    }
    
    public void Excluir(Clientes obj){
    
        try{
            String sql = "DELETE FROM cliente WHERE id = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, obj.getId());
            stmt.execute();
            stmt.close();
            JOptionPane.showMessageDialog(null, "Cliente excluido com sucesso!");
        }catch(SQLException erro){
            JOptionPane.showMessageDialog(null, "Erro ao excluir o cliente: " + erro);
        }
    
    }
    
    public Clientes BuscarClientes(String nome){
        try{
            String sql = 
            "SELECT c.id, c.nome, c.RG, c.CPF, c.email, c.telefone, c.cep, c.endereco, c.numero, c.complemento, c.bairro, c.cidade, c.estado, s.sexName " +
            "FROM cliente AS c " +
            "INNER JOIN sex AS s ON (c.idSex = s.idSex) WHERE c.nome = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, nome);
            ResultSet rs = stmt.executeQuery();
            
            Clientes obj = new Clientes();
            Sexualidades s = new Sexualidades();
            
            if(rs.next()){
                obj.setId(rs.getInt("c.id"));
                obj.setNome(rs.getString("c.nome"));
                obj.setRG(rs.getString("c.RG"));
                obj.setCPF(rs.getString("c.CPF"));
                obj.setEmail(rs.getString("c.email"));
                obj.setTelefone(rs.getString("c.telefone"));
                obj.setCep(rs.getString("c.cep"));
                obj.setEndereco(rs.getString("c.endereco"));
                obj.setNumero(rs.getInt("c.numero"));
                obj.setComplemento(rs.getString("c.complemento"));
                obj.setBairro(rs.getString("c.bairro"));
                obj.setCidade(rs.getString("c.cidade"));
                obj.setEstado(rs.getString("c.estado"));
                
                s.setSexName(rs.getString("s.sexName"));
                obj.setSexualidade(s);
            
            }
            return obj;    
        }catch(SQLException erro){
           JOptionPane.showMessageDialog(null, "Erro ao buscar o cliente: " + erro.getMessage());
        }
        return null;
    }
    
    public Clientes BuscarClientesCPF(String CPF){
        try{
            String sql = 
            "SELECT c.id, c.nome, c.RG, c.CPF, c.email, c.telefone, c.cep, c.endereco, c.numero, c.complemento, c.bairro, c.cidade, c.estado, s.sexName " +
            "FROM cliente AS c " +
            "INNER JOIN sex AS s ON (c.idSex = s.idSex) WHERE c.CPF = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, CPF);
            ResultSet rs = stmt.executeQuery();
            
            Clientes obj = new Clientes();
            Sexualidades s = new Sexualidades();
            
            if(rs.next()){
                obj.setId(rs.getInt("c.id"));
                obj.setNome(rs.getString("c.nome"));
                obj.setRG(rs.getString("c.RG"));
                obj.setCPF(rs.getString("c.CPF"));
                obj.setEmail(rs.getString("c.email"));
                obj.setTelefone(rs.getString("c.telefone"));
                obj.setCep(rs.getString("c.cep"));
                obj.setEndereco(rs.getString("c.endereco"));
                obj.setNumero(rs.getInt("c.numero"));
                obj.setComplemento(rs.getString("c.complemento"));
                obj.setBairro(rs.getString("c.bairro"));
                obj.setCidade(rs.getString("c.cidade"));
                obj.setEstado(rs.getString("c.estado"));
                
                s.setSexName(rs.getString("s.sexName"));
                obj.setSexualidade(s);
            
            }
            return obj;    
        }catch(SQLException erro){
           JOptionPane.showMessageDialog(null, "Erro ao buscar o cliente: " + erro.getMessage());
        }
        return null;
    }
    
    public List<Clientes> Listar() {
    List<Clientes> lista = new ArrayList<>();
    try {
        String sql = "SELECT c.id, c.nome, c.RG, c.CPF, c.email, c.telefone, c.cep, c.endereco, c.complemento, c.bairro, c.numero, c.cidade, c.estado, s.sexName FROM cliente AS c INNER JOIN sex AS s ON c.idSex = s.idSex ORDER BY id";
        PreparedStatement stmt = conn.prepareStatement(sql);
        ResultSet rs = stmt.executeQuery();
        
        while (rs.next()) {
            Clientes obj = new Clientes();
            Sexualidades sexu = new Sexualidades(); 
            
                obj.setId(rs.getInt("c.id"));
                obj.setNome(rs.getString("c.nome"));
                obj.setRG(rs.getString("c.RG"));
                obj.setCPF(rs.getString("c.CPF"));
                obj.setEmail(rs.getString("c.email"));
                obj.setTelefone(rs.getString("c.telefone"));
                obj.setCep(rs.getString("c.cep"));
                obj.setEndereco(rs.getString("c.endereco"));
                obj.setNumero(rs.getInt("c.numero"));
                obj.setComplemento(rs.getString("c.complemento"));
                obj.setBairro(rs.getString("c.bairro"));
                obj.setCidade(rs.getString("c.cidade"));
                obj.setEstado(rs.getString("c.estado"));
            
                sexu.setSexName(rs.getString("s.sexName"));
                obj.setSexualidade(sexu);
            lista.add(obj);
            }
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro ao criar a lista: " + erro);
        }
        return lista;
    }
    
    public List<Clientes>Filtrar(String fullname){
            List<Clientes> lista = new ArrayList<>();
            try{
                String sql = "SELECT c.id, c.nome, c.RG, c.CPF, c.email, c.telefone, c.cep, c.endereco, c.complemento, c.bairro, c.numero, c.cidade, c.estado, s.sexName " +
                "FROM cliente AS c INNER JOIN sex AS s ON c.idSex = s.idSex WHERE c.nome like ?";
                PreparedStatement stmt = conn.prepareStatement(sql);
                stmt.setString(1, fullname);
                ResultSet rs = stmt.executeQuery();
                
                while(rs.next()){
                Clientes obj = new Clientes();
                Sexualidades s = new Sexualidades(); 
                
                obj.setId(rs.getInt("c.id"));
                obj.setNome(rs.getString("c.nome"));
                obj.setRG(rs.getString("c.RG"));
                obj.setCPF(rs.getString("c.CPF"));
                obj.setEmail(rs.getString("c.email"));
                obj.setTelefone(rs.getString("c.telefone"));
                obj.setCep(rs.getString("c.cep"));
                obj.setEndereco(rs.getString("c.endereco"));
                obj.setNumero(rs.getInt("c.numero"));
                obj.setComplemento(rs.getString("c.complemento"));
                obj.setBairro(rs.getString("c.bairro"));
                obj.setCidade(rs.getString("c.cidade"));
                obj.setEstado(rs.getString("c.estado"));
                
                s.setSexName(rs.getString("s.sexName"));
                obj.setSexualidade(s);
                
                lista.add(obj);
                }
                return lista;
            }catch(SQLException erro){
                JOptionPane.showMessageDialog(null,"Erro ao criar a lista: " + erro);
            }
                return null;
    }
    
}

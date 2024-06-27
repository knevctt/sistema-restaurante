package integrador.dao;

import integrador.model.NivelAcesso;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class NivelAcessoDAO {
    
    private final Connection conn;

    public NivelAcessoDAO(){
        this.conn = new ConexaoBanco().conectar();
    }
    
    public List<NivelAcesso>Listar(){
            List<NivelAcesso> lista = new ArrayList<>();
            try{
                String sql = "SELECT * FROM accessLevel";
                PreparedStatement stmt = conn.prepareStatement(sql);
                ResultSet rs = stmt.executeQuery();
                
                while(rs.next()){
                NivelAcesso obj = new NivelAcesso();
                    
                obj.setIdLevel(rs.getInt("idLevel"));
                obj.setAccessLevel(rs.getString("accessLevel"));
                lista.add(obj);
                }
                return lista;
            }catch(SQLException erro){
                JOptionPane.showMessageDialog(null,"Erro ao criar a lista: " + erro);
            }
                return null;
    }
    
    public void Salvar(NivelAcesso obj){
        try{
            // 1 cria o SQL
            String sql = "INSERT INTO accessLevel(accessLevel)" 
                         + "values(?)";
            // 2 preparar a conexao SQL para se conectar com o banco
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, obj.getAccessLevel());
            
            // 3 Passo executar sql
            stmt.executeUpdate();
            // 4 fechar conexao
            stmt.close();
            JOptionPane.showMessageDialog(null, "Nivel de acesso salvo com Sucesso!");
        } catch(SQLException erro){
            JOptionPane.showMessageDialog(null, "Erro ao salvar o nivel de acesso: " + erro.getMessage());
        }
    }
    
    public void Editar(NivelAcesso obj){
        try{
            // 1 cria o SQL
            String sql = "UPDATE accessLevel SET accessLevel = ? WHERE idLevel = ?";
            // 2 preparar a conexao SQL para se conectar com o banco
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, obj.getAccessLevel());
            stmt.setInt(2, obj.getIdLevel());
            // 3 Passo executar sql
            stmt.executeUpdate();
            // 4 fechar conexao
            stmt.close();
            JOptionPane.showMessageDialog(null, "Nivel de acesso editado com Sucesso!");
        } catch(SQLException erro){
            JOptionPane.showMessageDialog(null, "Erro ao editar o nivel de acesso: " + erro.getMessage());
        }
    }
    
    public void Excluir(NivelAcesso obj){
    
        try{
            String sql = "DELETE FROM accessLevel WHERE idLevel = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, obj.getIdLevel());
            stmt.execute();
            stmt.close();
            JOptionPane.showMessageDialog(null, "Nivel de acesso excluido com sucesso!");
        }catch(SQLException erro){
            JOptionPane.showMessageDialog(null, "Erro ao excluir o nivel de acesso: " + erro);
        }
    
    }
    
    public NivelAcesso BuscarNivelAcesso(String sexName){
        try{
            String sql = "SELECT * FROM accessLevel WHERE accesslevel = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, sexName);
            ResultSet rs = stmt.executeQuery();
            NivelAcesso obj = new NivelAcesso();
            if(rs.next()){
                obj.setIdLevel(rs.getInt("idLevel"));
                obj.setAccessLevel(rs.getString("accessLevel"));
            }
            return obj;    
        }catch(SQLException erro){
           JOptionPane.showMessageDialog(null, "Erro ao buscar o nivel de acesso: " + erro.getMessage());
        }
        return null;
    }
    
    public List<NivelAcesso>Filtrar(String accessLevel){
            List<NivelAcesso> lista = new ArrayList<>();
            try{
                String sql = "SELECT * FROM accessLevel WHERE accessLevel like ?";
                PreparedStatement stmt = conn.prepareStatement(sql);
                stmt.setString(1, accessLevel);
                ResultSet rs = stmt.executeQuery();
                
                while(rs.next()){
                NivelAcesso obj = new NivelAcesso();
                    
                obj.setIdLevel(rs.getInt("idLevel"));
                obj.setAccessLevel(rs.getString("accessLevel"));
                lista.add(obj);
                }
                return lista;
            }catch(SQLException erro){
                JOptionPane.showMessageDialog(null,"Erro ao criar a lista: " + erro);
            }
                return null;
    }
    
}

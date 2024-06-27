package integrador.dao;

import integrador.model.TipoDeProduto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class TipoDeProdutosDAO {
    
    private final Connection conn;

    public TipoDeProdutosDAO(){
        this.conn = new ConexaoBanco().conectar();
    }
    
    public void Salvar(TipoDeProduto obj){
        try{
            // 1 cria o SQL
            String sql = "INSERT INTO typesOfProducts(productType)" 
                         + "values(?)";
            // 2 preparar a conexao SQL para se conectar com o banco
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, obj.getProductType());
            
            // 3 Passo executar sql
            stmt.executeUpdate();
            // 4 fechar conexao
            stmt.close();
            JOptionPane.showMessageDialog(null, "Tipo de produto Salvo com Sucesso!");
        } catch(SQLException erro){
            JOptionPane.showMessageDialog(null, "Erro ao salvar o tipo de produto: " + erro.getMessage());
        }
    }
    
    public void Editar(TipoDeProduto obj){
        try{
            // 1 cria o SQL
            String sql = "UPDATE typesOfProducts SET productType = ? WHERE idProductType = ?";
            // 2 preparar a conexao SQL para se conectar com o banco
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, obj.getProductType());
            stmt.setInt(2, obj.getIdProductType());
            // 3 Passo executar sql
            stmt.executeUpdate();
            // 4 fechar conexao
            stmt.close();
            JOptionPane.showMessageDialog(null, "Tipo de produto editado com Sucesso!");
        } catch(SQLException erro){
            JOptionPane.showMessageDialog(null, "Erro ao editar o tipo de produto: " + erro.getMessage());
        }
    }
    
    public void Excluir(TipoDeProduto obj){
    
        try{
            String sql = "DELETE FROM typesOfProducts WHERE idProductType = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, obj.getIdProductType());
            stmt.execute();
            stmt.close();
            JOptionPane.showMessageDialog(null, "Tipo de produto excluido com sucesso!");
        }catch(SQLException erro){
            JOptionPane.showMessageDialog(null, "Erro ao excluir tipo de produto: " + erro);
        }
    
    }

    public void setFullname(String text) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public TipoDeProduto BuscarTipoDeProdutos(String fullName){
        try{
            String sql = "SELECT * FROM typesOfProducts WHERE productType = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, fullName);
            ResultSet rs = stmt.executeQuery();
            TipoDeProduto obj = new TipoDeProduto();
            if(rs.next()){
                obj.setIdProductType(rs.getInt("idProductType"));
                obj.setProductType(rs.getString("productType"));
            }
            return obj;    
        }catch(SQLException erro){
           JOptionPane.showMessageDialog(null, "Erro ao buscar o tipo de produto: " + erro.getMessage());
        }
        return null;
    }
    
        public List<TipoDeProduto>Listar(){
            List<TipoDeProduto> lista = new ArrayList<>();
            try{
                String sql = "SELECT * FROM typesOfProducts";
                PreparedStatement stmt = conn.prepareStatement(sql);
                ResultSet rs = stmt.executeQuery();
                
                while(rs.next()){
                TipoDeProduto obj = new TipoDeProduto();
                    
                obj.setIdProductType(rs.getInt("idProductType"));
                obj.setProductType(rs.getString("productType"));
                lista.add(obj);
                }
                return lista;
            }catch(SQLException erro){
                JOptionPane.showMessageDialog(null,"Erro ao criar a lista: " + erro);
            }
                return null;
        }
        
    public List<TipoDeProduto>Filtrar(String productType){
            List<TipoDeProduto> lista = new ArrayList<>();
            try{
                String sql = "SELECT * FROM typesOfProducts WHERE productType like ?";
                PreparedStatement stmt = conn.prepareStatement(sql);
                stmt.setString(1, productType);
                ResultSet rs = stmt.executeQuery();
                
                while(rs.next()){
                    TipoDeProduto obj = new TipoDeProduto();
                    
                obj.setIdProductType(rs.getInt("idProductType"));
                obj.setProductType(rs.getString("productType"));
                lista.add(obj);
                }
                return lista;
            }catch(SQLException erro){
                JOptionPane.showMessageDialog(null,"Erro ao criar a lista: " + erro);
            }
                return null;
    }
    
    
}

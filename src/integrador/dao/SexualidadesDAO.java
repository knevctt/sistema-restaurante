/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package integrador.dao;

import integrador.model.Sexualidades;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class SexualidadesDAO {
    
    private final Connection conn;

    public SexualidadesDAO(){
        this.conn = new ConexaoBanco().conectar();
    }
    
    public List<Sexualidades>Listar(){
            List<Sexualidades> lista = new ArrayList<>();
            try{
                String sql = "SELECT * FROM sex";
                PreparedStatement stmt = conn.prepareStatement(sql);
                ResultSet rs = stmt.executeQuery();
                
                while(rs.next()){
                Sexualidades obj = new Sexualidades();
                    
                obj.setIdSex(rs.getInt("idSex"));
                obj.setSexName(rs.getString("sexName"));
                lista.add(obj);
                }
                return lista;
            }catch(SQLException erro){
                JOptionPane.showMessageDialog(null,"Erro ao criar a lista: " + erro);
            }
                return null;
    }
    
    public void Salvar(Sexualidades obj){
        try{
            // 1 cria o SQL
            String sql = "INSERT INTO sex(sexName)" 
                         + "values(?)";
            // 2 preparar a conexao SQL para se conectar com o banco
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, obj.getSexName());
            
            // 3 Passo executar sql
            stmt.executeUpdate();
            // 4 fechar conexao
            stmt.close();
            JOptionPane.showMessageDialog(null, "Tipo de sexualidade Salvo com Sucesso!");
        } catch(SQLException erro){
            JOptionPane.showMessageDialog(null, "Erro ao salvar o tipo de sexualidade: " + erro.getMessage());
        }
    }
    
    public void Editar(Sexualidades obj){
        try{
            // 1 cria o SQL
            String sql = "UPDATE sex SET sexName = ? WHERE idSex = ?";
            // 2 preparar a conexao SQL para se conectar com o banco
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, obj.getSexName());
            stmt.setInt(2, obj.getIdSex());
            // 3 Passo executar sql
            stmt.executeUpdate();
            // 4 fechar conexao
            stmt.close();
            JOptionPane.showMessageDialog(null, "Tipo de sexualidade editado com Sucesso!");
        } catch(SQLException erro){
            JOptionPane.showMessageDialog(null, "Erro ao editar o tipo de sexualidade: " + erro.getMessage());
        }
    }
    
    public void Excluir(Sexualidades obj){
    
        try{
            String sql = "DELETE FROM sex WHERE idSex = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, obj.getIdSex());
            stmt.execute();
            stmt.close();
            JOptionPane.showMessageDialog(null, "Tipo de sexualidade excluido com sucesso!");
        }catch(SQLException erro){
            JOptionPane.showMessageDialog(null, "Erro ao excluir tipo de sexualidade: " + erro);
        }
    
    }
    
    public Sexualidades BuscarTipoDeSexualidade(String sexName){
        try{
            String sql = "SELECT * FROM sex WHERE sexName = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, sexName);
            ResultSet rs = stmt.executeQuery();
            Sexualidades obj = new Sexualidades();
            if(rs.next()){
                obj.setIdSex(rs.getInt("idSex"));
                obj.setSexName(rs.getString("sexName"));
            }
            return obj;    
        }catch(SQLException erro){
           JOptionPane.showMessageDialog(null, "Erro ao buscar o tipo de sexualidade: " + erro.getMessage());
        }
        return null;
    }
    
    public List<Sexualidades>Filtrar(String sexName){
            List<Sexualidades> lista = new ArrayList<>();
            try{
                String sql = "SELECT * FROM sex WHERE sexName like ?";
                PreparedStatement stmt = conn.prepareStatement(sql);
                stmt.setString(1, sexName);
                ResultSet rs = stmt.executeQuery();
                
                while(rs.next()){
                    Sexualidades obj = new Sexualidades();
                    
                obj.setIdSex(rs.getInt("idSex"));
                obj.setSexName(rs.getString("sexName"));
                lista.add(obj);
                }
                return lista;
            }catch(SQLException erro){
                JOptionPane.showMessageDialog(null,"Erro ao criar a lista: " + erro);
            }
                return null;
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package integrador.dao;

import integrador.model.Vendas;
import java.sql.Connection;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;

/**
 *
 * @author knevc
 */
public class VendasDAO {
    private final Connection conn;

    public VendasDAO(){
        this.conn = new ConexaoBanco().conectar();
    }
    
    public void Salvar(Vendas obj){
        try {
            String sql = "INSERT INTO vendas (cliente_id, data_venda,total_venda,observacoes) VALUES(?,?,?,?)";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, obj.getClientes().getId());
            stmt.setString(2, obj.getData_venda());
            stmt.setDouble(3, obj.getTotal_venda());
            stmt.setString(4, obj.getObservacoes());
            stmt.execute();
            stmt.close();
            JOptionPane.showMessageDialog(null, "Venda realizada com sucesso!");
        } catch (SQLException erro) {
            throw new RuntimeException("Erro ao realizar a venda" + erro);
        }
    }
    
    public int retornaUltimoIdVenda(){
        try {
            int ultimoId = 0;
            String sql = "SELECT max(id) id FROM vendas";
            PreparedStatement stmt = conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while(rs.next()){
                Vendas v = new Vendas();
                v.setId(rs.getInt("id"));
                ultimoId = v.getId();
                
            }
            return ultimoId;
        } catch (SQLException erro) {
            throw new RuntimeException("erro ao retornar o ultimo id da venda" + erro);
        }
        
    }
    
}

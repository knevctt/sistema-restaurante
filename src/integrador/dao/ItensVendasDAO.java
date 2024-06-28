/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package integrador.dao;

import integrador.model.ItensVendas;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author knevc
 */
public class ItensVendasDAO {
    private final Connection conn;

    public ItensVendasDAO(){
        this.conn = new ConexaoBanco().conectar();
    }
    
    public void Salvar(ItensVendas obj){
    
        try {
            String sql = "INSERT INTO itensvendas(venda_id,produto_id,qtd,subtotal)VALUES (?,?,?,?)";
            PreparedStatement stmt = conn.prepareStatement(sql); 
        
        } catch (SQLException erro) {
            
        }
    
    }
    
}

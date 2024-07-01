/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package integrador.dao;

import integrador.model.ItensVendas;
import integrador.model.Produtos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;

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
            stmt.setInt(1, obj.getVendas().getId());
            stmt.setInt(2, obj.getProdutos().getIdProduct());
            stmt.setInt(3, obj.getQtd());
            stmt.setDouble(4, obj.getSubtotal());
            stmt.execute();
            stmt.close();
        } catch (SQLException erro) {
            throw new RuntimeException("Erro ao salvar os itens da venda" + erro);
        }
    
    }
    
    public List<ItensVendas>listaItens(int venda_id){
        try {
            List<ItensVendas>lista = new ArrayList<>();
            String sql = "SELECT p.idProduct, p.nameProduct, i.qtd, p.price, i.subtotal FROM itensvendas AS i INNER JOIN product AS p ON(i.produto_id = p.idProduct) WHERE i.venda_id = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, venda_id);
            ResultSet rs = stmt.executeQuery();
            while(rs.next()){
                ItensVendas item = new ItensVendas();
                Produtos p = new Produtos();
                p.setIdProduct(rs.getInt("p.idProduct"));
                item.setProdutos(p);
                p.setNameProduct(rs.getString("p.nameProduct"));
                item.setProdutos(p);
                item.setQtd(rs.getInt("i.qtd"));
                p.setPrice(rs.getDouble("p.price"));
                item.setProdutos(p);
                item.setSubtotal(rs.getInt("i.subtotal"));
                lista.add(item);
            }
            return lista;
        } catch (SQLException erro) {
                throw new RuntimeException("Erro ao criar a lista de itens" + erro);
        }
        
    
    }
    
}

package integrador.dao;
import java.awt.HeadlessException;
import java.sql.Connection;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;

public class TestarConexao {
        
    public static void main(String[] args){
        Connection conn = null;
    try {
            conn = new ConexaoBanco().conectar();
            JOptionPane.showMessageDialog(null, "Banco de dados conectado");
        } catch (HeadlessException ex) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro inesperado:\n" + ex.getMessage(), "ERRO!", ERROR_MESSAGE);
        }
}    
    
}
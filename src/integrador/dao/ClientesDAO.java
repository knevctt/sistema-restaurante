
package integrador.dao;

import java.sql.Connection;

public class ClientesDAO {
    private final Connection conn;

    public ClientesDAO(){
        this.conn = new ConexaoBanco().conectar();
    }
    
    
    
}

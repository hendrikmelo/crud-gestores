
package br.com.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoDAO {
    
    public Connection conexaoBD() throws ClassNotFoundException{
        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/projetopoupex?user=root&password=";
            con = DriverManager.getConnection(url);
        } catch (SQLException e) {
            throw new RuntimeException("Erro 4: " + e);
        }
        return con;
    }
}

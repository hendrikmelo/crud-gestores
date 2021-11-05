
package br.com.DAO;

import br.com.DTO.GestorDTO;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class GestorDao {
    
    Connection con;
    PreparedStatement pstm;
    
    public void CadastrarGestor(GestorDTO objGestorDTO) throws ClassNotFoundException{
        
        String sql = "insert into gestor (nme_gestor, mat_gestor, date_nasc_gestor, setor_gestor) values (?, ?, ?, ?)";
        con = new ConexaoDAO().conexaoBD();
        
        
        
        try {
            
            pstm = con.prepareStatement(sql);
            pstm.setString(1, objGestorDTO.getNome_gestor());
            pstm.setInt(2, objGestorDTO.getMat_gestor());
            pstm.setDate(3, objGestorDTO.getDate_nasc_gestor());
            pstm.setString(4, objGestorDTO.getSetor_gestor());
            
            pstm.execute();
            pstm.close();
            
        } catch (SQLException e) {
            throw new RuntimeException("Erro 4: " + e);
        }
    }
}

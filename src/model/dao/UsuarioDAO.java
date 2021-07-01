
package model.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.MysqlConnect;
import model.Usuario;

public class UsuarioDAO {
    
    PreparedStatement ps;
    ResultSet rs;
    MysqlConnect mysqlConnect = new MysqlConnect();
    
    public Usuario login (String dni, String pass){
        String sql = "SELECT u.*,p.perfil FROM usuarios u "+
		     "INNER JOIN perfil p ON p.cod_perf=u.cod_perf WHERE dni_usu = ? and pass = ?";
        Usuario u = new Usuario();
        try {
            ps = mysqlConnect.connect().prepareStatement(sql);
            ps.setString(1, dni);
            ps.setString(2, pass);
            rs = ps.executeQuery();
            
            while(rs.next()){
                u.setNum_usu(Integer.parseInt(rs.getString("num_usu")));
                u.setNombre_usu(rs.getString("nombre_usu"));
                u.setApellido_usu(rs.getString("apellido_usu"));
                u.setDni_usu(rs.getString("dni_usu"));
                u.setDni_usu(rs.getString("dni_usu"));
                u.setCod_perf(rs.getString("cod_perf"));
                u.setPerfil(rs.getString("perfil"));
                u.setEstado(Integer.parseInt(rs.getString("estado")));
            }
            
        } catch (SQLException e) {
        } finally {
            mysqlConnect.disconnect();
        }
        return u;
    }
}

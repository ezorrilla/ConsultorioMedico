
package model.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.MysqlConnect;
import model.Perfil;

public class PerfilDAO {
    
    PreparedStatement ps;
    ResultSet rs;
    MysqlConnect mysqlConnect = new MysqlConnect();
    
    public List<Perfil> getPerfilesActivos (){
        String sql = "SELECT * FROM perfil WHERE estado = ?";
        
        List<Perfil> perfiles = new ArrayList<>();
        try {
            ps = mysqlConnect.connect().prepareStatement(sql);
            ps.setInt(1, 1);
            rs = ps.executeQuery();
            
            while(rs.next()){
                Perfil p = new Perfil();
                p.setCod_perf(rs.getInt("cod_perf"));
                p.setPerfil(rs.getString("perfil"));
                perfiles.add(p);
            }
            
        } catch (SQLException e) {
        } finally {
            mysqlConnect.disconnect();
        }
        return perfiles;
    }
}

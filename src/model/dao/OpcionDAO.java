
package model.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.MysqlConnect;
import model.Opcion;


public class OpcionDAO {
    
    PreparedStatement ps;
    ResultSet rs;
    MysqlConnect mysqlConnect = new MysqlConnect();
    
    public List<Opcion> opcionesUsuario (int num_usu){
        String sql = "SELECT opc.* FROM usuarios u" +
                    " INNER JOIN opcionxperfil op " +
                    " 	ON u.cod_perf=op.cod_perf " +
                    " INNER JOIN opcion opc " +
                    " 	ON opc.cod_opc=op.cod_opc " +
                    " WHERE num_usu = ? " +
                    " ORDER BY weight";
        
        List<Opcion> opciones = new ArrayList<>();
        try {
            ps = mysqlConnect.connect().prepareStatement(sql);
            ps.setInt(1, num_usu);
            rs = ps.executeQuery();
            
            while(rs.next()){
                Opcion o = new Opcion();
                o.setCod_opc(rs.getInt("cod_opc"));
                o.setOpcion(rs.getString("opcion"));
                opciones.add(o);
            }
            
        } catch (SQLException e) {
        } finally {
            mysqlConnect.disconnect();
        }
        return opciones;
    }
}


package model.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.MysqlConnect;
import model.Pago;


public class PagoDAO {
    
    PreparedStatement ps;
    ResultSet rs;
    MysqlConnect mysqlConnect = new MysqlConnect();
    
    public int registrar (Pago pago){
        String sql = "INSERT INTO pago (cod_cita, cod_exa, tipo_tran, cod_transac, fecha_pago, monto, estado, usu_pago)" +
                     " VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        try {
            ps = mysqlConnect.connect().prepareStatement(sql);
            ps.setInt(1, pago.getCod_cita());
            ps.setInt(2, pago.getCod_exa());
            ps.setString(3, pago.getTipo_tran());
            ps.setInt(4, pago.getCod_transac());
            ps.setString(5, pago.getFecha_pago());
            ps.setDouble(6, pago.getMonto());
            ps.setString(7, pago.getEstado());
            ps.setInt(8, pago.getUsu_pago());
            
            return ps.executeUpdate();    
        } catch (SQLException e) {
        } finally {
            mysqlConnect.disconnect();
        }
        return 0;
    }
}

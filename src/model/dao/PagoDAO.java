
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
        String sql = "INSERT INTO pago (cod_serv, cod_pac, tipo_tran, cod_transac, fecha_crea, fecha_pago, monto, estado, usu_crea, usu_pago)" +
                     " VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try {
            ps = mysqlConnect.connect().prepareStatement(sql);
            ps.setInt(1, pago.getCod_serv());
            ps.setInt(2, pago.getCod_pac());
            ps.setString(3, pago.getTipo_tran());
            ps.setInt(4, pago.getCod_transac());
            ps.setString(5, pago.getFecha_crea());
            ps.setString(6, pago.getFecha_pago());
            ps.setDouble(7, pago.getMonto());
            ps.setString(8, pago.getEstado());
            ps.setInt(9, pago.getUsu_crea());
            ps.setInt(10, pago.getUsu_pago());
            
            return ps.executeUpdate();    
        } catch (SQLException e) {
        } finally {
            mysqlConnect.disconnect();
        }
        return 0;
    }
}

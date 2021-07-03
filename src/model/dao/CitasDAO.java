
package model.dao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import model.MysqlConnect;
import model.Citas;


public class CitasDAO {
    PreparedStatement ps;
    ResultSet rs;
    MysqlConnect mysqlConnect = new MysqlConnect();
    Citas p;
    
    public Citas buscarDNI(int dni){
        String sql = "SELECT nombre_pac, apellido_pac FROM `paciente` WHERE dni_pac = " + dni ;
        p = new Citas();
        try{
        ps = mysqlConnect.connect().prepareStatement(sql);
        rs = ps.executeQuery();
        while(rs.next()){
            p = new Citas();
        }
        } catch(SQLException e){}
        finally{
             mysqlConnect.disconnect();
        }
        return p;
    }
    
    public int agregarCita(Citas nuevo){
        String sql = "INSERT INTO cita (cod_pac,dia_cita,hora_cita,cod_area,cod_med,motivo_cita)VALUES (?, ?, ?, ?, ?, ?)"
                   + "WHERE cod_cita = ?";       
        try {
            ps = mysqlConnect.connect().prepareStatement(sql);            
            ps.setInt(1,nuevo.getCod_pac());
            ps.setDate(2,new java.sql.Date(Calendar.getInstance().getTime().getTime()));
            ps.setInt(3,nuevo.getHora_cita());
            ps.setInt(4,nuevo.getCod_area());
            ps.setInt(5,nuevo.getCod_med());
            ps.setString(6,nuevo.getMotivo_cita());
            ps.executeUpdate();
            
            return ps.executeUpdate();
        } catch (SQLException ex) {
        } finally {
            mysqlConnect.disconnect();
        }
        return 0;
    }
}


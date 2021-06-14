
package model.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.MysqlConnect;
import model.Paciente;

public class ConsultaDAO {
    
    PreparedStatement ps;
    ResultSet rs;
    MysqlConnect mysqlConnect = new MysqlConnect();
    Paciente p;
    
    public Paciente buscarNombre(int dni){
        String sql = "SELECT nombre_pac, apellido_pac FROM `paciente` WHERE dni_pac = " + dni ;
        p = new Paciente();
        try{
        ps = mysqlConnect.connect().prepareStatement(sql);
        rs = ps.executeQuery();
        while(rs.next()){
            p = new Paciente();
            p.setNombre_pac(rs.getString("nombre_pac"));
            p.setApellido_pac(rs.getString("apellido_pac"));
        }
        } catch(SQLException e){}
        finally{
             mysqlConnect.disconnect();
        }
        return p;
    }
}

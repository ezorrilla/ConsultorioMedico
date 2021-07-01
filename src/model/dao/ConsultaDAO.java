
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
    
    public List<Paciente> ultimosPacientesAtendidos(){
        String sql ="SELECT c.cod_cons, paci.cod_pac, " +
                    "   paci.nombre_pac," +
                    "   paci.apellido_pac," +
                    "   s.nomb_serv," +
                    "   c.fecha " +
                    " FROM  consulta c " +
                    " INNER JOIN paciente paci " +
                    "   ON c.cod_pac=paci.cod_pac " +
                    " INNER JOIN servicio s " +
                    "   ON  s.cod_serv=c.cod_serv " +
                    " AND c.estado='Atendido' ORDER BY cod_cons DESC limit 5";
        List<Paciente> pacientes = new ArrayList<>();
        try{
            ps = mysqlConnect.connect().prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                Paciente p = new Paciente();
                p.setCod_pac(rs.getInt("cod_pac"));
                p.setNombre_pac(rs.getString("nombre_pac"));
                p.setApellido_pac(rs.getString("apellido_pac"));
                pacientes.add(p);
            }
        } catch(SQLException e){}
        finally{
             mysqlConnect.disconnect();
        }
        return pacientes;
    }
}

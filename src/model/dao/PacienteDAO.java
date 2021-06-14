
package model.dao;

import model.Paciente;
import model.MysqlConnect;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class PacienteDAO{
    PreparedStatement ps;
    ResultSet rs;
    MysqlConnect mysqlConnect = new MysqlConnect();
    
    public List<Paciente> buscarNombres(String texto){
        String sql = "SELECT cod_pac, apellido_pac, nombre_pac FROM `paciente`"
                   + "WHERE CONCAT(apellido_pac ,' ', nombre_pac) LIKE '%" + texto + "%' ORDER BY cod_pac DESC limit 5";
        List<Paciente> pacientes = new ArrayList<>();
        try {
            ps = mysqlConnect.connect().prepareStatement(sql);
            rs = ps.executeQuery();
            
            while(rs.next()){
                Paciente p = new Paciente();
                p.setCod_pac(Integer.parseInt(rs.getString("cod_pac")));
                p.setNombre_pac(rs.getString("nombre_pac"));
                p.setApellido_pac(rs.getString("apellido_pac"));
                /*try{
                    p.setFecha_nac( new SimpleDateFormat("dd-MM-yyyy").parse(rs.getString("fecha_nac")));
                }catch(ParseException e){ }             
                p.setSexo_pac(rs.getString("sexo_pac"));
                p.setDni_pac(rs.getString("dni_pac"));
                p.setDireccion(rs.getString("direccion"));*/
                pacientes.add(p);
            }
            
        } catch (SQLException e) {
        } finally {
            mysqlConnect.disconnect();
        }
        return pacientes;
    }
       

}


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
import javax.swing.JOptionPane;

public class PacienteDAO{
    PreparedStatement ps;
    ResultSet rs;
    MysqlConnect mysqlConnect = new MysqlConnect();
    
    public List<Paciente> buscarNombresDNI(String texto){
        String sql = "SELECT cod_pac, apellido_pac, nombre_pac, dni_pac, fecha_nac, sexo_pac FROM `paciente` "
                   + "WHERE CONCAT(apellido_pac ,' ', nombre_pac) LIKE '%"+texto+"%' OR dni_pac LIKE'%"+texto+"%' ORDER BY cod_pac DESC limit 5";
        List<Paciente> pacientes = new ArrayList<>();
        try {
            ps = mysqlConnect.connect().prepareStatement(sql);
            rs = ps.executeQuery();
            
            while(rs.next()){
                Paciente p = new Paciente();
                p.setCod_pac(rs.getInt("cod_pac"));
                p.setNombre_pac(rs.getString("nombre_pac"));
                p.setApellido_pac(rs.getString("apellido_pac"));
                pacientes.add(p);
            }
            
        } catch (SQLException e) {
        } finally {
            mysqlConnect.disconnect();
        }
        return pacientes;
    } 
    
    public Paciente getPaciente(int cod_pac){
        String sql = "SELECT cod_pac, apellido_pac, nombre_pac, dni_pac, fecha_nac, sexo_pac FROM `paciente`"
                   + "WHERE cod_pac = ?";
        Paciente p = new Paciente();
        try {
            ps = mysqlConnect.connect().prepareStatement(sql);
            ps.setInt(1, cod_pac);
            rs = ps.executeQuery();
            
            while(rs.next()){
                p.setCod_pac(rs.getInt("cod_pac"));
                p.setNombre_pac(rs.getString("nombre_pac"));
                p.setApellido_pac(rs.getString("apellido_pac"));
                p.setDni_pac(rs.getString("dni_pac"));
                try{
                    p.setFecha_nac(new SimpleDateFormat("dd-MM-yyyy").parse(rs.getString("fecha_nac")));
                }catch(ParseException e){ } 
                p.setSexo_pac(rs.getString("sexo_pac"));                
            }
            
        } catch (SQLException e) {
        } finally {
            mysqlConnect.disconnect();
        }
        return p;
    } 

    
     public List<Paciente> buscarNombres(String texto){
        String sql = "SELECT cod_pac, apellido_pac, nombre_pac FROM `paciente`"
                   + "WHERE CONCAT(apellido_pac ,' ', nombre_pac) LIKE '%" + texto + "%' ORDER BY cod_pac DESC limit 5";
        List<Paciente> pacientes = new ArrayList<>();
        try {
            ps = mysqlConnect.connect().prepareStatement(sql);
            rs = ps.executeQuery();
            
            while(rs.next()){
                Paciente p = new Paciente();
                p.setCod_pac(rs.getInt("cod_pac"));
                p.setNombre_pac(rs.getString("nombre_pac"));
                p.setApellido_pac(rs.getString("apellido_pac"));
                pacientes.add(p);
            }
            
        } catch (SQLException e) {
        } finally {
            mysqlConnect.disconnect();
        }
        return pacientes;
    } 
    
    public void ingresarDatos(Paciente p){
        try{
            String sql = "INSERT INTO paciente ("
                    + "nombre_pac,"
                    + "apellido_pac,"
                    + "fecha_nac,"
                    + "sexo_pac,"
                    + "dni_pac,"
                    + "direccion,"
                    + "telefono) "
                    + "VALUES ("
                    +"\""+p.getNombre_pac()+"\","
                    +"\""+p.getApellido_pac()+"\","
                    +"\""+p.getFecha_nac()+"\","
                    +"\""+p.getSexo_pac()+"\","
                    +"\""+p.getDni_pac()+"\","
                    +"\""+p.getDireccion()+"\","
                    +p.getTelefono()+""
                    +")";
      ps = mysqlConnect.connect().prepareStatement(sql);
        ps.executeUpdate(); 
    } catch(SQLException e){
        JOptionPane.showMessageDialog(null, "Error de conexión:" + e.getMessage());
    }
    finally{
        mysqlConnect.disconnect();
    }
    }
    
    public List<Paciente> listarPacientes(){
        String sql = "SELECT * FROM paciente";
        List<Paciente> pacientes = new ArrayList<>();
        try{
            ps = mysqlConnect.connect().prepareStatement(sql);
            rs = ps.executeQuery();
            
            while(rs.next()){
                Paciente p = new Paciente();
                p.setCod_pac(Integer.parseInt(rs.getString("cod_pac")));
                p.setNombre_pac(rs.getString("nombre_pac"));
                p.setApellido_pac(rs.getString("apellido_pac"));
                p.setDni_pac(rs.getString("dni_pac"));
                p.setTelefono(Integer.parseInt(rs.getString("telefono")));
                p.setSexo_pac(rs.getString("sexo_pac"));
                p.setDireccion(rs.getString("direccion"));
                pacientes.add(p);
            }
        } catch (SQLException e) {
        } finally {
            mysqlConnect.disconnect();
        }
        return pacientes;
    }
    
    public int actualizar(Paciente paciente){
        String sql = "UPDATE paciente SET" +
                        "nombre_pac   = ?, " +
                        "apellido_pac = ?, " +
                        "dni_pac      = ?, " +
                        "direccion      = ?, " +
                        "telefono    = ?, " +
                     "WHERE cod_pac = ?";
        try{
           ps = mysqlConnect.connect().prepareStatement(sql);
           ps.setString(1, paciente.getNombre_pac());
           ps.setString(2, paciente.getApellido_pac());
           ps.setString(3, paciente.getDni_pac());
           ps.setString(4, paciente.getDireccion());
           ps.setInt(5, paciente.getTelefono());
           ps.setInt(6, paciente.getCod_pac());
           return ps.executeUpdate();
        } catch (SQLException e){
        } finally{
            mysqlConnect.disconnect();
        }
        return 0;
    }
    
    public int eliminar (int cod){
        String sql = "DELETE FROM paciente WHERE cod_pac = " + cod;
        try {
            ps = mysqlConnect.connect().prepareStatement(sql);
            
            return ps.executeUpdate();    
        } catch (SQLException e) {
        } finally {
            mysqlConnect.disconnect();
        }
        return 0;

    }
}

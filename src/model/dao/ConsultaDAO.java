
package model.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.Consulta;
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
    
    public void ingresarDatos(Consulta a){ 
    try{          
      // String sql = "INSERT INTO consulta (motivo_consu) VALUES ("+a.getMotivo_consu()+");";
         String sql = "INSERT INTO consulta("
                 + "peso,"
                 + "talla,"
                 + "presion_art,"
                 + "temperatura,"
                 + "notas,"
                 + "motivo_consu,"
                 + "diagnostico,"
                 + "tratamiento,"
                 + "fecha)"
                 + "VALUES("
                 +a.getPeso()+","
                 +a.getTalla()+","
                 +a.getPresion_art()+","
                 +a.getTemperatura()+","
                 +"\""+a.getNotas()+"\","
                 +"\""+a.getMotivo_consu()+"\","
                 +"\""+a.getDiagnostico()+"\","
                 +"\""+a.getTratamiento()+"\","
                 +"\""+a.getFecha()+"\""
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
    
    public List<Consulta> listarConsultas(){
        String sql = "SELECT c.*, p.nombre_pac FROM consulta c "
                + "INNER JOIN paciente p WHERE c.cod_pac=p.cod_pac";
        List<Consulta> consultas = new ArrayList<>();
        try{
            ps = mysqlConnect.connect().prepareStatement(sql);
            rs = ps.executeQuery();
            
            while(rs.next()){
                Consulta c = new Consulta();
                c.setCod_cons(Integer.parseInt(rs.getString("cod_cons")));
                c.setMotivo_consu(rs.getString("motivo_consu"));
                c.setNom_pac(rs.getString("nombre_pac"));
                c.setFecha(rs.getString("fecha"));
                consultas.add(c);
            }
        } catch (SQLException e) {
        } finally {
            mysqlConnect.disconnect();
        }
        return consultas;
    }
}
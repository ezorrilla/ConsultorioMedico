
package model.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;
import model.Historia;
import model.MysqlConnect;

public class HistoriaDAO {
    PreparedStatement ps;
    ResultSet rs;
    MysqlConnect mysqlConnect = new MysqlConnect();
    
    public Historia buscarHistoriaClinica(int cod_pac){
        String sql = "SELECT h.cod_his," +
                    " h.cod_pac," +
                    " h.fecha_his," +
                    " p.apellido_pac," +
                    " p.nombre_pac," +
                    " h.sangre," +
                    " h.VIH," +
                    " h.alergias," +
                    " h.alergia_medic," +
                    " h.medicamentos," +
                    " h.enfermedades," +
                    " h.habitos," +
                    " h.antec_fami," +
                    " h.fecha_act" +
                    " FROM historia h " +
                    " 	INNER JOIN paciente p " +
                    " 	ON p.cod_pac=h.cod_pac " +
                    " 	AND h.cod_pac = " + cod_pac;
        
        Historia historia = new Historia();
        try {
            ps = mysqlConnect.connect().prepareStatement(sql);
            rs = ps.executeQuery();
            
            while(rs.next()){
                historia.setCod_his(Integer.parseInt(rs.getString("cod_his")));
                historia.setCod_pac(Integer.parseInt(rs.getString("cod_pac")));
                try{
                    historia.setFecha_his(new SimpleDateFormat("dd-MM-yyyy").parse(rs.getString("fecha_his")));
                }catch(ParseException e){ } 
                historia.setApellido_pac(rs.getString("apellido_pac"));
                historia.setNombre_pac(rs.getString("nombre_pac"));
                historia.setSangre(rs.getString("sangre"));
                historia.setVIH(rs.getString("VIH"));
                historia.setAlergias(rs.getString("alergias"));
                historia.setAlergia_medic(rs.getString("alergia_medic"));
                historia.setMedicamentos(rs.getString("medicamentos"));
                historia.setEnfermedades(rs.getString("enfermedades"));
                historia.setHabitos(rs.getString("habitos"));
                historia.setAntec_fami(rs.getString("antec_fami"));
            }
            
        } catch (SQLException e) {
        } finally {
            mysqlConnect.disconnect();
        }
        return historia;
    }    
    
    public int actualizarHistoriaClinica(Historia historia){
        String sql = "UPDATE historia SET sangre = ?, VIH = ?, alergias = ?, alergia_medic = ?, medicamentos  = ?, enfermedades = ?, habitos = ?, antec_fami = ?, fecha_act = ? "
                   + "WHERE cod_his = ?";       
        try {
            ps = mysqlConnect.connect().prepareStatement(sql);            
            ps.setString(1,historia.getSangre());
            ps.setString(2,historia.getVIH());
            ps.setString(3,historia.getAlergias());
            ps.setString(4,historia.getAlergia_medic());
            ps.setString(5,historia.getMedicamentos());
            ps.setString(6,historia.getEnfermedades());
            ps.setString(7,historia.getHabitos());
            ps.setString(8,historia.getAntec_fami());
            ps.setDate(9, new java.sql.Date(Calendar.getInstance().getTime().getTime()));
            ps.setInt(10, historia.getCod_his());
            ps.executeUpdate();
            
            return ps.executeUpdate();
        } catch (SQLException ex) {
        } finally {
            mysqlConnect.disconnect();
        }
        return 0;
    }
}

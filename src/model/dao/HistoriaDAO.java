
package model.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
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
                    " 	AND h.cod_pac = " + cod_pac + "";
        
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
}

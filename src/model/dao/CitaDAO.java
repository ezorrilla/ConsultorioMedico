
package model.dao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Area;
import model.MysqlConnect;
import model.Cita;


public class CitaDAO {
    PreparedStatement ps;
    ResultSet rs;
    MysqlConnect mysqlConnect = new MysqlConnect();
        
    public List<Area> listarAreas (){
        String sql = "SELECT a.* FROM area a";
        List<Area> areas = new ArrayList<>();
        try {
            ps = mysqlConnect.connect().prepareStatement(sql);
            rs = ps.executeQuery();
            
            while(rs.next()){
                Area a = new Area();
                a.setCod_area(Integer.parseInt(rs.getString("cod_area")));
                a.setArea_nomb(rs.getString("area_nomb"));
                areas.add(a);
            }            
        } catch (SQLException e) {
        } finally {
            mysqlConnect.disconnect();
        }
        return areas;
    }
    
    public List<model.Medico> listarMedicosPorArea (int cod_area){
        String sql = "SELECT m.* FROM medico m "
                   + "INNER JOIN area a ON a.cod_area = m.cod_area WHERE a.cod_area = ?";
        List<model.Medico> medicos = new ArrayList<>();
        try {
            ps = mysqlConnect.connect().prepareStatement(sql);
            ps.setInt(1, cod_area);
            rs = ps.executeQuery();
            
            while(rs.next()){
                model.Medico m = new model.Medico();
                m.setCod_med(Integer.parseInt(rs.getString("cod_med")));
                m.setNombre_med(rs.getString("nombre_med"));
                m.setApellido_med(rs.getString("apellido_med"));
                medicos.add(m);
            }            
        } catch (SQLException e) {
        } finally {
            mysqlConnect.disconnect();
        }
        return medicos;
    }   
    
    
    public model.Servicio costoCita (int cod_area){
        String sql = "SELECT s.cod_serv, s.cost_serv FROM servicio s WHERE s.cod_area = ? and s.tipo_serv = 'Consulta'";
        model.Servicio s = new model.Servicio();
        try {
            ps = mysqlConnect.connect().prepareStatement(sql);
            ps.setInt(1, cod_area);
            rs = ps.executeQuery();
            
            while(rs.next()){
                s.setCod_serv(rs.getInt("cod_serv"));
                s.setCost_serv(rs.getDouble("cost_serv"));
            }            
        } catch (SQLException e) {
        } finally {
            mysqlConnect.disconnect();
        }
        return s;
    }   
    
    public int agendar (Cita cita){
        String sql = "INSERT INTO cita (cod_pac, dia_cita, hora_cita, cod_area, cod_serv, cod_med, motivo_cita, estado)" +
                     " VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        try {
            ps = mysqlConnect.connect().prepareStatement(sql);
            
            ps.setInt(1, cita.getCod_pac());
            long dia = cita.getDia_cita().getTime();
            ps.setDate(2, new java.sql.Date(dia));
            ps.setString(3, cita.getHora_cita());
            ps.setInt(4, cita.getCod_area());
            ps.setInt(5, cita.getCod_serv());
            ps.setInt(6, cita.getCod_med());
            ps.setString(7, cita.getMotivo_cita());
            ps.setString(8, "Pendiente");
            
            return ps.executeUpdate();    
        } catch (SQLException e) {
        } finally {
            mysqlConnect.disconnect();
        }
        return 0;
    }    
    
    public List<Cita> buscarCitas(String texto){
        String sql = "SELECT c.*,p.nombre_pac,p.apellido_pac,a.area_nomb,s.nomb_serv,s.cost_serv,m.nombre_med,m.apellido_med FROM cita c " +
                     "INNER JOIN paciente p ON p.cod_pac=c.cod_pac " +
                     "INNER JOIN area a ON a.cod_area=c.cod_area " +
                     "INNER JOIN servicio s ON s.cod_serv=c.cod_serv and a.cod_area=s.cod_area " +
                     "INNER JOIN medico m ON m.cod_med=c.cod_med " +
                     "WHERE s.tipo_serv = 'Consulta' AND CONCAT(apellido_pac ,' ', nombre_pac) LIKE '%" + texto + "%' " +
                       " AND DATE(c.dia_cita) >= CURDATE()" +
                     " AND c.cod_cita NOT IN (SELECT pa.cod_transac FROM pago pa WHERE pa.cod_transac=c.cod_cita AND pa.tipo_tran='Consulta')"; 
        List<Cita> citas = new ArrayList<>();
        try {
            ps = mysqlConnect.connect().prepareStatement(sql);
            rs = ps.executeQuery();         
            
            while(rs.next()){
                Cita c = new Cita();
                c.setCod_cita(rs.getInt("cod_cita"));
                c.setDia_cita(rs.getDate("dia_cita"));
                c.setHora_cita(rs.getString("hora_cita"));
                c.getPaciente().setCod_pac(rs.getInt("cod_pac"));
                c.getPaciente().setNombre_pac(rs.getString("nombre_pac"));
                c.getPaciente().setApellido_pac(rs.getString("apellido_pac"));
                c.getArea().setCod_area(rs.getInt("cod_area"));
                c.getArea().setArea_nomb(rs.getString("area_nomb"));
                c.getServicio().setCod_serv(rs.getInt("cod_serv"));
                c.getServicio().setNomb_serv(rs.getString("nomb_serv"));
                c.getServicio().setCost_serv(rs.getDouble("cost_serv"));
                c.getMedico().setCod_med(rs.getInt("cod_med"));
                c.getMedico().setNombre_med(rs.getString("nombre_med"));
                c.getMedico().setApellido_med(rs.getString("apellido_med"));
                citas.add(c);
            }
        } catch (SQLException ex) {
        } finally {
            mysqlConnect.disconnect();
        }
        return citas;
    }
}


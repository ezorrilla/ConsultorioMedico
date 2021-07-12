
package model.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.MysqlConnect;
import model.Usuario;

public class UsuarioDAO {
    
    PreparedStatement ps;
    ResultSet rs;
    MysqlConnect mysqlConnect = new MysqlConnect();
    
    public Usuario login (String dni, String pass){
        String sql = "SELECT u.*,p.perfil FROM usuarios u "+
		     "INNER JOIN perfil p ON p.cod_perf=u.cod_perf WHERE dni_usu = ? and pass = ?";
        Usuario u = new Usuario();
        try {
            ps = mysqlConnect.connect().prepareStatement(sql);
            ps.setString(1, dni);
            ps.setString(2, pass);
            rs = ps.executeQuery();
            
            while(rs.next()){
                u.setNum_usu(Integer.parseInt(rs.getString("num_usu")));
                u.setNombre_usu(rs.getString("nombre_usu"));
                u.setApellido_usu(rs.getString("apellido_usu"));
                u.setDni_usu(rs.getString("dni_usu"));
                u.setCod_perf(rs.getString("cod_perf"));
                u.setPerfil(rs.getString("perfil"));
                u.setEstado(Integer.parseInt(rs.getString("estado")));
            }
            
        } catch (SQLException e) {
        } finally {
            mysqlConnect.disconnect();
        }
        return u;
    }
    
    public List<Usuario> listarUsuarios (){
        String sql = "SELECT u.*,p.perfil FROM usuarios u "+
		     "INNER JOIN perfil p ON p.cod_perf=u.cod_perf WHERE u.estado != 2";
        List<Usuario> usuarios = new ArrayList<>();
        try {
            ps = mysqlConnect.connect().prepareStatement(sql);
            rs = ps.executeQuery();
            
            while(rs.next()){
                Usuario u = new Usuario();
                u.setNum_usu(Integer.parseInt(rs.getString("num_usu")));
                u.setNombre_usu(rs.getString("nombre_usu"));
                u.setApellido_usu(rs.getString("apellido_usu"));
                u.setDni_usu(rs.getString("dni_usu"));
                u.setCod_perf(rs.getString("cod_perf"));
                u.setPerfil(rs.getString("perfil"));
                u.setEstado(Integer.parseInt(rs.getString("estado")));
                usuarios.add(u);
            }
            
        } catch (SQLException e) {
        } finally {
            mysqlConnect.disconnect();
        }
        return usuarios;
    }
    
    public int registrar (Usuario usuario){
        String sql = "INSERT INTO usuarios (nombre_usu, apellido_usu, dni_usu, pass, cod_perf, estado)" +
                     " VALUES (?, ?, ?, ?, ?, ?)";
        try {
            ps = mysqlConnect.connect().prepareStatement(sql);
            ps.setString(1, usuario.getNombre_usu());
            ps.setString(2, usuario.getApellido_usu());
            ps.setString(3, usuario.getDni_usu());
            ps.setString(4, usuario.getPass());
            ps.setString(5, usuario.getCod_perf());
            ps.setInt(6, usuario.getEstado());
            
            return ps.executeUpdate();    
        } catch (SQLException e) {
        } finally {
            mysqlConnect.disconnect();
        }
        return 0;
    }
    
    public int actualizar (Usuario usuario){
        String sql = "UPDATE usuarios SET " +
                        "nombre_usu   = ?, " +
                        "apellido_usu = ?, " +
                        "dni_usu      = ?, " +
                        "cod_perf     = ?, " +
                        "estado       = ? " +
                     "WHERE num_usu = ?";
        try {
            ps = mysqlConnect.connect().prepareStatement(sql);
            ps.setString(1, usuario.getNombre_usu());
            ps.setString(2, usuario.getApellido_usu());
            ps.setString(3, usuario.getDni_usu());
            ps.setString(4, usuario.getCod_perf());
            ps.setInt(5, usuario.getEstado());
            ps.setInt(6, usuario.getNum_usu());
            
            return ps.executeUpdate();    
        } catch (SQLException e) {
        } finally {
            mysqlConnect.disconnect();
        }
        return 0;
    }
    
    public int eliminar (int num_usu){
        String sql = "UPDATE usuarios SET estado = 2 WHERE num_usu = " + num_usu;
        try {
            ps = mysqlConnect.connect().prepareStatement(sql);
            
            return ps.executeUpdate();    
        } catch (SQLException e) {
        } finally {
            mysqlConnect.disconnect();
        }
        return 0;
    }
    
    public int validarDNI (String dni){
        String sql = "SELECT count(*) as exist FROM usuarios WHERE dni_usu = " + dni;
        int cant = 0;
        try {
            ps = mysqlConnect.connect().prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                cant = rs.getInt("exist");
            }
            
        } catch (SQLException e) {
        } finally {
            mysqlConnect.disconnect();
        }
        return cant;
    }
    
    public int guardarConfiguracion (Usuario usuario){
        String sql = "UPDATE usuarios SET " +
                        " nombre_usu   = ? " +
                        ",apellido_usu = ? " +
                        (!usuario.getPass().isEmpty() ? ",pass = ? ":" ") +
                     "WHERE num_usu = " + usuario.getNum_usu();
        try {
            ps = mysqlConnect.connect().prepareStatement(sql);
            ps.setString(1, usuario.getNombre_usu());
            ps.setString(2, usuario.getApellido_usu());
            if(!usuario.getPass().isEmpty())
                ps.setString(3, usuario.getPass());
            
            return ps.executeUpdate();    
        } catch (SQLException e) {
        } finally {
            mysqlConnect.disconnect();
        }
        return 0;
    }
}

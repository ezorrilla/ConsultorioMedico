
package controller;

import javax.swing.JOptionPane;
import model.Usuario;
import view.frmConfiguracion;

public class configuracionController {
    
    public static frmConfiguracion vista = new frmConfiguracion();
    public static model.dao.UsuarioDAO daoUsuario = new model.dao.UsuarioDAO();
    
    public static void mostrar () { reiniciado(); vista.setLocationRelativeTo(null); vista.setVisible(true); inicializar();}
    public static void reiniciado () { vista = new frmConfiguracion(); }
    public static void ocultar () { vista.setVisible(false);} 
    
    private static void inicializar(){
        Principal.setIcono(vista);
        vista.txtNombres.setText(Principal.usuario.getNombre_usu());
        vista.txtApellidos.setText(Principal.usuario.getApellido_usu());
    }    
        
    public static void guardar() {
        if (!validarCampos()) return;
        
        int dialogResult = JOptionPane.showConfirmDialog (null, "¿Está seguro de guardar la configuración?", "Warning",JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if(dialogResult == JOptionPane.YES_OPTION){
            Usuario u = new Usuario();
            u.setNum_usu(Principal.usuario.getNum_usu());
            u.setNombre_usu(vista.txtNombres.getText());
            u.setApellido_usu(vista.txtApellidos.getText());
            u.setPass(new String(vista.txtContrasena.getPassword()));
            
            new Thread(){ @Override public void run(){ Principal.showLoading();
                int r = daoUsuario.guardarConfiguracion(u);
                Principal.hideLoading();
                if (r == 1) {
                    JOptionPane.showMessageDialog(vista, "Se guardó la configuración correctamente.");
                } else {
                    JOptionPane.showMessageDialog(vista, "No se pudo configurar.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }}.start();
        }        
    }

    public static boolean validarCampos() {
        
        if (! new String(vista.txtContrasena.getPassword()).equalsIgnoreCase( new String(vista.txtConfirmContrasena.getPassword()) ) ) {
            JOptionPane.showMessageDialog(vista, "Las contraseñas no coinciden.", "Error", JOptionPane.ERROR_MESSAGE);            
            return false;
        }
        return true;
    }
       
}

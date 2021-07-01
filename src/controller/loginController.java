
package controller;

import javax.swing.JOptionPane;
import model.Usuario;
import view.frmLogin;

public class loginController {
    
    public static frmLogin vista = new frmLogin();
    public static model.dao.UsuarioDAO dao = new model.dao.UsuarioDAO();
    
    public static void mostrar () { vista.setLocationRelativeTo(null); vista.setVisible(true);}
    public static void reiniciado () { vista = new frmLogin(); }
    public static void ocultar () { vista.setVisible(false);} 
    
    public static void sigIn(){
        new Thread(){ @Override public void run(){ Principal.showLoading();
            
            Usuario usuario = dao.login(vista.getTxtUsuario().getText(), new String(vista.getTxtContrasena().getPassword()) );

            if (usuario.getNum_usu() > 0) {
                JOptionPane.showMessageDialog(vista, "Bienvenido " + usuario.getNombre_usu() );
                dashboardController.mostrar();
                ocultar();
            } else {
                JOptionPane.showMessageDialog(vista, "Usuario o contraseña inválido.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        
        Principal.hideLoading();}}.start();
    }
}

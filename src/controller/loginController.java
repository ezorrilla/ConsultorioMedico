
package controller;

import javax.swing.JOptionPane;
import view.frmLogin;

public class loginController {
    
    public static frmLogin vista = new frmLogin();
    public static model.dao.UsuarioDAO daoUsu = new model.dao.UsuarioDAO();
    public static model.dao.OpcionDAO daoOpc = new model.dao.OpcionDAO();
    
    public static void mostrar () { vista.setLocationRelativeTo(null); vista.setVisible(true); inicializar();}
    public static void reiniciado () { vista = new frmLogin(); }
    public static void ocultar () { vista.setVisible(false);} 
    
    private static void inicializar(){
        Principal.setIcono(vista);
    }
    
    public static void sigIn(){
        new Thread(){ @Override public void run(){ Principal.showLoading();            
            Principal.usuario = daoUsu.login(vista.getTxtUsuario().getText(), new String(vista.getTxtContrasena().getPassword()) );
        
            if (Principal.usuario.getNum_usu() > 0) {
                Principal.opciones = daoOpc.opcionesUsuario(Principal.usuario.getNum_usu());
                Principal.hideLoading();
                JOptionPane.showMessageDialog(vista, "Bienvenido " + Principal.usuario.getNombre_usu() );
                dashboardController.mostrar();
                ocultar();
            } else {
                Principal.hideLoading();
                JOptionPane.showMessageDialog(vista, "Usuario o contraseña inválido.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }}.start();
        
            
            
        
    }
}


package controller;

import javax.swing.table.DefaultTableModel;
import view.frmRealizarPago;


public class realizarPagoController {
    
    
    public static frmRealizarPago vista = new frmRealizarPago();
    public static model.dao.UsuarioDAO daoUsuario = new model.dao.UsuarioDAO();
    public static DefaultTableModel modelo = new DefaultTableModel();
    
    public static void mostrar () { vista.setLocationRelativeTo(null); vista.setVisible(true); inicializar();}
    public static void reiniciado () { vista = new frmRealizarPago(); }
    public static void ocultar () { vista.setVisible(false);} 
    
    private static void inicializar(){
        
    }
    
    public static void realizarPago () { 
        
    }
    
}

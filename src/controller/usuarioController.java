
package controller;

import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import model.Usuario;
import view.frmUsuarios;

public class usuarioController {
    
    public static frmUsuarios vista = new frmUsuarios();
    public static model.dao.UsuarioDAO daoUsuario = new model.dao.UsuarioDAO();
    public static DefaultTableModel modelo = new DefaultTableModel();
    
    public static void mostrar () { vista.setLocationRelativeTo(null); vista.setVisible(true); inicializar();}
    public static void reiniciado () { vista = new frmUsuarios(); }
    public static void ocultar () { vista.setVisible(false);} 
    
    private static void inicializar(){
        listarUsuarios();
    }    
    
    private static void listarUsuarios(){             
        new Thread(){ @Override public void run(){ Principal.showLoading();
            
            centrarCeldas(vista.tabla);
            modelo = (DefaultTableModel) vista.tabla.getModel();
            vista.tabla.setModel(modelo);
            for (Usuario u : daoUsuario.listarUsuarios()) {
                
                Object[] objeto = new Object[5];
                    objeto[0] = u.getNum_usu();
                    objeto[1] = u.getNombre_usu();
                    objeto[2] = u.getApellido_usu();
                    objeto[3] = u.getDni_usu();
                    objeto[4] = u.getPerfil();
                    modelo.addRow(objeto);
                
            }
            vista.tabla.setRowHeight(35);
            vista.tabla.setRowMargin(10);
           
        Principal.hideLoading();}}.start();
        
    }
    
    private static void centrarCeldas(JTable tabla) {
        DefaultTableCellRenderer tcr = new DefaultTableCellRenderer();
        tcr.setHorizontalAlignment(SwingConstants.CENTER);
        for (int i = 0; i < vista.tabla.getColumnCount(); i++) {
            tabla.getColumnModel().getColumn(i).setCellRenderer(tcr);
        }
    }
}

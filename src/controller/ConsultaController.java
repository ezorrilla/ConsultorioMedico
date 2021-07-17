
package controller;

import static controller.dashboardController.daoConsulta;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import model.Consulta;
import view.frmConsulta;
import view.frmNuevaConsulta;

public class ConsultaController {
    
    public static frmConsulta vista = new frmConsulta();
    public static frmNuevaConsulta vista1 = new frmNuevaConsulta();
    public static model.dao.ConsultaDAO daoconsulta = new model.dao.ConsultaDAO();
    public static DefaultTableModel modelo = new DefaultTableModel();
    
    public static void mostrar () {  reiniciado();vista.setLocationRelativeTo(null); vista.setVisible(true); inicializar();}
    public static void reiniciado () { vista = new frmConsulta(); }
    public static void ocultar () { vista.setVisible(false);} 
    
     private static void inicializar(){
      
        listarConsultas();
    }  
    
    public static void listarConsultas(){
        
        limpiarTabla();
        centrarCeldas(vista.tabla);     
        modelo = (DefaultTableModel) vista.tabla.getModel();
        vista.tabla.setModel(modelo);
        
        new Thread(){@Override public void run(){Principal.showLoading();
            
            for (Consulta c : daoConsulta.listarConsultas()){
                Object[] objeto = new Object[4];
                    objeto[0] = c.getCod_cons();
                    objeto[1] = c.getNom_pac();
                    objeto[2] = c.getMotivo_consu();
                    objeto[3] = c.getFecha();
                    modelo.addRow(objeto);
            }
                vista.tabla.setRowHeight(35);
                vista.tabla.setRowMargin(10);
            Principal.hideLoading();}}.start();
    }
    
    private static void limpiarTabla() {
        for (int i = 0; i < vista.tabla.getRowCount(); i++) {
            modelo.removeRow(i);
            i = i - 1;
        }
    }
    
    private static void centrarCeldas(JTable tabla) {
        DefaultTableCellRenderer tcr = new DefaultTableCellRenderer();
        tcr.setHorizontalAlignment(SwingConstants.CENTER);
        for (int i = 0; i < vista.tabla.getColumnCount(); i++) {
            tabla.getColumnModel().getColumn(i).setCellRenderer(tcr);
        }
    }
    
    
    
}

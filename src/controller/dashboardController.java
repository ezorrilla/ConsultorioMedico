
package controller;

import javax.swing.DefaultListModel;
import view.frmDashboard;

public class dashboardController{
    
    public static frmDashboard vista = new frmDashboard();
    public static model.dao.dashboard dao = new model.dao.dashboard();
    
    public static void mostrar () { vista.setLocationRelativeTo(null); vista.setVisible(true);}
    public static void reiniciado () { vista = new frmDashboard(); }
    public static void ocultar () { vista.setVisible(false);} 
    
    public static void buscarPaciente(){
        String texto = vista.getTxtPacientes().getText();
        DefaultListModel demoList = new DefaultListModel();
        for (var p : dao.buscarHistoriaPaciente(texto)) {
            demoList.addElement(p.getApellido_pac() + " " + p.getNombre_pac());
        }
        vista.getLstPacientes().setModel(demoList);
        vista.getMenuBusqueda().show(vista.getTxtPacientes(), 0, vista.getTxtPacientes().getHeight());
    }
    
    
}

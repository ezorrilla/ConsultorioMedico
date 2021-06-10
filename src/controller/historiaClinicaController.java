
package controller;

import view.frmHistoriaClinica;

public class historiaClinicaController {
    
    public static frmHistoriaClinica vista = new frmHistoriaClinica();
    public static model.dao.dashboard dao = new model.dao.dashboard();
    
    public static void mostrar () { vista.setLocationRelativeTo(null); vista.setVisible(true);}
    public static void reiniciado () { vista = new frmHistoriaClinica(); }
    public static void ocultar () { vista.setVisible(false);} 
    
    
    public static void mostrarHistoriaClinica(int idPaciente){
        
    }
}

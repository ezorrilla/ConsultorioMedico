
package controller;

import model.Historia;
import view.frmHistoriaClinica;

public class historiaClinicaController {
    
    public static frmHistoriaClinica vista = new frmHistoriaClinica();
    public static model.dao.HistoriaDAO dao = new model.dao.HistoriaDAO();
    
    public static void mostrar () { vista.setLocationRelativeTo(null); vista.setVisible(true);}
    public static void reiniciado () { vista = new frmHistoriaClinica(); }
    public static void ocultar () { vista.setVisible(false);} 
    
    public static void mostrarHistoriaPaciente(int cod_pac){
        Historia historia = dao.buscarHistoriaClinica(cod_pac);
        
        vista.getCboSangre().setSelectedItem(historia.getSangre());
        vista.getCboSangre().setSelectedItem(historia.getVIH());
        vista.getTxpEnfermedades().setText(historia.getEnfermedades());
        vista.getTxpAlergias().setText(historia.getAlergias());
        vista.getTxpHabitos().setText(historia.getHabitos());
        vista.getTxpAlergiasMedic().setText(historia.getAlergia_medic());
        vista.getTxpAntecedentes().setText(historia.getAntec_fami());
        vista.getTxpUsoMedicamentos().setText(historia.getMedicamentos());
        mostrar();
    }
}

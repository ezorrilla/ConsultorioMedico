
package controller;

import java.awt.Cursor;
import javax.swing.JOptionPane;
import model.Historia;
import view.frmHistoriaClinica;

public class historiaClinicaController {
    
    public static frmHistoriaClinica vista = new frmHistoriaClinica();
    public static model.dao.HistoriaDAO dao = new model.dao.HistoriaDAO();
    
    public static void mostrar () { vista.setLocationRelativeTo(null); vista.setVisible(true);}
    public static void reiniciado () { vista = new frmHistoriaClinica(); }
    public static void ocultar () { vista.setVisible(false);} 
    
    public static void mostrarHistoriaPaciente(int cod_pac){        
        new Thread(){ @Override public void run(){ Principal.showLoading();
        
            Historia historia = dao.buscarHistoriaClinica(cod_pac);
            vista.getLblNumHistoria().setText(String.valueOf(historia.getCod_his()));
            vista.getLblPaciente().setText(historia.getNombre_pac() +" "+ historia.getApellido_pac());
            vista.getCboSangre().setSelectedItem(historia.getSangre());
            vista.getCboVIH().setSelectedItem(historia.getVIH());
            vista.getTxpEnfermedades().setText(historia.getEnfermedades());
            vista.getTxpAlergias().setText(historia.getAlergias());
            vista.getTxpHabitos().setText(historia.getHabitos());
            vista.getTxpAlergiasMedic().setText(historia.getAlergia_medic());
            vista.getTxpAntecedentes().setText(historia.getAntec_fami());
            vista.getTxpUsoMedicamentos().setText(historia.getMedicamentos());
            mostrar();
        
        Principal.hideLoading();}}.start();
    }
    
    public static void actualizarHistoriaPaciente(){
        new Thread(){ @Override public void run(){ Principal.showLoading();
        
            Historia historia = new Historia();
            historia.setCod_his(Integer.parseInt(vista.getLblNumHistoria().getText()));
            historia.setSangre(vista.getCboSangre().getSelectedItem().toString());
            historia.setVIH(vista.getCboVIH().getSelectedItem().toString());
            historia.setEnfermedades(vista.getTxpEnfermedades().getText());
            historia.setAlergias(vista.getTxpAlergias().getText());
            historia.setHabitos(vista.getTxpHabitos().getText());
            historia.setAlergia_medic(vista.getTxpAlergiasMedic().getText());
            historia.setAntec_fami(vista.getTxpAntecedentes().getText());
            historia.setMedicamentos(vista.getTxpUsoMedicamentos().getText());

            if (dao.actualizarHistoriaClinica(historia) == 1) {
                JOptionPane.showMessageDialog(vista, "Historia Clínica actualizada con éxito.");
            } else {
                JOptionPane.showMessageDialog(vista, "No se pudo actualizar.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        
        Principal.hideLoading();}}.start();
    }
}

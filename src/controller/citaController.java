
package controller;

import java.text.SimpleDateFormat;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import util.*;
import view.frmCita;

public class citaController {
    private static frmCita vista = new frmCita();
    private static final model.dao.CitaDAO daoCita = new model.dao.CitaDAO();
    
    public static void mostrar () { vista.setLocationRelativeTo(null); vista.setVisible(true); inicializar();}
    public static void reiniciado () { vista = new frmCita(); }
    public static void ocultar () { vista.setVisible(false); reiniciado();} 
    
    private static void inicializar(){
        Principal.setIcono(vista);
        vista.getDtcDiaCita().getJCalendar().setMinSelectableDate(new java.util.Date());
        listarAreas();
    }   
    
    private static void listarAreas(){
        vista.getCboEspecialidad().addItem(new ComboItem("<Seleccione>", "0"));
        
        new Thread(){ @Override public void run(){ Principal.showLoading();             
            for (model.Area a : daoCita.listarAreas()) {
                vista.getCboEspecialidad().addItem(new ComboItem(a.getArea_nomb(), ""+ a.getCod_area())); 
            }           
        Principal.hideLoading();}}.start(); 
        
    }
    
    public static void listarMedicosPorArea(){
        int cod_area = Integer.parseInt( Functions.jComboSelectedValue(vista.getCboEspecialidad()) );
        vista.getLblCod_Serv().setText("");
        vista.getLblCosto().setText("");
        vista.getCboMedico().removeAllItems();
        vista.getCboMedico().addItem(new ComboItem("<Seleccione>", "0"));
        if(cod_area==0) return;
        
        new Thread(){ @Override public void run(){ Principal.showLoading();             
            for (model.Medico m : daoCita.listarMedicosPorArea(cod_area)) {
                vista.getCboMedico().addItem(new ComboItem(m.getNombre_med()+" "+m.getApellido_med(), ""+ m.getCod_med())); 
            }
            
            //verificar si la especialidad atiende citas
            model.Servicio serv = daoCita.costoCita(cod_area);
            Principal.hideLoading();
            if(serv.getCod_serv()>0){
                vista.getLblCod_Serv().setText(""+serv.getCod_serv());
                vista.getLblCosto().setText("S/. " + serv.getCost_serv());
            }else{Principal.hideLoading();
                JOptionPane.showMessageDialog(vista, "La especialidad no atiende citas, seleccione otra.", "Error", JOptionPane.ERROR_MESSAGE);
                vista.getCboEspecialidad().setSelectedIndex(0);
            }
        }}.start(); 
        
    }
    
    public static void buscarPaciente(){
        new Thread(){ @Override public void run(){ Principal.showLoading();
            
            String texto = vista.getTxtBusqueda().getText();
            DefaultListModel demoList = new DefaultListModel();
            
            for (model.Paciente p : new model.dao.PacienteDAO().buscarNombresDNI(texto)) {
                demoList.addElement(new ComboItem(p.getNombre_pac()+" "+p.getApellido_pac(), ""+ p.getCod_pac()));
            }
            Principal.hideLoading();
            vista.getLstPacientes().setModel(demoList);
            vista.getMenuBusqueda().show(vista.getTxtBusqueda(), 0, vista.getTxtBusqueda().getHeight());
        }}.start();
    }
    
    public static void getPaciente(){
        new Thread(){ @Override public void run(){ Principal.showLoading();
            
            int cod_pac = Integer.parseInt(vista.getLstPacientes().getSelectedValue().getValue());
            vista.getTxtBusqueda().setText(vista.getLstPacientes().getSelectedValue().getKey());
            
            model.Paciente p = new model.dao.PacienteDAO().getPaciente(cod_pac);
            if (p.getCod_pac() > 0) {
                vista.getLblCod_Pac().setText(p.getCod_pac()+"");
                vista.getLblDNI().setText(p.getDni_pac());
                vista.getLblFechaNac().setText(new SimpleDateFormat("dd/MM/yyyy").format(p.getFecha_nac()));
                vista.getLblGenero().setText(p.getSexo_pac().equalsIgnoreCase("M")? " Masculino" : "Femenino");
                Principal.hideLoading();
            } else {
                Principal.hideLoading();
                int dialogResult = JOptionPane.showConfirmDialog (null, "No existe el paciente. ¿Desea crearlo?", "Warning",JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                if(dialogResult == JOptionPane.YES_OPTION){
                  
                }
            }
           
        Principal.hideLoading();}}.start();
    }
    
    public static void agendarCita(){
        if (!validarCampos()) {
            JOptionPane.showMessageDialog(vista, "Hay campos por completar, revise por favor.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        model.Cita cita = new model.Cita();
        cita.setCod_pac(Integer.parseInt(vista.getLblCod_Pac().getText()));
        cita.setCod_area(Integer.parseInt( Functions.jComboSelectedValue(vista.getCboEspecialidad()) ));
        cita.setCod_med(Integer.parseInt( Functions.jComboSelectedValue(vista.getCboMedico()) ));
        cita.setCod_serv(Integer.parseInt(vista.getLblCod_Serv().getText()) );
        cita.setDia_cita(vista.getDtcDiaCita().getDate());
        cita.setHora_cita(vista.getCboHoraCita().getSelectedItem().toString()+":00");
        cita.setMotivo_cita(vista.getTxtMotivo().getText());
        
        new Thread(){ @Override public void run(){ Principal.showLoading();
            int r = daoCita.agendar(cita);
            Principal.hideLoading();
            if (r == 1) {
                JOptionPane.showMessageDialog(vista, "Cita agendada correctamente.");
            } else {
                JOptionPane.showMessageDialog(vista, "No se pudo agendar la cita.", "Error", JOptionPane.ERROR_MESSAGE);
            }
            reiniciado();
        }}.start();
    }
    
    
    
    private static boolean validarCampos(){
        
        if (vista.getLblCod_Pac().getText().isEmpty()) return false;
        if (vista.getCboEspecialidad().getSelectedIndex() == 0) return false;
        if (vista.getCboMedico().getSelectedIndex() == 0) return false;
        if (vista.getLblCod_Serv().getText().isEmpty()) return false;
        if (vista.getDtcDiaCita().getDate() == null) return false;
        if (vista.getCboHoraCita().getSelectedIndex() == 0) return false;
        return true;
    }
    
}

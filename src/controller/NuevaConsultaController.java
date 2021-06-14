//Controlador para el módulo de agendar consulta
package controller;

import model.Paciente;
import view.frmNuevaConsulta;


public class NuevaConsultaController {
    
    public static frmNuevaConsulta vista = new frmNuevaConsulta();
    public static model.dao.ConsultaDAO daoconsulta = new model.dao.ConsultaDAO();
    
    public static void mostrar () { vista.setLocationRelativeTo(null); vista.setVisible(true);}
    public static void reiniciado () { vista = new frmNuevaConsulta(); }
    public static void ocultar () { vista.setVisible(false);} 
    
    public static void mostrarDatosPaciente(int dni) {
        
        Paciente paciente = daoconsulta.buscarNombre(dni);
        
        vista.getTxtNom().setText(paciente.getNombre_pac());
        vista.getTxtAp().setText(paciente.getApellido_pac());
       
        
    }
}

    
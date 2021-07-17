//Controlador para el módulo de agendar consulta
package controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import model.Consulta;
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
    
    public static void nuevaConsulta(){
        
        Consulta c = new Consulta();
        double peso = Double.parseDouble(vista.getTxtPeso().getText());
        c.setPeso(peso);
        double talla = Double.parseDouble(vista.getTxtTalla().getText());
        c.setTalla(talla);
        double presion_art = Double.parseDouble(vista.getTxtPresio_art().getText());
        c.setPresion_art(presion_art);
        double temperatura = Double.parseDouble(vista.getTxtTemp().getText());
        c.setTemperatura(temperatura);
        String notas_ad = vista.getTxtNotas_ad().getText();
        c.setNotas(notas_ad);
        String motivo_consu = vista.getTxtMotivo_consu().getText();
        c.setMotivo_consu(motivo_consu); 
        String diagnostico = vista.getTxtDiagnostico().getText();
        c.setDiagnostico(diagnostico); 
        String tratamiento = vista.getTxtTratamiento().getText();
        c.setTratamiento(tratamiento);
        String fecha = vista.getTxtFecha().getText();
        c.setFecha(fecha);
//        try{ 
//            c.setFecha(new SimpleDateFormat("dd-MM-yyyy").parse(vista.getTxtFecha().getText()));
//        }
//         catch(ParseException e){}
           
        daoconsulta.ingresarDatos(c);
         
    }
}

    
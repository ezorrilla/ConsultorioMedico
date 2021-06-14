
package controller;

import view.frmConsulta;

public class ConsultaController {
    
    public static frmConsulta vista = new frmConsulta();
    
    public static void mostrar () { vista.setLocationRelativeTo(null); vista.setVisible(true);}
    public static void reiniciado () { vista = new frmConsulta(); }
    public static void ocultar () { vista.setVisible(false);} 
    
}


package controller;
import view.frmCitas;
public class CitasController {
    public static frmCitas vista = new frmCitas();
    
    public static void mostrar () { vista.setLocationRelativeTo(null); vista.setVisible(true);}
    public static void reiniciado () { vista = new frmCitas(); }
    public static void ocultar () { vista.setVisible(false);} 
}

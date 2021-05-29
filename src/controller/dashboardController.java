
package controller;

import view.frmDashboard;

public class dashboardController {
    
    public static frmDashboard form = new frmDashboard();
    
    public static void mostrar () { form.setLocationRelativeTo(null); form.setVisible(true);}
    public static void reiniciado () { form = new frmDashboard(); }
    public static void ocultar () { form.setVisible(false);} 
}

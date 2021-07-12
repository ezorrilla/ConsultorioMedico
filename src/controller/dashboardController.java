
package controller;

import javax.swing.DefaultListModel;
import javax.swing.border.EmptyBorder;
import model.Paciente;
import view.frmDashboard;

public class dashboardController{
    
    public static frmDashboard vista = new frmDashboard();
    public static model.dao.PacienteDAO daoPaciente = new model.dao.PacienteDAO();
    public static model.dao.ConsultaDAO daoConsulta = new model.dao.ConsultaDAO();
    
    public static void mostrar () { vista.setLocationRelativeTo(null); vista.setVisible(true); inicializar();}
    public static void reiniciado () { vista = new frmDashboard(); }
    public static void ocultar () { vista.setVisible(false);} 
    
    private static void inicializar(){
        Principal.setIcono(vista);
        opcionesUsuario();
        listarUltimosPacientes();
    }
    
    public static void buscarPaciente(){
        new Thread(){ @Override public void run(){ Principal.showLoading();
            
            String texto = vista.getTxtPacientes().getText();
            DefaultListModel demoList = new DefaultListModel();     
            
            for (model.Paciente p : new model.dao.PacienteDAO().buscarNombresDNI(texto)) {
                demoList.addElement(new util.ComboItem(p.getNombre_pac()+" "+p.getApellido_pac(), ""+ p.getCod_pac()));
            }
            Principal.hideLoading();
            vista.getLstPacientes().setModel(demoList);
            vista.getMenuBusqueda().show(vista.getTxtPacientes(), 0, vista.getTxtPacientes().getHeight());
        }}.start();
    }
    
    
    private static void opcionesUsuario(){    
        vista.getLblPerfil().setText(Principal.usuario.getPerfil());
        vista.getLblUsuario().setText(Principal.usuario.getNombre_usu() + " " + Principal.usuario.getApellido_usu());
        
        vista.getLblPacientes().setVisible(false);
        vista.getBtnBuscar().setVisible(false);
        vista.getLblConsultas().setVisible(false);
        vista.getLblPagos().setVisible(false);
        vista.getLblUsuarios().setVisible(false);
        Principal.opciones.forEach((opc) -> {
            switch (opc.getCod_opc()){
                case 2 :vista.getLblPacientes().setVisible(true);break;
                case 3 : vista.getBtnBuscar().setVisible(true);break;
                case 4 : vista.getLblConsultas().setVisible(true);break;
                case 5 : vista.getLblPagos().setVisible(true);break;
                case 10 : vista.getLblUsuarios().setVisible(true);break;
            }
        });
    }
    
    private static void listarUltimosPacientes(){        
        new Thread(){ @Override public void run(){ Principal.showLoading();
            int y = 33;
            for (Paciente p : daoConsulta.ultimosPacientesAtendidos()) {
                javax.swing.JLabel lbl = new javax.swing.JLabel(p.getApellido_pac() + " " + p.getNombre_pac());                 
                lbl.setFont(new java.awt.Font("Segoe UI Semilight", 1, 14));
                lbl.setBorder(new EmptyBorder(0,10,0,0));
                lbl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
                vista.getPnlUltimosPacientes().add(lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, y + 37, 210, 20)); 
                               
                javax.swing.JButton btn= new javax.swing.JButton("Ver más");
                btn.setActionCommand(String.valueOf(p.getCod_pac()));
                btn.setBackground(new java.awt.Color(23, 100, 191));
                btn.setFont(new java.awt.Font("Segoe UI Semilight", 1, 11));
                btn.setForeground(new java.awt.Color(255, 255, 255));
                btn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 51, 102), 1, true));
                btn.setBorderPainted(false); btn.setFocusable(false);
                btn.addActionListener(dashboardController::btnMVerMasActionPerformed);
                vista.getPnlUltimosPacientes().add(btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, y + 37, 70, 30));
                
                vista.validate();
                y+=37;
            }
           
        Principal.hideLoading();}}.start();
        
    }
    
    public static void btnMVerMasActionPerformed(java.awt.event.ActionEvent evt){ 
        historiaClinicaController.mostrarHistoriaPaciente(Integer.parseInt(evt.getActionCommand()));
    }

}
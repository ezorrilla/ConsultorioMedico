
package controller;

import java.time.LocalDate;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import model.Pago;
import view.frmRealizarPago;


public class realizarPagoController {
    
    
    public static frmRealizarPago vista = new frmRealizarPago();
    private static final model.dao.CitaDAO daoCita = new model.dao.CitaDAO();
    private static final model.dao.PagoDAO daoPago = new model.dao.PagoDAO();
    private static DefaultTableModel modelo = new DefaultTableModel();
    private static DefaultTableModel modeloServ = new DefaultTableModel();
    
    public static void mostrar () { vista.setLocationRelativeTo(null); vista.setVisible(true); inicializar();}
    public static void reiniciado () { vista = new frmRealizarPago(); }
    public static void ocultar () { vista.setVisible(false);} 
    
    private static void inicializar(){
        Principal.setIcono(vista);
        ocultarColumnas();
        buscarCitas();
    }
    private static void ocultarColumnas () { 
        vista.tabla.getColumnModel().getColumn(0).setMaxWidth(0);
        vista.tabla.getColumnModel().getColumn(0).setMinWidth(0);
        vista.tabla.getColumnModel().getColumn(0).setPreferredWidth(0);
        vista.tabla.getColumnModel().getColumn(3).setMaxWidth(0);
        vista.tabla.getColumnModel().getColumn(3).setMinWidth(0);
        vista.tabla.getColumnModel().getColumn(3).setPreferredWidth(0);
        
        vista.tblServicios.getColumnModel().getColumn(0).setMaxWidth(0);
        vista.tblServicios.getColumnModel().getColumn(0).setMinWidth(0);
        vista.tblServicios.getColumnModel().getColumn(0).setPreferredWidth(0);
        vista.tblServicios.getColumnModel().getColumn(1).setMaxWidth(0);
        vista.tblServicios.getColumnModel().getColumn(1).setMinWidth(0);
        vista.tblServicios.getColumnModel().getColumn(1).setPreferredWidth(0);  
        vista.tblServicios.getColumnModel().getColumn(4).setMaxWidth(0);
        vista.tblServicios.getColumnModel().getColumn(4).setMinWidth(0);
        vista.tblServicios.getColumnModel().getColumn(4).setPreferredWidth(0);
    }
    
    public static void buscarCitas () {         
        limpiarTabla();
        centrarCeldas(vista.tabla);
        modelo = (DefaultTableModel) vista.tabla.getModel();
        vista.tabla.setModel(modelo);
        
        String texto = vista.getTxtBuscar().getText();
        
        new Thread(){ @Override public void run(){ Principal.showLoading();             
            for (model.Cita c : daoCita.buscarCitas(texto)) {
                              
                Object[] objeto = new Object[8];
                objeto[0] = c.getCod_cita();
                objeto[1] = c.getServicio().getCod_serv();
                objeto[2] = c.getServicio().getNomb_serv();
                objeto[3] = c.getPaciente().getCod_pac();
                objeto[4] = c.getPaciente().getNombre_pac() +" "+ c.getPaciente().getApellido_pac();
                objeto[5] = c.getMedico().getNombre_med() +" "+ c.getMedico().getApellido_med();
                objeto[6] = c.getDia_cita()+" "+c.getHora_cita();
                objeto[7] = c.getServicio().getCost_serv();
                modelo.addRow(objeto);                
            }
            //vista.tabla.setRowHeight(35);
            //vista.tabla.setRowMargin(10);
            
        Principal.hideLoading();}}.start();  
    }
        
    public static void agregarCita() {        
        int fila = vista.tabla.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(vista, "Debe seleccionar una cita.", "Error", JOptionPane.CANCEL_OPTION);
        } else {
            if (!validarRedundancia(vista.tabla.getValueAt(fila, 0),"Consulta")) return;
            
            centrarCeldas(vista.tblServicios);
            modeloServ = (DefaultTableModel) vista.tblServicios.getModel();
            vista.tblServicios.setModel(modeloServ);
            
            Object[] objeto = new Object[7];
            objeto[0] = vista.tabla.getValueAt(fila, 0);
            objeto[1] = "Consulta";
            objeto[2] = vista.tabla.getValueAt(fila, 1);
            objeto[3] = vista.tabla.getValueAt(fila, 2).toString();
            objeto[4] = vista.tabla.getValueAt(fila, 3);
            objeto[5] = vista.tabla.getValueAt(fila, 4).toString();
            objeto[6] = vista.tabla.getValueAt(fila, 7);
            modeloServ.addRow(objeto);    
            vista.tblServicios.setRowHeight(35);
            vista.tblServicios.setRowMargin(10);
            calcularTotal();
        }
    } 
    
    private static boolean validarRedundancia (Object cod_transac, String tipo_tran) { 
        
        for (int i = 0; i < vista.tblServicios.getRowCount(); i++) {            
            if(vista.tblServicios.getValueAt(i, 0) == cod_transac &&
               vista.tblServicios.getValueAt(i, 1) == tipo_tran ) { return false; }
        }
        return true;
    }
    
    private static void calcularTotal () { 
        double suma=0;
        for (int i = 0; i < vista.tblServicios.getRowCount(); i++) {            
            suma += (double) vista.tblServicios.getValueAt(i, 6);
        }
        vista.txtTotal.setText("S/ "+suma);
    }
    
    public static void quitar () { 
        
        int fila = vista.tblServicios.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(vista, "Debe seleccionar una fila.");
        } else {
            modeloServ.removeRow(fila);
            calcularTotal();            
        }
    }
    
    public static void realizarPago () {         

        new Thread(){ @Override public void run(){ Principal.showLoading();
            try {           
                int regOK = 0;
                for (int i = 0; i < vista.tblServicios.getRowCount(); i++) {
                    Pago p = new Pago();
                    p.setCod_transac((int)vista.tblServicios.getValueAt(i, 0));
                    p.setTipo_tran((String)vista.tblServicios.getValueAt(i, 1));
                    p.setCod_serv((int)vista.tblServicios.getValueAt(i, 2));
                    p.setCod_pac((int)vista.tblServicios.getValueAt(i, 4));
                    p.setFecha_crea(new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new java.util.Date()));
                    p.setFecha_pago(new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new java.util.Date()));
                    p.setMonto((double) vista.tblServicios.getValueAt(i, 6));
                    p.setEstado("Pagado");
                    p.setUsu_crea(Principal.usuario.getNum_usu());
                    p.setUsu_pago(Principal.usuario.getNum_usu());

                    regOK +=daoPago.registrar(p);
                }
                Principal.hideLoading();
                
                if (regOK != vista.tblServicios.getRowCount()) throw new Exception();
                
                final javax.swing.ImageIcon icon = new javax.swing.ImageIcon("src/assets/ok.png");
                JOptionPane.showMessageDialog(vista, "Pago realizado correctamente.", "Mensaje", JOptionPane.INFORMATION_MESSAGE, icon);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(vista, "No se pudo realizar el pago.", "Error", JOptionPane.ERROR_MESSAGE);
            }
            nuevo();
        }}.start();
    }
    
    private static void centrarCeldas(javax.swing.JTable tabla) {
        DefaultTableCellRenderer tcr = new DefaultTableCellRenderer();
        tcr.setHorizontalAlignment(SwingConstants.CENTER);
        for (int i = 0; i < tabla.getColumnCount(); i++) {
            tabla.getColumnModel().getColumn(i).setCellRenderer(tcr);
        }
    }    
        
    public static void nuevo () { 
        
        for (int i = 0; i < vista.tblServicios.getRowCount(); i++) {
            modeloServ.removeRow(i);
            i = i - 1;
        }
        vista.txtTotal.setText("S/ 0.0");
        buscarCitas();
    }
    
    private static void limpiarTabla() {
        for (int i = 0; i < vista.tabla.getRowCount(); i++) {
            modelo.removeRow(i);
            i = i - 1;
        }
    }
}

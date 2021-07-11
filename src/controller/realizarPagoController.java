
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
        buscarCitas();
    }
    
    public static void buscarCitas () {         
        limpiarTabla();
        centrarCeldas(vista.tabla);
        modelo = (DefaultTableModel) vista.tabla.getModel();
        vista.tabla.setModel(modelo);
        
        String texto = vista.getTxtBuscar().getText();
        
        new Thread(){ @Override public void run(){ Principal.showLoading();             
            for (model.Cita c : daoCita.buscarCitas(texto)) {
                              
                Object[] objeto = new Object[6];
                objeto[0] = c.getServicio().getCod_serv();
                objeto[1] = c.getPaciente().getNombre_pac() +" "+ c.getPaciente().getApellido_pac();
                objeto[2] = c.getMedico().getNombre_med() +" "+ c.getMedico().getApellido_med();
                objeto[3] = c.getServicio().getNomb_serv();
                objeto[4] = c.getDia_cita()+" "+c.getHora_cita();
                objeto[5] = c.getServicio().getCost_serv();
                modelo.addRow(objeto);                
            }
            vista.tabla.setRowHeight(35);
            vista.tabla.setRowMargin(10);
                      
        Principal.hideLoading();}}.start();  
    }
        
    public static void agregarCita() {        
        int fila = vista.tabla.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(vista, "Debe seleccionar una cita.", "Error", JOptionPane.CANCEL_OPTION);
        } else {
            centrarCeldas(vista.tblServicios);
            modeloServ = (DefaultTableModel) vista.tblServicios.getModel();
            vista.tblServicios.setModel(modeloServ);
            
            Object[] objeto = new Object[4];
            objeto[0] = vista.tabla.getValueAt(fila, 0);
            objeto[1] = vista.tabla.getValueAt(fila, 1).toString();
            objeto[2] = vista.tabla.getValueAt(fila, 3).toString();
            objeto[3] = vista.tabla.getValueAt(fila, 5);
            modeloServ.addRow(objeto);    
            vista.tblServicios.setRowHeight(35);
            vista.tblServicios.setRowMargin(10);
            calcularTotal();
        }
    } 
    
    private static void calcularTotal () { 
        double suma=0;
        for (int i = 0; i < vista.tblServicios.getRowCount(); i++) {            
            suma += (double) vista.tblServicios.getValueAt(i, 3);
        }
        vista.txtTotal.setText(""+suma);
    }
    
    public static void realizarPago () {         

        new Thread(){ @Override public void run(){ Principal.showLoading();
            try {                
                for (int i = 0; i < vista.tblServicios.getRowCount(); i++) {
                    Pago p = new Pago();
                    p.setFecha_pago(LocalDate.now().toString());
                    p.setEstado("Pagado");
                    p.setUsu_pago(Principal.usuario.getNum_usu());
                    p.setMonto((double) vista.tabla.getValueAt(i, 3));

                    daoPago.registrar(p);
                }
                Principal.hideLoading();
                JOptionPane.showMessageDialog(vista, "Pago realizado correctamente.");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(vista, "No se pudo realizar el pago.", "Error", JOptionPane.ERROR_MESSAGE);
            }
            
        }}.start();
    }
    
    private static void centrarCeldas(javax.swing.JTable tabla) {
        DefaultTableCellRenderer tcr = new DefaultTableCellRenderer();
        tcr.setHorizontalAlignment(SwingConstants.CENTER);
        for (int i = 0; i < tabla.getColumnCount(); i++) {
            tabla.getColumnModel().getColumn(i).setCellRenderer(tcr);
        }
    }    
    
    private static void limpiarTabla() {
        for (int i = 0; i < vista.tabla.getRowCount(); i++) {
            modelo.removeRow(i);
            i = i - 1;
        }
    }
}

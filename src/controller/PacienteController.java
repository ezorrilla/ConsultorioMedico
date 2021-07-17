
package controller;

import static controller.dashboardController.daoPaciente;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import model.Paciente;
import util.Functions;
import view.frmPaciente;

public class PacienteController {
    
    public static frmPaciente vista = new frmPaciente();

    public static model.dao.PacienteDAO daopaciente = new model.dao.PacienteDAO();
    public static DefaultTableModel modelo = new DefaultTableModel();
    
    public static void mostrar () { reiniciado(); vista.setLocationRelativeTo(null); vista.setVisible(true); inicializar();}
    public static void reiniciado () { vista = new frmPaciente(); }
    public static void ocultar () { vista.setVisible(false);} 
    
    public static void inicializar(){
      listarPacientes();
    }
    
    public static void nuevoPaciente(){
    
        Paciente p = new Paciente();
        
        String nombre_pac = vista.getTxtNom().getText();
        p.setNombre_pac(nombre_pac);
        String apellido_pac = vista.getTxtAp().getText();
        p.setApellido_pac(apellido_pac);
        try{ 
            p.setFecha_nac(new SimpleDateFormat("dd-MM-yyyy").parse(vista.getTxtFec().getText()));
        }
         catch(ParseException e){}
        String sexo_pac = (String) vista.getTxtSexo().getSelectedItem();
        p.setSexo_pac(sexo_pac);
        String dni_pac = vista.getTxtDni().getText();
        p.setDni_pac(dni_pac);
        String direccion = vista.getTxtDir().getText();
        p.setDireccion(direccion);
        int telefono = Integer.parseInt(vista.getTxtTel().getText()); 
        p.setTelefono(telefono);
        
        daopaciente.ingresarDatos(p);
        listarPacientes();
        limpiar();
        
        
    }
    
    public static void listarPacientes(){
        
        limpiarTabla();
        centrarCeldas(vista.tabla);
        
        modelo = (DefaultTableModel) vista.tabla.getModel();
        vista.tabla.setModel(modelo);
        
        new Thread(){@Override public void run(){Principal.showLoading();
            
            for (Paciente p : daoPaciente.listarPacientes()){
                Object[] objeto = new Object[7];
                    objeto[0] = p.getCod_pac();
                    objeto[1] = p.getNombre_pac();
                    objeto[2] = p.getApellido_pac();
                    objeto[3] = p.getDni_pac();
                    objeto[4] = p.getTelefono();
                    objeto[5] = p.getSexo_pac();
                    objeto[6] = p.getDireccion();
                    modelo.addRow(objeto);
            }
//                vista.tabla.setRowHeight(35);
//                vista.tabla.setRowMargin(10);
            Principal.hideLoading();}}.start();
    }
    
    private static void limpiarTabla() {
        for (int i = 0; i < vista.tabla.getRowCount(); i++) {
            modelo.removeRow(i);
            i = i - 1;
        }
    }
    
    private static void centrarCeldas(JTable tabla) {
        DefaultTableCellRenderer tcr = new DefaultTableCellRenderer();
        tcr.setHorizontalAlignment(SwingConstants.CENTER);
        for (int i = 0; i < vista.tabla.getColumnCount(); i++) {
            tabla.getColumnModel().getColumn(i).setCellRenderer(tcr);
        }
    }
    
    public static void editar(){
        int fila = vista.tabla.getSelectedRow();
        if (fila==-1){
            JOptionPane.showMessageDialog(vista, "Debe seleccionar un registro.", "Error", JOptionPane.CANCEL_OPTION);        
        }
        else{
            vista.TxtId.setText(vista.tabla.getValueAt(fila, 0).toString());
            vista.TxtNom.setText(vista.tabla.getValueAt(fila, 1).toString());
            vista.TxtAp.setText(vista.tabla.getValueAt(fila, 2).toString());
            vista.TxtDni.setText(vista.tabla.getValueAt(fila, 3).toString());
            vista.TxtTel.setText(vista.tabla.getValueAt(fila, 4).toString());
            vista.TxtDir.setText(vista.tabla.getValueAt(fila, 6).toString());
//          Functions.jComboSelectItemByKey(vista1.CbSexo, (String) vista.tabla.getValueAt(fila, 4));

        }
        
      
    }
    
    public static void actualizar(){
        if (vista.TxtNom.getText().equals("")){
        JOptionPane.showMessageDialog(vista, "Edite primero antes de actualizar");
        } else {
            Paciente p = new Paciente();
            p.setCod_pac(Integer.parseInt(vista.TxtId.getText()));
            p.setNombre_pac(vista.TxtNom.getText());
            p.setApellido_pac(vista.TxtAp.getText());
            p.setDni_pac(vista.TxtDni.getText());
            p.setDireccion(vista.TxtDir.getText());
            p.setTelefono(Integer.parseInt(vista.TxtTel.getText()));
//            p.setSexo_pac((String) vista.CbSexo.getSelectedItem());
            new Thread(){ @Override public void run(){ Principal.showLoading();
                int x = daoPaciente.actualizar(p);
                Principal.hideLoading();
                if (x==1){
                     JOptionPane.showMessageDialog(vista, "Paciente actualizado con éxito.");
                }
                else{
                   JOptionPane.showMessageDialog(vista, "No se pudo actualizar.", "Error", JOptionPane.ERROR_MESSAGE); 
                }
                listarPacientes();
            }}.start();
        }
    }
    
    public static void eliminar() {        
        int fila = vista.tabla.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(vista, "Seleccione una fila");
        } else {
            
            int id = Integer.parseInt(vista.tabla.getValueAt(fila, 0).toString());

            new Thread(){ @Override public void run(){ Principal.showLoading();
                int r = daoPaciente.eliminar(id);
                Principal.hideLoading();
                if (r == 1) {
                    JOptionPane.showMessageDialog(vista, "Usuario eliminado.");
                } else {
                    JOptionPane.showMessageDialog(vista, "No se pudo actualizar.", "Error", JOptionPane.ERROR_MESSAGE);
                }
                listarPacientes();
            }}.start();
        }
    }
    
    public static void limpiar(){
        
        vista.TxtId.setText("");
        vista.TxtNom.setText("");
        vista.TxtAp.setText("");
        vista.TxtDni.setText("");
        vista.TxtFec.setText("");
        vista.TxtDir.setText("");
        vista.TxtDir.setText("");
        vista.TxtTel.setText("");
        vista.CbSexo.setSelectedIndex(0);
        
    }
    
      
}

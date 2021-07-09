
package controller;

import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import model.Perfil;
import model.Usuario;
import util.ComboItem;
import util.Functions;
import view.frmUsuarios;

public class usuarioController {
    
    public static frmUsuarios vista = new frmUsuarios();
    public static model.dao.UsuarioDAO daoUsuario = new model.dao.UsuarioDAO();
    public static model.dao.PerfilDAO daoPerfil = new model.dao.PerfilDAO();
    public static DefaultTableModel modelo = new DefaultTableModel();
    
    public static void mostrar () { reiniciado(); vista.setLocationRelativeTo(null); vista.setVisible(true); inicializar();}
    public static void reiniciado () { vista = new frmUsuarios(); }
    public static void ocultar () { vista.setVisible(false);} 
    
    private static void inicializar(){
        listarEstado();
        listarPerfiles();
        listarUsuarios();
    }    
    
    public static void listarUsuarios(){             
        nuevo();
        limpiarTabla();
        centrarCeldas(vista.tabla);

        modelo = (DefaultTableModel) vista.tabla.getModel();
        vista.tabla.setModel(modelo);
        
        new Thread(){ @Override public void run(){ Principal.showLoading();
        
            for (Usuario u : daoUsuario.listarUsuarios()) {                
                Object[] objeto = new Object[6];
                    objeto[0] = u.getNum_usu();
                    objeto[1] = u.getNombre_usu();
                    objeto[2] = u.getApellido_usu();
                    objeto[3] = u.getDni_usu();
                    objeto[4] = u.getPerfil();
                    objeto[5] = u.getEstado() == 1 ? "Activo" : "No activo";
                    modelo.addRow(objeto);                
            }
            vista.tabla.setRowHeight(35);
            vista.tabla.setRowMargin(10);
        Principal.hideLoading();}}.start();
    }    
    
    private static void listarPerfiles(){
        vista.cboPerfil.addItem(new util.ComboItem("<Seleccione>", "-1"));
        
        new Thread(){ @Override public void run(){ Principal.showLoading();             
            for (Perfil p : daoPerfil.getPerfilesActivos()) {
                vista.cboPerfil.addItem(new util.ComboItem(p.getPerfil(), ""+ p.getCod_perf())); 
            }           
        Principal.hideLoading();}}.start();        
    }    
    
    private static void listarEstado(){
        vista.cboEstado.addItem(new util.ComboItem("<Seleccione>", "-1"));   
        vista.cboEstado.addItem(new util.ComboItem("Activo", "1"));   
        vista.cboEstado.addItem(new util.ComboItem("No activo", "0"));
    }  
    
    
    public static void agregar() {        
        Usuario u = new Usuario();
        u.setNombre_usu(vista.txtNombres.getText());
        u.setApellido_usu(vista.txtApellidos.getText());
        u.setDni_usu(vista.txtDNI.getText());
        u.setCod_perf(((ComboItem)vista.cboPerfil.getSelectedItem()).getValue());
        u.setEstado( Integer.parseInt( ((ComboItem)vista.cboEstado.getSelectedItem()).getValue() ));
        u.setPass(new String(vista.txtContrasena.getPassword()));

        new Thread(){ @Override public void run(){ Principal.showLoading();
            int r = daoUsuario.registrar(u);
            Principal.hideLoading();
            if (r == 1) {
                JOptionPane.showMessageDialog(vista, "Usuario creado correctamente.");
            } else {
                JOptionPane.showMessageDialog(vista, "No se pudo registrar.", "Error", JOptionPane.ERROR_MESSAGE);
            }
            listarUsuarios();
        }}.start();
    }
    
    public static void editar() {        
        int fila = vista.tabla.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(vista, "Debe seleccionar una registro.", "Error", JOptionPane.CANCEL_OPTION);
        } else {          
            vista.lblContrasena.setVisible(false);
            vista.txtContrasena.setVisible(false);
            vista.txtId.setText(vista.tabla.getValueAt(fila, 0).toString());
            vista.txtNombres.setText((String) vista.tabla.getValueAt(fila, 1));
            vista.txtApellidos.setText((String) vista.tabla.getValueAt(fila, 2));
            vista.txtDNI.setText((String) vista.tabla.getValueAt(fila, 3));
            Functions.jComboSelectItemByKey(vista.cboPerfil, (String) vista.tabla.getValueAt(fila, 4));
            Functions.jComboSelectItemByKey(vista.cboEstado, (String) vista.tabla.getValueAt(fila, 5));
        }
    }    
    
    public static void actualizar() {
        if (vista.txtId.getText().equals("")) {
            JOptionPane.showMessageDialog(vista, "No se Identifica el Id debe selecionar la opción Editar");
        } else {
            
            Usuario u = new Usuario();
            u.setNum_usu(Integer.parseInt(vista.txtId.getText()));
            u.setNombre_usu(vista.txtNombres.getText());
            u.setApellido_usu(vista.txtApellidos.getText());
            u.setDni_usu(vista.txtDNI.getText());
            u.setCod_perf(((ComboItem)vista.cboPerfil.getSelectedItem()).getValue());
            u.setEstado( Integer.parseInt( ((ComboItem)vista.cboEstado.getSelectedItem()).getValue() ));
            new Thread(){ @Override public void run(){ Principal.showLoading();
                int r = daoUsuario.actualizar(u);
                Principal.hideLoading();
                if (r == 1) {
                    JOptionPane.showMessageDialog(vista, "Usuario actualizado con éxito.");
                } else {
                    JOptionPane.showMessageDialog(vista, "No se pudo actualizar.", "Error", JOptionPane.ERROR_MESSAGE);
                }
                listarUsuarios();
            }}.start();
        }
    }
        
    public static void eliminar() {        
        int fila = vista.tabla.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(vista, "Debe seleccionar una fila.");
        } else {
            
            int id = Integer.parseInt(vista.tabla.getValueAt(fila, 0).toString());

            new Thread(){ @Override public void run(){ Principal.showLoading();
                int r = daoUsuario.eliminar(id);
                Principal.hideLoading();
                if (r == 1) {
                    JOptionPane.showMessageDialog(vista, "Usuario eliminado.");
                } else {
                    JOptionPane.showMessageDialog(vista, "No se pudo actualizar.", "Error", JOptionPane.ERROR_MESSAGE);
                }
                listarUsuarios();
            }}.start();
        }
    }
    
    public static void validarDNI() {     
        String dni = vista.txtDNI.getText();
        if (dni.length() != 8) {
            JOptionPane.showMessageDialog(vista, "El DNI debe ser de 8 digitos.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        new Thread(){ @Override public void run(){ Principal.showLoading();
            int r = daoUsuario.validarDNI(dni);
            Principal.hideLoading();
            int cantMinExistente = vista.txtId.getText().isEmpty()? 0 : 1;
            if (r > cantMinExistente) {
                JOptionPane.showMessageDialog(vista, "El DNI ya existe, ingrese otro por favor.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }}.start();
    }
    
    public static void validarCampos() {
        
        vista.txtNombres.getText();
        vista.txtApellidos.getText();
        vista.txtDNI.getText();
        vista.cboPerfil.setSelectedIndex(0);
        vista.cboEstado.setSelectedIndex(0);
        vista.txtContrasena.setText("");
        vista.txtNombres.requestFocus();
    }
    
    public static void nuevo() {
        vista.txtId.setText("");
        vista.txtNombres.setText("");
        vista.txtApellidos.setText("");
        vista.txtDNI.setText("");
        vista.cboPerfil.setSelectedIndex(0);
        vista.cboEstado.setSelectedIndex(0);
        vista.lblContrasena.setVisible(true);
        vista.txtContrasena.setVisible(true);
        vista.txtContrasena.setText("");
        vista.txtNombres.requestFocus();
    }
    
    private static void centrarCeldas(JTable tabla) {
        DefaultTableCellRenderer tcr = new DefaultTableCellRenderer();
        tcr.setHorizontalAlignment(SwingConstants.CENTER);
        for (int i = 0; i < vista.tabla.getColumnCount(); i++) {
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

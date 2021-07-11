
package view;
import com.toedter.calendar.JDateChooser;
import controller.citaController;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPopupMenu;
import javax.swing.JTextField;

public class frmCita extends javax.swing.JFrame {

    /**
     * Creates new form citasDashboard
     */
    public frmCita() {
        initComponents();        
        menuBusqueda.add(pnlBusqueda);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlBusqueda = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstPacientes = new javax.swing.JList<>();
        menuBusqueda = new javax.swing.JPopupMenu();
        lblCod_Pac = new javax.swing.JLabel();
        lblCod_Serv = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        txtBusqueda = new javax.swing.JTextField();
        txtMotivo = new javax.swing.JTextField();
        btnBuscarDNI = new javax.swing.JToggleButton();
        jLabel14 = new javax.swing.JLabel();
        dtcDiaCita = new com.toedter.calendar.JDateChooser();
        cboEspecialidad = new javax.swing.JComboBox<>();
        cboHoraCita = new javax.swing.JComboBox<>();
        btnAgendar = new javax.swing.JButton();
        btnCerrar = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        lblDNI = new javax.swing.JLabel();
        lblGenero = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        cboMedico = new javax.swing.JComboBox<>();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        lblFechaNac = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        lblCosto = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        pnlBusqueda.setPreferredSize(new java.awt.Dimension(238, 144));

        jScrollPane1.setBorder(null);

        lstPacientes.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        lstPacientes.setVisibleRowCount(5);
        lstPacientes.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstPacientesValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(lstPacientes);

        javax.swing.GroupLayout pnlBusquedaLayout = new javax.swing.GroupLayout(pnlBusqueda);
        pnlBusqueda.setLayout(pnlBusquedaLayout);
        pnlBusquedaLayout.setHorizontalGroup(
            pnlBusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBusquedaLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        pnlBusquedaLayout.setVerticalGroup(
            pnlBusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
        );

        menuBusqueda.setFocusable(false);

        lblCod_Pac.setFont(new java.awt.Font("Segoe UI Semilight", 1, 14)); // NOI18N

        lblCod_Serv.setFont(new java.awt.Font("Segoe UI Semilight", 1, 14)); // NOI18N

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 51, 102));
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icons8_planner_25px.png"))); // NOI18N
        jLabel10.setText("AGENDAR NUEVA CITA");
        jPanel4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, 260, 30));
        jPanel4.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 600, 10));

        txtBusqueda.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        txtBusqueda.setToolTipText("Buscar por nombres completos o DNI");
        txtBusqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBusquedaActionPerformed(evt);
            }
        });
        jPanel4.add(txtBusqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, 220, 25));
        jPanel4.add(txtMotivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 600, 130));

        btnBuscarDNI.setBackground(new java.awt.Color(255, 255, 255));
        btnBuscarDNI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icons8_search_25px_1.png"))); // NOI18N
        btnBuscarDNI.setBorderPainted(false);
        btnBuscarDNI.setOpaque(true);
        btnBuscarDNI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarDNIActionPerformed(evt);
            }
        });
        jPanel4.add(btnBuscarDNI, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 60, 30, 25));

        jLabel14.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(23, 100, 191));
        jLabel14.setText("Médico:");
        jPanel4.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 210, 110, 25));

        dtcDiaCita.setDateFormatString("dd-MMM-yyyy");
        dtcDiaCita.setMinSelectableDate(new java.util.Date(-62135747906000L));
        jPanel4.add(dtcDiaCita, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, 160, 25));

        cboEspecialidad.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboEspecialidadItemStateChanged(evt);
            }
        });
        cboEspecialidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboEspecialidadActionPerformed(evt);
            }
        });
        jPanel4.add(cboEspecialidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, 160, 25));

        cboHoraCita.setFont(new java.awt.Font("Segoe UI Semilight", 1, 12)); // NOI18N
        cboHoraCita.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Seleccione>", "09:00", "09:30", "10:00", "10:30", "11:00", "11:30", "12:00", "12:30", "13:00", "13:30", "14:00", "14:30", "15:00", "15:30", "16:00", "16:30", "17:00", "17:30" }));
        cboHoraCita.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        cboHoraCita.setOpaque(false);
        jPanel4.add(cboHoraCita, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 160, 170, 25));

        btnAgendar.setBackground(new java.awt.Color(23, 100, 191));
        btnAgendar.setFont(new java.awt.Font("Segoe UI Semilight", 1, 11)); // NOI18N
        btnAgendar.setForeground(new java.awt.Color(255, 255, 255));
        btnAgendar.setText("AGENDAR");
        btnAgendar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 51, 102), 1, true));
        btnAgendar.setBorderPainted(false);
        btnAgendar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAgendar.setFocusable(false);
        btnAgendar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgendarActionPerformed(evt);
            }
        });
        jPanel4.add(btnAgendar, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 470, 70, 40));

        btnCerrar.setBackground(new java.awt.Color(255, 255, 255));
        btnCerrar.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        btnCerrar.setForeground(new java.awt.Color(51, 0, 255));
        btnCerrar.setText("CANCELAR");
        btnCerrar.setToolTipText("");
        btnCerrar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnCerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCerrar.setFocusCycleRoot(true);
        btnCerrar.setFocusPainted(false);
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });
        jPanel4.add(btnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 470, 70, 40));

        jLabel15.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(23, 100, 191));
        jLabel15.setText("F. Nacimiento:");
        jPanel4.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 110, 100, 25));

        lblDNI.setFont(new java.awt.Font("Segoe UI Semilight", 1, 14)); // NOI18N
        jPanel4.add(lblDNI, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, 100, 25));

        lblGenero.setFont(new java.awt.Font("Segoe UI Semilight", 1, 14)); // NOI18N
        jPanel4.add(lblGenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 110, 100, 25));

        jLabel16.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(23, 100, 191));
        jLabel16.setText("Género:");
        jPanel4.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 110, 60, 25));

        jLabel17.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(23, 100, 191));
        jLabel17.setText("DNI:");
        jPanel4.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 70, 25));

        jLabel21.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(23, 100, 191));
        jLabel21.setText("Motivo de consulta:");
        jPanel4.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 160, 25));

        jPanel4.add(cboMedico, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 210, 170, 25));

        jLabel22.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(23, 100, 191));
        jLabel22.setText("Hora de la cita:");
        jPanel4.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 160, 110, 25));

        jLabel23.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(23, 100, 191));
        jLabel23.setText("Día de la cita:");
        jPanel4.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 100, 25));

        jLabel24.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(23, 100, 191));
        jLabel24.setText("Especialidad:");
        jPanel4.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 100, 25));
        jPanel4.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 42, 600, 10));

        lblFechaNac.setFont(new java.awt.Font("Segoe UI Semilight", 1, 14)); // NOI18N
        jPanel4.add(lblFechaNac, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 110, 70, 25));

        jLabel25.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(23, 100, 191));
        jLabel25.setText("Costo:");
        jPanel4.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 260, 100, 25));

        lblCosto.setBackground(new java.awt.Color(246, 251, 13));
        lblCosto.setFont(new java.awt.Font("Segoe UI Semilight", 1, 14)); // NOI18N
        lblCosto.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCosto.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel4.add(lblCosto, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 260, 170, 25));

        jLabel18.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(23, 100, 191));
        jLabel18.setText("Busqueda:");
        jPanel4.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 80, 25));

        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Por nombres completos o DNI");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 89, 172, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 638, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 528, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        citaController.ocultar();
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void btnAgendarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgendarActionPerformed
        citaController.agendarCita();
    }//GEN-LAST:event_btnAgendarActionPerformed

    private void txtBusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBusquedaActionPerformed
        citaController.buscarPaciente();
    }//GEN-LAST:event_txtBusquedaActionPerformed

    private void btnBuscarDNIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarDNIActionPerformed
        citaController.buscarPaciente();
    }//GEN-LAST:event_btnBuscarDNIActionPerformed

    private void cboEspecialidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboEspecialidadActionPerformed
        citaController.listarMedicosPorArea();
    }//GEN-LAST:event_cboEspecialidadActionPerformed

    private void cboEspecialidadItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboEspecialidadItemStateChanged
        
    }//GEN-LAST:event_cboEspecialidadItemStateChanged

    private void lstPacientesValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstPacientesValueChanged
        citaController.getPaciente();
    }//GEN-LAST:event_lstPacientesValueChanged

    public JTextField getTxtBusqueda() {
        return txtBusqueda;
    }

    public JLabel getLblCod_Pac() {
        return lblCod_Pac;
    }

    public JLabel getLblFechaNac() {
        return lblFechaNac;
    }

    public JLabel getLblGenero() {
        return lblGenero;
    }

    public JLabel getLblDNI() {
        return lblDNI;
    }

    public JLabel getLblCod_Serv() {
        return lblCod_Serv;
    }

    public JLabel getLblCosto() {
        return lblCosto;
    }

    public JComboBox<util.ComboItem> getCboEspecialidad() {
        return cboEspecialidad;
    }

    public JComboBox<String> getCboHoraCita() {
        return cboHoraCita;
    }

    public JComboBox<util.ComboItem> getCboMedico() {
        return cboMedico;
    }

    public JDateChooser getDtcDiaCita() {
        return dtcDiaCita;
    }

    public JTextField getTxtMotivo() {
        return txtMotivo;
    }

    public JList<util.ComboItem> getLstPacientes() {
        return lstPacientes;
    }

    public JPopupMenu getMenuBusqueda() {
        return menuBusqueda;
    }
 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgendar;
    private javax.swing.JToggleButton btnBuscarDNI;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JComboBox<util.ComboItem> cboEspecialidad;
    private javax.swing.JComboBox<String> cboHoraCita;
    private javax.swing.JComboBox<util.ComboItem> cboMedico;
    private com.toedter.calendar.JDateChooser dtcDiaCita;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblCod_Pac;
    private javax.swing.JLabel lblCod_Serv;
    private javax.swing.JLabel lblCosto;
    private javax.swing.JLabel lblDNI;
    private javax.swing.JLabel lblFechaNac;
    private javax.swing.JLabel lblGenero;
    private javax.swing.JList<util.ComboItem> lstPacientes;
    private javax.swing.JPopupMenu menuBusqueda;
    private javax.swing.JPanel pnlBusqueda;
    private javax.swing.JTextField txtBusqueda;
    private javax.swing.JTextField txtMotivo;
    // End of variables declaration//GEN-END:variables
}

package view;

import controller.citaController;
import controller.realizarPagoController;
import javax.swing.JTextField;

/**
 *
 * @author elder
 */
public class frmRealizarPago extends javax.swing.JFrame {

    /**
     * Creates new form frmRealizarPago
     */
    public frmRealizarPago() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnSalir = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblServicios = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        pnlCitas = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        txtBuscar = new javax.swing.JTextField();
        cmbBusc = new javax.swing.JComboBox();
        btnBuscar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        pnlExamenes = new javax.swing.JPanel();
        btnSolicitarExamen = new javax.swing.JButton();
        btnAgregarExamen = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btnPagar = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        btnNuevo = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnCrearCita = new javax.swing.JButton();
        btnQuitar1 = new javax.swing.JButton();
        btnAgregarCita = new javax.swing.JButton();

        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnSalir.setBackground(new java.awt.Color(255, 255, 255));
        btnSalir.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(51, 0, 255));
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icons8_enter_25px.png"))); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.setToolTipText("");
        btnSalir.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnSalir.setBorderPainted(false);
        btnSalir.setFocusCycleRoot(true);
        btnSalir.setFocusPainted(false);
        btnSalir.setOpaque(false);
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        jPanel1.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 560, 89, 40));

        jLabel9.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabel9.setText("Fecha");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 10, 53, 20));

        tblServicios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "cod_transac", "tipo_tran", "COD. SERVICIO", "SERVICIO", "cod_pac", "PACIENTE", "COSTO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblServicios.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tblServicios);
        if (tblServicios.getColumnModel().getColumnCount() > 0) {
            tblServicios.getColumnModel().getColumn(0).setPreferredWidth(5);
            tblServicios.getColumnModel().getColumn(1).setPreferredWidth(5);
            tblServicios.getColumnModel().getColumn(2).setResizable(false);
            tblServicios.getColumnModel().getColumn(4).setPreferredWidth(15);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 790, 180));

        jLabel1.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jLabel1.setText("TOTAL");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 560, -1, 36));

        txtTotal.setBackground(new java.awt.Color(255, 255, 51));
        txtTotal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtTotal.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtTotal.setToolTipText("");
        txtTotal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtTotal.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jPanel1.add(txtTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 560, 123, 36));

        pnlCitas.setBackground(new java.awt.Color(255, 255, 255));
        pnlCitas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tabla = new javax.swing.JTable(){
            public boolean isCellEditable(int fila,int col){
                return false;
            }
        };
        tabla.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "cod_cita", "Cod. Servicio", "Servicio", "cod_pac", "Paciente", "Médico", "Fecha Cita", "Costo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tabla.setFocusable(false);
        tabla.setRowMargin(4);
        tabla.getTableHeader().setReorderingAllowed(false);
        jScrollPane5.setViewportView(tabla);
        if (tabla.getColumnModel().getColumnCount() > 0) {
            tabla.getColumnModel().getColumn(0).setPreferredWidth(20);
            tabla.getColumnModel().getColumn(1).setPreferredWidth(20);
            tabla.getColumnModel().getColumn(3).setPreferredWidth(15);
            tabla.getColumnModel().getColumn(6).setPreferredWidth(100);
            tabla.getColumnModel().getColumn(7).setPreferredWidth(20);
        }

        pnlCitas.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 788, 150));

        txtBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarActionPerformed(evt);
            }
        });
        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarKeyReleased(evt);
            }
        });
        pnlCitas.add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 356, 30));

        cmbBusc.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Paciente", "Medico" }));
        pnlCitas.add(cmbBusc, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 91, 30));

        btnBuscar.setBackground(new java.awt.Color(255, 255, 255));
        btnBuscar.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(51, 0, 255));
        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icons8_find_user_male_25px.png"))); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.setToolTipText("");
        btnBuscar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnBuscar.setBorderPainted(false);
        btnBuscar.setFocusCycleRoot(true);
        btnBuscar.setFocusPainted(false);
        btnBuscar.setOpaque(false);
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        pnlCitas.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 10, 89, 38));

        jLabel4.setFont(new java.awt.Font("Noto Sans", 1, 12)); // NOI18N
        jLabel4.setText("Buscar:");
        pnlCitas.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 30));

        jTabbedPane1.addTab("Citas", pnlCitas);

        btnSolicitarExamen.setBackground(new java.awt.Color(255, 255, 255));
        btnSolicitarExamen.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        btnSolicitarExamen.setForeground(new java.awt.Color(51, 0, 255));
        btnSolicitarExamen.setText("Solicitar Exámen");
        btnSolicitarExamen.setToolTipText("");
        btnSolicitarExamen.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnSolicitarExamen.setBorderPainted(false);
        btnSolicitarExamen.setFocusCycleRoot(true);
        btnSolicitarExamen.setFocusPainted(false);
        btnSolicitarExamen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSolicitarExamenActionPerformed(evt);
            }
        });

        btnAgregarExamen.setBackground(new java.awt.Color(0, 0, 255));
        btnAgregarExamen.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        btnAgregarExamen.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregarExamen.setText("Agregar");
        btnAgregarExamen.setToolTipText("");
        btnAgregarExamen.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAgregarExamen.setBorderPainted(false);
        btnAgregarExamen.setFocusCycleRoot(true);
        btnAgregarExamen.setFocusPainted(false);
        btnAgregarExamen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarExamenActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlExamenesLayout = new javax.swing.GroupLayout(pnlExamenes);
        pnlExamenes.setLayout(pnlExamenesLayout);
        pnlExamenesLayout.setHorizontalGroup(
            pnlExamenesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlExamenesLayout.createSequentialGroup()
                .addContainerGap(606, Short.MAX_VALUE)
                .addComponent(btnSolicitarExamen, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAgregarExamen, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnlExamenesLayout.setVerticalGroup(
            pnlExamenesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlExamenesLayout.createSequentialGroup()
                .addContainerGap(173, Short.MAX_VALUE)
                .addGroup(pnlExamenesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSolicitarExamen, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgregarExamen, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Exámenes", pnlExamenes);

        jPanel1.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 47, -1, 240));

        jLabel3.setText("09/07/2021");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 10, 67, 20));
        jLabel3.setText( new java.text.SimpleDateFormat("dd/MM/yyyy").format(new java.util.Date()));

        btnPagar.setBackground(new java.awt.Color(0, 51, 204));
        btnPagar.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        btnPagar.setForeground(new java.awt.Color(255, 255, 255));
        btnPagar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icons8_money_bag_25px.png"))); // NOI18N
        btnPagar.setText("Pagar");
        btnPagar.setToolTipText("");
        btnPagar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnPagar.setBorderPainted(false);
        btnPagar.setFocusCycleRoot(true);
        btnPagar.setFocusPainted(false);
        btnPagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPagarActionPerformed(evt);
            }
        });
        jPanel1.add(btnPagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 560, 87, 38));

        jLabel10.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 51, 102));
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icons8_cash_register_40px.png"))); // NOI18N
        jLabel10.setText("Paga citas y exámenes");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(321, 11, -1, 30));

        btnNuevo.setBackground(new java.awt.Color(255, 255, 255));
        btnNuevo.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        btnNuevo.setForeground(new java.awt.Color(51, 0, 255));
        btnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icons8_new_file_25px.png"))); // NOI18N
        btnNuevo.setText("Nuevo");
        btnNuevo.setToolTipText("");
        btnNuevo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnNuevo.setBorderPainted(false);
        btnNuevo.setFocusCycleRoot(true);
        btnNuevo.setFocusPainted(false);
        btnNuevo.setOpaque(false);
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });
        jPanel1.add(btnNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 560, 89, 40));

        jLabel2.setFont(new java.awt.Font("Noto Sans", 1, 12)); // NOI18N
        jLabel2.setText("SERVICIOS A PAGAR:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 160, 30));

        btnCrearCita.setBackground(new java.awt.Color(23, 100, 191));
        btnCrearCita.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        btnCrearCita.setForeground(new java.awt.Color(255, 255, 255));
        btnCrearCita.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icons8_planner_25px.png"))); // NOI18N
        btnCrearCita.setText("Crear Cita");
        btnCrearCita.setToolTipText("");
        btnCrearCita.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnCrearCita.setBorderPainted(false);
        btnCrearCita.setFocusCycleRoot(true);
        btnCrearCita.setFocusPainted(false);
        btnCrearCita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearCitaActionPerformed(evt);
            }
        });
        jPanel1.add(btnCrearCita, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 300, 89, 38));

        btnQuitar1.setBackground(new java.awt.Color(255, 255, 255));
        btnQuitar1.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        btnQuitar1.setForeground(new java.awt.Color(51, 0, 255));
        btnQuitar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/delete.png"))); // NOI18N
        btnQuitar1.setText("Quitar");
        btnQuitar1.setToolTipText("");
        btnQuitar1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnQuitar1.setBorderPainted(false);
        btnQuitar1.setFocusCycleRoot(true);
        btnQuitar1.setFocusPainted(false);
        btnQuitar1.setOpaque(false);
        btnQuitar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuitar1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnQuitar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 300, 89, 38));

        btnAgregarCita.setBackground(new java.awt.Color(255, 255, 255));
        btnAgregarCita.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        btnAgregarCita.setForeground(new java.awt.Color(51, 0, 255));
        btnAgregarCita.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icons8_add_dollar_25px.png"))); // NOI18N
        btnAgregarCita.setText("Agregar");
        btnAgregarCita.setToolTipText("");
        btnAgregarCita.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnAgregarCita.setBorderPainted(false);
        btnAgregarCita.setFocusCycleRoot(true);
        btnAgregarCita.setFocusPainted(false);
        btnAgregarCita.setOpaque(false);
        btnAgregarCita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarCitaActionPerformed(evt);
            }
        });
        jPanel1.add(btnAgregarCita, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 300, 100, 38));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 620));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyReleased
        
    }//GEN-LAST:event_txtBuscarKeyReleased

    private void btnAgregarCitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarCitaActionPerformed
        realizarPagoController.agregarCita();
    }//GEN-LAST:event_btnAgregarCitaActionPerformed

    private void btnCrearCitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearCitaActionPerformed
        citaController.mostrar();
    }//GEN-LAST:event_btnCrearCitaActionPerformed

    private void btnSolicitarExamenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSolicitarExamenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSolicitarExamenActionPerformed

    private void btnAgregarExamenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarExamenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAgregarExamenActionPerformed

    private void btnPagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPagarActionPerformed
        realizarPagoController.realizarPago();
    }//GEN-LAST:event_btnPagarActionPerformed

    private void txtBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarActionPerformed
        realizarPagoController.buscarCitas();
    }//GEN-LAST:event_txtBuscarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        realizarPagoController.buscarCitas();
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        realizarPagoController.ocultar();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        realizarPagoController.nuevo();
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnQuitar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuitar1ActionPerformed
        realizarPagoController.quitar();
    }//GEN-LAST:event_btnQuitar1ActionPerformed

    public JTextField getTxtBuscar() {
        return txtBuscar;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarCita;
    private javax.swing.JButton btnAgregarExamen;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCrearCita;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnPagar;
    private javax.swing.JButton btnQuitar1;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnSolicitarExamen;
    private javax.swing.JComboBox cmbBusc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JPanel pnlCitas;
    private javax.swing.JPanel pnlExamenes;
    public javax.swing.JTable tabla;
    public javax.swing.JTable tblServicios;
    private javax.swing.JTextField txtBuscar;
    public javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
}

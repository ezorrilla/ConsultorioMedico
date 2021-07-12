
package view;

import controller.ConsultaController;
import controller.NuevaConsultaController;
import controller.citaController;
import controller.configuracionController;
import controller.dashboardController;
import controller.historiaClinicaController;
import controller.loginController;
import controller.realizarPagoController;
import controller.usuarioController;
import java.awt.Rectangle;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
public class frmDashboard extends javax.swing.JFrame {
    
    public frmDashboard() {
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
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtPacientes = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        lblPerfil = new javax.swing.JLabel();
        lblSalir = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblPacientes = new javax.swing.JLabel();
        lblConfiguracion = new javax.swing.JLabel();
        lblPagos = new javax.swing.JLabel();
        lblConsultas = new javax.swing.JLabel();
        lblUsuarios = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        pnlAgenda = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        pnlUltimosPacientes = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        btnAgendar = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        lblPaciente = new javax.swing.JLabel();

        pnlBusqueda.setPreferredSize(new java.awt.Dimension(238, 144));

        jScrollPane1.setBorder(null);

        lstPacientes.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        lstPacientes.setVisibleRowCount(5);
        lstPacientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lstPacientesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(lstPacientes);

        javax.swing.GroupLayout pnlBusquedaLayout = new javax.swing.GroupLayout(pnlBusqueda);
        pnlBusqueda.setLayout(pnlBusquedaLayout);
        pnlBusquedaLayout.setHorizontalGroup(
            pnlBusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBusquedaLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        pnlBusquedaLayout.setVerticalGroup(
            pnlBusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
        );

        menuBusqueda.setFocusable(false);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel3.setBackground(new java.awt.Color(23, 100, 191));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icons8_circled_user_male_skin_type_7_25px.png"))); // NOI18N
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 10, 40, 30));

        jLabel2.setFont(new java.awt.Font("Segoe UI Semilight", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icons8_caduceus_25px_1.png"))); // NOI18N
        jLabel2.setText("Consultorio Médico");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 210, 50));

        lblUsuario.setFont(new java.awt.Font("Segoe UI Semilight", 0, 12)); // NOI18N
        lblUsuario.setForeground(new java.awt.Color(255, 255, 255));
        lblUsuario.setText("Elder Zorrilla");
        jPanel3.add(lblUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(902, 25, 150, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI Semilight", 0, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Pacientes");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(425, 18, -1, -1));

        txtPacientes.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        txtPacientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPacientesActionPerformed(evt);
            }
        });
        jPanel3.add(txtPacientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(492, 10, 238, 30));

        btnBuscar.setBackground(new java.awt.Color(255, 255, 255));
        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icons8_find_user_male_25px.png"))); // NOI18N
        btnBuscar.setBorderPainted(false);
        btnBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscar.setOpaque(false);
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPacientesActionPerformed(evt);
            }
        });
        jPanel3.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(736, 11, 26, 30));

        lblPerfil.setFont(new java.awt.Font("Segoe UI Semilight", 0, 12)); // NOI18N
        lblPerfil.setForeground(new java.awt.Color(255, 255, 255));
        lblPerfil.setText("Administrador");
        jPanel3.add(lblPerfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(902, 6, 110, -1));

        lblSalir.setBackground(new java.awt.Color(255, 255, 255));
        lblSalir.setForeground(new java.awt.Color(255, 255, 255));
        lblSalir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icons8_shutdown_25px_1.png"))); // NOI18N
        lblSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblSalir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSalirMouseClicked(evt);
            }
        });
        jPanel3.add(lblSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 11, 33, -1));

        jPanel2.setBackground(new java.awt.Color(49, 58, 73));

        lblPacientes.setBackground(new java.awt.Color(49, 58, 73));
        lblPacientes.setFont(new java.awt.Font("Segoe UI Semilight", 1, 14)); // NOI18N
        lblPacientes.setForeground(new java.awt.Color(255, 255, 255));
        lblPacientes.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblPacientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icons8_headache_25px.png"))); // NOI18N
        lblPacientes.setText("Pacientes");
        lblPacientes.setBorder(new EmptyBorder(0,10,0,0));
        lblPacientes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblPacientes.setOpaque(true);

        lblConfiguracion.setBackground(new java.awt.Color(39, 45, 57));
        lblConfiguracion.setFont(new java.awt.Font("Segoe UI Semilight", 1, 12)); // NOI18N
        lblConfiguracion.setForeground(new java.awt.Color(255, 255, 255));
        lblConfiguracion.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblConfiguracion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icons8_automatic_25px_1.png"))); // NOI18N
        lblConfiguracion.setText("Configuración");
        lblConfiguracion.setBorder(new EmptyBorder(0,10,0,0));
        lblConfiguracion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblConfiguracion.setOpaque(true);
        lblConfiguracion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblConfiguracionMouseClicked(evt);
            }
        });

        lblPagos.setBackground(new java.awt.Color(49, 58, 73));
        lblPagos.setFont(new java.awt.Font("Segoe UI Semilight", 1, 14)); // NOI18N
        lblPagos.setForeground(new java.awt.Color(255, 255, 255));
        lblPagos.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblPagos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icons8_pos_terminal_25px.png"))); // NOI18N
        lblPagos.setText("Pagos");
        lblPagos.setBorder(new EmptyBorder(0,10,0,0));
        lblPagos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblPagos.setOpaque(true);
        lblPagos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblPagosMouseClicked(evt);
            }
        });

        lblConsultas.setBackground(new java.awt.Color(39, 45, 57));
        lblConsultas.setFont(new java.awt.Font("Segoe UI Semilight", 1, 14)); // NOI18N
        lblConsultas.setForeground(new java.awt.Color(255, 255, 255));
        lblConsultas.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblConsultas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icons8_organ_transplantation_25px.png"))); // NOI18N
        lblConsultas.setText("Consultas");
        lblConsultas.setBorder(new EmptyBorder(0,10,0,0));
        lblConsultas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblConsultas.setOpaque(true);
        lblConsultas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblConsultasMouseClicked(evt);
            }
        });

        lblUsuarios.setBackground(new java.awt.Color(39, 45, 57));
        lblUsuarios.setFont(new java.awt.Font("Segoe UI Semilight", 1, 14)); // NOI18N
        lblUsuarios.setForeground(new java.awt.Color(255, 255, 255));
        lblUsuarios.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icons8_user_group_25px.png"))); // NOI18N
        lblUsuarios.setText("Uruarios");
        lblUsuarios.setBorder(new EmptyBorder(0,10,0,0));
        lblUsuarios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblUsuarios.setOpaque(true);
        lblUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblUsuariosMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(lblPacientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblConsultas, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPagos, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblConfiguracion, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addComponent(lblPacientes, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(lblConsultas, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(lblPagos, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(lblUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblConfiguracion, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11))
        );

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icons8_graph_100px.png"))); // NOI18N
        jPanel5.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 120, 100));

        jLabel27.setBackground(new java.awt.Color(255, 255, 255));
        jLabel27.setFont(new java.awt.Font("Segoe UI Semilight", 1, 14)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(23, 100, 191));
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icons8_cash_receipt_25px.png"))); // NOI18N
        jLabel27.setText("Ingresos");
        jLabel27.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel27.setOpaque(true);
        jPanel5.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 130, 40));

        jPanel4.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(688, 123, 200, 170));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 192, 192));

        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icons8_health_checkup_96px.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel28)
                .addContainerGap(56, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 11, Short.MAX_VALUE)
                .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel6.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 90));

        jLabel15.setBackground(new java.awt.Color(255, 255, 255));
        jLabel15.setFont(new java.awt.Font("Segoe UI Semilight", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(23, 100, 191));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel15.setText("Pacientes");
        jLabel15.setBorder(new EmptyBorder(0,10,0,0));
        jLabel15.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel15.setOpaque(true);
        jPanel6.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, 90, 30));

        jLabel12.setFont(new java.awt.Font("Segoe UI Semilight", 0, 24)); // NOI18N
        jLabel12.setText("23");
        jPanel6.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, -1, -1));

        jPanel4.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 123, -1, 170));

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel16.setBackground(new java.awt.Color(255, 255, 255));
        jLabel16.setFont(new java.awt.Font("Segoe UI Semilight", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(23, 100, 191));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel16.setText("Médicos");
        jLabel16.setBorder(new EmptyBorder(0,10,0,0));
        jLabel16.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel16.setOpaque(true);
        jPanel7.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, 90, 30));

        jLabel17.setFont(new java.awt.Font("Segoe UI Semilight", 0, 24)); // NOI18N
        jLabel17.setText("6");
        jPanel7.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, -1, -1));

        jPanel9.setBackground(new java.awt.Color(51, 204, 0));

        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icons8_medical_doctor_96px.png"))); // NOI18N

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel29)
                .addContainerGap(56, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addGap(0, 11, Short.MAX_VALUE)
                .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel7.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 90));

        jPanel4.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(243, 123, -1, 170));

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel24.setBackground(new java.awt.Color(255, 255, 255));
        jLabel24.setFont(new java.awt.Font("Segoe UI Semilight", 1, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(23, 100, 191));
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icons8_health_checkup_25px.png"))); // NOI18N
        jLabel24.setText("Atenciones de la semana");
        jLabel24.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel24.setOpaque(true);
        jPanel8.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 200, 40));

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icons8_graph_100px.png"))); // NOI18N
        jPanel8.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 120, 100));

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel30.setBackground(new java.awt.Color(255, 255, 255));
        jLabel30.setFont(new java.awt.Font("Segoe UI Semilight", 1, 14)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(23, 100, 191));
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icons8_health_checkup_25px.png"))); // NOI18N
        jLabel30.setText("Atenciones de la semana");
        jLabel30.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel30.setOpaque(true);
        jPanel10.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 200, 40));

        jLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icons8_graph_100px.png"))); // NOI18N
        jPanel10.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 120, 100));

        jPanel8.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel4.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(466, 123, -1, 170));

        pnlAgenda.setBackground(new java.awt.Color(255, 255, 255));
        pnlAgenda.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setFont(new java.awt.Font("Segoe UI Semilight", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(23, 100, 191));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icons8_address_book_25px_1.png"))); // NOI18N
        jLabel13.setText("Agenda");
        jLabel13.setBorder(new EmptyBorder(0,10,0,0));
        jLabel13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel13.setOpaque(true);
        pnlAgenda.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 210, 40));

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setFont(new java.awt.Font("Segoe UI Semilight", 1, 14)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/Screenshot_1.png"))); // NOI18N
        jLabel14.setBorder(new EmptyBorder(0,10,0,0));
        jLabel14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel14.setOpaque(true);
        pnlAgenda.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 20, 70, 20));

        jPanel4.add(pnlAgenda, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 420, 270));

        pnlUltimosPacientes.setBackground(new java.awt.Color(255, 255, 255));
        pnlUltimosPacientes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel19.setBackground(new java.awt.Color(255, 255, 255));
        jLabel19.setFont(new java.awt.Font("Segoe UI Semilight", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(23, 100, 191));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icons8_health_checkup_25px.png"))); // NOI18N
        jLabel19.setText("Últimos pacientes atendidos");
        jLabel19.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel19.setOpaque(true);
        pnlUltimosPacientes.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 210, 40));

        jPanel4.add(pnlUltimosPacientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 310, 420, 270));

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));

        jPanel13.setBackground(new java.awt.Color(0, 155, 255));

        jLabel32.setBackground(new java.awt.Color(0, 102, 255));
        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icons8_laptop_medical_96px.png"))); // NOI18N

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        btnAgendar.setBackground(new java.awt.Color(23, 100, 191));
        btnAgendar.setFont(new java.awt.Font("Segoe UI Semilight", 1, 11)); // NOI18N
        btnAgendar.setForeground(new java.awt.Color(255, 255, 255));
        btnAgendar.setText("AGENDAR CITA");
        btnAgendar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 51, 102), 1, true));
        btnAgendar.setBorderPainted(false);
        btnAgendar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAgendar.setFocusable(false);
        btnAgendar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgendarActionPerformed(evt);
            }
        });

        jLabel20.setBackground(new java.awt.Color(255, 255, 255));
        jLabel20.setFont(new java.awt.Font("Segoe UI Semilight", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(23, 100, 191));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icons8_health_checkup_25px.png"))); // NOI18N
        jLabel20.setText("Tu próxima cita de hoy");
        jLabel20.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel20.setOpaque(true);

        lblPaciente.setFont(new java.awt.Font("Segoe UI Semilight", 1, 14)); // NOI18N
        lblPaciente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPaciente.setText("No tienes citas programadas para hoy");
        lblPaciente.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(200, 200, 200))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addComponent(lblPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(btnAgendar, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(btnAgendar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel4.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 26, 870, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(1, 1, 1)))
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 598, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPacientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPacientesActionPerformed
        dashboardController.buscarPaciente();
    }//GEN-LAST:event_txtPacientesActionPerformed

    private void lstPacientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lstPacientesMouseClicked
        historiaClinicaController.mostrarHistoriaPaciente(Integer.parseInt(lstPacientes.getSelectedValue().getValue()));
    }//GEN-LAST:event_lstPacientesMouseClicked

    private void lblConsultasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblConsultasMouseClicked
        ConsultaController.mostrar();
    }//GEN-LAST:event_lblConsultasMouseClicked

    private void lblSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSalirMouseClicked
        loginController.reiniciado();
        loginController.mostrar();
        dashboardController.ocultar();
    }//GEN-LAST:event_lblSalirMouseClicked

    private void lblUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblUsuariosMouseClicked
        usuarioController.mostrar();
    }//GEN-LAST:event_lblUsuariosMouseClicked

    private void lblPagosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPagosMouseClicked
        realizarPagoController.mostrar();
    }//GEN-LAST:event_lblPagosMouseClicked

    private void btnAgendarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgendarActionPerformed
        citaController.mostrar();
    }//GEN-LAST:event_btnAgendarActionPerformed

    private void lblConfiguracionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblConfiguracionMouseClicked
        configuracionController.mostrar();
    }//GEN-LAST:event_lblConfiguracionMouseClicked

    public JList<util.ComboItem> getLstPacientes() {
        return lstPacientes;
    }

    public JPopupMenu getMenuBusqueda() {
        return menuBusqueda;
    }

    public JTextField getTxtPacientes() {
        return txtPacientes;
    }

    public JPanel getPnlUltimosPacientes() {
        return pnlUltimosPacientes;
    }

    public JLabel getLblPerfil() {
        return lblPerfil;
    }

    public JLabel getLblUsuario() {
        return lblUsuario;
    }

    public JLabel getLblConsultas() {
        return lblConsultas;
    }

    public JLabel getLblConfiguracion() {
        return lblConfiguracion;
    }

    public JLabel getLblPacientes() {
        return lblPacientes;
    }

    public JLabel getLblPagos() {
        return lblPagos;
    }

    public JLabel getLblUsuarios() {
        return lblUsuarios;
    }

    public JButton getBtnBuscar() {
        return btnBuscar;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgendar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblConfiguracion;
    private javax.swing.JLabel lblConsultas;
    private javax.swing.JLabel lblPaciente;
    private javax.swing.JLabel lblPacientes;
    private javax.swing.JLabel lblPagos;
    private javax.swing.JLabel lblPerfil;
    private javax.swing.JLabel lblSalir;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JLabel lblUsuarios;
    private javax.swing.JList<util.ComboItem> lstPacientes;
    private javax.swing.JPopupMenu menuBusqueda;
    private javax.swing.JPanel pnlAgenda;
    private javax.swing.JPanel pnlBusqueda;
    private javax.swing.JPanel pnlUltimosPacientes;
    private javax.swing.JTextField txtPacientes;
    // End of variables declaration//GEN-END:variables
}

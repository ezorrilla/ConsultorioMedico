
package view;

import controller.configuracionController;

/**
 *
 * @author elder
 */
public class frmConfiguracion extends javax.swing.JFrame {

    /**
     * Creates new form frmConfiguracion
     */
    public frmConfiguracion() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel18 = new javax.swing.JLabel();
        txtNombres = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        txtApellidos = new javax.swing.JTextField();
        txtContrasena = new javax.swing.JPasswordField();
        jLabel20 = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        btnCerrar = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        txtConfirmContrasena = new javax.swing.JPasswordField();

        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(java.awt.Color.white);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 51, 102));
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icons8_google_classroom_40px.png"))); // NOI18N
        jLabel10.setText("CONFIGURA TU CUENTA");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 280, 30));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 460, 10));

        jLabel18.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(23, 100, 191));
        jLabel18.setText("Nombres:");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, 80, 25));

        txtNombres.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        txtNombres.setToolTipText("Buscar por nombres completos o DNI");
        txtNombres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombresActionPerformed(evt);
            }
        });
        jPanel1.add(txtNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, 220, 25));

        jLabel19.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(23, 100, 191));
        jLabel19.setText("Cambiar contraseña:");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, 160, 25));

        txtApellidos.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        txtApellidos.setToolTipText("Buscar por nombres completos o DNI");
        txtApellidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidosActionPerformed(evt);
            }
        });
        jPanel1.add(txtApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, 220, 25));
        jPanel1.add(txtContrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, 300, 25));

        jLabel20.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(23, 100, 191));
        jLabel20.setText("Apellidos:");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, 80, 25));

        btnGuardar.setBackground(new java.awt.Color(23, 100, 191));
        btnGuardar.setFont(new java.awt.Font("Segoe UI Semilight", 1, 11)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardar.setText("Guardar");
        btnGuardar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 51, 102), 1, true));
        btnGuardar.setBorderPainted(false);
        btnGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGuardar.setFocusable(false);
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 330, 70, 40));

        btnCerrar.setBackground(new java.awt.Color(255, 255, 255));
        btnCerrar.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        btnCerrar.setForeground(new java.awt.Color(51, 0, 255));
        btnCerrar.setText("CANCELAR");
        btnCerrar.setToolTipText("");
        btnCerrar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnCerrar.setBorderPainted(false);
        btnCerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCerrar.setFocusCycleRoot(true);
        btnCerrar.setFocusPainted(false);
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 330, 70, 40));

        jLabel21.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(23, 100, 191));
        jLabel21.setText("Confirmar contraseña:");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, 170, 25));
        jPanel1.add(txtConfirmContrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 270, 300, 25));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 490, 390));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombresActionPerformed
        
    }//GEN-LAST:event_txtNombresActionPerformed

    private void txtApellidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellidosActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        configuracionController.guardar();
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        configuracionController.ocultar();
    }//GEN-LAST:event_btnCerrarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator2;
    public javax.swing.JTextField txtApellidos;
    public javax.swing.JPasswordField txtConfirmContrasena;
    public javax.swing.JPasswordField txtContrasena;
    public javax.swing.JTextField txtNombres;
    // End of variables declaration//GEN-END:variables
}

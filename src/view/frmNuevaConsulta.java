/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package view;

import controller.NuevaConsultaController;
import static java.lang.Integer.parseInt;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JTextPane;

/**
 *
 * @author Jeff
 */
public class frmNuevaConsulta extends javax.swing.JFrame {

    /** Creates new form Paciente */
    public frmNuevaConsulta() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel11 = new javax.swing.JLabel();
        TxtNom = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        txtDni = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        TxtAp = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TxtDiagnostico = new javax.swing.JTextArea();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TxtMotivo_consu = new javax.swing.JTextArea();
        jLabel16 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        TxtTratamiento = new javax.swing.JTextArea();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        TxtTalla = new javax.swing.JTextField();
        TxtTemp = new javax.swing.JTextField();
        TxtPeso = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel24 = new javax.swing.JLabel();
        TxtPresio_art = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        TxtNotas_ad = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        TxtFecha = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel4.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 42, 830, 10));

        jLabel11.setFont(new java.awt.Font("Rubik", 0, 11)); // NOI18N
        jLabel11.setText("DNI:");
        jPanel4.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));

        TxtNom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtNomActionPerformed(evt);
            }
        });
        jPanel4.add(TxtNom, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, 220, -1));

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        jPanel4.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 60, -1, -1));

        jLabel12.setFont(new java.awt.Font("Rubik", 0, 11)); // NOI18N
        jLabel12.setText("Apellidos:");
        jPanel4.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, -1));
        jPanel4.add(txtDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, 150, -1));

        jLabel13.setFont(new java.awt.Font("Rubik", 0, 11)); // NOI18N
        jLabel13.setText("Nombres:");
        jPanel4.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));
        jPanel4.add(TxtAp, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, 220, -1));

        jLabel14.setText("Motivo de consulta:");
        jPanel4.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, -1));

        TxtDiagnostico.setColumns(20);
        TxtDiagnostico.setRows(5);
        TxtDiagnostico.setWrapStyleWord(true);
        jScrollPane1.setViewportView(TxtDiagnostico);

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, 230, 120));

        jLabel15.setFont(new java.awt.Font("Rubik", 0, 11)); // NOI18N
        jLabel15.setText("Diagnóstico:");
        jPanel4.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, -1, -1));

        TxtMotivo_consu.setColumns(20);
        TxtMotivo_consu.setRows(5);
        TxtMotivo_consu.setWrapStyleWord(true);
        jScrollPane2.setViewportView(TxtMotivo_consu);

        jPanel4.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 230, 120));

        jLabel16.setFont(new java.awt.Font("Rubik", 0, 11)); // NOI18N
        jLabel16.setText("Tratamiento:");
        jPanel4.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 120, -1, -1));

        TxtTratamiento.setColumns(20);
        TxtTratamiento.setRows(5);
        jScrollPane3.setViewportView(TxtTratamiento);

        jPanel4.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 140, 230, 120));

        jLabel17.setFont(new java.awt.Font("Rubik", 0, 11)); // NOI18N
        jLabel17.setText("Temp:");
        jPanel4.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 420, -1, -1));

        jLabel18.setFont(new java.awt.Font("Rubik", 0, 11)); // NOI18N
        jLabel18.setText("Peso:");
        jPanel4.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 460, -1, -1));

        jLabel19.setFont(new java.awt.Font("Rubik", 0, 11)); // NOI18N
        jLabel19.setText("Talla:");
        jPanel4.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 420, -1, -1));
        jPanel4.add(TxtTalla, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 420, 80, -1));
        jPanel4.add(TxtTemp, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 420, 80, -1));

        TxtPeso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtPesoActionPerformed(evt);
            }
        });
        jPanel4.add(TxtPeso, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 460, 80, -1));

        jLabel21.setFont(new java.awt.Font("Rubik", 0, 11)); // NOI18N
        jLabel21.setText("kg");
        jPanel4.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 460, -1, -1));

        jLabel20.setFont(new java.awt.Font("Rubik", 0, 11)); // NOI18N
        jLabel20.setText("C°");
        jPanel4.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 420, -1, -1));

        jLabel22.setFont(new java.awt.Font("Rubik", 0, 11)); // NOI18N
        jLabel22.setText("cm");
        jPanel4.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 420, -1, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 140, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 130, Short.MAX_VALUE)
        );

        jPanel4.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 70, 140, 130));

        jPanel5.setBackground(new java.awt.Color(204, 204, 204));

        jLabel23.setFont(new java.awt.Font("Rubik", 0, 11)); // NOI18N
        jLabel23.setText("Historial del paciente:");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel23)
                .addContainerGap(97, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel23)
                .addContainerGap(258, Short.MAX_VALUE))
        );

        jPanel4.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 220, 220, 280));

        jButton2.setText("Realizar");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 510, -1, -1));

        jLabel10.setFont(new java.awt.Font("Rubik", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 51));
        jLabel10.setText("Análisis del paciente");
        jPanel4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 170, 30));

        jLabel1.setFont(new java.awt.Font("Rubik", 0, 11)); // NOI18N
        jLabel1.setText("Fecha:");
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 90, -1, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Medicina general", "Ginecología", "Odontología", "Terapia de lenguaje", "Pediatría", "Laboratorio" }));
        jPanel4.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 60, 130, -1));

        jLabel24.setFont(new java.awt.Font("Rubik", 0, 11)); // NOI18N
        jLabel24.setText("P/A:");
        jPanel4.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 460, -1, -1));
        jPanel4.add(TxtPresio_art, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 460, 80, -1));

        jLabel26.setFont(new java.awt.Font("Rubik", 0, 11)); // NOI18N
        jLabel26.setText("mmhg");
        jPanel4.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 460, -1, -1));

        jLabel27.setFont(new java.awt.Font("Rubik", 0, 11)); // NOI18N
        jLabel27.setText("Notas adicionales:");
        jPanel4.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 270, -1, -1));

        TxtNotas_ad.setColumns(20);
        TxtNotas_ad.setRows(5);
        jScrollPane4.setViewportView(TxtNotas_ad);

        jPanel4.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 290, 230, 120));

        jLabel2.setFont(new java.awt.Font("Rubik", 0, 11)); // NOI18N
        jLabel2.setText("Especialidad:");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 60, -1, -1));

        TxtFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtFechaActionPerformed(evt);
            }
        });
        jPanel4.add(TxtFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 90, 130, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 870, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(52, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(31, 31, 31))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
   
        NuevaConsultaController.mostrarDatosPaciente(parseInt(txtDni.getText()));
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void TxtNomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtNomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtNomActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        NuevaConsultaController.nuevaConsulta();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
      
    }//GEN-LAST:event_jButton2MouseClicked

    private void TxtPesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtPesoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtPesoActionPerformed

    private void TxtFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtFechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtFechaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmNuevaConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmNuevaConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmNuevaConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmNuevaConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmNuevaConsulta().setVisible(true);
            }
        });
    }
    
    public JTextField getTxtNom(){
        return TxtNom;
    }
     
    public JTextField getTxtAp(){
        return TxtAp;
    }
    
    public JTextField getTxtPeso(){
        return TxtPeso;
    }
    
    public JTextField getTxtTalla(){
        return TxtTalla;
    }
    
        public JTextField getTxtPresio_art(){
        return TxtPresio_art;
    }
        
        public JTextField getTxtTemp(){
        return TxtTemp;
    }

        public JTextArea getTxtNotas_ad(){
        return TxtNotas_ad;
    }
    
        public JTextArea getTxtMotivo_consu(){
        return TxtMotivo_consu;
    }    
        
        public JTextArea getTxtDiagnostico(){
        return TxtDiagnostico;
    }  
        
        public JTextArea getTxtTratamiento(){
        return TxtTratamiento;
    } 
        
       public JTextField getTxtFecha(){
        return TxtFecha;
    }     
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TxtAp;
    private javax.swing.JTextArea TxtDiagnostico;
    private javax.swing.JTextField TxtFecha;
    private javax.swing.JTextArea TxtMotivo_consu;
    private javax.swing.JTextField TxtNom;
    private javax.swing.JTextArea TxtNotas_ad;
    private javax.swing.JTextField TxtPeso;
    private javax.swing.JTextField TxtPresio_art;
    private javax.swing.JTextField TxtTalla;
    private javax.swing.JTextField TxtTemp;
    private javax.swing.JTextArea TxtTratamiento;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField txtDni;
    // End of variables declaration//GEN-END:variables

}

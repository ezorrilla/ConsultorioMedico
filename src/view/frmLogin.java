
package view;

import controller.loginController;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class frmLogin extends javax.swing.JFrame {

    /**
     * Creates new form frmLogin
     */
    
    int posX;
    int posY;
    
    public frmLogin() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setBackground(new Color(0, 0, 0, 0));
        txtUsuario.setBackground(new Color(0, 0, 0, 0));        
        txtContrasena.setBackground(new Color(0, 0, 0, 0));
        chkAgree.setBackground(new Color(255, 255, 255, 0));
        txtUsuario.setText("");
        txtContrasena.setText("");
        this.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                posX = e.getX();
                posY = e.getY();
            }
        });
        this.addMouseMotionListener(new MouseAdapter() {
            public void mouseDragged(MouseEvent evt) {
                //sets frame position when mouse dragged			
                setLocation(evt.getXOnScreen() - posX, evt.getYOnScreen() - posY);

            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        btnSignUp = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        txtContrasena = new javax.swing.JPasswordField();
        chkAgree = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        rightPanel = new javax.swing.JLabel();
        leftPanel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Berlin Sans FB", 0, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Ingresa tus credenciales");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 120, 320, 50));

        jLabel10.setFont(new java.awt.Font("Berlin Sans FB", 0, 15)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Contraseña");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 300, 150, 30));

        jLabel8.setFont(new java.awt.Font("Berlin Sans FB", 0, 15)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Usuario");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 190, 150, 30));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 380, 320, 20));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 270, 320, 20));

        btnSignUp.setFont(new java.awt.Font("Berlin Sans FB", 0, 15)); // NOI18N
        btnSignUp.setForeground(new java.awt.Color(255, 255, 255));
        btnSignUp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnSignUp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/btnSigin.png"))); // NOI18N
        btnSignUp.setText("Sign In");
        btnSignUp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSignUp.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSignUp.setPreferredSize(new java.awt.Dimension(160, 51));
        btnSignUp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSignUpMouseClicked(evt);
            }
        });
        getContentPane().add(btnSignUp, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 480, 160, 51));

        txtUsuario.setFont(new java.awt.Font("Berlin Sans FB", 0, 15)); // NOI18N
        txtUsuario.setForeground(new java.awt.Color(255, 255, 255));
        txtUsuario.setBorder(null);
        txtUsuario.setOpaque(false);
        getContentPane().add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 220, 320, 50));

        txtContrasena.setFont(new java.awt.Font("Berlin Sans FB", 0, 15)); // NOI18N
        txtContrasena.setForeground(new java.awt.Color(255, 255, 255));
        txtContrasena.setText("jPasswordField1");
        txtContrasena.setBorder(null);
        txtContrasena.setOpaque(false);
        txtContrasena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContrasenaActionPerformed(evt);
            }
        });
        getContentPane().add(txtContrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 330, 320, 50));

        chkAgree.setFont(new java.awt.Font("Berlin Sans FB", 0, 15)); // NOI18N
        chkAgree.setForeground(new java.awt.Color(255, 255, 255));
        chkAgree.setText("Mantener la sesión iniciada");
        chkAgree.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkAgreeActionPerformed(evt);
            }
        });
        getContentPane().add(chkAgree, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 420, 310, -1));

        jLabel1.setFont(new java.awt.Font("Berlin Sans FB", 0, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("BIENVENIDO");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, 190, 50));

        rightPanel.setBackground(new java.awt.Color(0, 0, 51));
        rightPanel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        rightPanel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/bg_right.png"))); // NOI18N
        getContentPane().add(rightPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 0, 550, 660));

        leftPanel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        leftPanel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/bg_left.png"))); // NOI18N
        getContentPane().add(leftPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(-70, 0, 660, 660));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void chkAgreeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkAgreeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkAgreeActionPerformed

    private void btnSignUpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSignUpMouseClicked
        loginController.sigIn();
    }//GEN-LAST:event_btnSignUpMouseClicked

    private void txtContrasenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContrasenaActionPerformed
        loginController.sigIn();
    }//GEN-LAST:event_txtContrasenaActionPerformed

    public JPasswordField getTxtContrasena() {
        return txtContrasena;
    }

    public JTextField getTxtUsuario() {
        return txtUsuario;
    }
  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnSignUp;
    private javax.swing.JCheckBox chkAgree;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel leftPanel;
    private javax.swing.JLabel rightPanel;
    private javax.swing.JPasswordField txtContrasena;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}

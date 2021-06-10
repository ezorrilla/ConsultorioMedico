
package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class frmLogin extends javax.swing.JFrame {

    /**
     * Creates new form frmLogin
     */
    
    int posX;
    int posY;
    
    public frmLogin() {
        initComponents();
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2);
        this.setBackground(new Color(255, 255, 255, 0));
        inpUsername.setBackground(new Color(255, 255, 255, 0));
        inpPassword.setBackground(new Color(255, 255, 255, 0));
        inpEmail.setBackground(new Color(255, 255, 255, 0));
        chkAgree.setBackground(new Color(255, 255, 255, 0));
        inpUsername.setText("");
        inpPassword.setText("");
        inpEmail.setText("");
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

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        btnSignUp = new javax.swing.JLabel();
        inpEmail = new javax.swing.JTextField();
        inpUsername = new javax.swing.JTextField();
        inpPassword = new javax.swing.JPasswordField();
        chkAgree = new javax.swing.JCheckBox();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        rightPanel = new javax.swing.JLabel();
        leftPanel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);
        getContentPane().setLayout(null);

        jLabel10.setFont(new java.awt.Font("Berlin Sans FB", 0, 15)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Password");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(520, 310, 150, 30);

        jLabel9.setFont(new java.awt.Font("Berlin Sans FB", 0, 15)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Email");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(520, 220, 150, 30);

        jLabel8.setFont(new java.awt.Font("Berlin Sans FB", 0, 15)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Username");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(520, 130, 150, 30);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(520, 390, 320, 20);
        getContentPane().add(jSeparator2);
        jSeparator2.setBounds(520, 210, 320, 20);
        getContentPane().add(jSeparator3);
        jSeparator3.setBounds(520, 300, 320, 20);

        btnSignUp.setFont(new java.awt.Font("Berlin Sans FB", 0, 15)); // NOI18N
        btnSignUp.setForeground(new java.awt.Color(255, 255, 255));
        btnSignUp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnSignUp.setText("Sign Up");
        getContentPane().add(btnSignUp);
        btnSignUp.setBounds(530, 540, 70, 40);

        inpEmail.setFont(new java.awt.Font("Berlin Sans FB", 0, 15)); // NOI18N
        inpEmail.setForeground(new java.awt.Color(255, 255, 255));
        inpEmail.setBorder(null);
        getContentPane().add(inpEmail);
        inpEmail.setBounds(520, 250, 320, 50);

        inpUsername.setFont(new java.awt.Font("Berlin Sans FB", 0, 15)); // NOI18N
        inpUsername.setForeground(new java.awt.Color(255, 255, 255));
        inpUsername.setBorder(null);
        getContentPane().add(inpUsername);
        inpUsername.setBounds(520, 160, 320, 50);

        inpPassword.setFont(new java.awt.Font("Berlin Sans FB", 0, 15)); // NOI18N
        inpPassword.setForeground(new java.awt.Color(255, 255, 255));
        inpPassword.setText("jPasswordField1");
        inpPassword.setBorder(null);
        getContentPane().add(inpPassword);
        inpPassword.setBounds(520, 340, 320, 50);

        chkAgree.setFont(new java.awt.Font("Berlin Sans FB", 0, 15)); // NOI18N
        chkAgree.setForeground(new java.awt.Color(255, 255, 255));
        chkAgree.setText("I agree to the terms and conditions");
        chkAgree.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkAgreeActionPerformed(evt);
            }
        });
        getContentPane().add(chkAgree);
        chkAgree.setBounds(520, 440, 310, 25);

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btnsignUp.png"))); // NOI18N
        getContentPane().add(jLabel6);
        jLabel6.setBounds(490, 540, 150, 40);

        jLabel5.setFont(new java.awt.Font("Berlin Sans FB", 0, 15)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Login");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(760, 40, 80, 30);

        jLabel4.setFont(new java.awt.Font("Berlin Sans FB", 0, 15)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Sign up");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(690, 40, 60, 30);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btnLoginSwitch.png"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(730, 30, 140, 50);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btnSignUpSwitch.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(660, 30, 140, 50);

        jLabel1.setFont(new java.awt.Font("Berlin Sans FB", 0, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Come Fly With Us");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(140, 130, 240, 50);

        rightPanel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        rightPanel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/rightPanel.png"))); // NOI18N
        getContentPane().add(rightPanel);
        rightPanel.setBounds(390, 0, 550, 660);

        leftPanel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        leftPanel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/LeftPanelBackGround.jpg"))); // NOI18N
        getContentPane().add(leftPanel);
        leftPanel.setBounds(-70, 0, 660, 660);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void chkAgreeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkAgreeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkAgreeActionPerformed

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
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnSignUp;
    private javax.swing.JCheckBox chkAgree;
    private javax.swing.JTextField inpEmail;
    private javax.swing.JPasswordField inpPassword;
    private javax.swing.JTextField inpUsername;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel leftPanel;
    private javax.swing.JLabel rightPanel;
    // End of variables declaration//GEN-END:variables
}

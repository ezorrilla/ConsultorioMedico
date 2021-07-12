
package controller;

import java.awt.Image;
import java.util.ArrayList;
import java.util.List;
import javax.swing.Icon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import model.Opcion;
import model.Usuario;

public class Principal {    
    public static JFrame loading = new JFrame();
    public static Usuario usuario = new Usuario();
    public static List<Opcion> opciones = new ArrayList<>();
    
    public static void main (String[] args){   
        
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
        } catch (InstantiationException ex) {
        } catch (IllegalAccessException ex) {
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
        }        
        //</editor-fold>
        
        inicializar();
        loginController.mostrar();
    }
    
    private static void inicializar(){
        javax.swing.ImageIcon img = new javax.swing.ImageIcon("src/assets/ld2.gif");        
        JLabel thumb = new JLabel();
        thumb.setIcon(img);
        thumb.setOpaque(false);
        thumb.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        loading.setUndecorated(true);
        loading.setBackground(new java.awt.Color(255, 255, 255, 150));
        loading.getContentPane().add(thumb);        
    }
    
    public static void showLoading(){
        loading.setAlwaysOnTop(true);
        loading.setVisible(true);
        loading.setExtendedState( loading.getExtendedState()|JFrame.MAXIMIZED_BOTH );
    }
    
    public static void hideLoading(){
        loading.setAlwaysOnTop(false);
        loading.setVisible(false);
    }
    
    public static void setIcono(javax.swing.JFrame frame){
        javax.swing.ImageIcon logo = new javax.swing.ImageIcon("src/assets/logo.png");  
        frame.setIconImage(logo.getImage());
    }
}

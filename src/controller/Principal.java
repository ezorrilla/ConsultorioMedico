
package controller;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JLabel;
import model.Opcion;
import model.Usuario;

public class Principal {    
    public static JFrame loading = new JFrame();
    public static Usuario usuario = new Usuario();
    public static List<Opcion> opciones = new ArrayList<>();
    public static void main (String[] args){   
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
        loading.setVisible(true);
        loading.setExtendedState( loading.getExtendedState()|JFrame.MAXIMIZED_BOTH );
    }
    
    public static void hideLoading(){
        loading.setVisible(false);
    }
}

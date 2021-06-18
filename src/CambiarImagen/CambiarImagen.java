package CambiarImagen;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.util.Timer;
import java.util.TimerTask;

public class CambiarImagen extends javax.swing.JFrame implements Runnable {
    
    static int contador = 0;

    public static void main(String args[]){
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run(){
                new CambiarImagen().setVisible(true);
            }
        });
    }
   
    @Override
        public void run() {
        contador = 0;
        Timer timer;
        TimerTask tarea;
        int velmil = 1 * 1000;
        
        Semaforo semaforo = new Semaforo();
        semaforo.setVisible(true);
        
        tarea = new TimerTask(){
            
            @Override
            public void run() {
                 Icon icono;
                 try {
                 switch(contador){
                     case 0:
                         contador = 1;
                         icono = new ImageIcon(getClass().getResource("/Iconos/SemaforoColorVerde.png"));
                         semaforo.jLabel1.setIcon(icono);
                         Thread.sleep(2000);
                         break;
                     case 1: 
                         contador = 2;
                         icono = new ImageIcon(getClass().getResource("/Iconos/SemaforoColorAmarillo.png"));
                         semaforo.jLabel1.setIcon(icono);
                         Thread.sleep(1000);
                         break;
                     case 2: 
                         contador = 0;
                         icono = new ImageIcon(getClass().getResource("/Iconos/SemaforoColorRojo.png"));
                         semaforo.jLabel1.setIcon(icono);
                         Thread.sleep(3000);
                         break;
                     }
                 }catch(Exception e){
                     e.printStackTrace();
                 }
            }
        
        };
                
        timer = new Timer();
        timer.scheduleAtFixedRate(tarea, velmil, velmil);
       
    }

}

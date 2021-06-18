package CambiarImagen;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.util.Timer;
import java.util.TimerTask;

public class CambiarImagen1 extends javax.swing.JFrame implements Runnable {

    static int contador = 0;

    public static void main(String args[]){
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run(){
                new CambiarImagen1().setVisible(true);
            }
        });
    }
    
     @Override
        public void run() {
        contador = 0;
        Timer timer2;
        TimerTask tarea2;
        int velmil2 = 1 * 1000;
        
        Semaforo1 semaforo1 = new Semaforo1();
        semaforo1.setVisible(true);
        
        tarea2 = new TimerTask(){
            
            @Override
            public void run() {
                 Icon icono2;
                 try {
                 switch(contador){
                     case 0:
                         contador = 1;
                         icono2 = new ImageIcon(getClass().getResource("/Iconos/SemaforoColorRojo.png"));
                         semaforo1.jLabel1.setIcon(icono2);
                         Thread.sleep(3000);
                         break;
                     case 1: 
                         contador = 2;
                         icono2 = new ImageIcon(getClass().getResource("/Iconos/SemaforoColorVerde.png"));
                         semaforo1.jLabel1.setIcon(icono2);
                         Thread.sleep(2000);
                         break;
                     case 2: 
                         contador  = 0;
                         icono2 = new ImageIcon(getClass().getResource("/Iconos/SemaforoColorAmarillo.png"));
                         semaforo1.jLabel1.setIcon(icono2);
                         Thread.sleep(1000);
                         break;
                     }
                 }catch(Exception e){
                     e.printStackTrace();
                 }
            }
        
        };
        
      timer2 = new Timer();
      timer2.scheduleAtFixedRate(tarea2, velmil2, velmil2);
       
}
}

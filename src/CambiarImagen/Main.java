
package CambiarImagen;

public class Main {

    public static void main(String[] args) {
      
        CambiarImagen cambiarimagen = new CambiarImagen();
        CambiarImagen1 cambiarimagen1 = new CambiarImagen1();
        
        cambiarimagen.setVisible(true);
        cambiarimagen1.setVisible(true);
        
        Thread hilo1 = new Thread(cambiarimagen);
        Thread hilo2 = new Thread(cambiarimagen1);
        
        hilo1.start();
        hilo2.start();

    }
}

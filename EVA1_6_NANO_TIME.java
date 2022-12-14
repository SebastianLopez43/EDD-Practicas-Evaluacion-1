package eva1_6_nano_time;

/**
 * @author José Sebastian López Ibarra
 * Wednesday August 24 2022
 */

public class EVA1_6_NANO_TIME {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        
        // Función que determina el tiempo utilizado
        System.out.println(System.nanoTime());
        
        long inicio = System.nanoTime();
        System.out.println(inicio);
        
        long fin = System.nanoTime();
        long tiempo = fin - inicio;
        
        // Tiempo empleado
        System.out.println(tiempo);
    }
}

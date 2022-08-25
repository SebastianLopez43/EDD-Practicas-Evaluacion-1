package eva1_7_medir_tiempo;

/**
 * @author José Sebastian López Ibarra
 * Thursday August 25 2022
 */

public class EVA1_7_MEDIR_TIEMPO {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        int[] datos = new int[300000000];
        long inicio = System.nanoTime();
        
        for (int i = 0; i < datos.length; i++) {
            datos[i] = 100;
        }
        
        long fin = System.nanoTime();
        long tiempo = fin - inicio;
        
        System.out.println(tiempo/300000000);
    }
}
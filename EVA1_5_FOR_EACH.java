package eva1_5_for_each;

/**
 * @author José Sebastian López Ibarra
 * Wednesday August 24 2022
 */

public class EVA1_5_FOR_EACH {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        int [] arregloDatos = new int[50];
        
        for(int i = 0; i < arregloDatos.length; i++) {
            arregloDatos[i] = (int)(Math.random() * 100);
        }
        
        // For Each
        for (int arregloDato : arregloDatos) {
            System.out.print("[ " + arregloDato + " ]");
        }
    }
}
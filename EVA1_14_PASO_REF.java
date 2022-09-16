package eva1_14_paso_ref;

/**
 * @author José Sebastian López Ibarra
 * Friday September 02 2022
 */

public class EVA1_14_PASO_REF {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        
        // Creamos arreglo de enteros
        int[] arregloDatos = new int[100];
        
        // Función que llena el arreglo con números aleatorios
        llenar(arregloDatos);
        
        // Función que imprime el arreglo
        imprimir(arregloDatos);
    }    
    
    public static void llenar(int[] arreglo) {        
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = (int)(Math.random() * 100);
        }
    }
    
    public static void imprimir(int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("Valor " + (i+1) + " :[ " + arreglo[i] + " ]");
        }
    }
}

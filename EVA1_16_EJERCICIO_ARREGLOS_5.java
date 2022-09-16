package eva1_16_ejercicio_arreglos_5;

/**
 * @author José Sebastian López Ibarra
 * Thursday September 08 2022
 */

public class EVA1_16_EJERCICIO_ARREGLOS_5 {

    /**
     * @param args the command line arguments
     */
    
    /*
    Los Strings son arreglos de caracteres
    */
    
    public static void main(String[] args) {
        int num;
        
        // Crear arreglo con 50 elementos
        int[] numArray = new int[50];
        
        // Llamada a función que llena datos en el arreglo
        llenar(numArray);                
        
        // Llamada a función que imprime el primer arreglo
        System.out.println("    Lista de valores (Primer arreglo)    ");
        System.out.println("");
        imprimir(numArray);
        System.out.println("");
                                
        // Crear segundo arreglo que guardará números pares
        int[] numPairArray = new int[numArray.length];        
        
        // Creamos una copia del primer arreglo
        for (int i = 0; i < numArray.length; i++) {
            numPairArray[i] = numArray[i];            
        }
        
        // Llamada a función que imprime el segundo arreglo
        System.out.println("    Lista de valores (Segundo arreglo)    ");
        System.out.println("");
        imprimir(numPairArray);
        
        System.out.println("");
        System.out.println(" Segundo Arreglo (Número Pares)");
        System.out.println("");
        
        // Ciclo que agrega únicamente los números pares al segundo arreglo
        for (int i = 0; i < numArray.length; i++) {
            if (numArray[i] % 2 == 0) {
                numPairArray[i] = numArray[i];
                System.out.println("Número " + (i+1) + " de la lista: [ " + numPairArray[i] + " ]");
            }
        }
    }
    
    // Función que llena arreglos con valores entre uno y 100
    public static void llenar(int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = (int) (Math.random() * 100);
        }
    }
    
    // Función que imprime un arreglo
    public static void imprimir(int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("Valor " + (i+1) + ": [ " + arreglo[i] + " ]");
        }
    }
}

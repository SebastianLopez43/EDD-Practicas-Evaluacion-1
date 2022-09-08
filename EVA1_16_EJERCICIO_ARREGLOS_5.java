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
                
        // Crear arreglo con 50 elementos
        int[] numArray = new int[50];
        
        // Llamada a función que llena datos en el arreglo
        llenar(numArray);                
        
        // Llamada a función que imprime el primer arreglo
        System.out.println("    Lista de valores (Primer arreglo)    ");
        System.out.println("");
        imprimir(numArray);
        System.out.println("");
        
        // Llamada a función que determinar si un número es par o no en el primer arreglo
        numPar(numArray);
                                
        // Crear segundo arreglo que guarda valores pares
        int[] numPairArray = new int[numArray.length];
        
        // Llamada a función que determina si son pares o no
        numPar(numPairArray);
        
        // Llamada a función que imprime el segundo arreglo
        System.out.println("    Lista de valores (Segundo arreglo)    ");
        System.out.println("");
        imprimir(numPairArray);
        
        // Creamos una copia del primer arreglo
        for (int i = 0; i < numArray.length; i++) {
            numPairArray[i] = numArray[i];
            
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
    
    // Función que determinar si un número es par o impar
    public static void numPar(int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] % 2 == 0){
                arreglo[i] = arreglo[i];
            }
            //arreglo[i]
        }
    }
}
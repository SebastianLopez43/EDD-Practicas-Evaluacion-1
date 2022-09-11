package eva1_15_copia_arreglos;

/**
 * @author José Sebastian López Ibarra
 * Wednesday September 07 2022
 */

public class EVA1_15_COPIA_ARREGLOS {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        
        // Creamos arreglo con 100 enteros
        int[] arrayDatos = new int[100];
        
        // Creamos segundo arreglo que guarde una copia del primer arreglo
        int[] arrayCopia = new int[arrayDatos.length];
        
        // Llamamos a la función que llena el primer arreglo
        llenar(arrayDatos);
        
        // Llamamos a la función que imprime el primer arreglo
        System.out.println("Primer arreglo");
        imprimir(arrayDatos);
        System.out.println("");
        
        //Copia de los valores
        for (int i = 0; i < arrayDatos.length; i++) {
            arrayCopia[i] = arrayDatos[i];
        }
        
        // Llamamos a función que imprime el segundo arreglo
        System.out.println("Copia del primer arreglo");
        imprimir(arrayCopia);        
        System.out.println("");
                
        // Ciclo que agrega del último valor al primero del primer arreglo en el segundo
        for (int i = 0; i < arrayDatos.length; i++) {        
                for(int j = 0; j < arrayDatos.length; j++) {
                    arrayCopia[j] = arrayDatos[(arrayDatos.length - 1) - j];
            }
        }
        
        // Llamada a función que imprime el segundo arreglo de manera inversa
        System.out.println("Primer arreglo invertido");
        imprimir(arrayCopia);
    }
    
    // Función que llena una arreglo con números aleatorios entre 1 y 100
    public static void llenar(int[] array){
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random()*10);
        }
    }
    
    // Función que imprime un arreglo
    public static void imprimir(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print("[" + array[i] + "]");   
        }
        System.out.println("");
    }    
}

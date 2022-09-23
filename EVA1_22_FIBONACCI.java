package eva1_22_fibonacci;
import java.util.Scanner;

/**
 * @author José Sebastian López Ibarra
 * Wednesday September 21 2022
 */

public class EVA1_22_FIBONACCI {

    /**
     * @param args the command line arguments
     */       
    
    public static void main(String[] args) {
                
        Scanner input = new Scanner(System.in);
        
        /* 
        Creamos variable que determina la posición del último número
        de la serie de Fibonacci
        */
        int serie;
        
        // Preguntamos al usuario que introduzca la posición de la serie que desesa saber.
        System.out.println("Introduce la posición de la serie de Fibonacci deseada (no mayor de 20): ");
        serie = input.nextInt();
        System.out.println("");
 
        System.out.println("Serie de Fibonacci:");
        
        // Ciclo que imprime cada uno de los números 
        for (int i = 0; i <= serie; i++) { 
            System.out.print("Posición " + i + ". " + fibonacciRecursivo(i));
            System.out.println("");
        }
    }
 
    // Función que determina el número según su posición
    public static int fibonacciRecursivo(int n) {
 
        // Si el usuario introduce 0, devolvemos 0
        if (n == 0) {
            return 0;
            // Si el usuario introduce 1, devolvemos 1    
        } else if (n == 1) {
            return 1;
        } else {
            // Realizamos la suma            
            return fibonacciRecursivo(n - 1) + fibonacciRecursivo(n - 2);
        } 
    } 
}

package eva1_20_factorial;
import java.util.Scanner;

/**
 * @author José Sebastian López Ibarra
 * Thursday September 15 2022
 */

public class EVA1_20_FACTORIAL {

    /**
     * @param args the command line arguments
     */
    
    /*
    Pedir un número para calcular el factorial del mismo.
    
    Factorial de un número:
    n! || n = 5
    5*4*3*2*1 = 120
    
    5! = 5 * 4!
    4! = 4 * 3!
    3! = 3 * 2!
    2! = 2 * 1!
    1! = 1 * 0!
    */
    
    public static void main(String[] args) {                                        
        
        System.out.println("- Programa que determina el factorial de un número -\n");
        
        // Creamos objeto de entrada de texto
        Scanner input = new Scanner(System.in);
        
        // Creamos variable de número entera
        int numFact, continuar;
        
        do{
        
            // Preguntamos al usuario el número a evaluar
            System.out.println("Ingresa un número mayor a 0: ");
            numFact = input.nextInt();
            
            // Método recurisvo que determina el factorial de un número
            System.out.println("\nEl factorial de " + numFact + " es:");
            System.out.println(factorial(numFact));
            System.out.println("");
            
            System.out.println("¿Quieres volver a usar el programa? Si = 0/No = 1");
            continuar = input.nextInt();
            System.out.println("");
            
        } while(continuar != 1);
            System.out.println("Programa finalizado");
    }

    public static int factorial(int num) {
        
        if (num == 0) {
            return 1;
        } else {
            return num * factorial(num - 1);
        }            
    }         
}

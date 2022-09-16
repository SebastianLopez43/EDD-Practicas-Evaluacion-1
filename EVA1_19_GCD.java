package eva1_19_gcd;
import java.util.Scanner;

/**
 * @author José Sebastian López Ibarra
 * Thursday September 15 2022
 */

public class EVA1_19_GCD {

    /**
     * @param args the command line arguments
     */
    
    /*
    Dvidendo y divisor
        Dividendo/divisor -> Residuo
    */
    
    public static void main(String[] args) {
        
        // Creamos un objeto de entrada de texto
        Scanner input = new Scanner(System.in);
        
        // Creamos variables de números enteros
        int dividendo, divisor;
        
        System.out.println("- Programa que calcula el máximo común divisor de dos números -\n");
        
        // Preguntamos al usuario los números a evaluar
        System.out.println("Introduce un número mayor a 0: ");
        dividendo = input.nextInt();
        System.out.println("Introduce un número mayor a 0: ");
        divisor = input.nextInt();
        
        // Condición de no negatividad
        if (dividendo <= 0) {
            System.out.println("Introduce un número mayor a 0: ");
            dividendo = input.nextInt();
        } else if (divisor <= 0) {
            System.out.println("Introduce un número mayor a 0: ");
            divisor = input.nextInt();
        }
        
        // Método recursivo que calcula el máximo comun divisor de dos números
        System.out.println("El máximo común divisor de " + dividendo + " y " + divisor + " es:");
        System.out.println(gcd(dividendo, divisor));
    }   
    
    /* 
    Si residuo es 0
      divisor es el MCD
    si no
      divisor/residuo
    
    */
    
    public static int gcd(int dividendo, int divisor) {
                        
        int residuo;
        residuo = dividendo % divisor;
                
        // Determinar si el algoritmo continúa o se detiene
        if (residuo == 0) {
            // Me detengo, se encontró el MCD
            return divisor;            
        } else {
            return gcd(divisor, residuo);
        }                    
    }   
}

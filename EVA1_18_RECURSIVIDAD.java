package eva1_18_recursividad;
import java.util.Scanner;

/**
 * @author José Sebastian López Ibarra
 * Thursday September 15 2022
 */

public class EVA1_18_RECURSIVIDAD {

    /**
     * @param args the command line arguments
     */
    
    /*
                    Recursividad
    Dos condiciones
        1. Método que se llama a si mismo
        Algún tipo de trabajo
            
        2. Un mecanismo para deterner la recursividad
    */
    
    public static void main(String[] args) { 
        
        // Creamos un objeto de entrada de texto
        Scanner input = new Scanner(System.in);
        
        // Creamos variables de números entera
        int numDes, numAscIni, numAscFin;
        
        System.out.println("- Forma descendente de un número -\n");
        
        // Preguntamos al usuario el número a evaluar
        System.out.println("Introduce un número mayor a 0: ");
        numDes = input.nextInt();
        
        // Condición de no negatividad
        if (numDes <= 0) {
            System.out.println("Introduce un número mayor a 0: ");
            numDes = input.nextInt();
        }
        
        // Método recursivo que ordena los números de forma descendente
        System.out.println("\nNúmeros descendentes\n");
        falsoForDes(numDes);
        System.out.println("\n");
                
        System.out.println("- Forma ascendente de un número -\n");        
        
        // Preguntamos al usuario los números a evaluar
        System.out.println("Introduce un número mayor a 0: ");
        numAscFin = input.nextInt();
        System.out.println("Introduce un número menor al ya introducido: ");
        numAscIni = input.nextInt();
                
        // Condición de no negatividad
        if (numAscFin <= 0) {
            System.out.println("Introduce un número mayor a 0: ");
            numAscFin = input.nextInt();
        } else if (numAscIni <= 0) {
            System.out.println("Introduce un número menor al ya introducido: ");
            numAscIni = input.nextInt();
        }
                
        // Método recursivo que ordena los números de forma ascendente
        // Primer valor = Número al que se quiere llegar
        // Segundo valor = Número donde comienza
        System.out.println("");
        System.out.println("Números ascendentes\n");
        falsoForAsc(numAscFin, numAscIni);
        System.out.println("");
    }
    
    // Falso For
    // Imprimir unalista de números de mayor a menor (de manera recursiva)
    // Recibir un valor falsoForDes(5) ->  "5 - 4 - 3 - 2 - 1"
    
    public static void falsoForDes(int valor) {
        
        /*
         - Que voy a hacer 
            Imprimir valor
         - Llamada recursiva
            falsoForDes(valor - 1)
         - Detener la llamada recursiva
            Valor == 1
        
        } Si valor es 1, me detengo, si no, llamada recursiva {
        */
                 
        /* 
        1era Manera de solucionarlo
        if (valor > 0) {
            System.out.print(valor + " - ");
            valor--;
            falsoForDes(valor);
        }
        */
                
        // 2da manera de solucionarlo
        if (valor == 1){
            System.out.print(valor);
        } else {
            System.out.print(valor + " - ");
            falsoForDes(valor - 1);
        }                 
    }
    
    // falsoFor(5, 1)
    public static void falsoForAsc(int fin, int ini) {
        
        if (ini == fin) {
            System.out.print(fin);
        } else {
            System.out.print(ini + " - ");
            falsoForAsc(fin, ini + 1);
        }
    }
}

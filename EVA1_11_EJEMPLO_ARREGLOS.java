package eva1_11_ejemplo_arreglos;
import java.util.Scanner;

/**
 * @author José Sebastian López Ibarra
 * Thursday September 01 2022
 */

public class EVA1_11_EJEMPLO_ARREGLOS {

    /**
     * @param args the command line arguments
     */
    
    /*
    - Pedir números de grupos
    - Pedir número de alumnos por grupo
    - Capturar calificaciones
    - Imprimir calificaciones
    */
    
    public static void main(String[] args) {        
        
        Scanner input = new Scanner(System.in);
        
        int i, j, k, l;
        
        // Pedir número de grupos
        System.out.println("¿Cuántos grupos se van a capturar? Ingresa un valor entero.");
        int grupos = input.nextInt();                   
        
        // Creamos arreglo para capturar los grupos, los alumnos y sus correspondiente calificaciones
        int[][] arregloCalif;
        
        /* 
        Primera dimensión - Grupos
        Segundo dimensión - Estudiantes
        */
        
        // Determinar grupos en el arreglo
        arregloCalif = new int[grupos][];
        
        // Condición que identifica si se ingresan valores mayores a 0
        if(grupos <= 0) {
            System.out.println("\nIngresa un valor mayor que 0: ");
            grupos = input.nextInt();
            arregloCalif = new int[grupos][];
        } else {
            System.out.println("Número de grupos:");
            System.out.println(arregloCalif.length + "\n");
        }        
        
        // Ciclo que captura el número de alumnos por grupo
        for (i = 0; i < arregloCalif.length; i++) {
            
            // Pedir número de alumnos por grupo
            System.out.println("¿Cuántos alumnos hay en el grupo " + (i+1) + "?");
            int alumnos = input.nextInt();
            
            // Determinar el número de alumnos por grupo en el arreglo
            arregloCalif[i] = new int[alumnos];
            
            System.out.println("Número de alumnos en el grupo " + (i+1) + ":");
            System.out.println(arregloCalif[i].length + "\n");
            
            // Ciclo que pide cada calificación
            for (j = 0; j < arregloCalif[i].length; j++) {
                
                // Pedir la calificación de cada alumno
                System.out.println("Capture la calificación del alumno " + (j + 1) + 
                        " del grupo " + (i + 1) + ":");
                int calificaciones = input.nextInt();
                
                // Determinar la calificación de cada alumno
                arregloCalif[i][j] = calificaciones;                                    
            }
            
            System.out.println("");
        }
        
        for (k = 0; k < arregloCalif.length; k++) {
            System.out.println("Calificaciónes del grupo: " + (k + 1));
            for (l = 0; l < arregloCalif[k].length; l++) {
                System.out.println("Alumno " + (l + 1) + ": " + arregloCalif[k][l]);
            }
            
            System.out.println("");
        }
    }
}       

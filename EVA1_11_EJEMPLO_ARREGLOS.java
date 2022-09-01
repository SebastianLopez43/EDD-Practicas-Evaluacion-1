package eva1_11_ejemplo_arreglos;
import java.util.Scanner;

/**
 *
 * @author moviles
 */

public class EVA1_11_EJEMPLO_ARREGLOS {

    /**
     * @param args the command line arguments
     */
    
    /*
    - Pedir números de grupos *
    - Pedir número de alumnos por grupo *
    - Capturar calificaciones
    - Imprimir calificaciones
    */
    
    public static void main(String[] args) {        
        
        Scanner input = new Scanner(System.in);
        
        // Pedir número de grupos
        System.out.println("¿Cuántos grupos se van a capturar? Ingresa un valor entero.");
        int grupos = input.nextInt();                
        
        int[][] arregloCalif;
        
        /* 
        Primera dimensión - Grupos
        Segundo dimensión - Estudiantes
        */
        
        // Determinar grupos
        arregloCalif = new int[grupos][];
        
        System.out.println(arregloCalif.length);
        
        for (int i = 0; i < arregloCalif.length; i++) {
            
            // Pedir número de alumnos por grupo
            System.out.println("¿Cuántos alumnos hay en el grupo " + (i+1) + "?");
            int alumnos = input.nextInt();
            
            // Determinar el número de alumnos por grupo
            arregloCalif[i] = new int[alumnos];
                        
            System.out.println(arregloCalif[i].length);
        }
        
        /*
        for (int i = 0; i < grupo_alumno.length; i++) {
            System.out.println("¿Cuántos grupos se van a capturar? Ingresa en valor entero.");
            int grupo = input.nextInt();
            grupo_alumno[i] = grupo;        
        }
        */
    }
}    
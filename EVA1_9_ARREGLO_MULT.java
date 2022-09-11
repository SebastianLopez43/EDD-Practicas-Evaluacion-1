package eva1_9_arreglo_mult;

/**
 * @author José Sebastian López Ibarra
 * Friday August 26 2022
 */

public class EVA1_9_ARREGLO_MULT {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        
        // 15 enteros
        int[][] arregloMatriz = new int[3][5];
        
        System.out.println("Filas: " + arregloMatriz.length);
        
        // Primera dimensión (3 filas)
        for(int i = 0; i < arregloMatriz.length; i++){
            // Segunda dimensión (5 columnas)
            for(int j = 0; j < arregloMatriz[i].length; j++) {
                arregloMatriz[i][j] = 100;
            }
            System.out.println("Columnas: " + arregloMatriz[i].length);
        }
        
        System.out.println("");
        System.out.println("Matriz de tres filas y cinco columnas");
        System.out.println("");
        
        for(int i = 0; i < arregloMatriz.length; i++) {
            for(int j = 0; j < arregloMatriz[i].length; j++) {  
                System.out.print("[" + arregloMatriz[i][j] + "]");                                 
            }
            System.out.println("");
        }
    }
}
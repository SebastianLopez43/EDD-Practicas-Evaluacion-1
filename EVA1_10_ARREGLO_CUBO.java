package eva1_10_arreglo_cubo;

/**
 * @author José Sebastian López Ibarra
 * Friday August 26 2022
 */

public class EVA1_10_ARREGLO_CUBO {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        
        // 60 enteros
        int[][][] matrizCubo = new int[3][4][5];
        
        // Primera dimensión (3 columnas)
        for(int i = 0; i < matrizCubo.length; i++){
            // Segunda dimensión (4 filas)
            for(int j = 0; j < matrizCubo[i].length; j++) {
                // Tercera dimensión (5 de profundidad)
                for (int k = 0; k < matrizCubo[i][j].length; k++) {
                    matrizCubo[i][j][k] = 50;
                }
            }
        }
        
        System.out.println("");
        System.out.println("Tres matrices de tres columnas, cuatro filas y 5 de profundidad");
        System.out.println("");
        
        for(int i = 0; i < matrizCubo.length; i++) {
            for(int j = 0; j < matrizCubo[i].length; j++) {  
                System.out.println("");
                for (int k = 0; k < matrizCubo[i][j].length; k++) {
                    System.out.print("[" + matrizCubo[i][j][k] + "]");                    
                }                                
            }
            System.out.println("");
        }
    }   
}

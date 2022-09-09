package eva1_17_ejercicio_arreglos_3;

/**
 * @author José Sebastian López Ibarra
 * Friday September 09 2022
 */

public class EVA1_17_EJERCICIO_ARREGLOS_3 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        
        // 60 enteros
        int[][] matrizQuinta = new int[5][5];
        
        // Primera dimensión (5 columnas)
        for(int i = 0; i < matrizQuinta.length; i++){
            // Segunda dimensión (5 filas)
            for(int j = 0; j < matrizQuinta[i].length; j++) {
                matrizQuinta[i][j] = ((int)(Math.random() * 100)) + 1;
            }
        }
        
        System.out.println("");
        System.out.println("    Matriz con cinco columnas y cinco filas");
        System.out.println("");                
        
        // Llamada a función imprimir
        imprimir(matrizQuinta);
        
        // Crear arreglo inverso al primer arreglo
        int[][] matrizInversa = new int [5][5];
        
        
        for (int i = 0; i < matrizQuinta.length; i++) {
            matrizInversa[i] = matrizQuinta[(matrizQuinta.length - 1) - i];
            for (int j = 0; j < 10; j++) {
                matrizInversa[i][j] = matrizQuinta[(matrizQuinta[i].length - 1) - i][(matrizQuinta[i][j] - 1) - j];
                System.out.println("[ " + matrizInversa[i][j] + " ]");
            }
            System.out.println("");
        }
        
        // Salto de línea
        System.out.println("");
        System.out.println("    Matriz inversa");
        
    }
    
    // Función que imprime el arreglo
    public static void imprimir(int[][] arreglo) {
    for(int i = 0; i < arreglo.length; i++) {
            for(int j = 0; j < arreglo[i].length; j++) {                  
                System.out.print("[ " + arreglo[i][j] + " ]");                                
            }
            System.out.println("");
        }
    }
}
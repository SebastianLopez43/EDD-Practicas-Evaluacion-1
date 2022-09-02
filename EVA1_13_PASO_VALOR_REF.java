package eva1_13_paso_valor_ref;

/**
 * @author José Sebastian López Ibarra
 * Friday September 02 2022
 */

public class EVA1_13_PASO_VALOR_REF {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        
        // Definimos variable con algún valor
        int valorPrueba = 100;
        System.out.println("Valor = " + valorPrueba);
        
        // Llamamos a la función.
        increValor(valorPrueba);
        // Se crea una copia de lo que está almacenado.
               
        // Se imprime el valor original, no se modificó la variable
        System.out.println("Valor incrementado = " + valorPrueba);
        
        System.out.println("----------------------");
        
        PruebaValor prueba = new PruebaValor();
        prueba.c = 100;
        
        System.out.println("Prueba (obj) = " + prueba.c);
        
        increVal(prueba);
        
        System.out.println("Valor incrementado (obj) = " + prueba.c);
    }    
    
    // Incrementar valor en uno
    public static void increValor(int valor){
        valor++;
    }
    
    // Incrementar valor
    public static void increVal(PruebaValor prueba) {
        prueba.c++;
    }
}

class PruebaValor {
    int c;
}
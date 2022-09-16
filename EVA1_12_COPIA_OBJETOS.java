package eva1_12_copia_objetos;

/**
 * @author José Sebastian López Ibarra
 * Friday September 02 2022
 */

public class EVA1_12_COPIA_OBJETOS {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        
        /*
        PASO POR VALOR
        PASO POR REFERENCIA
        */
        
        // Creamos variables enteras
        int valor, copiaValor;
        
        // Asignamos valor
        valor = 100;
        
        // Respaldo
        copiaValor = valor;
        
        System.out.println("Valor: " + valor);
        System.out.println("Copia: " + copiaValor);
        
        // Incrementamos valor en 1
        valor++;
        
        System.out.println("");
        System.out.println("Valor: " + valor);
        System.out.println("Copia: " + copiaValor);
        System.out.println("");
        
        // Copias con objetos
        PruebaValor prueba = new PruebaValor();
        prueba.c = 5000;
        
        // Asignamos la dirección de la variable prueba a la variable pruebaCopia
        PruebaValor pruebaCopia = new PruebaValor();        
        pruebaCopia = prueba;
        
        System.out.println("    Copia de objetos");
        System.out.println("Como la variable prueba tiene guardada en su dirección el valor de '5000',");
        System.out.println("y copiaPrueba tiene la misma dirección, se va a imprimir el mismo valor.");
        System.out.println("");
        System.out.println("Prueba: " + prueba.c);
        System.out.println("Copia prueba: " + pruebaCopia.c);
        
        prueba.c++;
        
        System.out.println("");
        System.out.println("Las dos variables gurdan las mismas direcciones.");
        System.out.println("Prueba: " + prueba.c);
        System.out.println("Copia prueba: " + pruebaCopia.c);
    }    
}

class PruebaValor{
    int c;
}

package eva1_8_arreglos_objetos;

/**
 * @author José Sebastian López Ibarra
 * Thursday August 25 2022
 */

public class EVA1_8_ARREGLOS_OBJETOS {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        
        // Objeto de arreglo creado
        // Clase identificador = new Clase();
        // Instanciar objeto
        Prueba[] arrayPrueba = new Prueba[20];
        
        // Acceder a la posición de tipo Prueba
        // Acceder a las propiedades del arreglo
        // System.out.println("Valor de c = " + arrayPrueba.lenght);
        
        // Acceder a las propiedades de lo que está almacenado en el objeto
        // System.out.println(arrayPrueba[10].c);
        
        // Ciclo que crea los objetos
        for(int i = 0; i < arrayPrueba.length; i++) {
            arrayPrueba[i] = new Prueba();
        }
        
        System.out.println("Direcciones\n");
        // For each que imprime las direcciones de cada objeto
        for(Prueba prueba : arrayPrueba) {
            // Distintas direcciones - Diferentes objetos
            System.out.println(prueba);
            }
        
        System.out.println("\nValores de cada objeto\n");
        // For each que agrega el valor a cada objeto
        for(Prueba prueba : arrayPrueba) {
            // Contenido de cada objeto
            System.out.println(prueba.c);
        }
    }    
}

class Prueba {
    int c = 100;
}

package eva1_4_arrays;

/**
 * @author José Sebastian López Ibarra
 * Wednesday August 24 2022
 */

/*
- TDA - Tipo de abstracción de datos (objetos y clases)
- Arreglos en Java -> Objetos -> TDA

- Estilo de Programación
    Funciones e identificadores -> Empiezan en minúscula
    Funciones -> indican una acción -> Verbos
    Clases -> Empiezan con mayúscula
*/

public class EVA1_4_ARRAYS {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        /*
                Crear Arreglos
        
            Tipo de dato [ ] Identificación = new Tipo de dato (tamaño)
            Arreglo de 
        */
        
        // Todos los identificadores declarados son arreglos de enteros
        int [] arregloEdades, arregloSalario, arregloCalif;
        
        // arregloPromedio únicamente es un arreglo
        double arregloPromedio[], porcentaje;
        
        // Los arreglos son objetos
        arregloEdades = new int[50];
        
        // System.out.println(Integer.MAX_VALUE); - Máximo valor que guarda una variable de tipo entero
        
        // System.out.println(arregloEdades); - Inprime la dirección donde está guardado en memoria
        
        for(int i = 0; i < 50; i++) {
            arregloEdades[i] = (int)(Math.random() * 100);
        }
        
        for(int i = 0; i < arregloEdades.length; i++) {
            System.out.println("[ " + i + " ] = " + arregloEdades[i]);
        }
    }
}
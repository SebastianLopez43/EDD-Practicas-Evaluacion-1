package eva_15_copia_arreglos;

/**
 * @author José Sebastian López Ibarra
 */
public class EVA_15_COPIA_ARREGLOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] arregloDatos = new int[100];

        llenar(arregloDatos);
        imprimir(arregloDatos);

        // Copiar los valores almacenados en el arreglo
        int[] arregloCopia = new int[arregloDatos.length];

        // Diferentes direcciones
        System.out.println("");
        System.out.println("");
        System.out.println(arregloCopia);
        System.out.println(arregloCopia);
        System.out.println("");

        // Crear la copia de los valores
        for (int i = 0; i < arregloDatos.length; i++) {
            arregloCopia[i] = arregloDatos[i];
        }

        // Imprimir arreglo
        imprimir(arregloCopia);
    }

    public static void llenar(int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = (int) (Math.random() * 100);
        }
    }

    public static void imprimir(int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print("[ " + arreglo[i] + " ]");
        }
    }
}
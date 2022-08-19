package eva1_1_stack;

/**
 * @author José Sebastian López Ibarra
 * Thursday August 18 2022
 */

public class EVA1_1_STACK {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args){
        System.out.println("Inicia Main");
        A();
        System.out.println("Retoma ejecución Main");
        System.out.println("Termina Main");
    }
    
    public static void A(){
        System.out.println("Inicia A");
        B();
        System.out.println("Retoma ejecución A");
        System.out.println("Termina A");
    }
    
    public static void B(){
        System.out.println("Inica B");
        int i = 1;
        double d = 10.0;
        System.out.println("Termina B");
    }
}

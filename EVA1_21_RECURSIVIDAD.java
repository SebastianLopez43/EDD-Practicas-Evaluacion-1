package eva1_21_recursividad;

/** 
 * @author José Sebastian López Ibarra
 * Wednesday September 21 2022;
 */

public class EVA1_21_RECURSIVIDAD {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {        
        System.out.println("Main: " + A());
        System.out.println("Función A: " + B());
        System.out.println("Función B: " + C());
    }
        
    
    public static String A(){
        return "A " + B();
    }
    
    public static String B(){
        return "B " + C();
    }
    
    
    public static String C(){
        return "C";
    }
}

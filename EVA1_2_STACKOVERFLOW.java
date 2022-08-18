package eva1_2_stackoverflow;

/**
 * @author José Sebastian López Ibarra
 * Thursday August 18 2022
 */

public class EVA1_2_STACKOVERFLOW {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        A();
    }
    
    public static void A(){
        B();
    }
    
    public static void B(){
        A();
    }
}
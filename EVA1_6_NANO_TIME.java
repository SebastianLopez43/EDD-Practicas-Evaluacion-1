package eva1_6_nano_time;

/**
 * @author José Sebastian López Ibarra
 * Wednesday August 24 2022
 */

public class EVA1_6_NANO_TIME {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        System.out.println(System.nanoTime());
        
        int x = 5;
        
        System.out.println(System.nanoTime());
        
        int y = 3;
        
        System.out.println(System.nanoTime());
        
        System.out.println(x - y);
        
        System.out.println(System.nanoTime());
    }
}
package eva1_3_heap;

/**
 * @author José Sebastian López Ibarra
 * Friday August 19 2022
 */

public class EVA1_3_HEAP {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        int a = 10;
        Test obj1 = new Test();
        Test obj2 = new Test();
        
        // obj1 and obj2 restored references
        System.out.println(a);
        System.out.println(obj1);
        System.out.println(obj1.value);
        System.out.println(obj2);
        
        /*
        En Java las direcciones de memoria (máquina virtual) son llamadas: Referencias.
        
        En otros lenguajes se conocen como: Apuntadores.
        */
    }
}

class Test {
    public int value = 100;
}
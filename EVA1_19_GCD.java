package eva1_19_gcd;

/**
 * @author José Sebastian López Ibarra
 * Thursday September 15 2022
 */

public class EVA1_19_GCD {

    /**
     * @param args the command line arguments
     */
    
    /*
    Dvidendo y divisor
        Dividendo/divisor -> Residuo
    */
    
    public static void main(String[] args) {
        
        // Método recursivo que calcula el máximo comun divisor de dos números
        System.out.println(gcd(250, 25));
    }   
    
    /* 
    Si residuo es 0
      divisor es el MCD
    si no
      divisor/residuo
    
    */
    
    public static int gcd(int dividendo, int divisor) {
                        
        int residuo;
        residuo = dividendo % divisor;
                
        // Determinar si el algoritmo continúa o se detiene
        if (residuo == 0) {
            // Me detengo, se encontró el MCD
            System.out.println("Máximo común divisor de " + dividendo + " y " + divisor);
            return divisor;            
        } else {
            return gcd(divisor, residuo);
        }                    
    }   
}
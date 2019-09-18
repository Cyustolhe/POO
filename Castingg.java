/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package castingg;

/**
 *
 * @author professor
 */
public class Castingg {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Valor widening");
        
        
        byte a = 1;
        short s;
        int i;
        long l;
        float f;
        double d;
       
        //d = f = l = i = s = a;
        
        //f = s;
        //d = a;
       
        System.out.println("Valor narrowing");       
        
        byte a2;
        short s2;
        int i2;
        long l2;
        float f2;
        double d2 = 2;
        
        f2 = (float) d2;
        l2 = (long) f2;
        i2 = (int) l2;
        s2 = (short) i2;
        a2 = (byte) s2;
        
        
       
        
        
        
        
        
        
    }
    
}

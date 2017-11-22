/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *
 * @author diego
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    
    static int edad;
    static String nombre;
 
    static void disp(){
      System.out.println("Edad es: "+edad);
      System.out.println("Nombre: "+nombre);
    }
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        int MY_VAR = Demo.MY_VAR;
        Demo obj1 = new Demo();
        Demo obj2 = new Demo();
        
        System.out.println("contador en obj1 es: " + obj1.contador);
        System.out.println("contador en obj1 es: " + obj2.contador);
        
        obj1.incrementar();
        obj2.incrementar();
        
        System.out.println("contador en obj1 es: " + obj1.contador);
        System.out.println("contador en obj1 es: " + obj2.contador);
        
        disp();
        
    }
    
}

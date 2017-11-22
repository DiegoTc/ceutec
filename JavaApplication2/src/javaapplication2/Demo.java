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
public class Demo {
    
    /*
    Static variable initialization

Static variables are initialized when class is loaded.
Static variables are initialized before any object of that class is created.
Static variables are initialized before any static method of the class executes.
    */
    
    public static int contador = 0;
    public static final int MY_VAR=27;
    public void incrementar(){
        contador++;
    }
}

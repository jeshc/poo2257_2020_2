/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sesion_8;

import jdk.internal.org.objectweb.asm.TypeReference;

/**
 *
 * @author usuario-49
 */
public class Sesion_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int edad = 10;
        edad = edad + 1;
        edad ++;
        edad += 1;
        System.out.println("Edad: " + edad );
        System.out.println("Edad: " + (++edad));
        System.out.println("Edad: " + edad++);
        //Wraper de entero
        Integer objEdad = new Integer(10);
        int dias = Integer.parseInt("12");
        Float estatura = new Float("1.78");
        System.out.println("Edad obj: " + objEdad.intValue());
        System.out.println("Estatura: " + estatura.floatValue());
        System.out.println("Estatura(parte entera): " + estatura.intValue());
        int edad2 = 10;
        boolean pasa = false;
        if (edad2 >= 18){
            pasa = true;
        } else{
            pasa = false;
        }
        System.out.println("Pasa: " + pasa);
        
        pasa = edad2 >= 18? true:false;
        System.out.println("Pasa= " + pasa);
        System.out.println("La clase es el tipo Float: " +
                                                   (estatura instanceof Float));
        float x = 3.46f / 1.1f;
        System.out.println("X= " + x);
        int y = (int)x;
        System.out.println("y= " + y);
        x = (float)y;
        System.out.println("x " + x);
        
        
        
        
    }
    
}

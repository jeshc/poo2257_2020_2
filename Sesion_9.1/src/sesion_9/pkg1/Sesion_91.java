/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sesion_9.pkg1;

import java.util.Scanner;

/**
 *
 * @author usuario-49
 */
public class Sesion_91 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        int [] numeros;
        numeros = new int[10];
        
        numeros [0] = 2;
        System.out.println("Valor 1: " + numeros[0]);
        System.out.println("Valor 10: " + numeros[9]);
        int i = 0;
        try {
            for ( i = 0; i < numeros.length; i++) {
                System.out.print("Introduce un entero: ");
                numeros[i] = teclado.nextInt();
                
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.toString());
            
        }
        System.out.println("******************************");
        int j = 0;
        
        for ( j = 0; j < numeros.length; j++) {
            try {
                System.out.println("Introduce un número: ");
                numeros[i] = teclado.nextInt();
                
            } catch (Exception e) {
                numeros[j] = 0;
                System.out.println("Error: " + e.toString());
            }
            
            
        }
 
            
    }
    
}

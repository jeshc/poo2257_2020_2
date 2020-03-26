/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sesion_9;

import java.util.InputMismatchException;
import java.util.Scanner;
import javax.management.remote.JMXProviderException;
import javax.swing.JOptionPane;

/**
 *
 * @author usuario-49
 */
public class Sesion_9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner teclado = new Scanner(System.in);
        /*
        System.out.println("Delimitador: " + teclado.delimiter());
        String entrada = teclado.next();
        System.out.println("Entrada= " + entrada);
        String entrada2 = teclado.nextLine();
        System.out.println("Entrada 2= " + entrada2);
        String[] nombres = new String[5];
        nombres[0] = entrada; 
        nombres[1] = entrada2;
        int j = 0;
        for (j= 0; j < 5;j++)
            System.out.println("Elemento " + j +": " + nombres[j]);
        */
        int numero = 0;
        try {
           numero = teclado.nextInt();
        } catch (InputMismatchException e) {
            JOptionPane.showMessageDialog(null, "Error: Captura no válida!!");
            numero = -1;
        }
        System.out.print("Numero: " + numero);
        int j=0;
        int[] edades = new int[5];
        for(j=0; j < 5 ; j++){
        System.out.println("Dame una edad: ");
           edades[j] = teclado.nextInt();        
        }
        float suma = 0.0f;
        for (j = 0; j < edades.length; j++) {
            System.out.println("Edad " + j + "= " + edades[j]);
            suma += (float)edades[j];
        }
        System.out.println("Promedio de edades: " + (suma/(float)edades.length));
        
        
    }
        
        
    
    
}

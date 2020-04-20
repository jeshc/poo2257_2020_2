/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sesion_12;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author jeshc
 */
public class Sesion_12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<String> nombres = new ArrayList();
        nombres.add("José");
        nombres.add("Jaqueline");
        nombres.add("Diana");
        nombres.add("Diego");
        
        Scanner teclado=new Scanner( System.in);
        System.out.print("Ingresa un entero (0 - 3):");
        int indice = 0;
        
        try{
            //int t= 3/0;
         indice = teclado.nextInt();
         System.out.println("Elemento :" + nombres.get( indice ));
        }catch( IndexOutOfBoundsException e ){
            System.out.println( e );
            System.out.println("Elemento :" + nombres.get( 0 ));
        }catch( InputMismatchException e ){
            System.out.println( e );
            indice = 0;
        }catch(Exception e){
            System.out.println(e);
            //t = -1;
        }finally{
            System.out.println("Siempre se ejecuta despues del try");
        }
        System.out.println("Fin del programa!!!!");
        
        
        
    }
    
}

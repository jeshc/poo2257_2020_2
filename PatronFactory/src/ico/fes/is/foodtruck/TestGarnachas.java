/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.is.foodtruck;

import java.util.Scanner;

/**
 *
 * @author jeshc
 */
public class TestGarnachas {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcion=0;
        
        
        System.out.println("Que deseas comprar?");
        System.out.println("1) Pizza Haw, con orilla de queso");
        System.out.println("2) Pizza Margarita, con doble Queso");
        System.out.println("3) Hamburguesa sencilla");
        System.out.println("4) Hamburgesa Hawahiana");
        opcion=teclado.nextInt(); // Falta manejo de excepciones
        System.out.println("Opcion elegida es:"+opcion);
        
        switch (opcion) {
            case 1:
                Pizza p=new Pizza("Jamon y piña", false, false, true);
                System.out.println(p);
                break;
            case 2:
                
                break;
                
            case 3:
                
                break;
            case 4:
                Hamburguesa h=new Hamburguesa("Res", false, true, false, false, true);
                break;
            default:
                throw new AssertionError();
        }
        
    }
}

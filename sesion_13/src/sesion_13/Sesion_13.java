/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sesion_13;

import ico.fes.poo.Aritmetica;
import ico.fes.poo.Calculadora;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jeshc
 */
public class Sesion_13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Calculadora calc = new Calculadora( new Aritmetica());
        try {
            // sumar 5 y 6 --> 11
            calc.setValores(5, 6, 12);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }
        
        System.out.println("Resultado:"+calc.calcular());
    }
    
}

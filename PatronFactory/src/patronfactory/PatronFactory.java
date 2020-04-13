/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patronfactory;

import ico.fes.is.factory.Snack;
import ico.fes.is.factory.SnackFactory;
import ico.fes.is.foodtruck.Pizza;

/**
 *
 * @author jeshc
 */
public class PatronFactory {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Snack garnacha = SnackFactory.createSnack(Snack.PIZZA_HAW);
        System.out.println((Pizza)garnacha);
    }
    
}

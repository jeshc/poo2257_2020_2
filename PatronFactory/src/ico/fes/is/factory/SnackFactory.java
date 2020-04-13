/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.is.factory;

import ico.fes.is.foodtruck.Hamburguesa;
import ico.fes.is.foodtruck.Pizza;

/**
 *
 * @author jeshc
 */
public class SnackFactory implements Snack{
    
    
    public static Snack createSnack( int tipo){
        switch (tipo) {
            case Snack.PIZZA_HAW:
                return new Pizza("Jamon y Piña", false, false, false);
            case Snack.PIZZA_MARG:
                return new Pizza("Albahaca y aceite de olivo", false, true, false);
            case Snack.PIZZA_CARNES:
                return new Pizza("Carne de res, cerdo, pollo", true, true, false);
            case Snack.HAMBURGUESA_HAW:
                return new Hamburguesa("Res", false, true, false, false, true);
            // etc
            default:
                throw new AssertionError();
        }
    }
    
}

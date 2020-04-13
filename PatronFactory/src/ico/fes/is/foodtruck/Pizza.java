/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.is.foodtruck;

import ico.fes.is.factory.Snack;

/**
 *
 * @author jeshc
 */
public class Pizza implements Snack{
        private String ingredientePricipal;
        private boolean dobleQueso;
        private boolean salsaDeTomate;
        private boolean orillaQueso;

    public Pizza() {
    }

    public Pizza(String ingredientePricipal, boolean dobleQueso, boolean salsaDeTomate, boolean orillaQueso) {
        this.ingredientePricipal = ingredientePricipal;
        this.dobleQueso = dobleQueso;
        this.salsaDeTomate = salsaDeTomate;
        this.orillaQueso = orillaQueso;
    }

    public boolean isOrillaQueso() {
        return orillaQueso;
    }

    public void setOrillaQueso(boolean orillaQueso) {
        this.orillaQueso = orillaQueso;
    }

    public String getIngredientePricipal() {
        return ingredientePricipal;
    }

    public void setIngredientePricipal(String ingredientePricipal) {
        this.ingredientePricipal = ingredientePricipal;
    }

    public boolean isDobleQueso() {
        return dobleQueso;
    }

    public void setDobleQueso(boolean dobleQueso) {
        this.dobleQueso = dobleQueso;
    }

    public boolean isSalsaDeTomate() {
        return salsaDeTomate;
    }

    public void setSalsaDeTomate(boolean salsaDeTomate) {
        this.salsaDeTomate = salsaDeTomate;
    }

    @Override
    public String toString() {
        return "Aqui esta su Pizza:" + "ingredientePricipal=" + ingredientePricipal + ", dobleQueso=" + dobleQueso + ", salsaDeTomate=" + salsaDeTomate + ", orillaQueso=" + orillaQueso ;
    }
     
    
        
}

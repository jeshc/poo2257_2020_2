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
public class Hamburguesa implements Snack{
    
       private String tipoCarne; // POllo, Res, REs/Cerdo o Pescado
       private boolean dobleQueso;
       private boolean conPinia;
       private boolean dobleCarne;
       private boolean tocino;
       private boolean picante;

    public Hamburguesa() {
    }

    public Hamburguesa(String tipoCarne, boolean dobleQueso, boolean conPinia, boolean dobleCarne, boolean tocino, boolean picante) {
        this.tipoCarne = tipoCarne;
        this.dobleQueso = dobleQueso;
        this.conPinia = conPinia;
        this.dobleCarne = dobleCarne;
        this.tocino = tocino;
        this.picante = picante;
    }

    public boolean isPicante() {
        return picante;
    }

    public void setPicante(boolean picante) {
        this.picante = picante;
    }

    public String getTipoCarne() {
        return tipoCarne;
    }

    public void setTipoCarne(String tipoCarne) {
        this.tipoCarne = tipoCarne;
    }

    public boolean isDobleQueso() {
        return dobleQueso;
    }

    public void setDobleQueso(boolean dobleQueso) {
        this.dobleQueso = dobleQueso;
    }

    public boolean isConPinia() {
        return conPinia;
    }

    public void setConPinia(boolean conPinia) {
        this.conPinia = conPinia;
    }

    public boolean isDobleCarne() {
        return dobleCarne;
    }

    public void setDobleCarne(boolean dobleCarne) {
        this.dobleCarne = dobleCarne;
    }

    public boolean isTocino() {
        return tocino;
    }

    public void setTocino(boolean tocino) {
        this.tocino = tocino;
    }

    @Override
    public String toString() {
        return "Aqui esta su Hamburguesa: " + "tipoCarne=" + tipoCarne + ", dobleQueso=" + dobleQueso + ", conPinia=" + conPinia + ", dobleCarne=" + dobleCarne + ", tocino=" + tocino + ", picante=" + picante ;
    }
       
       
        
}

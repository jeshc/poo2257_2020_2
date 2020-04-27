/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.poo.abstractas;

/**
 *
 * @author jeshc
 */
public abstract class Instrumento {

    private int anioFabricacion;
    public static final int VIOLIN = 0;
    public static final int GUITARRA = 1;
    public static final int PIANO = 2;
    public static final int FLAUTA = 3;

    public Instrumento() {
    }

    public Instrumento(int anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }

    public int getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setAnioFabricacion(int anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }
    
    public abstract void tocar();
    public abstract void afinar();
    
    public String obtenerTipoInstrumento(){
        return "Instrumento de música";
    }

}

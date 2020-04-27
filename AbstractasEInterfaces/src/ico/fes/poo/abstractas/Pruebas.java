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
public class Pruebas {
    public static void main(String[] args) {
        Flauta f = new Flauta("Stevenson", 1987);
        //Instrumento o = new Instrumento();
        f.afinar();
        f.limpiar();
        f.tocar();
        System.out.println(f.obtenerTipoInstrumento());
    }
  
}

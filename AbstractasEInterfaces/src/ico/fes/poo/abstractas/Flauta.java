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
public class Flauta extends Instrumento{
    private String marca;
            
            
    public Flauta() {
    }

    public Flauta(String marca, int anioFabricacion) {
        super(anioFabricacion);
        this.marca = marca;
    }
    
    

    @Override
    public void tocar() {
        System.out.println("Posicionar los dedos sobre la flauta");
        System.out.println("Soblar sobre la boquilla...");
        System.out.println("emitiendo sonidos....");
    }

    @Override
    public void afinar() {
        System.out.println("Afinando la flauta...");
    }
    
    public void limpiar(){
        System.out.println("Limpiando la flauta!!!");
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    
}

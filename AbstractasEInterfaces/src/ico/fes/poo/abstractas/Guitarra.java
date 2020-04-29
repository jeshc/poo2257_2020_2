/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.poo.abstractas;

public class Guitarra extends Instrumento {

    private String marca;

    public Guitarra(String marca, int anioFbricacion) {
        super(anioFbricacion);
        this.marca = marca;
    }

    public Guitarra(int anioFabricacion) {
        super(anioFabricacion);
    }
        
    
    
    public Guitarra() {
    }

    @Override
    public void tocar() {
        System.out.println("Posicionar los dedos sobre la cuerda");
        System.out.println("Rasgar la cuerda");
        System.out.println("Emitiendo sonidos...");
    }

    public String  getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public void afinar() {
        System.out.println("Afinando la Guitarra...");
    }

    public void limpiar() {
        System.out.println("Limpiando la Guitarra");
    }

    public String obtenerTipoInstrumento() {
        return "Instrumento de musica de cuerda es una Guitarra";
    }

}

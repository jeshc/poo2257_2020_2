/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.componentes;

/**
 *
 * @author usuario-49
 */
public class Teclado {
    private String marca;
    private int numTeclas;

    public Teclado() {
    }

    public Teclado(String marca, int numTeclas) {
        this.marca = marca;
        this.numTeclas = numTeclas;
    }

    public int getNumTeclas() {
        return numTeclas;
    }

    public void setNumTeclas(int numTeclas) {
        this.numTeclas = numTeclas;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    public void encender(){
        System.out.println("Encendiendo la compu!! ");
    }
    
    
}

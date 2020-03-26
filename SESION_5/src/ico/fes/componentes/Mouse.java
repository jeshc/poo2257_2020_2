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
public class Mouse {
    private String marca;
    private int numBotones;

    public Mouse() {
    }

    public Mouse(String marca, int numBotones) {
        this.marca = marca;
        this.numBotones = numBotones;
    }

    public int getNumBotones() {
        return numBotones;
    }

    public void setNumBotones(int numBotones) {
        this.numBotones = numBotones;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    public void seleccionar(int x , int y){
        System.out.println("Click en:" + x + "," + y);
    }
}

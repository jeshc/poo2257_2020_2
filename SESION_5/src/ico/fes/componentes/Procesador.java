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
public class Procesador {
    private String modelo;
    private float velocidad;

    public Procesador() {
    }

    public Procesador(String modelo, float velocidad) {
        this.modelo = modelo;
        this.velocidad = velocidad;
    }

    public float getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(float velocidad) {
        this.velocidad = velocidad;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    public void encender(){
        System.out.println("Encendiendo procesador!!");
    }
    
}

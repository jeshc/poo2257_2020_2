/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.poo;

/**
 *
 * @author jeshc
 */
public class SmartPhone {
    private String marca;
    private float precio;
    private float tamanioPantalla; // pulgadas

    public SmartPhone() {
    }

    public SmartPhone(String marca, float precio, float tamanioPantalla) {
        this.marca = marca;
        this.precio = precio;
        this.tamanioPantalla = tamanioPantalla;
    }

    public float getTamanioPantalla() {
        return tamanioPantalla;
    }

    public void setTamanioPantalla(float tamanioPantalla) {
        this.tamanioPantalla = tamanioPantalla;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        String res = "Marca:"+this.marca;
        res = res +"\n precio:"+this.precio;
        res = res +"\n Tamaño de pantalla:"+this.tamanioPantalla+"\"" ;
        return res;
    }

    
    
    
    
}

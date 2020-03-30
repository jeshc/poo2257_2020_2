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
public class Persona {
    private String nombre;
    private int edad;
    private float estatura;

    public Persona() {
    }

    public Persona(String nombre, int edad, float estatura) {
        this.nombre = nombre;
        this.edad = edad;
        this.estatura = estatura;
    }

    public float getEstatura() {
        return estatura;
    }

    public void setEstatura(float estatura) {
        this.estatura = estatura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
       String res="Nombre:"+this.nombre;
       res = res +"\nEdad:"+this.edad;
       res = res +"\nEstatura:"+this.estatura;
       
       return res;
    }
    
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.equipo;

import ico.fes.componentes.Mouse;
import ico.fes.componentes.Procesador;
import ico.fes.componentes.Teclado;

/**
 *
 * @author usuario-49
 */
public class Computadora {

    private String marca;
    private String modelo;
    private Teclado teclado;
    private Procesador cpu;
    private Mouse raton;

    public Computadora() {
        teclado=new Teclado();
        cpu=new Procesador();
        raton=new Mouse();
    }

    public Computadora(String marca, String modelo, Teclado teclado,
            Procesador cpu, Mouse raton) {
        this.marca = marca;
        this.modelo = modelo;
        this.teclado = teclado;
        this.cpu = cpu;
        this.raton = raton;
    }

    public Mouse getRaton() {
        return raton;
    }

    public void setRaton(Mouse raton) {
        this.raton = raton;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Teclado getTeclado() {
        return teclado;
    }

    public void setTeclado(Teclado teclado) {
        this.teclado = teclado;
    }

    public Procesador getCpu() {
        return cpu;
    }

    public void setCpu(Procesador cpu) {
        this.cpu = cpu;
    }

    public void encender() {
        System.out.println("Encendiendo... la computadora");
    }

    @Override
    public String toString() {
        String data = "Marca:" + marca;
        data = data + "\nModedlo:" + modelo;
        data = data + "\nProcesador:" + cpu.getModelo() + " Velocidad:" + cpu.getVelocidad();
        data = data + "\nTeclado:" + teclado.getMarca() + " # teclas: " + teclado.getNumTeclas();
        data = data + "\nMouse:" + raton.getMarca() + "  # botonoes:" + raton.getNumBotones();
        data = data + "\n----------------------------------------------";

        return data;
    }

}

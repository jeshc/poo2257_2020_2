/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.poo.abstractas;

import javax.swing.JButton;
import javax.swing.JFrame;

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
        
        Guitarra g = new Guitarra(1998);
        
        JFrame ventana = new JFrame("Hola ventana");
        ventana.setSize(600, 400);
        ventana.getContentPane().add(new JButton("Presióname !!!"));
        ventana.setVisible(true);
        JButton btn= new JButton();
        btn.setSize(50,15);
        
        
    }
  
}

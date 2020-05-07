/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.poo.gui;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.HeadlessException;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import ico.fes.poo.gui.eventos.EventoGenerico;
import ico.fes.poo.gui.eventos.EventosVentana;
/**
 *
 * @author jeshc
 */
public class Ventana extends Frame {

    private String titulo;
    private int alto;
    private int ancho;
    private Button boton1;
    private Button boton2;

    public Ventana() throws HeadlessException {
    }

    public Ventana(int alto, int ancho, String title) throws HeadlessException {
        super(title);
        this.alto = alto;
        this.ancho = ancho;
        this.setSize(this.ancho, this.alto);
        boton1 = new Button("Presioname 1");
        boton2 = new Button("Presioname 2");
        this.setLayout(new BorderLayout());
        this.add("North", boton1);
        this.add("South", boton2);
        this.add("West", new Button("P-3"));
        this.add("East", new Button("Presioname 4"));

        boton1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                   // super.mouseClicked(e); //To change body of generated methods, choose Tools | Templates.
                   System.out.println("Evento clic raton");
                   System.out.println(e.getX());
                   System.out.println(e.getY());
                  
                   
            }
            
        });

        boton1.addActionListener(new EventoGenerico());
        this.addWindowListener(new EventosVentana());
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.poo.gui.eventos;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;


/**
 *
 * @author jeshc
 */
public class EventosVentana implements WindowListener{

    @Override
    public void windowOpened(WindowEvent e) {
        System.out.println("Evento windowOpened !!");
    }

    @Override
    public void windowClosing(WindowEvent e) {
        System.out.println("Eventoo windowClosing");
        System.exit(0);
    }

    @Override
    public void windowClosed(WindowEvent e) {
        System.out.println("Evento windowClosed ");
    }

    @Override
    public void windowIconified(WindowEvent e) {
        System.out.println("Evento windowIconified");
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        System.out.println("Evento windowDeiconified");
    }

    @Override
    public void windowActivated(WindowEvent e) {
        System.out.println("Evento windowActivated");
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        System.out.println("Evento windowDeactivated");
    }
    
}

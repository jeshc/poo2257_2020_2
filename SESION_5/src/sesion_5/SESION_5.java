/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sesion_5;

import ico.fes.componentes.Mouse;
import ico.fes.componentes.Procesador;
import ico.fes.componentes.Teclado;
import ico.fes.equipo.Computadora;

/**
 *
 * @author usuario-49
 */
public class SESION_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Computadora compu1 = new Computadora();
        compu1.setCpu(new Procesador("19", 6.3f));
        System.out.println(compu1);
        
        Computadora compu2=new Computadora("HP", "Pavillion", 
                            new Teclado("Akteck", 101), new Procesador("INtel i7", 3.5f), 
                            new Mouse("Genius", 3));
        
        System.out.println("Compu 2:\n"+compu2);
    }
    
}

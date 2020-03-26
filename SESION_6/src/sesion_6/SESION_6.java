/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sesion_6;

import ico.fes.is.marvel.SuperHeroe;

/**
 *
 * @author usuario-49
 */
public class SESION_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SuperHeroe spiderMan = new SuperHeroe();
        spiderMan.setNombre("Peter Parker");
        spiderMan.setEdad(16);
        spiderMan.setAlias("Spider-Man!!");
        spiderMan.setPoder("Trepa paredes y presiente el peligro!!");
        System.out.println(spiderMan);
        
        // otro ejemplo
        
        SuperHeroe ironman=new SuperHeroe("Iron man", "Suoer inteligencia y millonario", "Tony Stark", 46);
        System.out.println("Detalle:"+ironman);
    }
    
}

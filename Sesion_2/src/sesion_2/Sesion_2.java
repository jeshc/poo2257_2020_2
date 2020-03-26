/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sesion_2;

/**
 *
 * @author usuario-16
 */
public class Sesion_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int edad = 10;
        RelojDeManoDigital reloj1=new RelojDeManoDigital();
        RelojDeManoDigital reloj2= new RelojDeManoDigital("Casio", "Metal", true, 12, 0, 0, 7, 0, 0);
        //reloj1.hora=25;
        reloj1.setHora(25);
        
        
    }
    
}

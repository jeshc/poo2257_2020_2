/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sesion_3;
import ico.fes.poo.Reloj;
/**
 *
 * @author usuario-16
 */
public class Sesion_3 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Reloj reloj1=new Reloj();
        reloj1.setHora(14);
        reloj1.setMinuto(35);
        reloj1.setSegundo(56);
        reloj1.establecerAlarma(15, 0, 0);
        //System.out.println("Hora:" + reloj1.getHora() );
        reloj1.mostrarHora();
        int j=0;
        while(true){
            reloj1.incrementarSegundo();
            reloj1.mostrarHora();
        }
        
    }
}

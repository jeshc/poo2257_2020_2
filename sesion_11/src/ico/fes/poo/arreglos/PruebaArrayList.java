/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.poo.arreglos;
    
import ico.fes.poo.SmartPhone;
import java.util.ArrayList;

/**
 *
 * @author jeshc
 */
public class PruebaArrayList {
    public static void main(String[] args) {
        ArrayList<SmartPhone> celulares=new ArrayList();
        celulares.add( new SmartPhone("Nokia", 270.0f, 4.1f));
        celulares.add( new SmartPhone("Xiaomi", 12000.0f, 6.0f));
        
        for (SmartPhone cel : celulares) {
            System.out.println("-+-+-+-+-+-+-+-+-+");
            System.out.println(cel);
        }
        celulares.add(1, new SmartPhone("Motorola", 11000.0f, 5.3f));
        
        for (SmartPhone cel : celulares) {
            System.out.println("*****************");
            System.out.println(cel);
        }
        
        SmartPhone y=celulares.set(1, new SmartPhone("Alcatel", 7000.0f, 4.6f));
        System.out.println("???????????????? Y");
        System.out.println( y );
        
        for (SmartPhone cel : celulares) {
            System.out.println(";;;;;;;;;;;;;;;;;;;;");
            System.out.println(cel);
        }
        
        SmartPhone z= celulares.remove(1);
        System.out.println("?????? Z");
        System.out.println(z);
        for (SmartPhone cel : celulares) {
            System.out.println("&&&&&&&&&&&&&&&&&&&&&");
            System.out.println(cel);
        }
        
        SmartPhone r = celulares.get(0);
        System.out.println("?????????? R ");
        System.out.println(r);
        
        SmartPhone s = celulares.get(1);
        System.out.println("???????? S");
        System.out.println(s);
        celulares.set(1, new SmartPhone("ZTE", 5.0f, 3.0f));
        System.out.println("???????? S");
        System.out.println(s);
        
        for (SmartPhone cel : celulares) {
            System.out.println("%%%%%%%%%%%%%%%%%%%");
            System.out.println(cel);
        }
        
        //SmartPhone t = celulares.get(2);
        
        for (int i = 0; i < celulares.size(); i++) {
            System.out.println("++++++++++++++");
            System.out.println(celulares.get(i));
            
        }
        
    }
}

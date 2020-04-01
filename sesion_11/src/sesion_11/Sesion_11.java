/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sesion_11;

import ico.fes.poo.SmartPhone;
import java.util.ArrayList;

/**
 *
 * @author jeshc
 */
public class Sesion_11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       ArrayList <SmartPhone> ListaCells = new ArrayList();
        ListaCells.add(new SmartPhone("Apple", 22000.0f, 5.7f));
        ListaCells.add(new SmartPhone("Huawei", 12000.0f,7.0f));
        ListaCells.add( new SmartPhone("Samsung", 14000.0f, 7.3f));
        
        System.out.println("Tam. del arreglo:"+ ListaCells.size());
        
        SmartPhone x=ListaCells.get(0);
        System.out.println("--------------------");
        System.out.println(x);
        
        
        for (SmartPhone cell : ListaCells) {
            System.out.println("+-+-+-++-+-+-+-+");
            System.out.println(cell);
        }
        
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sesion_10;

import ico.fes.poo.Auto;
import ico.fes.poo.Persona;
import java.util.ArrayList;

/**
 *
 * @author jeshc
 */
public class Sesion_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [] numeros; // declaracion
        numeros = new int[10]; // creación de la instancia arreglo
        
        numeros[0]=2;
        numeros[8]=101;
        System.out.println(""+numeros[8]);
        
        //numeros[12]=33;
        
        float[] estaturas = new float[10];
        boolean [] banderas = new boolean[5];
        
        String [] nombres = new String[10];
        
        nombres[0]="José";
        nombres[1]="María";
        
        for (int i = 0; i < nombres.length; i++) { // for tradicional
            String n = nombres[i];
            System.out.println("Elemento "+i+":"+n);
        }
        System.out.println("------------------------------");
        for (String n : nombres) {  // for each
            System.out.println("Nombre:"+n);
        }
        
        System.out.println("------------------------------");
        // arreglo de 3 elementos de la clase persona.
        
//        String cadena=new String("Hola");
//        ArrayList lista=new ArrayList();
//        Auto carro=new Auto(4, "Chevrolet");
//        Persona p = new Persona("Juan", 22, 1.78f);
//        
//        System.out.println(cadena);
//        System.out.println(lista);
//        System.out.println(carro);
//        System.out.println(p);2

        Persona [] lista = new Persona[3];
        lista[0]= new Persona("Juan", 22, 1.67f);
        lista[1]= new Persona("Diana",23,1.65f);
        lista[2]= new Persona("Diego", 19, 1.81f);
        
        for (int i = 0; i < lista.length; i++) {
            Persona persona = lista[i];
            System.out.println("++++++++++++++++++++++");
            System.out.println(persona);
        }
        
        System.out.println("------ Ahora con for Each --------");
        
        for (Persona persona : lista) {
            System.out.println("$$$$$$$$$$$$$$$$$$$$$$$");
            System.out.println(persona);
        }
        
    }
    
}

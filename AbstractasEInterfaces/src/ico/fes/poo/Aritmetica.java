/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.poo;

/**
 *
 * @author jeshc
 */
public interface Aritmetica {
    public static final int SUMA = 1;
    public static final int RESTA = 2;
    public static final int MULTIPLICACION = 3;
    public static final int DIVISION = 4;
    
    
    public abstract float sumar( float a , float b);
    public float restar(float a , float b);
    public float multiplicar(float a , float b);
    public float dividir(float a , float b);
    
    
}

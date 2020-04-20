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
public class Aritmetica {

    private float op1;
    private float op2;
    private int operando; // 1 -> suma , 2-> resta, 3 -> multiplicacion y 4 -> division

    public Aritmetica() {
    }

    public Aritmetica(float op1, float op2, int operando) {
        this.op1 = op1;
        this.op2 = op2;
        this.operando = operando;
    }

    public int getOperando() {
        return operando;
    }

    public void setOperando(int operando) throws AritmeticaException  {
        if (operando < 1 || operando > 4) {
            throw new AritmeticaException();
        } else {
            this.operando = operando;
        }
    }

    public float getOp1() {
        return op1;
    }

    public void setOp1(float op1) {
        this.op1 = op1;
    }

    public float getOp2() {
        return op2;
    }

    public void setOp2(float op2) {
        this.op2 = op2;
    }

}

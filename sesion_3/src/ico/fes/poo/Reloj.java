/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.poo;

/**
 *
 * @author usuario-16
 */
public class Reloj {

    private int hora;
    private int minuto;
    private int segundo;
    private int horaAlarma;
    private int minutoAlarma;
    private int segundoAlarma;

    public Reloj() {
    }

    public Reloj(int hora, int minuto, int segundo, int horaAlarma, int minutoAlarma, int segundoAlarma) {
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
        this.horaAlarma = horaAlarma;
        this.minutoAlarma = minutoAlarma;
        this.segundoAlarma = segundoAlarma;
    }

    public int getSegundoAlarma() {
        return segundoAlarma;
    }

    public void setSegundoAlarma(int segundoAlarma) {
        this.segundoAlarma = segundoAlarma;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }

    public int getSegundo() {
        return segundo;
    }

    public void setSegundo(int segundo) {
        this.segundo = segundo;
    }

    public int getHoraAlarma() {
        return horaAlarma;
    }

    public void setHoraAlarma(int horaAlarma) {
        this.horaAlarma = horaAlarma;
    }

    public int getMinutoAlarma() {
        return minutoAlarma;
    }

    public void setMinutoAlarma(int minutoAlarma) {
        this.minutoAlarma = minutoAlarma;
    }

    public void reset() {
        this.setHora(0);
        this.setMinuto(0);
        this.setSegundo(0);
    }

    public void establecerAlarma(int h, int m, int s) {
        if (h >= 0 && h < 24) {
            this.setHoraAlarma(h);
        }
        if (m >= 0 && m < 60) {
            this.setMinutoAlarma(m);
        }
        if (s >= 0 && s < 60) {
            this.setSegundoAlarma(s);
        }
    }

    public void mostrarHora() {
        System.out.println(this.hora + ":" + this.minuto + ":" + this.segundo);
    }

    public void incrementarSegundo() {

        if (this.segundo <= 58) {
            this.segundo++; // this.segundo +=1; this.segundo=this.segundo +1  
        } else {
            this.segundo = 0;
            this.incrementarMinuto();
        }
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            Thread.currentThread().interrupt();
        }
    }
    
    void incrementarMinuto(){
        if(this.minuto <=58){
            this.minuto++;
        }else{
            this.minuto=0;
            //this.incrementarHora();
        }
    }

}

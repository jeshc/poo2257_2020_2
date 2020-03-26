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
public class RelojDeManoDigital {
    private String marca;
    private String materialCorrea;
    private boolean pruebaDeAgua;
    private int hora;
    private int minuto;
    private int segundo;
    private int horaAlarma;
    private int minutoAlarma;
    private int segundoAlarma;

    public RelojDeManoDigital() {
    }

    public RelojDeManoDigital(String marca, String materialCorrea, boolean pruebaDeAgua, int hora, int minuto, int segundo, int horaAlarma, int minutoAlarma, int segundoAlarma) {
        this.marca = marca;
        this.materialCorrea = materialCorrea;
        this.pruebaDeAgua = pruebaDeAgua;
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
        this.horaAlarma = horaAlarma;
        this.minutoAlarma = minutoAlarma;
        this.segundoAlarma = segundoAlarma;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMaterialCorrea() {
        return materialCorrea;
    }

    public void setMaterialCorrea(String materialCorrea) {
        this.materialCorrea = materialCorrea;
    }

    public boolean isPruebaDeAgua() {
        return pruebaDeAgua;
    }

    public void setPruebaDeAgua(boolean pruebaDeAgua) {
        this.pruebaDeAgua = pruebaDeAgua;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        if(hora >= 0 && hora < 24){
            this.hora = hora;
        }else{
            System.out.println("Valor fuera del rango 0 y 23");
        }
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

    public int getSegundoAlarma() {
        return segundoAlarma;
    }

    public void setSegundoAlarma(int segundoAlarma) {
        this.segundoAlarma = segundoAlarma;
    }
    
    
    
    
    
}

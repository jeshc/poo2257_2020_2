/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.is.foodtruck;

import ico.fes.is.factory.Snack;

/**
 *
 * @author jeshc
 */
public class Torta implements Snack{
    private String nombreEspecialidad; // toluqueña, cubana, etc
    private boolean rajas;
    private boolean chipotle;
    private boolean mayonesa;
    private boolean aguacate;

    public Torta() {
    }

    public Torta(String nombreEspecialidad, boolean rajas, boolean chipotle, boolean mayonesa, boolean aguacate) {
        this.nombreEspecialidad = nombreEspecialidad;
        this.rajas = rajas;
        this.chipotle = chipotle;
        this.mayonesa = mayonesa;
        this.aguacate = aguacate;
    }

    public boolean isAguacate() {
        return aguacate;
    }

    public void setAguacate(boolean aguacate) {
        this.aguacate = aguacate;
    }

    public String getNombreEspecialidad() {
        return nombreEspecialidad;
    }

    public void setNombreEspecialidad(String nombreEspecialidad) {
        this.nombreEspecialidad = nombreEspecialidad;
    }

    public boolean isRajas() {
        return rajas;
    }

    public void setRajas(boolean rajas) {
        this.rajas = rajas;
    }

    public boolean isChipotle() {
        return chipotle;
    }

    public void setChipotle(boolean chipotle) {
        this.chipotle = chipotle;
    }

    public boolean isMayonesa() {
        return mayonesa;
    }

    public void setMayonesa(boolean mayonesa) {
        this.mayonesa = mayonesa;
    }

    @Override
    public String toString() {
        return "Aqui esta su torta: " + "nombreEspecialidad=" + nombreEspecialidad + ", rajas=" + rajas + ", chipotle=" + chipotle + ", mayonesa=" + mayonesa + ", aguacate=" + aguacate ;
    }
    
    
}

package com.inforcap;

public class Bus extends Vehiculo {

    private int cantidadDeAsientos;

    public Bus(String color, String patente, int cantidadDeAsientos) {
        super(color, patente);
        this.cantidadDeAsientos = cantidadDeAsientos;
    }

    public int getCantidadDeAsientos() {
        return cantidadDeAsientos;
    }

    public void setCantidadDeAsientos(int cantidadDeAsientos) {
        this.cantidadDeAsientos = cantidadDeAsientos;
    }

    /**
     * @return
     */
    public int asientosDisponibles() { 
    
        return getCantidadDeAsientos();
    }
}

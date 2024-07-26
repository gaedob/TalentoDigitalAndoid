package com.inforcap;

//Clase Taxi
public class Taxi extends Vehiculo {

    private int valorPasaje;

    public Taxi(String color, String patente, int valorPasaje) {
        super(color, patente);
        this.valorPasaje = valorPasaje;
    }

    public int getValorPasaje() {
        return valorPasaje;
    }

    public void setValorPasaje(int valorPasaje) {
        this.valorPasaje = valorPasaje;
    }

    /**
     * Método pagarPasaje : Se ingresa el monto por parámetro, antes de pagar el
     * pasaje se debe validar que este monto sea mayor al valor del pasaje
     * inicial. * Si se cumple devolver el vuelto Si no se cumple devolver el
     * pasaje original
     *
     * @param pasaje
     * @return
     */
    public int pagarPasaje(int pasaje) {
        int vuelto = 0;
        if (pasaje >= getValorPasaje()) {
            vuelto = getValorPasaje() - pasaje;
        }
        return vuelto;
    }
}

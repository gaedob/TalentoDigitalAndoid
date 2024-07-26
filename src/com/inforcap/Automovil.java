package com.inforcap;

public class Automovil {

    private  String marca;
    private String modelo;
    private String color;
    private int velocidadActual;
    private boolean isMotorEncendido;
  

    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public int getVelocidadActual() {
        return velocidadActual;
    }
    public void setVelocidadActual(int velocidadActual) {
        this.velocidadActual = velocidadActual;
    }
    public boolean isMotorEncendido() {
        return isMotorEncendido;
    }
    /**
     * 
     * @param motorEncendido
     */
    public void setMotorEncendido(boolean motorEncendido) {
        this.isMotorEncendido = motorEncendido;
    }
    

}

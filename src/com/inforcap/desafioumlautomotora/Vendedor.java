package com.inforcap.desafioumlautomotora;

//Clase Vendedor
public class Vendedor extends Persona {

    private String direccion;

    public Vendedor(String rut, String nombre, int edad, String direccion) {
        super(rut, nombre, edad);
        this.direccion = direccion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}

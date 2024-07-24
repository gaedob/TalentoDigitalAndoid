package com.inforcap.test;

import com.inforcap.desafioautomotora.Automovil;

public class TestJava {

    private static Automovil automovil;

    public static void setAutomovil(Automovil automovil) {
        TestJava.automovil = automovil;
        TestJava.automovil.setColor("Rojo");

    }

    public static Automovil getAutomovil() {
        return automovil;
    }

    private static String marca;

    public static void setMarca(String marca) {
        TestJava.marca = marca;
    }

    public static String getMarca() {
        return marca;
    }

    public static void main(String[] args) {
        Automovil myAutomovil = new Automovil();

        TestJava.setAutomovil(myAutomovil);

        System.out.println(TestJava.getAutomovil().getColor());
    }

}

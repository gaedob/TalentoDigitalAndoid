package com.inforcap.desafiotiendaindianjeans;

class Configurador {

    private static Configurador config;

    //Constructor privado
    private Configurador() {}

    //Método estático encapsulador para acceder a la instancia única
    public static Configurador getConfig() {
        if (config == null) {
            config = new Configurador();
        }
        return config;
    }
}

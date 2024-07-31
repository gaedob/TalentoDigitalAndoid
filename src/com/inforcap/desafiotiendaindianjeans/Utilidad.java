package com.inforcap.desafiotiendaindianjeans;

public class Utilidad{

    public Utilidad() {
    }

   public static void limpiezaPantalla() {
    try {
        final String os = System.getProperty("os.name");

        if (os.contains("Windows")) {
            // Método para limpiar consola en Windows
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } else {
            // Método para limpiar consola en Unix/Linux/MacOS
            System.out.print("\033[H\033[2J");
            System.out.flush();
        }
    } catch (Exception e) {
        // Manejo de excepciones
        e.printStackTrace();
    }
}



 public static void tiempoEspera(int seconds) {
       
        for (int i = seconds; i >= 0; i--) {
            try {
                System.out.print("\r" + i + " segundo de espera !");
                System.out.flush(); // Asegura que el texto se imprima inmediatamente
                Thread.sleep(1000); // Espera 1 segundo
            } catch (InterruptedException e) {
                System.err.print("Cuenta Interrumpida");
                Thread.currentThread().interrupt(); // Vuelve a establecer el estado de interrupción
                return;
            }
        }
       // System.out.println("Countdown finished!");
    }

}

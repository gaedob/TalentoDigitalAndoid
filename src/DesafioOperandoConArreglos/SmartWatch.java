package DesafioOperandoConArreglos;
import java.util.ArrayList;

public class SmartWatch {

    public static void main(String[] args) {
        // Verificamos que se hayan pasado parámetros
        if (args.length == 0) {
            System.out.println("No se han proporcionado pasos diarios como parámetro.");
            return;
        }

        // Convertimos los argumentos de la línea de comandos a un arreglo de enteros
        ArrayList<Integer> pasosDiarios = new ArrayList<>();
        for (String arg : args) {
            try {
                int paso = Integer.parseInt(arg);
                pasosDiarios.add(paso);
            } catch (NumberFormatException e) {
                System.out.println("Error: '" + arg + "' no es un número entero válido.");
                return;
            }
        }

        // Filtramos los pasos fuera del rango
        ArrayList<Integer> pasosFiltrados = clearSteps(pasosDiarios);

        // Calculamos el promedio de los pasos filtrados
        double promedioPasos = calcularPromedio(pasosFiltrados);

        // Mostramos el resultado en pantalla
        System.out.println("El promedio de pasos diarios es: " + promedioPasos);
    }

    // Método para filtrar los pasos que están fuera del rango aceptable
    public static ArrayList<Integer> clearSteps(ArrayList<Integer> pasos) {
        ArrayList<Integer> pasosFiltrados = new ArrayList<>();
        for (int paso : pasos) {
            if (paso >= 200 && paso <= 100000) {
                pasosFiltrados.add(paso);
            }
        }
        return pasosFiltrados;
    }

    // Método para calcular el promedio de un arreglo de enteros
    public static double calcularPromedio(ArrayList<Integer> pasos) {
        if (pasos.isEmpty()) {
            return 0;
        }

        int suma = 0;
        for (int paso : pasos) {
            suma += paso;
        }

        return (double) suma / pasos.size();
    }
}

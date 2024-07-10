
public class Visitas {

    public static void main(String[] args) {
        
        // Verificamos que se hayan pasado parámetros
        if (args.length == 0) {
            System.out.println("No se han proporcionado visitas diarias como parámetro.");
            return;
        }

        // Convertimos los argumentos de la línea de comandos a un arreglo de enteros
        int[] visitasDiarias = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            try {
                visitasDiarias[i] = Integer.parseInt(args[i]);
            } catch (NumberFormatException e) {
                System.out.println("Error: '" + args[i] + "' no es un número entero válido.");
                return;
            }
        }

        // Calculamos el promedio de las visitas diarias
        double promedioVisitas = promedio(visitasDiarias);

        // Mostramos el resultado en pantalla
        System.out.println("El promedio de visitas diarias es: " + promedioVisitas);
    }

    // Método para calcular el promedio de un arreglo de enteros
    public static double promedio(int[] visitas) {
        if (visitas.length == 0) {
            return 0;
        }

        int suma = 0;
        for (int visita : visitas) {
            suma += visita;
        }

        return (double) suma / visitas.length;
    }
}

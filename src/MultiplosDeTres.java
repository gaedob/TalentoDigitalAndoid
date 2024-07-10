public class MultiplosDeTres {

    public static void main(String[] args) {
        // Verificar si se han proporcionado argumentos
        if (args.length == 0) {
            System.out.println("No se han proporcionado números como parámetro.");
            return;
        }

        // Convertir argumentos de la línea de comandos a un arreglo de enteros
        int[] numeros = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            try {
                numeros[i] = Integer.parseInt(args[i]);
            } catch (NumberFormatException e) {
                System.out.println("Error: '" + args[i] + "' no es un número entero válido.");
                return;
            }
        }

        // Calcular la suma de los múltiplos de tres
        int sumaMultiplosTres = sumaMultiplosDeTres(numeros);

        // Mostrar el resultado en pantalla
        System.out.println("La suma de los múltiplos de tres es: " + sumaMultiplosTres);
    }

    // Método para sumar los múltiplos de tres en un arreglo de enteros
    public static int sumaMultiplosDeTres(int[] numeros) {
        int suma = 0;
        for (int num : numeros) {
            if (num % 3 == 0) { // Verificar si es múltiplo de tres
                suma += num;
            }
        }
        return suma;
    }
}


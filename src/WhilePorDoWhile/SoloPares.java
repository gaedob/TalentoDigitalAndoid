package WhilePorDoWhile;

import java.util.Scanner;

public class SoloPares {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese el valor de n
        System.out.print("Ingrese el valor de n: ");
        int n = scanner.nextInt();

        // Mostrar los primeros n números pares
        mostrarPares(n);
    }

    // Método para mostrar los primeros n números pares
    public static void mostrarPares(int n) {
        for (int i = 0; i < n; i++) {
             System.out.println(i);
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}

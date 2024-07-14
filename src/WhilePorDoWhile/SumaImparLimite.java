package WhilePorDoWhile;

import java.util.Scanner;

public class SumaImparLimite {

    public static void main(String[] args) {

     Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese el valor de n
        System.out.print("Ingrese el valor  inferior: ");
        int inferior = scanner.nextInt();

        System.out.print("Ingrese el valor  superior: ");
        int superior = scanner.nextInt();


        // Mostrar los primeros n números pares
        mostrarImpoares(inferior, superior);

    }

    public static void  mostrarImpoares(int inferior, int superior) {
        int suma = 0;
        for (int num = inferior; num < superior; num++ ) {
            if (num % 2 != 0) { // Verificar si es múltiplo de tres
                suma += num;
            }
        }
        System.out.println( suma);
    }


}

package WhilePorDoWhile;

import java.util.Scanner;

public class SumaImpar {

    public static void main(String[] args) {

     Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese el valor de n
        System.out.print("Ingrese el valor de n: ");
        int n = scanner.nextInt();

        // Mostrar los primeros n números pares
        mostrarImpoares(n);

    }

    
        public static void  mostrarImpoares(int SumaImpar) {
            int suma = 0;
            for (int num = 0; num < SumaImpar; num++ ) {
                if (num % 2 != 0) { // Verificar si es múltiplo de tres
                    suma += num;
                }
            }
            System.out.println( suma);
        }



}

package WhilePorDoWhile;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Pedir al usuario que ingrese el valor de n
        System.out.print("Ingrese elementos a mostrar Fibonacci: ");
        int fibo = scanner.nextInt();
        // Mostrar los primeros n números pares
        mostrarFibos(fibo);

    }
    private static void mostrarFibos(int fibo) {
        // TODO Auto-generated method stub
        int suma = 0;
        for (int num = 0; num <= fibo; num++) {
            suma = fibo(num);
            System.out.println(suma);
        }
    }

    private static int fibo(int valor) {
        int sumafibo = 0;
        int ciclofibo = 0;

        if (valor == 0) {
            sumafibo =  0;
        }

        if (valor == 1) {
            sumafibo = 1;
        }
        else{

        while (ciclofibo != valor) {

            sumafibo =  fibo(valor - 1) + fibo(valor - 2);
            ciclofibo++;
        }
    }
        return sumafibo;
    }

}

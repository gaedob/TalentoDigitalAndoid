package DesafioPatrones;

import java.util.Scanner;

public class Patrones {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de elementos a mostrar: ");
        int n = scanner.nextInt();

        patron1(n);
        patron2(n);
        patron3(n);

    }

    static void patron1(int n) {
        for (int i = 1;i <= n; i++){
            if (i % 2 == 0) {
                System.out.print(".");
            }else {
                System.out.print("*");
            }
        }
        System.out.println();
    }

    static void patron2(int n) {

        for (int i = 1;i <= n; i++){
            if (i % 2 == 0) {
                System.out.print("1234");
            }else {
                System.out.print("1234");
            }
        }
        System.out.println();

    }
  
    static void patron3(int n) {

        for (int i = 1;i <= n; i++){
            if (i % 2 == 0) {
                System.out.print("*");
            }else {
                System.out.print("||");
            }
        }
        System.out.println();

    }
}

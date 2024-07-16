package DesafioPatrones;

import java.util.Scanner;

public class PatronesAnidados {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de elementos a mostrar: ");
        int n = scanner.nextInt();

        patronO(n, "*");
        patronZ(n);
        patronX(n);
        patronAlgo(n);

    }

    static void patronO(int n, String patron) {
        for (int i = 0; i < n; i++) {
            System.out.print(patron);
        }
        System.out.println();

        for (int i = 0; i < n - 2; i++) {
            System.out.print(patron);
            for (int j = 0; j < n - 2; j++) {
                System.out.print(" ");
            }
            System.out.print(patron);
            System.out.println();
        }
        if (n > 1) {
            for (int i = 0; i < n; i++) {
                System.out.print(patron);
            }
        }
        System.out.println();
    }

    static void patronZ(int n) {
        String patron = "z";

        for (int i = 0; i < n; i++) {
            System.out.print(patron);
        }
        System.out.println();

        for (int i = 0; i < n - 2; i++) {

            for (int j = i; j < n - 2; j++) {
                System.out.print(" ");
            }
            System.out.print(patron);

            System.out.println();
        }

        if (n > 1) {
            for (int i = 0; i < n; i++) {
                System.out.print(patron);
            }
        }
        System.out.println();

    }

    public static boolean primeNumber(int num) {
        boolean prime = true;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                prime = false;
                break;
            }
        }
        return prime;
    }

    // static String patronPrimo(int num) {

    //     if (primeNumber(num)) {

    //         System.out.print(" ");

    //             for (int j = i; j < n - 2; j++) {

    //                 System.out.print(" ");
                   
    //             }

    //     }
    //     else{

    //     }

    //     return "";

    // }
    static void patroncabeceraX(int n, String patrString){

        for (int i = 0; i < n-2 ; i++) {
            System.out.print(patrString);

            for (int j = i; j < n - 2; j++) {

                System.out.print(" ");
                
            }
            System.out.print(patrString);
            System.out.println();
            
        }
   

    }

    static void patronX(int n) {
        String patron = "x";

        if (n == 1 || n == 2) {
            patronO(n, patron);
            return;
        }

        if (n > 2) {
            for (int i = 0; i < n ; i++) {

               if (n%2 == 0) patroncabeceraX(n,patron);

            }
        }

        // if (n > 2) {
        //     for (int i = 0; i < n - 2; i++) {

        //         System.out.print(i);

        //         for (int j = i; j < n - 2; j++) {

        //             System.out.print(" ");
        //             i = j;
        //         }

        //         System.out.println();
        //     }
        // }
        // if(n>3)
        // {
        // System.out.println();

        // for (int i = 0; i < n-2; i++){

        // // System.out.print(patron);
        // System.out.print(" ");
        // for (int j = i; j < n-2; j++){
        // System.out.print(patron);
        // }

        // System.out.println();
        // }
        // }

        // Centro

        // for (int i = 0; i < n-2; i++){

        // for (int j = 0; j < n-2; j++){
        // System.out.print(" ");

        // }
        // System.out.print(patron);

        // System.out.println();
        // }

        // if(n>=3)
        // {
        // for (int i = 0; i < n-2; i++){

        // System.out.print(patron);
        // for (int j = 0; j < n-2; j++){
        // System.out.print(" ");
        // }
        // System.out.print(patron);
        // System.out.println();
        // }
        // }
        // System.out.println();

    }

    static void patronAlgo(int n) {

    }

}

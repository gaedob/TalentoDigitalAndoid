package desafioexcepciones;

import java.util.Scanner;

public class LibroVenta {

    private String nombreVenta;
    private String fechaVenta = "01102020";

    public LibroVenta() {
    }

    public LibroVenta(String nombreVenta, String fechaVenta) {
        this.nombreVenta = nombreVenta;
        this.fechaVenta = fechaVenta;
    }

    public String getNombreVenta() {
        return this.nombreVenta;
    }

    public void setNombreVenta(String nombreVenta) {
        this.nombreVenta = nombreVenta;
    }

    public String getFechaVenta() {
        return this.fechaVenta;
    }

    public void setFechaVenta(String fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    public void guardarVenta(Cliente cliente, Vehiculo vehiculo) {

    }

    @Override
    public String toString() {
        return "{"
                + " nombreVenta='" + getNombreVenta() + "'"
                + ", fechaVenta='" + getFechaVenta() + "'"
                + "}";
    }

    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresando una Venta");

        // Pedir al usuario que ingrese el valor de n
        System.out.print("Ingrese Edad del Cliente: ");
        int n = 0;
        try {
            n = scanner.nextInt();
            
            if (n <= 0) {
                System.out.println("Debe ingresa un número");
                return;
            }

        } catch (Exception e) {
            System.out.println("Debe ingresa un número");
            return;
        }
        
        System.out.print("Ingrese Datos del Vhieculo - Patente: ");

        String patente = scanner.nextLine();

        try {
            if (patente.isBlank() || patente.isEmpty()) {
                System.out.println("Debe ingresa una Patente ");
                return;
            }

        } catch (Exception e) {
            System.out.println("Debe ingresa una patente válida");
        }

        scanner.close();

        // Mostrar los primeros n números pares
        //  mostrarPares(n);
    }

}

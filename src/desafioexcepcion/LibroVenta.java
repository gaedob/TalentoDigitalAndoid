package desafioexcepcion;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
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

        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy/dd/MM HH:mm:ss");
        String formattedDate = formatter.format(date);
        this.setFechaVenta(formattedDate);
        return this.fechaVenta;
    }

    public void setFechaVenta(String fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    public void guardarVenta(Cliente cliente, Vehiculo vehiculo) {

        GestionaArchivoTexto gTexto = new GestionaArchivoTexto();

        ArrayList<String> venta = new ArrayList<>();
        venta.add("Nombre Venta:" + this.getNombreVenta().substring(0, this.getNombreVenta().length()-4));
        venta.add("Patente : "+ vehiculo.getPatente());
        venta.add("Edad Cliente: "+ cliente.getEdad() );
        venta.add("Fehca Venta: " + this.getFechaVenta());
     
        gTexto.crearArchivo("ficheros", this.getNombreVenta(), venta);
        
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
        Cliente cliente = new Cliente();
        scanner.useDelimiter("\n");
        // Pedir al usuario que ingrese el valor de n
        System.out.println("");
        System.out.println("*********************************************");
        System.out.println("************* Sistema de Ventas *************");
        System.out.println("************** Enter continua ****************");



        if (scanner.hasNextLine()) {
            scanner.nextLine(); // Consume el carácter de nueva línea si existe
        }
        System.out.print("Ingrese Edad del Cliente: ");
        int edad;
        try {
            edad = scanner.nextInt();

            if (edad <= 0) {
                throw new ExceptionNumero("Exception Edad: El número no puede ser menor o igual a cero");
            }

            cliente.setEdad(edad);
        
        }catch (ExceptionNumero e) {
            System.out.println(e.getMessage());
            return ;
        } 
        catch (Exception e) {
            System.out.println("Debe ingresa un número");
            return;
        }

        
        if (scanner.hasNextLine()) {
            scanner.nextLine(); // Consume el carácter de nueva línea si existe
        }
        System.out.print("Ingrese Datos del Vehiculo - Patente: ");

        String patente = scanner.nextLine();

        try {
            if (patente.isBlank() || patente.isEmpty()) {
                throw new ExceptionPatente("Exception Patente: Debe ingresa una Patente válida");
            }

        }catch (ExceptionPatente e) {
            System.out.println(e.getMessage());
            return;
        }
         catch (Exception e) {
            System.out.println("Debe ingresa una patente válida");
            return;
        }
        Vehiculo vehiculo = new  Vehiculo("azul",patente  );


        System.out.print("Ingrese Nombre de la Venta (.txt): ");

        String nombreVenta = scanner.nextLine();

        try {
            if (nombreVenta.isBlank() || nombreVenta.isEmpty()) {
                throw new ExceptionVenta("Exception Venta: Debe ingresa una venta válida");
              
            }
        }catch (ExceptionVenta e) {
            System.out.println(e.getMessage());
            return;
        } 
        catch (Exception e) {
            System.out.println("Debe ingresa una patente válida");
            return;
        }

        
        LibroVenta lv = new LibroVenta();
        lv.setNombreVenta(nombreVenta);
        lv.guardarVenta(cliente, vehiculo);
        scanner.close();
        System.out.println("**************************");
        System.out.println("Venta realizada con éxtito");
        System.out.println("**************************");
        System.out.println("");


        // Mostrar los primeros n números pares
        //  mostrarPares(n);
    }

}

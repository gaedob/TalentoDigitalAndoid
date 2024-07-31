package com.inforcap.desafiotiendaindianjeans;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Menu {

    public static Scanner scanner = new Scanner(System.in);
    public static ProductoServicio productoServicio = new ProductoServicio();
    private static ExportadorTxt exp = new ExportadorTxt();
    private static ArchivoServicio archivoServicio = new ArchivoServicio();

    public static void Principal() {

        System.out.println("");
        System.out.println("");
        System.out.println(" -- Menu de Productos -- ");
        System.out.println("[1] Listar Producto");
        System.out.println("[2] Agregar Producto");
        System.out.println("[3] Exportar Datos");
        System.out.println("[4] Cargar Datos");
        System.out.println("[5] Editar Datos");
        System.out.println("[6] Salir");
        System.out.print("Ingrese una opción:");

    }

    private static void clearScreen() {
        Utilidad.tiempoEspera(3);
        Utilidad.limpiezaPantalla();
        Principal();
    }

    public static void listarProducto() {

        System.out.println("");
        System.out.println(" --- 1 Listar Productos ---- ");

        productoServicio.listarProductos();

        clearScreen();

    }

    public static void cambiarProduct(String opcion, Producto productoAntiguo) {


        int opcionInt = Integer.parseInt(opcion);
        //String newValue;
        Producto productoNuevo = productoAntiguo;

        switch (opcionInt) {
            case 1 -> {
                System.out.print("[1] -  Articulo, nuevo valor :");
                productoNuevo.setArticulo(scanner.nextLine());
                break;
            }
            case 2 -> {
                System.out.print("[2] -  Precio, nuevo valor :");
                productoNuevo.setPrecio(scanner.nextLine());
                break;
            }
            case 3 -> {
                System.out.print("[3] -  Descripcion, nuevo valor :");
                productoNuevo.setDescripcion(scanner.nextLine());
                break;
            }
            case 4 -> {
                System.out.print("[4] -  Código, nuevo valor :");
                productoNuevo.setCodigo(scanner.nextLine());
                break;
            }
            case 5 -> {
                System.out.print("[5] -  Talla, nuevo valor :");
                productoNuevo.setTalla(scanner.nextLine());
                break;
            }
            case 6 -> {
                System.out.print("[6] -  Marca, nuevo valor :");
                productoNuevo.setMarca(scanner.nextLine());
                break;
            }
            case 7 -> {
                System.out.print("[7] -  Color, nuevo valor :");

                productoNuevo.setColo(scanner.nextLine());
                break;
            }

            default ->
                throw new AssertionError();
        }
        productoServicio.presentarDatosProductoPantalla(productoNuevo);
        productoServicio.cambiaPrimerProductoencontrado(productoAntiguo, productoNuevo);

    }

    public static void presentarProducto(Producto producto) {

        System.out.println("");

        if (producto == null) {
            System.out.println("Producto No econtrado...");
            return;
        }

        productoServicio.presentarDatosProductoPantalla(producto);

        System.out.print("Selecione una opción [1-7] para modificar o letra S (Salir) :");

        char letraSalir = 'S';
        try {
            String opcion = scanner.nextLine();

            if (opcion.length() > 1) {
                System.out.println("Opción o número incorrecto, 1 -7 , S (Salir) ...!!!");
                return;

            }
            boolean contieneLetra = opcion.contains(String.valueOf(letraSalir));
            if (contieneLetra) {
                return;
            }

            boolean contieneNumero = Pattern.compile("[1-7]").matcher(opcion).find();

            if (!contieneLetra && !contieneNumero) {
                System.out.println("Opción o número incorrecto, 1 -7 , S (Salir) ...!!!");
                return;
            }

            cambiarProduct(opcion,producto);


        } catch (Exception e) {

            System.out.println("Opción o número incorrecto 1-...!!!");

        }

    }

    public static void exportarProducto() {

        System.out.println("");
        System.out.println(" --- 3 Exportar Productos ---- ");
        exp.setListaProductos(productoServicio.getListaProductos());
        exp.setFichero("ListaProductos.txt");
        exp.exportar();

        clearScreen();
    }

    public static void editarDatos() {

        System.out.println(" --- 5 Editar Datos ---- ");

        if (scanner.hasNextLine()) {
            // Consume el carácter de nueva línea si existe
            scanner.nextLine();
        }

        System.out.print("Ingrese código del producto: ");

        String codigo = scanner.nextLine();

        Producto pr = productoServicio.buscarProductoCodigo(codigo);

        presentarProducto(pr);

        clearScreen();

    }

    public static void agregarProducto() {

        Producto pr1 = new Producto();

        System.out.println(" --- 2 Crear Productos ---- ");

        if (scanner.hasNextLine()) {
            // Consume el carácter de nueva línea si existe
            scanner.nextLine();
        }

        System.out.print("Ingresar nombre articulo :");
        pr1.setArticulo(scanner.nextLine());

        System.out.print("Ingresa precio :");
        pr1.setPrecio(scanner.nextLine());

        System.out.print("Ingresa descripción :");
        pr1.setDescripcion(scanner.nextLine());

        System.out.print("Ingresa código :");
        pr1.setCodigo(scanner.nextLine());

        System.out.print("Ingresa talla :");
        pr1.setTalla(scanner.nextLine());

        System.out.print("Ingresa marca :");
        pr1.setMarca(scanner.nextLine());

        System.out.print("Ingresa color :");
        pr1.setColo(scanner.nextLine());

        productoServicio.agregarProductos(pr1);
        
        System.out.println(" ---- -------- ----");
        productoServicio.presentarDatosProductoPantalla(pr1);
       

        clearScreen();
    }

    public static void importarDatos() {

        System.out.println("");
        System.out.println(" --- 4 Cargar Datos ---- ");

        System.out.println("Ingresa la ruta en donde se encuentra el archivo " + archivoServicio.getNombreArchivo());
        System.out.print("Un dato, puede estar en miDirectorio :" );

        if (scanner.hasNextLine()) {
            // Consume el carácter de nueva línea si existe
            scanner.nextLine();
        }

        archivoServicio.setRutaArchivo(scanner.nextLine());

        if (archivoServicio.cargarDatos(productoServicio)) {
            System.out.println("Datos cargados correctamente en la lista");
        }

        clearScreen();

    }

    public static void main(String[] args) {

        Principal();
        try {
            int opcion = 0;
            opcion = scanner.nextInt();
            while (opcion != 6) {
                Utilidad.limpiezaPantalla();

                switch (opcion) {
                    case 1:
                        listarProducto();
                        break;
                    case 2:
                        agregarProducto();
                        break;
                    case 3:
                        exportarProducto();
                    case 4:
                        importarDatos();
                        break;
                    case 5:
                        editarDatos();
                        break;
                    default:
                        Principal();

                }
                opcion = scanner.nextInt();

            }
        } catch (Exception e) {
            System.out.println("");
            System.out.println("Debe ingresa un número (1 - 6) ...");
           
            return;
        } finally {
            scanner.close();
        }
    }
}

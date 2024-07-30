package com.inforcap.desafiotiendaindianjeans;

import java.util.Scanner;

public class Menu {

    public static Scanner scanner = new Scanner(System.in);
    public static ProductoServicio productoServicio = new  ProductoServicio();
    public static  ExportadorTxt exp = new ExportadorTxt();

    public static void Principal() {

        System.out.println("");
        System.out.println("");
        System.out.println(" -- Menu de Productos -- ");
        System.out.println("[1] Listar Producto");
        System.out.println("[2] Agregar Producto");
        System.out.println("[3] Exportar Datos");
        System.out.println("[4] Salir");
        System.out.print("Ingrese una opción:");


    }

    public static void listarProducto() {

        System.out.println("");
        System.out.println(" --- 1 Listar Productos ---- ");
   

        productoServicio.listarProductos();

       
        Utilidad.tiempoEspera(4);
        Utilidad.limpiezaPantalla();
        Principal();

    }

    public static void exportarProducto() {

        System.out.println("");
        System.out.println(" --- 3 Exportar Productos ---- ");
        exp.setListaProductos(productoServicio.getListaProductos());
        exp.setFichero("ListaProductos.txt");
        exp.exportar();
       
        Utilidad.tiempoEspera(4);
        Utilidad.limpiezaPantalla();
        Principal();

    }

    public static void agregarProducto() {

        Producto pr1 = new Producto();
        
        System.out.println(" --- 2 Crear Productos ---- ");

        if (scanner.hasNextLine()) {
            // Consume el carácter de nueva línea si existe
            scanner.nextLine(); 
         }

        System.out.print("Ingresar nombre articulo:");
        pr1.setArticulo(scanner.nextLine());

        System.out.print("Ingresa precio:");
        pr1.setPrecio(scanner.nextLine());

        System.out.print("Ingresa descripción:");
        pr1.setDescripcion(scanner.nextLine());


        System.out.print("Ingresa código:");
        pr1.setCodigo(scanner.nextLine());

        System.out.print("Ingresa talla:");
        pr1.setTalla(scanner.nextLine());

        System.out.print("Ingresa marca:");
        pr1.setMarca(scanner.nextLine());

        System.out.print("Ingresa color:");
        pr1.setColo(scanner.nextLine());



        
        productoServicio.agregarProductos(pr1);
        System.out.println("");
        System.out.println("Articulo :");
        System.out.println(pr1.toString());

       
        Utilidad.tiempoEspera(4);
        Utilidad.limpiezaPantalla();
        Principal();
    }

    public static void main(String[] args) {
        Principal();
        try {
            int opcion = 0;
            opcion = scanner.nextInt();
            while (opcion != 4) {
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
                        break;
                    default:
                        Principal();
                        
                }
                opcion = scanner.nextInt();


            }
        } catch (Exception e) {
            System.out.println("Debe ingresa un número");
            return;
        } finally {
            scanner.close();
        }
    }
}

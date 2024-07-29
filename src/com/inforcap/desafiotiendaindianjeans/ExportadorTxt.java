package com.inforcap.desafiotiendaindianjeans;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

public class ExportadorTxt extends ExportarTxt {

    private ArrayList<Producto> listaProductos;
    private final String directorio = "src/DirectorioExportadorTXT";
    private String fichero;

    public String getFichero() {
        return this.fichero;
    }

    public void setFichero(String fichero) {
        this.fichero = fichero;
    }

    public String getDirectorio() {
        return this.directorio;
    }

    // public void setDirectorio(String directorio) {
    //     this.directorio = directorio;
    // }
    public ArrayList<Producto> getListaProductos() {
        return this.listaProductos;
    }

    public void setListaProductos(ArrayList<Producto> listaProductos) {
        this.listaProductos = listaProductos;
    }

    @Override
    public void exportar() {

        File file = crearDirectorio();

       

        if (file != null && ( fichero != null && !fichero.isEmpty() && !fichero.isBlank() )) {
            if (escribirArchivo(file)) {
                System.out.println("Archivo creado y datos escritos en " + file.getPath());

            }
            else{
                System.out.println("Error al escribir en el archivo...");
            }

        } else {
            System.out.println("No existe directorio o Fiechero..." );

        }

    }

    private boolean escribirArchivo(File dir) {

        File file = new File(dir, getFichero());

        ArrayList<Producto> lista = getListaProductos();
        if (lista == null )
            return false;

        // Escribir en el archivo
        try (FileWriter writer = new FileWriter(file)) {

            Iterator<Producto> iterator = lista.iterator();
            while (iterator.hasNext()) {
                writer.write(iterator.next() + System.lineSeparator());
            }
            writer.close();

        } catch (IOException e) {
            
            return false;
        }

        return true;

    }

    private File crearDirectorio() {
        File dir = new File(getDirectorio());
        // Validar si el directorio existe
        if (!dir.exists()) {
            if (dir.mkdirs()) {
                return dir;
                //System.out.println("Directorio creado: " + directorio);
            } else {
                //System.out.println("Error al crear directorio");
                return null;

            }
        }

        return dir;
    }

    // Validar que el nombre del fichero termine con ".txt"
    // if (!fichero.endsWith(".txt")) {
    //     System.out.println("El nombre del fichero debe terminar con \".txt\"");
    //     return;
    // }
}

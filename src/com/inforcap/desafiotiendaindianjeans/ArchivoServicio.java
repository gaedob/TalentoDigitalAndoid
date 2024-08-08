package com.inforcap.desafiotiendaindianjeans;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Logger;


public class ArchivoServicio {

    private static  final String NOMBREARCHIVO = "/ProductosImportados.csv";
    private String rutaArchivo;
    private  final   Logger logger = Logger.getLogger(getClass().getName());


    public ArchivoServicio() {
      // TODO document why this constructor is empty
    }
    private Producto parseProducto(String linea) {
        String[] partes = linea.split(",");

        if (partes.length == 7) {
            return new Producto(
                    partes[0].trim(),
                    partes[1].trim(),
                    partes[2].trim(),
                    partes[3].trim(),
                    partes[4].trim(),
                    partes[5].trim(),
                    partes[6].trim()
            );
        } else {
            return null;
        }
    }

    public boolean cargarDatos(ProductoServicio productoServicio) {

        File file = new File("src/" + rutaArchivo +  NOMBREARCHIVO);

        // Validar si el fichero existe
        if (!file.exists()) {
            logger.info("El fichero ingresado no existe");
            //System.out.println("El fichero ingresado no existe");
            return false;
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
              Producto pr = parseProducto(line); //Jeans,15000,Son unos jeans maravillosos,1500,42,Levos,Azul Marino
              if (pr != null){
                productoServicio.agregarProductos(pr);
                pr.toString();
              }

            }
           
            reader.close();
        
            logger.info("Datos cargados correctamente en la lista"); 
            return true;
           // System.out.println("Datos cargados correctamente en la lista ");
        } catch (IOException e) {
            logger.warning("Error al leer el archivo: " + e.getMessage());  
            return false;

            //System.out.println("Error al leer el archivo: " + e.getMessage());
        }
        

    }

    public String getNombreArchivo() {
        return ArchivoServicio.NOMBREARCHIVO;
    }

    public String getRutaArchivo() {
        return this.rutaArchivo;
    }

    public void setRutaArchivo(String rutaArchivo) {
        this.rutaArchivo = rutaArchivo;
    }


}

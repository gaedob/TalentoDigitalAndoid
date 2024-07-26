package desafioexcepcion;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

public class GestionaArchivoTexto {

        public  void crearArchivo(String directorio, String fichero, ArrayList<String> venta) {
            File dir = new File("src/" + directorio);
    
            // Validar si el directorio existe
            if (!dir.exists()) {
                if (dir.mkdirs()) {
                    System.out.println("Directorio creado: " + directorio);
                } else {
                    System.out.println("Error al crear directorio");
                    return;
                }
            }
    
            // Validar que el nombre del fichero termine con ".txt"
            if (!fichero.endsWith(".txt")) {
                System.out.println("El nombre del fichero debe terminar con \".txt\"");
                return;
            }
    
            File file = new File(dir, fichero);

             // Validar si el fichero existe
             if (file.exists()) {
                System.out.println("El fichero ingresado existe");
                return;
            }

    
            // Escribir en el archivo
            try (FileWriter writer = new FileWriter(file)) {
                Iterator<String> iterator = venta.iterator();
                while (iterator.hasNext()) {
                    writer.write(iterator.next() + System.lineSeparator());
                }
                writer.close();
    
                System.out.println("Archivo creado y datos escritos en " + file.getPath());
            } catch (IOException e) {
                System.out.println("Error al escribir en el archivo: " + e.getMessage());
            }
        }
    
}

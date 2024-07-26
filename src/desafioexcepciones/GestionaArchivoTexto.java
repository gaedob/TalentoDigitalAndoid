package desafioexcepciones;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

public class GestionaArchivoTexto {

        public  void crearArchivo(String directorio, String fichero) {
            File dir = new File("src/" + directorio);
    
            // Validar si el directorio existe
            if (!dir.exists()) {
                if (dir.mkdirs()) {
                    System.out.println("Directorio creado: " + directorio);
                } else {
                    System.out.println("Error al crear directorio");
                    return;
                }
            } else {
                System.out.println("El directorio ya existe");
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
                ArrayList<String> lista = new ArrayList<>();
                lista.add("Perro");
                lista.add("Gato");
                lista.add("Juan");
                lista.add("Daniel");
                lista.add("Juan");
                lista.add("Gato");
                lista.add("Perro");
                lista.add("Camila");
                lista.add("Daniel");
                lista.add("Camila");
    
                Iterator<String> iterator = lista.iterator();
                while (iterator.hasNext()) {
                    writer.write(iterator.next() + System.lineSeparator());
                }
                writer.close();
    
                System.out.println("Archivo creado y datos escritos en " + file.getPath());
            } catch (IOException e) {
                System.out.println("Error al escribir en el archivo: " + e.getMessage());
            }
        }
    
        //Crear el método buscarTexto
        public  void buscarTexto(String nombreFichero, String texto) {
            File file = new File("src/" + nombreFichero);
    
            // Validar si el fichero existe
                if (!file.exists()) {
                    System.out.println("El fichero ingresado no existe");
                    return;
                }
    
            // Contar la cantidad de repeticiones del texto
            int count = 0;
            try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    if (line.equals(texto)) {
                        count++;
                    }
                }
                reader.close();
    
                System.out.println("Cantidad de repeticiones del texto -> " + count);
            } catch (IOException e) {
                System.out.println("Error al leer el archivo: " + e.getMessage());
            }
        }
    
}

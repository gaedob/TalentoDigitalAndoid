package EjercioClases;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;


public class TextoJava {
    public static void main(String[] args) {

        File directoFile = new File("src/directorio");

        if (!directoFile.exists()) {
            boolean flag = directoFile.mkdirs();
            if (flag) {
                System.out.println("creado");

            } else {
                System.out.println("Otro problema existe");
            }

        } else {
            System.out.println("ya existe");

        }

        String currentPath;
        try {
            currentPath = new java.io.File(".").getCanonicalPath();
            System.out.println("Current dir:" + currentPath);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        String currentDir = System.getProperty("user.dir");
        System.out.println("Current dir using System:" + currentDir);

        File archivoFile = new File(directoFile.getPath() + "/directorio.txt");
        try {
            boolean aflag = archivoFile.createNewFile();
            if (aflag)
                System.out.println("Archivo creado:" + archivoFile.getName());
            else
                System.out.println("Algo paso:" + archivoFile.getName());

        } catch (Exception e) {
            // TODO: handle exception
        }
        // String path = "src/directorio/path/dir";
        // try {
        // Files.createDirectories(Paths.get(path));
        // } catch (IOException e) {
        // // TODO Auto-generated catch block
        // e.printStackTrace();
        // }

        // File archivo = new File("src/carpeta/texto.txt");
        try {
            FileWriter fileW = new FileWriter(archivoFile, true);
            // fileW.write("currentDir");
            BufferedWriter bufferedWriter = new BufferedWriter(fileW);
            bufferedWriter.write("texto");
            bufferedWriter.newLine();

            bufferedWriter.close();

            fileW.close();

        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

       // File archivo = new File(archivoFile);
        FileReader fr;
        try {
            fr = new FileReader(archivoFile);
            BufferedReader br = new BufferedReader(fr);


        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
       
    }

}

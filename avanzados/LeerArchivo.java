package avanzados;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class LeerArchivo {
    public static void main(String[] args) {
        var nombreArchivo = "mi_archivos.txt";
        var archivo = new File(nombreArchivo);
        try{
            System.out.println("Contenido: ");
            var entrada = new BufferedReader(new FileReader(archivo));
            var linea = entrada.readLine();
            while (linea != null) {
                System.out.println(linea);
                linea = entrada.readLine();
            }
            List<String> lineas = Files.readAllLines(Paths.get(nombreArchivo));
            lineas.forEach(System.out::println);
            entrada.close();
        } catch (Exception e) {
            System.out.println("Error al leer el archivo");
        }
    }
}

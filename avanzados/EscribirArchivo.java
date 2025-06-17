package avanzados;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

public class EscribirArchivo {
    public static void main(String[] args) {
        var anexar = false;
        var nombreArchivo = "mi_archivos.txt";
        var archivo = new File(nombreArchivo);
        try{
            anexar = archivo.exists();
            var salida = new PrintWriter(new FileWriter(nombreArchivo, anexar));
            var nuevoContenido = "Nuevo contendio \nfila nuevo contenido";
            salida.println(nuevoContenido);
            salida.close();
            System.out.println("Se agrego contenido");
        }catch (Exception e){
            System.out.println(e);
        }
    }
}

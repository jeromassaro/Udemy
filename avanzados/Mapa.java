package avanzados;

import java.util.HashMap;
import java.util.Map;

public class Mapa {
    public static void main(String[] args) {

        Map<String ,String> mapa = new HashMap<>();

        mapa.put("nombre","Jeronimo");
        mapa.put("apellido","Massaro");
        mapa.put("edad","24");
        mapa.put("edad","24");
        System.out.println("Valores del mapa");
        mapa.entrySet().forEach(System.out::println);
        mapa.put("edad","25");
        mapa.remove("apellido");
        mapa.entrySet().forEach(System.out::println);

        // Iterar los valores
        mapa.forEach((llave,valor) -> System.out.println(llave+": "+valor));
    }
}

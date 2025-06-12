package avanzados;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Listas {
    public static void main(String[] args) {
        System.out.println("Lista de Objetos sin definir tipo");
        List l = new ArrayList();
        l.add("A");
        l.add("B");
        l.add(5);
        for (Object o : l) {
            System.out.println(o);
        }
        System.out.println();

        List<Integer> l2 = new ArrayList<>();

        l2.add(1);
        l2.add(2);
        l2.add(3);
        l2.add(4);
        System.out.println();

        System.out.println("Lista de numeros");
        // Funcion lambda ForEach default
        l2.forEach(System.out::println);

        // Funcion lambda ForEach
        l2.forEach( elemento -> {
            System.out.println("Elemento: " + elemento);
        });

        System.out.println();
        List<String> nombres = Arrays.asList("Jero","Tute","Yupa","Nico","Tino");
        System.out.println("Lista de nombres");
        nombres.forEach(System.out::println);
    }
}

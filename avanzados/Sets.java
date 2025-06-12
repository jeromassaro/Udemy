package avanzados;

import java.util.Set;
import java.util.TreeSet;

public class Sets {
    public static void main(String[] args) {
        Set<String> conjunto = new TreeSet<>();

        conjunto.add("A");
        conjunto.add("B");
        conjunto.add("C");

        System.out.println("Elementos de conjunto: ");
        conjunto.forEach(System.out::println);
    }
}

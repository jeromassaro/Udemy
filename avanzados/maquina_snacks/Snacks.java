package avanzados.maquina_snacks;

import java.util.ArrayList;
import java.util.List;

public class Snacks {

    private static final List<Snack> snackList;

    static {
        snackList = new ArrayList<>();
        snackList.add(new Snack("Coca Cola",1500));
        snackList.add(new Snack("Lays",500));
        snackList.add(new Snack("Pepsi",1399.99));
        snackList.add(new Snack("Doritos",799.99));
    }

    public static void agregarSnack(Snack snack) {
        Snacks.snackList.add(snack);
    }

    public static void mostrarSnacks(){
        System.out.println("--- Snacks en el inventario ---");
        Snacks.snackList.forEach(snack -> System.out.println(snack.toString()));
    }

    public static List<Snack> getSnackList() {
        return Snacks.snackList;
    }
}

package avanzados.maquina_snacks;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MaquinaSnacks {

    public static void main(String[] args) {
        maquinaSnacks();
    }

    public static void maquinaSnacks() {
        Scanner sc = new Scanner(System.in);
        var salir = false;
        List<Snack> snacksComprados = new ArrayList<>();
        System.out.println("*** Maquina de Snacks ***");
        Snacks.mostrarSnacks();
        while (!salir){
            try {
                int opcion = mostrarMenu(sc);
                salir = elegirOpcion (opcion,sc,snacksComprados);
            }
            catch (Exception e) {
                System.out.println(e.getMessage());
            }
            finally {
                System.out.println();
            }
        }
        System.out.println("Fin del Programa");
    }

    private static int mostrarMenu(Scanner sc) {
        System.out.println("\nMenu:");
        System.out.println("1.Comprar Snack\n2.Mostrar Ticket\n3.Agregar Snack a la Maquina\n4.Salir");
        System.out.print("Elija la Opcion: ");
        return Integer.parseInt(sc.nextLine());
    }

    private static boolean elegirOpcion (int opcion, Scanner sc, List<Snack> snacksComprados) {
        var salir = false;
        switch (opcion) {
            case 1 -> comprarSnack(sc,snacksComprados);
            case 2 -> mostrarTicket(snacksComprados);
            case 3 -> agregarSnacks(sc);
            case 4 -> {
                System.out.println("Adios!");
                salir = true;
            }
            default -> throw new RuntimeException("Opcion invalida");
        }
        return salir;
    }

    private static void comprarSnack(Scanner sc, List<Snack> snacksComprados) {
        System.out.print("Que snack quieres comprar? (id) ");
        int id = Integer.parseInt(sc.nextLine());
        var snackEncontrado = false;
        for (Snack snack : Snacks.getSnackList()) {
            if (snack.getIdSnack() == id) {
                snacksComprados.add(snack);
                System.out.println("Snack agregado :" + snack);
                snackEncontrado = true;
                break;
            }
        }
        if (!snackEncontrado) {
            System.out.println("\nEl snack quieres comprar no existe en la lista");
        }
    }

    private static void mostrarTicket(List<Snack> snacksComprados) {
        System.out.println("*** Ticket ***");
        double precioTotal = 0;
        for (Snack snack : snacksComprados) {
            System.out.println("\n\t-" + snack.getNombre() + " - $" + snack.getPrecio());
            precioTotal += snack.getPrecio();
        }
        System.out.println("El total de la compra es: $"+precioTotal);
    }

    private static void agregarSnacks(Scanner sc) {
        Snack snack = new Snack();
        System.out.print("Ingrese el nombre del snack: ");
        snack.setNombre(sc.nextLine());
        System.out.print("Ingrese el precio del snack: ");
        snack.setPrecio(Double.parseDouble(sc.nextLine()));
        Snacks.agregarSnack(snack);
        System.out.println("Snack agregado");
        Snacks.mostrarSnacks();
    }
}

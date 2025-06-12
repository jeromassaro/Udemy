import java.util.Scanner;
public class RecetasDeCocinas {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("*** Recetas de Cocinas ***");

        System.out.print("Ingresa el nombre: ");
        var nombre = scanner.nextLine();
        System.out.print("Ingresa los ingredientes: ");
        var ingredientes = scanner.nextLine();
        System.out.print("Ingresa el timpo de preparacion (min): ");
        var tiempoPreparacion = Integer.parseInt(scanner.nextLine());
        System.out.print("Ingresa la dificultad: ");
        var dificultad = scanner.nextLine();
        System.out.println("\n --- Receta de Cocina ---");
        System.out.println("Nombre receta : " + nombre);
        System.out.println("Ingredientes : " + ingredientes);
        System.out.println("Tiempo de preparacion : " + tiempoPreparacion + " minutos");
        System.out.println("Dificultad : " + dificultad);
    }
}

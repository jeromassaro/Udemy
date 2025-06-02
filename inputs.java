import java.util.Scanner;
import java.util.Random;
public class inputs {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        // System.out.print("Ingrese una linea: ");
        // var linea = Integer.parseInt(scanner.nextLine());
        // System.out.println("linea = " + linea);

    //    System.out.println("Ingrese el Nombre del Empleado : ");
    //    var nombre = scanner.nextLine();
    //    System.out.println("Ingrese la Edad del Empleado : ");
    //    var edad = Integer.parseInt(scanner.nextLine());
    //    System.out.println("Ingrese el Salario del Empleado : ");
    //    var salario =  Double.parseDouble(scanner.nextLine());
    //    System.out.println("Es Jefe de departartamento? (true / false) : ");
    //    var isBoss = Boolean.parseBoolean(scanner.nextLine());
    //    System.out.println("Datos del Empleado");
    //    System.out.println("Nombre del Empleado : " + nombre + "\nEdad : " + edad + "\nSalario : $%.2f ".formatted(salario)+ "\nEs Jefe de departamento? : " + isBoss);

        // Numeros y booleano random

        var random = new Random();
        var numero0a9 = random.nextInt(10);
        System.out.println("Numero aleatorio entre 0 y 9 : " + numero0a9);
        var numero1a10 = random.nextInt(10) + 1;
        System.out.println("Numero aleatorio entre 1 y 10 : " + numero1a10);
        System.out.println(random.nextBoolean());

        scanner.close();
    }
}

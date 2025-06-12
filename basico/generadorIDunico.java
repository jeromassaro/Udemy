import java.util.Random;
import java.util.Scanner;
public class generadorIDunico {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        var random = new Random();
        System.out.println("*** Sistema Generador de ID Unico ***");

        System.out.print("Ingrese el Nombre : ");
        var nombre = scanner.nextLine();

        System.out.print("Ingrese el Apellido : ");
        var apellido = scanner.nextLine();

        System.out.print("Ingrese el año de nacimiento (YYYY) : ");
        var anioNacimiento = scanner.nextLine();

        var id = random.nextInt(9999) + 1;
        var idNormalizado = String.format("%04d", id);

        var nombreNormalizado = nombre.trim().toUpperCase().substring(0,2);
        var apellidoNormalizado = apellido.trim().toUpperCase().substring(0,2);
        var anioNormalizado = anioNacimiento.trim().substring(2);

        var idUnico = nombreNormalizado + apellidoNormalizado + anioNormalizado + idNormalizado;
        System.out.printf("""
                Hola %s,
                \tTu nuevo numero de identificacion (ID) generador por el sistema es : 
                \t%s
                \tFelicidades!%n""",nombre,idUnico);
    }
}

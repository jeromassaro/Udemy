import java.util.Scanner;

public class validadorUsuario {
    public static void main(String[] args) {
        final String user = "admin";
        final String pass = "jerito";
        Scanner consola = new Scanner(System.in);

        System.out.print("Ingrese su usuario: ");
        String usuario = consola.nextLine().strip();
        System.out.print("Ingrese su contraseña: ");
        String contrasena = consola.nextLine().strip();
        // boolean resultado = (user.equals(usuario)) && (contrasena.equals(pass));
        // System.out.println("resultado: " + resultado);

        // System.out.println("Ingrese la altura del rectangulo: ");
        // double altura = Double.parseDouble(consola.nextLine());
        // System.out.println("Ingrese la base del rectangulo: ");
        // double base = Double.parseDouble(consola.nextLine ());

        // double area = base * altura;
        // double perimetro = 2 * (altura + base);
        // System.out.println("El area del rectangulo es: " + area);
        // System.out.println("El perimetro es: " + perimetro);

        if (usuario.equals(user) && contrasena.equals(pass)) {
            System.out.println("Bienvenido al sistema");
        } else if (!(usuario.equals(user)) && (contrasena.equals(pass))) {
            System.out.println("Usuario incorrecto");
        } else if (usuario.equals(user) && !(contrasena.equals(pass))) {
            System.out.println("Contraseña invalida");
        } else {
            System.out.println("Usuario y contraseña invalidas");
        }
    }
}

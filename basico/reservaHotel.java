import java.util.Scanner;

public class reservaHotel {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        final double SIN_VISTA_MAR = 150.5;
        final double CON_VISTA_MAR = 190.5;

        System.out.println("Ingresa tu nombre: ");
        var nombre = consola.nextLine();
        System.out.println("Ingresa la cantidad de dias en el Hotel: ");
        var dias = Integer.parseInt(consola.nextLine());
        System.out.println("Cuarto con vistal al mar? true/false: ");
        var vistaMar = Boolean.parseBoolean(consola.nextLine());

        double total = vistaMar ? CON_VISTA_MAR*dias : SIN_VISTA_MAR*dias;

        System.out.printf("""
                Nombre: %s
                Total de dias : %d
                Su total es : %.2f
                """,nombre,dias,total);
    }
}

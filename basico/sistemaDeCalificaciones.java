import java.util.Scanner;

public class sistemaDeCalificaciones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su calificacion para convetir");
        var calificacion = Double.parseDouble(sc.nextLine());
        String calificacionLetra;

        if (calificacion >= 9 && calificacion <= 10) {
            calificacionLetra = "A";
        } else if (calificacion >= 8 && calificacion <= 9) {
            calificacionLetra = "B";
        } else if (calificacion >= 7 && calificacion <= 8) {
            calificacionLetra = "C";
        } else if (calificacion >= 6 && calificacion <= 7) {
            calificacionLetra = "D";
        } else if (calificacion >= 0 && calificacion <= 6) {
            calificacionLetra = "F";
        }else calificacionLetra = "Error";
        System.out.println(calificacionLetra);
    }
}

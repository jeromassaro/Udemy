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

        //var random = new Random();
        //var numero0a9 = random.nextInt(10);
        //System.out.println("Numero aleatorio entre 0 y 9 : " + numero0a9);
        //var numero1a10 = random.nextInt(10) + 1;
        //System.out.println("Numero aleatorio entre 1 y 10 : " + numero1a10);
        //System.out.println(random.nextBoolean());

        System.out.println("Ingrese un numero");
        var num = Integer.parseInt(scanner.nextLine());
        System.out.println("Ingrese otro numero");
        var num2 = Integer.parseInt(scanner.nextLine());
        var mayor = (num > num2) ? num : num2;
        System.out.println("mayor = " + mayor);

        System.out.println("Ingrese el mes del año: ");
        var num3 = Integer.parseInt(scanner.nextLine());
        switch (num3){
            case 1,2,12 -> System.out.println("Verano");
            case 3,4,5 -> System.out.println("Otoño");
            case 6,7,8 -> System.out.println("Invierno");
            case 9,10,11 -> System.out.println("Primavera");
            default -> System.out.println("Dia invalido");
        }

        // if ((num3 == 1) || (num3 == 2) || (num3 == 12)) {
        //     System.out.println("Verano");
        // } else if ((num3 == 3) || (num3 == 4) || (num3 == 5)){
        //     System.out.println("Otoño");
        // } else if ((num3 == 6) || (num3 == 7) || (num3 == 8)) {
        //     System.out.println("Invierno");
        // } else if ((num3 == 9) || (num3 == 10) || (num3 == 11)) {
        //     System.out.println("Primavera");
        // } else System.out.println("Valor invalido");

        int dia = 1;
        String diaSemana;
        diaSemana = switch (dia) {
            case 1 -> "Lunes";
            case 2 -> "Martes";
            case 3 -> "Miercoles";
            case 4 -> "Jueves";
            case 5 -> "Viernes";
            case 6 -> "Sabado";
            case 7 -> "Domingo";
            default -> "Error";
        };
        System.out.println("diaSemana = " + diaSemana);

    }
}
import java.util.Scanner;
public class operadoresEj {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        // final int rango_inicial = 0;
        // final int rango_final = 10;
        // System.out.print("Ingrese un valor : ");
        // int a = Integer.parseInt(new Scanner(System.in).next());
        // boolean resultado = (a >= rango_inicial) && (a <= rango_final);
        // System.out.println("resultado = " + resultado);

        //final int minimo = 10;
        //System.out.println("Cuantos articulos compro en el dia? ");
        //int articulos = Integer.parseInt(consola.nextLine());
        //System.out.println("Es miembro vip? 0 no 1 si ");
        //int vip = Integer.parseInt(consola.nextLine());
        //boolean resultado = (articulos >= minimo && vip == 1);
        //System.out.println("Tiene acceso a descuento? : " + resultado);

        //final double kmsLimite = 3;
        //System.out.println("Tienes credencial? true/false");
        //boolean credencial = Boolean.parseBoolean(consola.nextLine());
        //System.out.println("A cuantos km a la redonda vivis?");
        //double km = Double.parseDouble(consola.nextLine());
        //boolean resultado = credencial || km < kmsLimite;
        //System.out.println("resultado = " + resultado);

        System.out.print("Ingrese el precio de la leche: ");
        int leche = Integer.parseInt(consola.nextLine());
        System.out.print("Ingrese el precio de la pan: ");
        int pan = Integer.parseInt(consola.nextLine());
        System.out.print("Ingrese el precio de la lechuga: ");
        int lechuga = Integer.parseInt(consola.nextLine());
        System.out.print("Ingrese el precio de la banana: ");
        int banana = Integer.parseInt(consola.nextLine());

        int subtotal = leche + pan + lechuga + banana;
        double impuestos = subtotal * 0.15;
        double subtotalImpuestos = subtotal + impuestos;

        System.out.printf("""
                \nTicket de Venta
                ----------------
                Subtotal: $%d
                Impuestos (15%%): $%.2f
                SubtotalImpuestos: $%.2f
                """,subtotal,impuestos,subtotalImpuestos);
    }
}

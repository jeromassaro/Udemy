import java.util.Scanner;

public class tiendaEnLinea {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        System.out.print("Ingrese el total de compra: ");
        double total = Double.parseDouble(consola.nextLine());
        System.out.print("Es miembro de la tienda? true/false : ");
        boolean miembro = Boolean.parseBoolean(consola.nextLine());
        if ((total >= 1000) && (miembro)){
            double subTotal = total - (total*0.10);
            System.out.println("El total de compra es: $" + subTotal);
        }
        else if (miembro){
            double subTotal = total - (total*0.05);
            System.out.println("El total de compra es: $" + subTotal);
        }
        else {
            System.out.println("El total de compra es: $" + total);
        }
        var mensaje = miembro ? "Felicidades eres miembro" : total > 1000 ? "Que lastima que no eres miembro" : "Nada";
        System.out.println("mensaje = " + mensaje);
    }
}
